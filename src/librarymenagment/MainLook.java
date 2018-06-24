/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymenagment;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import librarymenagment.exceptions.IllegalOrphanException;
import librarymenagment.exceptions.NonexistentEntityException;


public class MainLook extends javax.swing.JFrame {

    public MainLook() {
        initComponents();
        bindAuthorsTable();
        bindBooks();
        bindCBBoxAuthor();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTablledPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfAuthorFirsname = new javax.swing.JTextField();
        jtfAuthorSurname = new javax.swing.JTextField();
        jtfAuthorEmail = new javax.swing.JTextField();
        btnAuthorInsert = new javax.swing.JButton();
        btnAuthorEdit = new javax.swing.JButton();
        btnAuthorDelete = new javax.swing.JButton();
        btnAuthorClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAuthors = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfBookTitle = new javax.swing.JTextField();
        jtfBookEdition = new javax.swing.JTextField();
        tbBookAuthor = new javax.swing.JComboBox<>();
        btnBookInsert = new javax.swing.JButton();
        btnBookEdit = new javax.swing.JButton();
        btnBookDelete = new javax.swing.JButton();
        btnBookClear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBooks = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Author"));

        jLabel1.setText("Firstname");

        jLabel2.setText("Surname");

        jLabel3.setText("Email");

        jtfAuthorEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAuthorEmailActionPerformed(evt);
            }
        });

        btnAuthorInsert.setText("Insert");
        btnAuthorInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuthorInsertActionPerformed(evt);
            }
        });

        btnAuthorEdit.setText("Edit");
        btnAuthorEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuthorEditActionPerformed(evt);
            }
        });

        btnAuthorDelete.setText("Delete");
        btnAuthorDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuthorDeleteActionPerformed(evt);
            }
        });

        btnAuthorClear.setText("Clear");
        btnAuthorClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuthorClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jtfAuthorFirsname))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(41, 41, 41)
                        .addComponent(jtfAuthorEmail))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(23, 23, 23)
                        .addComponent(jtfAuthorSurname)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnAuthorInsert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAuthorEdit)
                .addGap(18, 18, 18)
                .addComponent(btnAuthorDelete)
                .addGap(18, 18, 18)
                .addComponent(btnAuthorClear)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfAuthorFirsname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfAuthorSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfAuthorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAuthorInsert)
                    .addComponent(btnAuthorEdit)
                    .addComponent(btnAuthorDelete)
                    .addComponent(btnAuthorClear)))
        );

        tblAuthors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblAuthors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAuthorsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAuthors);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setText("Scrool Library System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JTablledPane.addTab("Author", jPanel1);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Book"));

        jLabel5.setText("Title");

        jLabel6.setText("Edition");

        jLabel7.setText("Author");

        jtfBookTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBookTitleActionPerformed(evt);
            }
        });

        tbBookAuthor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnBookInsert.setText("Insert");
        btnBookInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookInsertActionPerformed(evt);
            }
        });

        btnBookEdit.setText("Edit");
        btnBookEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookEditActionPerformed(evt);
            }
        });

        btnBookDelete.setText("Delete");
        btnBookDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookDeleteActionPerformed(evt);
            }
        });

        btnBookClear.setText("Clear");
        btnBookClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnBookInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(btnBookEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBookDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnBookClear)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel7))
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfBookTitle)
                            .addComponent(jtfBookEdition)
                            .addComponent(tbBookAuthor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBookClear, btnBookDelete, btnBookEdit, btnBookInsert});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jtfBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfBookEdition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tbBookAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBookInsert)
                    .addComponent(btnBookEdit)
                    .addComponent(btnBookDelete)
                    .addComponent(btnBookClear)))
        );

        tblBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBooksMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblBooks);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel8.setText("School Library System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel8)
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        JTablledPane.addTab("Book", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTablledPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTablledPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfAuthorEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAuthorEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfAuthorEmailActionPerformed

    private void btnAuthorInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuthorInsertActionPerformed
        if (!((jtfAuthorFirsname.getText().equals("")) || (jtfAuthorSurname.getText().equals("")) || (jtfAuthorEmail.equals("")))) {
            Authors autor = new Authors();
            autor.setFirstname(jtfAuthorFirsname.getText());
            autor.setSurname(jtfAuthorSurname.getText());
            autor.setEmail(jtfAuthorEmail.getText());

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryMenagmentPU");
            AuthorsJpaController controller = new AuthorsJpaController(emf);
            controller.create(autor);
            clearAuthorTextFields();
            bindAuthorsTable();
            bindCBBoxAuthor();
        } else {
            JOptionPane.showMessageDialog(null, "you must fill all fields");
        }
    }//GEN-LAST:event_btnAuthorInsertActionPerformed

    private void btnBookInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookInsertActionPerformed
        if (!((jtfBookTitle.getText().equals("")) || (jtfBookEdition.getText().equals("")))) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryMenagmentPU");
            BooksJpaController bookControler = new BooksJpaController(emf);
            Books book = new Books();
            book.setTitle(jtfBookTitle.getText());
            book.setEdition(jtfBookEdition.getText());
            Authors author = (Authors) tbBookAuthor.getSelectedItem();
            book.setAuthor(author);
            bookControler.create(book);
            clearBookTextFields();
            bindBooks();
            bindCBBoxAuthor();
        } else {
            JOptionPane.showMessageDialog(null, "you must fill all fields");
        }
    }//GEN-LAST:event_btnBookInsertActionPerformed

    private void btnAuthorClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuthorClearActionPerformed
        clearAuthorText();
    }//GEN-LAST:event_btnAuthorClearActionPerformed

    public void clearAuthorText() {
        jtfAuthorFirsname.setText("");
        jtfAuthorSurname.setText("");
        jtfAuthorEmail.setText("");
    }

    private void btnBookClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookClearActionPerformed
        jtfBookTitle.setText("");
        jtfBookEdition.setText("");
    }//GEN-LAST:event_btnBookClearActionPerformed

    private void tblAuthorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAuthorsMouseClicked
        int RowCount = tblAuthors.getSelectedRow();
        selectedAuthorId = Integer.parseInt(tblAuthors.getValueAt(RowCount, 0).toString());
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryMenagmentPU");
        AuthorsJpaController controler = new AuthorsJpaController(emf);
        Authors autor = controler.findAuthors(selectedAuthorId);
        jtfAuthorFirsname.setText(autor.getFirstname());
        jtfAuthorSurname.setText(autor.getSurname());
        jtfAuthorEmail.setText(autor.getEmail());


    }//GEN-LAST:event_tblAuthorsMouseClicked

    private void btnAuthorEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuthorEditActionPerformed
        if (selectedAuthorId != -1) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryMenagmentPU");
            AuthorsJpaController controller = new AuthorsJpaController(emf);
            Authors autor = controller.findAuthors(selectedAuthorId);
            autor.setFirstname(jtfAuthorFirsname.getText());
            autor.setSurname(jtfAuthorSurname.getText());
            autor.setEmail(jtfAuthorEmail.getText());
            try {
                controller.edit(autor);
            } catch (NonexistentEntityException ex) {
                Logger.getLogger(MainLook.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(MainLook.class.getName()).log(Level.SEVERE, null, ex);
            }
            selectedAuthorId = -1;
            clearAuthorText();
            bindAuthorsTable();
        } else {
            JOptionPane.showMessageDialog(null, "You must select  from table first");
        }
    }//GEN-LAST:event_btnAuthorEditActionPerformed

    private void btnAuthorDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuthorDeleteActionPerformed
        if (selectedAuthorId != -1) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryMenagmentPU");
            AuthorsJpaController controler = new AuthorsJpaController(emf);
            BooksJpaController bookControler = new BooksJpaController(emf);
            Authors autor = controler.findAuthors(selectedAuthorId);
            List<Books> bookList = bookControler.getBooksByAuthor(autor);
            int numberOfBooks = bookList.size();
            if (numberOfBooks <= 0) {
                try {
                    controler.destroy(selectedAuthorId);
                } catch (NonexistentEntityException ex) {
                    Logger.getLogger(MainLook.class.getName()).log(Level.SEVERE, null, ex);
                }
                clearAuthorText();
                bindAuthorsTable();
                selectedAuthorId = -1;
            } else {
                JOptionPane.showMessageDialog(null, "You can not delete author who has book");
            }
        } else {
            JOptionPane.showMessageDialog(null, "You must select from table first");
        }
    }//GEN-LAST:event_btnAuthorDeleteActionPerformed

    private void btnBookDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookDeleteActionPerformed
        if (selectedBookId != -1) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryMenagmentPU");
            BooksJpaController controler = new BooksJpaController(emf);
            try {
                controler.destroy(selectedBookId);
            } catch (NonexistentEntityException ex) {
                Logger.getLogger(MainLook.class.getName()).log(Level.SEVERE, null, ex);
            }
            clearBookTextFields();
            bindBooks();
            selectedBookId = -1;
        } else {
            JOptionPane.showMessageDialog(null, "You must select from table first!");
        }
    }//GEN-LAST:event_btnBookDeleteActionPerformed

    private void tblBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBooksMouseClicked
        int rowNUm = tblBooks.getSelectedRow();
        selectedBookId = Integer.parseInt(tblBooks.getValueAt(rowNUm, 0).toString());
        jtfBookTitle.setText(tblBooks.getValueAt(rowNUm, 1).toString());
        jtfBookEdition.setText(tblBooks.getValueAt(rowNUm, 2).toString());
        int authorId = Integer.parseInt(tblBooks.getValueAt(rowNUm, 3).toString());
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryMenagmentPU");
        AuthorsJpaController controler = new AuthorsJpaController(emf);
        Authors author = controler.findAuthors(authorId);
        tbBookAuthor.setSelectedItem(author);

    }//GEN-LAST:event_tblBooksMouseClicked

    private void btnBookEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookEditActionPerformed
        if (selectedBookId != -1) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryMenagmentPU");
            BooksJpaController controler = new BooksJpaController(emf);
            Books book = controler.findBooks(selectedBookId);
            book.setTitle(jtfBookTitle.getText());
            book.setEdition(jtfBookEdition.getText());
            book.setAuthor((Authors) tbBookAuthor.getSelectedItem());
            try {
                controler.edit(book);
            } catch (Exception ex) {
                Logger.getLogger(MainLook.class.getName()).log(Level.SEVERE, null, ex);
            }
            clearBookTextFields();
            bindBooks();
            selectedBookId = -1;
        } else {
            JOptionPane.showMessageDialog(null, " You must select author from table!");
        }
    }//GEN-LAST:event_btnBookEditActionPerformed

    private void jtfBookTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBookTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBookTitleActionPerformed
  

