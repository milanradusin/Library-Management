
package librarymenagment;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import librarymenagment.exceptions.NonexistentEntityException;


public class BooksJpaController implements Serializable {

    public BooksJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Books books) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Authors author = books.getAuthor();
            if (author != null) {
                author = em.getReference(author.getClass(), author.getId());
                books.setAuthor(author);
            }
            em.persist(books);
            if (author != null) {
                author.getBooksCollection().add(books);
                author = em.merge(author);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Books books) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Books persistentBooks = em.find(Books.class, books.getId());
            Authors authorOld = persistentBooks.getAuthor();
            Authors authorNew = books.getAuthor();
            if (authorNew != null) {
                authorNew = em.getReference(authorNew.getClass(), authorNew.getId());
                books.setAuthor(authorNew);
            }
            books = em.merge(books);
            if (authorOld != null && !authorOld.equals(authorNew)) {
                authorOld.getBooksCollection().remove(books);
                authorOld = em.merge(authorOld);
            }
            if (authorNew != null && !authorNew.equals(authorOld)) {
                authorNew.getBooksCollection().add(books);
                authorNew = em.merge(authorNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = books.getId();
                if (findBooks(id) == null) {
                    throw new NonexistentEntityException("The books with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Books books;
            try {
                books = em.getReference(Books.class, id);
                books.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The books with id " + id + " no longer exists.", enfe);
            }
            Authors author = books.getAuthor();
            if (author != null) {
                author.getBooksCollection().remove(books);
                author = em.merge(author);
            }
            em.remove(books);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Books> findBooksEntities() {
        return findBooksEntities(true, -1, -1);
    }

    public List<Books> findBooksEntities(int maxResults, int firstResult) {
        return findBooksEntities(false, maxResults, firstResult);
    }

    private List<Books> findBooksEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Books.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Books findBooks(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Books.class, id);
        } finally {
            em.close();
        }
    }

    public int getBooksCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Books> rt = cq.from(Books.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    public List<Books>getBooksByAuthor(Authors author){
    EntityManager em = getEntityManager();
    Query q1 = em.createQuery("SELECT b FROM Books b WHERE b.author = :author");
    q1.setParameter("author", author);
    return q1.getResultList();
    }

}
