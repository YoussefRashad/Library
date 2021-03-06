/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame.Panel;

import DataFile.Book;
import DataFile.Client;
import DataFile.Transaction;
import Safety.Validation;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class ListAllMyBookClient extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public ListAllMyBookClient() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelEmail = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelSuccessOrFail = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordFieldPass = new javax.swing.JPasswordField();
        jTextFieldEmail = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelpass = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanelReset = new javax.swing.JPanel();
        jLabelReset = new javax.swing.JLabel();
        jPanelLogin = new javax.swing.JPanel();
        jLabelLogin = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(105, 105, 105));

        jPanelEmail.setBackground(new java.awt.Color(105, 105, 105));

        jLabel7.setBackground(new java.awt.Color(0, 51, 51));
        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Cancel_20px.png"))); // NOI18N
        jLabel7.setText("Wrong Email");

        javax.swing.GroupLayout jPanelEmailLayout = new javax.swing.GroupLayout(jPanelEmail);
        jPanelEmail.setLayout(jPanelEmailLayout);
        jPanelEmailLayout.setHorizontalGroup(
            jPanelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmailLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelEmailLayout.setVerticalGroup(
            jPanelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEmailLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );

        jLabel15.setBackground(new java.awt.Color(0, 51, 51));
        jLabel15.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Reset");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Gmail Login_48px.png"))); // NOI18N

        jLabelSuccessOrFail.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabelSuccessOrFail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSuccessOrFail.setText("List All My Book ...!");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Password_48px.png"))); // NOI18N

        jPasswordFieldPass.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N
        jPasswordFieldPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordFieldPass.setBorder(null);

        jTextFieldEmail.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N
        jTextFieldEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldEmail.setBorder(null);
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jPanelpass.setBackground(new java.awt.Color(105, 105, 105));

        jLabel8.setBackground(new java.awt.Color(0, 51, 51));
        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Cancel_20px.png"))); // NOI18N
        jLabel8.setText("Wrong Password");

        javax.swing.GroupLayout jPanelpassLayout = new javax.swing.GroupLayout(jPanelpass);
        jPanelpass.setLayout(jPanelpassLayout);
        jPanelpassLayout.setHorizontalGroup(
            jPanelpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelpassLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelpassLayout.setVerticalGroup(
            jPanelpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelpassLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Books_48px.png"))); // NOI18N
        jLabel4.setText("Name");

        jTextFieldName.setEditable(false);
        jTextFieldName.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N
        jTextFieldName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldName.setBorder(null);

        jLabel11.setBackground(new java.awt.Color(0, 51, 51));
        jLabel11.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Login");

        jPanelReset.setBackground(new java.awt.Color(105, 105, 105));
        jPanelReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelResetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelResetMouseExited(evt);
            }
        });

        jLabelReset.setBackground(new java.awt.Color(0, 51, 51));
        jLabelReset.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabelReset.setForeground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout jPanelResetLayout = new javax.swing.GroupLayout(jPanelReset);
        jPanelReset.setLayout(jPanelResetLayout);
        jPanelResetLayout.setHorizontalGroup(
            jPanelResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelReset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelResetLayout.setVerticalGroup(
            jPanelResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelReset)
                .addGap(10, 10, 10))
        );

        jPanelLogin.setBackground(new java.awt.Color(105, 105, 105));
        jPanelLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelLoginMouseExited(evt);
            }
        });

        jLabelLogin.setBackground(new java.awt.Color(0, 51, 51));
        jLabelLogin.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabelLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Login_48px.png"))); // NOI18N
        jLabelLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelLoginMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelLogin)
                .addContainerGap())
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelLogin)
                .addGap(10, 10, 10))
        );

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDBook", "NameBook", "Salary", "No Of Books"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jPasswordFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(121, 121, 121)
                                        .addComponent(jPanelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanelReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSuccessOrFail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jPanelpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSuccessOrFail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jPanelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPasswordFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jLabelResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelResetMouseClicked
        // TODO add your handling code here:
        resetPanel();
        jLabelSuccessOrFail.setText("List All My Book ...!");
    }//GEN-LAST:event_jLabelResetMouseClicked

    private void jLabelResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelResetMouseEntered
        // TODO add your handling code here:
        SetColorPanel(jPanelReset);
    }//GEN-LAST:event_jLabelResetMouseEntered

    private void jLabelResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelResetMouseExited
        // TODO add your handling code here:
        GetColorPanel(jPanelReset);
    }//GEN-LAST:event_jLabelResetMouseExited

    private void jPanelResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelResetMouseClicked
        // TODO add your handling code here:
        resetPanel();
        jLabelSuccessOrFail.setText("List All My Book ...!");
    }//GEN-LAST:event_jPanelResetMouseClicked

    private void jPanelResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelResetMouseEntered
        // TODO add your handling code here:
        SetColorPanel(jPanelReset);
    }//GEN-LAST:event_jPanelResetMouseEntered

    private void jPanelResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelResetMouseExited
        // TODO add your handling code here:
        GetColorPanel(jPanelReset);
    }//GEN-LAST:event_jPanelResetMouseExited

    private void jLabelLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginMouseClicked
        // TODO add your handling code here:
        Login();
    }//GEN-LAST:event_jLabelLoginMouseClicked

    private void jLabelLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginMouseEntered
        // TODO add your handling code here:
        SetColorPanel(jPanelLogin);
    }//GEN-LAST:event_jLabelLoginMouseEntered

    private void jLabelLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginMouseExited
        // TODO add your handling code here:
        GetColorPanel(jPanelLogin);
    }//GEN-LAST:event_jLabelLoginMouseExited

    private void jPanelLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLoginMouseClicked
        // TODO add your handling code here:
        Login();
        
    }//GEN-LAST:event_jPanelLoginMouseClicked

    private void jPanelLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLoginMouseEntered
        // TODO add your handling code here:
        GetColorPanel(jPanelLogin);
    }//GEN-LAST:event_jPanelLoginMouseEntered

    private void jPanelLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLoginMouseExited
        // TODO add your handling code here:
        GetColorPanel(jPanelLogin);
    }//GEN-LAST:event_jPanelLoginMouseExited

    
    private void setTable(Transaction c)
     {
         resetTable();
         ArrayList<Transaction> arr = new ArrayList<Transaction>();
         Transaction re = new Transaction();
         for(int i=0;i<c.Books_ID.size();i++)
             arr.add(re.returnInfoItem(c.Books_ID.get(i)));
         
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object rowData[] = new Object[4];
        for(int i=0;i<arr.size();i++)
        {
            for(int j=0;j<arr.get(i).Books_ID.size();j++)
            {
                rowData [0]=arr.get(i).Books_ID.get(j);
                rowData [1]=arr.get(i).BooksName.get(j);
                rowData [2]=arr.get(i).Books_Salary.get(j);
                rowData [3]=arr.get(i).Books_No.get(j);
                model.addRow(rowData);
            }
        }
    }

    private void resetPanel() {
        FALL();
        
        resetTable();
        jTextFieldName.setText("");
        jTextFieldEmail.setText("");
        jPasswordFieldPass.setText("");
        jPanelpass.setVisible(false);
        jPanelEmail.setVisible(false);
        Frist_Half();
    }

    private void resetTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            while (jTable1.getRowCount() > 0) {
                
                for (int i = 0; i < jTable1.getRowCount(); i++) {
                    model.removeRow(i);
                }
            }
            model.removeRow(0);
        } catch (Exception e) {
            ;
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelReset;
    private javax.swing.JLabel jLabelSuccessOrFail;
    private javax.swing.JPanel jPanelEmail;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelReset;
    private javax.swing.JPanel jPanelpass;
    private javax.swing.JPasswordField jPasswordFieldPass;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
private void SetColorPanel(JPanel p) {

        p.setBackground(new java.awt.Color(0,64,128));
    }

    private void GetColorPanel(JPanel p) {

        p.setBackground(new Color(105, 105, 105));
    }

    private void Login() {
          if (!jTextFieldEmail.getText().equals("") && !jPasswordFieldPass.getText().equals("")) {
            Validation v = new Validation();
            if (v.checkEmail(jTextFieldEmail.getText())) {
                if (v.checkPass(jPasswordFieldPass.getText())) {
                    Client c = new Client();
                    if ((c = c.openMyProfile(jTextFieldEmail.getText(), jPasswordFieldPass.getText())) != null) {
                        Transaction t = new Transaction();
                        t = t.getTransaction(c.getID());
                        if (t != null) {
                            setTable(t);
                            jTextFieldName.setText(c.getName());
                            jLabelSuccessOrFail.setText("Welcome " + c.getUserName() + "...! ur Book ;)");
                        } else {
                            jTextFieldName.setText(c.getName());
                            jLabelSuccessOrFail.setText("You Not Have any Books from Our Library , Sorry :( ");
                            JOptionPane.showMessageDialog(null, "You Not Have any Books from Our Library , Sorry :( ");
                        }
                    } else {
                        jLabelSuccessOrFail.setText("Invalid ... !  Please try again");
                        JOptionPane.showMessageDialog(null, "Email OR Password is Wrong OR both are Wrong ,Try Again :(");
//                    jPanelWrongEmail.setVisible(false);
//                    jPanelWrongPass.setVisible(false);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Not valid Password length ,Should it Length\nis more than 6 OR Password has (*,/,=,+,...)\n                    Try Again :(");
//                    jPanelWrongPass.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Not valid Input for Email Try Again :(");
//                jPanelWrongEmail.setVisible(true);
            }
        } else {
            jLabelSuccessOrFail.setText("Missing Required Fields ... !  Please, complete them before submit ...! :(");
        }
    }
     private void Frist_Half() {
        jTextFieldEmail.setEnabled(true);
        jTextFieldName.setEnabled(false);
        jPasswordFieldPass.setEnabled(true);
    }

    private void second_Half() {
        jTextFieldEmail.setEnabled(false);
        jTextFieldName.setEnabled(true);
        jPasswordFieldPass.setEnabled(false);
    }

    private void FALL() {
         jTextFieldEmail.setEnabled(true);
        jTextFieldName.setEnabled(true);
        jPasswordFieldPass.setEnabled(true);
        
    }
}

