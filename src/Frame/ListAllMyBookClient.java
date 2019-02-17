/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import DataFile.Book;
import DataFile.Client;
import DataFile.Transaction;
import Safety.Validation;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class ListAllMyBookClient extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListAllMyBookClient
     */
    public ListAllMyBookClient() {
        initComponents();
        jPanelPass.setVisible(false);
        jPanelEmail.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelSuccessOrFail = new javax.swing.JLabel();
        jPasswordFieldPass = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelReset = new javax.swing.JPanel();
        jLabelReset = new javax.swing.JLabel();
        jPanelLogIn = new javax.swing.JPanel();
        jLabelLogIn = new javax.swing.JLabel();
        jPanelEmail = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelPass = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(105, 105, 105));
        setClosable(true);

        jTextFieldName.setEditable(false);
        jTextFieldName.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextFieldName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldName.setBorder(null);

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

        jTextFieldEmail.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextFieldEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldEmail.setBorder(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Gmail Login_48px.png"))); // NOI18N
        jLabel1.setText("Email");

        jLabelSuccessOrFail.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabelSuccessOrFail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSuccessOrFail.setText("List All My Book ...!");

        jPasswordFieldPass.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jPasswordFieldPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordFieldPass.setBorder(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Password_48px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Books_48px.png"))); // NOI18N
        jLabel4.setText("Name");

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

        jLabelReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Reset_48px.png"))); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelResetLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelReset)
                .addGap(10, 10, 10))
        );
        jPanelResetLayout.setVerticalGroup(
            jPanelResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelResetLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelReset)
                .addGap(10, 10, 10))
        );

        jPanelLogIn.setBackground(new java.awt.Color(105, 105, 105));
        jPanelLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelLogInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelLogInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelLogInMouseExited(evt);
            }
        });

        jLabelLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Login_48px.png"))); // NOI18N
        jLabelLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelLogInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelLogInMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelLogInLayout = new javax.swing.GroupLayout(jPanelLogIn);
        jPanelLogIn.setLayout(jPanelLogInLayout);
        jPanelLogInLayout.setHorizontalGroup(
            jPanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogInLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelLogIn)
                .addGap(10, 10, 10))
        );
        jPanelLogInLayout.setVerticalGroup(
            jPanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogInLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelLogIn)
                .addGap(10, 10, 10))
        );

        jPanelEmail.setBackground(new java.awt.Color(105, 105, 105));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Close Window_20px.png"))); // NOI18N
        jLabel2.setText("Wrong Email");

        javax.swing.GroupLayout jPanelEmailLayout = new javax.swing.GroupLayout(jPanelEmail);
        jPanelEmail.setLayout(jPanelEmailLayout);
        jPanelEmailLayout.setHorizontalGroup(
            jPanelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelEmailLayout.setVerticalGroup(
            jPanelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEmailLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        jPanelPass.setBackground(new java.awt.Color(105, 105, 105));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Close Window_20px.png"))); // NOI18N
        jLabel5.setText("Wrong Password");

        javax.swing.GroupLayout jPanelPassLayout = new javax.swing.GroupLayout(jPanelPass);
        jPanelPass.setLayout(jPanelPassLayout);
        jPanelPassLayout.setHorizontalGroup(
            jPanelPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPassLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addGap(0, 0, 0))
        );
        jPanelPassLayout.setVerticalGroup(
            jPanelPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPassLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelSuccessOrFail))
                        .addGap(0, 0, 0))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94)
                        .addComponent(jPanelLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jPanelReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabelSuccessOrFail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPasswordFieldPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanelPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanelReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelLogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLogInMouseClicked
        // TODO add your handling code here:
        if(!jTextFieldEmail.getText().equals("")&&!jPasswordFieldPass.getText().equals(""))
        {
            Validation v = new Validation();
            if(v.checkEmail(jTextFieldEmail.getText())){
                if(v.checkPass(jPasswordFieldPass.getText())){
                    Client c = new Client();
                    if((c=c.openMyProfile(jTextFieldEmail.getText(), jPasswordFieldPass.getText()))!=null){
                        Transaction t = new Transaction();
                        t = t.getTransaction(c.getID());
                        if(t!=null){
                            setTable(t);
                            jTextFieldName.setText(c.getName());
                            jLabelSuccessOrFail.setText("Welcome "+ c.getUserName() + "...! ur Books ;)");
                        }
                        else{
                            jLabelSuccessOrFail.setText("You Are not Buying Any Thing ... !  ):");
                            JOptionPane.showMessageDialog(null, "You Are not Buying Any Thing ... !  ):");
                        }
                    }
                    else{
                        jLabelSuccessOrFail.setText("Invalid ... !  Please try again");
                        JOptionPane.showMessageDialog(null, "Email OR Password is Wrong OR both are Wrong ,Try Again :(");
                        jPanelEmail.setVisible(false);
                        jPanelPass.setVisible(false);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Not valid Password length ,Should it Length\nis more than 6 OR Password has (*,/,=,+,...)\n                    Try Again :(");
                    jPanelPass.setVisible(true);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Not valid Input for Email Try Again :(");
                jPanelEmail.setVisible(true);
            }
        }
        else
        jLabelSuccessOrFail.setText("Missing Required Fields ... !  Please, complete them before submit ...! :(");
    }//GEN-LAST:event_jPanelLogInMouseClicked

    private void jPanelLogInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLogInMouseEntered
        // TODO add your handling code here:
        jPanelLogIn.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_jPanelLogInMouseEntered

    private void jPanelLogInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLogInMouseExited
        // TODO add your handling code here:
        jPanelLogIn.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_jPanelLogInMouseExited

    private void jLabelLogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogInMouseClicked
        // TODO add your handling code here:
        if(!jTextFieldEmail.getText().equals("")&&!jPasswordFieldPass.getText().equals(""))
        {
            Validation v = new Validation();
            if(v.checkEmail(jTextFieldEmail.getText())){
                if(v.checkPass(jPasswordFieldPass.getText())){
                    Client c = new Client();
                    if((c=c.openMyProfile(jTextFieldEmail.getText(), jPasswordFieldPass.getText()))!=null){
                        Transaction t = new Transaction();
                        t = t.getTransaction(c.getID());
                        if(t!=null){
                            setTable(t);
                            jTextFieldName.setText(c.getName());
                            jLabelSuccessOrFail.setText("Welcome "+ c.getUserName() + "...! ur Books ;)");
                        }
                        else{
                            jLabelSuccessOrFail.setText("You Are not Buying Any Thing ... !  ):");
                            JOptionPane.showMessageDialog(null, "You Are not Buying Any Thing ... !  ):");
                        }
                    }
                    else{
                        jLabelSuccessOrFail.setText("Invalid ... !  Please try again");
                        JOptionPane.showMessageDialog(null, "Email OR Password is Wrong OR both are Wrong ,Try Again :(");
                        jPanelEmail.setVisible(false);
                        jPanelPass.setVisible(false);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Not valid Password length ,Should it Length\nis more than 6 OR Password has (*,/,=,+,...)\n                    Try Again :(");
                    jPanelPass.setVisible(true);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Not valid Input for Email Try Again :(");
                jPanelEmail.setVisible(true);
            }
        }
        else
        jLabelSuccessOrFail.setText("Missing Required Fields ... !  Please, complete them before submit ...! :(");
    }//GEN-LAST:event_jLabelLogInMouseClicked

    private void jLabelLogInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogInMouseEntered
        // TODO add your handling code here:
        jPanelLogIn.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_jLabelLogInMouseEntered

    private void jLabelLogInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogInMouseExited
        // TODO add your handling code here:
        jPanelLogIn.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_jLabelLogInMouseExited

    private void jLabelResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelResetMouseClicked
        // TODO add your handling code here:
        jLabelSuccessOrFail.setText("List All My Book ...!");
        resetPanel();
    }//GEN-LAST:event_jLabelResetMouseClicked

    private void jLabelResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelResetMouseEntered
        // TODO add your handling code here:
        jPanelReset.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_jLabelResetMouseEntered

    private void jLabelResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelResetMouseExited
        // TODO add your handling code here:
        jPanelReset.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_jLabelResetMouseExited

    private void jPanelResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelResetMouseClicked
        // TODO add your handling code here:
       jLabelSuccessOrFail.setText("List All My Book ...!");
        resetPanel();
    }//GEN-LAST:event_jPanelResetMouseClicked

    private void jPanelResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelResetMouseEntered
        // TODO add your handling code here:
        jPanelReset.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_jPanelResetMouseEntered

    private void jPanelResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelResetMouseExited
        // TODO add your handling code here:
        jPanelReset.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_jPanelResetMouseExited
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
    private void resetPanel()
    {
        resetTable();
        jTextFieldName.setText("");
        jTextFieldEmail.setText("");
        jPasswordFieldPass.setText("");
        jPanelPass.setVisible(false);
        jPanelEmail.setVisible(false);
    }
    private void resetTable()
     {
         try{
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            while(jTable1.getRowCount()>0){
                for(int i=0;i<jTable1.getRowCount();i++)
                    model.removeRow(i);
            }
            model.removeRow(0);
        }
        catch(Exception e)
        {
            ;
        }
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelLogIn;
    private javax.swing.JLabel jLabelReset;
    private javax.swing.JLabel jLabelSuccessOrFail;
    private javax.swing.JPanel jPanelEmail;
    private javax.swing.JPanel jPanelLogIn;
    private javax.swing.JPanel jPanelPass;
    private javax.swing.JPanel jPanelReset;
    private javax.swing.JPasswordField jPasswordFieldPass;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}