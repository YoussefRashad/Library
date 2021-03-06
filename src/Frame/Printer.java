/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import DataFile.Book;
import DataFile.Transaction;
import Safety.Validation;
import TestPanel.NewJFrame;
import java.awt.Color;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class Printer extends javax.swing.JInternalFrame {

    /**
     * Creates new form Printer
     */
    public Printer() {
        initComponents();
        WrongPassword.setVisible(false);
        WrongEmail.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldClientEmail = new javax.swing.JTextField();
        jTextFieldPass = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaPrint = new javax.swing.JTextArea();
        jPanelSearch = new javax.swing.JPanel();
        jLabelSearch = new javax.swing.JLabel();
        jPanelreset = new javax.swing.JPanel();
        jLabelReset = new javax.swing.JLabel();
        jPanelPrint = new javax.swing.JPanel();
        jLabelPrint = new javax.swing.JLabel();
        WrongEmail = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        WrongPassword = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(105, 105, 105));
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Email");

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pass");

        jTextFieldClientEmail.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jTextFieldClientEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldClientEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClientEmailActionPerformed(evt);
            }
        });

        jTextFieldPass.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jTextFieldPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPass.setBorder(null);
        jTextFieldPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPassActionPerformed(evt);
            }
        });

        jTextAreaPrint.setColumns(20);
        jTextAreaPrint.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextAreaPrint.setRows(5);
        jScrollPane1.setViewportView(jTextAreaPrint);

        jPanelSearch.setBackground(new java.awt.Color(105, 105, 105));
        jPanelSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelSearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelSearchMouseExited(evt);
            }
        });

        jLabelSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Find_and_Replace_48px.png"))); // NOI18N
        jLabelSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSearchMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelSearchLayout = new javax.swing.GroupLayout(jPanelSearch);
        jPanelSearch.setLayout(jPanelSearchLayout);
        jPanelSearchLayout.setHorizontalGroup(
            jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSearchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelSearch)
                .addGap(10, 10, 10))
        );
        jPanelSearchLayout.setVerticalGroup(
            jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSearchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelSearch)
                .addContainerGap())
        );

        jPanelreset.setBackground(new java.awt.Color(105, 105, 105));
        jPanelreset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelresetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelresetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelresetMouseExited(evt);
            }
        });

        jLabelReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Reset_48px.png"))); // NOI18N
        jLabelReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelResetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelResetMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelresetLayout = new javax.swing.GroupLayout(jPanelreset);
        jPanelreset.setLayout(jPanelresetLayout);
        jPanelresetLayout.setHorizontalGroup(
            jPanelresetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelresetLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelReset)
                .addGap(10, 10, 10))
        );
        jPanelresetLayout.setVerticalGroup(
            jPanelresetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelresetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelReset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelPrint.setBackground(new java.awt.Color(105, 105, 105));
        jPanelPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelPrintMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelPrintMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelPrintMouseExited(evt);
            }
        });

        jLabelPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Print_96px_1.png"))); // NOI18N
        jLabelPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPrintMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelPrintMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelPrintMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrintLayout = new javax.swing.GroupLayout(jPanelPrint);
        jPanelPrint.setLayout(jPanelPrintLayout);
        jPanelPrintLayout.setHorizontalGroup(
            jPanelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrintLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelPrint)
                .addGap(10, 10, 10))
        );
        jPanelPrintLayout.setVerticalGroup(
            jPanelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrintLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelPrint)
                .addGap(10, 10, 10))
        );

        WrongEmail.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Close Window_20px.png"))); // NOI18N
        jLabel4.setText("WrongEmail");

        javax.swing.GroupLayout WrongEmailLayout = new javax.swing.GroupLayout(WrongEmail);
        WrongEmail.setLayout(WrongEmailLayout);
        WrongEmailLayout.setHorizontalGroup(
            WrongEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WrongEmailLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, 0))
        );
        WrongEmailLayout.setVerticalGroup(
            WrongEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WrongEmailLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel4))
        );

        WrongPassword.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Close Window_20px.png"))); // NOI18N
        jLabel3.setText("WrongPassword");

        javax.swing.GroupLayout WrongPasswordLayout = new javax.swing.GroupLayout(WrongPassword);
        WrongPassword.setLayout(WrongPasswordLayout);
        WrongPasswordLayout.setHorizontalGroup(
            WrongPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WrongPasswordLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        WrongPasswordLayout.setVerticalGroup(
            WrongPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WrongPasswordLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldClientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(WrongEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelreset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WrongPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(304, 304, 304))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldClientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(WrongEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(WrongPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelreset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPassActionPerformed

    private void jTextFieldClientEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClientEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClientEmailActionPerformed

    private void jLabelSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSearchMouseClicked
        // TODO add your handling code here:
        if (!jTextFieldClientEmail.getText().equals("") && !jTextFieldPass.getText().equals("")) {
            Validation v = new Validation();
            if (v.checkEmail(jTextFieldClientEmail.getText())) {
                if (v.checkPass(jTextFieldPass.getText())) {
                    Transaction tran = new Transaction();
                    tran = tran.getTransaction(jTextFieldClientEmail.getText(),jTextFieldPass.getText());
                    if (tran != null) {
                        String strID ="";
                        String strName ="";
                        String strQuantity ="";
                        String strSalary ="";
                        for(int i=0;i<tran.Books_ID.size();i++){
                            strID += tran.Books_ID.get(i)+"\t";
                        }
                        for(int i=0;i<tran.BooksName.size();i++){
                            strName += tran.BooksName.get(i)+"\t";
                        }
                        for(int i=0;i<tran.Books_No.size();i++){
                            strQuantity += tran.Books_No.get(i)+"\t";
                        }
                        for(int i=0;i<tran.Books_Salary.size();i++){
                            strSalary += tran.Books_Salary.get(i)+"\t";
                        }
                        jTextAreaPrint.setText("client ID: " + tran.client.getID() + "             " + "client Name: " 
                        + tran.client.getName()+ "\n\n" + "\t---------------" + "\n\n" + "Book ID: " +strID
                        + "\n" + "Book Name: " + strName + "\n" + "Book Quantity: "+strQuantity+"Price for One Book: " + strQuantity
                                + "\n\n" + "\t---------------" + "\n\n" + "Price: " +strSalary);
                    } else {
                            JOptionPane.showMessageDialog(null, "This User Is Not Exist Or Does Not Have Any Transaction.");
                            WrongPassword.setVisible(true);
                            WrongEmail.setVisible(true);
                        }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Password Please Try Again.");
                    WrongPassword.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invaild Email. Please Try Again.");
                WrongEmail.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fill The Missing Field. Then Try Again.");
        }


    }//GEN-LAST:event_jLabelSearchMouseClicked

    private void jLabelSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSearchMouseEntered
        // TODO add your handling code here:
        setColor(jPanelSearch);
    }//GEN-LAST:event_jLabelSearchMouseEntered

    private void jLabelSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSearchMouseExited
        // TODO add your handling code here:
        getColor(jPanelSearch);
    }//GEN-LAST:event_jLabelSearchMouseExited

    private void jPanelSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSearchMouseClicked
        // TODO add your handling code here:
        if (!jTextFieldClientEmail.getText().equals("") && !jTextFieldPass.getText().equals("")) {
            Validation v = new Validation();
            if (v.checkEmail(jTextFieldClientEmail.getText())) {
                if (v.checkPass(jTextFieldPass.getText())) {
                    Transaction tran = new Transaction();
                    tran = tran.getTransaction(Integer.parseInt(jTextFieldClientEmail.getText()));
                    if (tran != null) {
                        String strID ="";
                        String strName ="";
                        String strQuantity ="";
                        String strSalary ="";
                        for(int i=0;i<tran.Books_ID.size();i++){
                            strID += tran.Books_ID.get(i)+"\t";
                        }
                        for(int i=0;i<tran.BooksName.size();i++){
                            strName += tran.BooksName.get(i)+"\t";
                        }
                        for(int i=0;i<tran.Books_No.size();i++){
                            strQuantity += tran.Books_No.get(i)+"\t";
                        }
                        for(int i=0;i<tran.Books_Salary.size();i++){
                            strSalary += tran.Books_Salary.get(i)+"\t";
                        }
                        jTextAreaPrint.setText("client ID: " + tran.client.getID() + "             " + "client Name: " 
                        + tran.client.getName()+ "\n\n" + "\t---------------" + "\n\n" + "Book ID: " +strID
                        + "\n" + "Book Name: " + strName + "\n" + "Book Quantity: "+strQuantity+"Price for One Book: " + strQuantity
                                + "\n\n" + "\t---------------" + "\n\n" + "Price: " +strSalary);
                    } else {
                            JOptionPane.showMessageDialog(null, "This User Is Not Exist Or Does Not Have Any Transaction.");
                            WrongPassword.setVisible(true);
                            WrongEmail.setVisible(true);
                        }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Password Please Try Again.");
                    WrongPassword.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invaild Email. Please Try Again.");
                WrongEmail.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fill The Missing Field. Then Try Again.");
        }
    }//GEN-LAST:event_jPanelSearchMouseClicked

    private void jPanelSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSearchMouseEntered
        // TODO add your handling code here:
        setColor(jPanelSearch);
    }//GEN-LAST:event_jPanelSearchMouseEntered

    private void jPanelSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSearchMouseExited
        // TODO add your handling code here:
        getColor(jPanelSearch);
    }//GEN-LAST:event_jPanelSearchMouseExited

    private void jLabelResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelResetMouseClicked
        // TODO add your handling code here:
        jTextFieldClientEmail.setText("");
        jTextFieldPass.setText("");
        jTextAreaPrint.setText("");
        WrongPassword.setVisible(false);
        WrongEmail.setVisible(false);

    }//GEN-LAST:event_jLabelResetMouseClicked

    private void jLabelResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelResetMouseEntered
        // TODO add your handling code here:
        setColor(jPanelreset);
    }//GEN-LAST:event_jLabelResetMouseEntered

    private void jLabelResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelResetMouseExited
        // TODO add your handling code here:
        getColor(jPanelreset);
    }//GEN-LAST:event_jLabelResetMouseExited

    private void jPanelresetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelresetMouseClicked
        // TODO add your handling code here:
        jTextFieldClientEmail.setText("");
        jTextFieldPass.setText("");
        jTextAreaPrint.setText("");
        WrongPassword.setVisible(false);
        WrongEmail.setVisible(false);

    }//GEN-LAST:event_jPanelresetMouseClicked

    private void jPanelresetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelresetMouseEntered
        // TODO add your handling code here:
        setColor(jPanelreset);
    }//GEN-LAST:event_jPanelresetMouseEntered

    private void jPanelresetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelresetMouseExited
        // TODO add your handling code here:
        getColor(jPanelreset);
    }//GEN-LAST:event_jPanelresetMouseExited

    private void jLabelPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPrintMouseClicked
        // TODO add your handling code here:
        try {
// TODO add your handling code here:
            boolean act = jTextAreaPrint.print();
            if (act) {
                JOptionPane.showMessageDialog(null, "Done Printing:  ", "Inforrmation", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Printing !", "Printer", JOptionPane.ERROR_MESSAGE);
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Printer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabelPrintMouseClicked

    private void jPanelPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPrintMouseClicked
        // TODO add your handling code here:
        try {
// TODO add your handling code here:
            boolean act = jTextAreaPrint.print();
            if (act) {
                JOptionPane.showMessageDialog(null, "Done Printing:  ", "Inforrmation", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Printing !", "Printer", JOptionPane.ERROR_MESSAGE);
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Printer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jPanelPrintMouseClicked

    private void jPanelPrintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPrintMouseEntered
        // TODO add your handling code here:
        setColor(jPanelPrint);
    }//GEN-LAST:event_jPanelPrintMouseEntered

    private void jLabelPrintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPrintMouseEntered
        setColor(jPanelPrint);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelPrintMouseEntered

    private void jLabelPrintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPrintMouseExited
        getColor(jPanelPrint);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelPrintMouseExited

    private void jPanelPrintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPrintMouseExited
        getColor(jPanelPrint);        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelPrintMouseExited

    private void setColor(JPanel p) {
        p.setBackground(new Color(0, 64, 128));
    }

    private void getColor(JPanel p) {
        p.setBackground(new Color(105, 105, 105));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel WrongEmail;
    private javax.swing.JPanel WrongPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelPrint;
    private javax.swing.JLabel jLabelReset;
    private javax.swing.JLabel jLabelSearch;
    private javax.swing.JPanel jPanelPrint;
    private javax.swing.JPanel jPanelSearch;
    private javax.swing.JPanel jPanelreset;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaPrint;
    private javax.swing.JTextField jTextFieldClientEmail;
    private javax.swing.JTextField jTextFieldPass;
    // End of variables declaration//GEN-END:variables
}