// declaration variable 
    int selectedAuthorId = -1;
    int selectedBookId = -1;

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainLook().setVisible(true);

            }
        });
    }

    private void bindAuthorsTable() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryMenagmentPU");
        AuthorsJpaController controller = new AuthorsJpaController(emf);
        List<Authors> authorsList = controller.findAuthorsEntities();

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"id_authors", "firstname", "lastname", "email"});
        for (Authors author : authorsList) {
            model.addRow(new String[]{author.getId().toString(), author.getFirstname(), author.getSurname(), author.getEmail()});
        }
        tblAuthors.setModel(model);
        tblAuthors.getColumnModel().getColumn(0).setMinWidth(0);
        tblAuthors.getColumnModel().getColumn(0).setMaxWidth(0);
        tblAuthors.getColumnModel().getColumn(0).setPreferredWidth(0);
        /*tblAuthors.getColumnModel().getColumn(3).setMinWidth(3);
        tblAuthors.getColumnModel().getColumn(3).setMaxWidth(3);
        tblAuthors.getColumnModel().getColumn(3).setPreferredWidth(3);*/
    }

    private void bindBooks() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryMenagmentPU");
        BooksJpaController controller = new BooksJpaController(emf);
        List<Books> booksList = controller.findBooksEntities();

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"idbook", "title", "editon", "id_authors"});

        String authorName = "";
        for (Books books : booksList) {

            authorName = books.getAuthor().getSurname() + ", " + books.getAuthor().getFirstname();
            model.addRow(new String[]{books.getId().toString(), books.getTitle(), books.getEdition(), books.getAuthor().getId().toString()});

        }
        tblBooks.setModel(model);
        tblBooks.getColumnModel().getColumn(0).setMinWidth(0);
        tblBooks.getColumnModel().getColumn(0).setMaxWidth(0);
        tblBooks.getColumnModel().getColumn(0).setPreferredWidth(0);

    }

    private void bindCBBoxAuthor() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryMenagmentPU");
        AuthorsJpaController controller = new AuthorsJpaController(emf);
        List<Authors> authorsList = controller.findAuthorsEntities();

        Object[] authorsArray = authorsList.toArray();
        DefaultComboBoxModel model = new DefaultComboBoxModel(authorsArray);

        tbBookAuthor.setModel(model);
    }

    private void clearAuthorTextFields() {
        jtfAuthorFirsname.setText("");
        jtfAuthorSurname.setText("");
        jtfAuthorEmail.setText("");
    }

    private void clearBookTextFields() {
        jtfBookTitle.setText("");
        jtfBookEdition.setText("");

    }
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JTablledPane;
    private javax.swing.JButton btnAuthorClear;
    private javax.swing.JButton btnAuthorDelete;
    private javax.swing.JButton btnAuthorEdit;
    private javax.swing.JButton btnAuthorInsert;
    private javax.swing.JButton btnBookClear;
    private javax.swing.JButton btnBookDelete;
    private javax.swing.JButton btnBookEdit;
    private javax.swing.JButton btnBookInsert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jtfAuthorEmail;
    private javax.swing.JTextField jtfAuthorFirsname;
    private javax.swing.JTextField jtfAuthorSurname;
    private javax.swing.JTextField jtfBookEdition;
    private javax.swing.JTextField jtfBookTitle;
    private javax.swing.JComboBox<String> tbBookAuthor;
    private javax.swing.JTable tblAuthors;
    private javax.swing.JTable tblBooks;
    // End of variables declaration//GEN-END:variables
}
