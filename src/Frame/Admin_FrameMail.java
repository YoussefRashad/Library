/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import Frame.Panel.ComposeMail;
import Frame.Panel.ListMail;
import Frame.Panel.RemoveMail;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

/**
 *
 * @author DELL
 */
public class Admin_FrameMail extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    ComposeMail p1;
    ListMail p2;
    RemoveMail p3;
    GridBagLayout layout = new GridBagLayout();
    public Admin_FrameMail() {
        initComponents();
        p1 = new ComposeMail();
        p2 = new ListMail();
        p3 = new RemoveMail();
        DynamicPanel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(p1,c);
        DynamicPanel.add(p2,c);
        DynamicPanel.add(p3,c);
        
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DynamicPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        ComposeEmPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SentEmPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        SearchEmPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);

        DynamicPanel.setBackground(new java.awt.Color(105, 105, 105));

        javax.swing.GroupLayout DynamicPanelLayout = new javax.swing.GroupLayout(DynamicPanel);
        DynamicPanel.setLayout(DynamicPanelLayout);
        DynamicPanelLayout.setHorizontalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 934, Short.MAX_VALUE)
        );
        DynamicPanelLayout.setVerticalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 663, Short.MAX_VALUE)
        );

        getContentPane().add(DynamicPanel, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        ComposeEmPanel.setBackground(new java.awt.Color(0, 0, 0));
        ComposeEmPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComposeEmPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ComposeEmPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ComposeEmPanelMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Send Email_96px.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout ComposeEmPanelLayout = new javax.swing.GroupLayout(ComposeEmPanel);
        ComposeEmPanel.setLayout(ComposeEmPanelLayout);
        ComposeEmPanelLayout.setHorizontalGroup(
            ComposeEmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComposeEmPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(10, 10, 10))
        );
        ComposeEmPanelLayout.setVerticalGroup(
            ComposeEmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComposeEmPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(10, 10, 10))
        );

        SentEmPanel.setBackground(new java.awt.Color(0, 0, 0));
        SentEmPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SentEmPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SentEmPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SentEmPanelMouseExited(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Mailbox_96px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout SentEmPanelLayout = new javax.swing.GroupLayout(SentEmPanel);
        SentEmPanel.setLayout(SentEmPanelLayout);
        SentEmPanelLayout.setHorizontalGroup(
            SentEmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SentEmPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(10, 10, 10))
        );
        SentEmPanelLayout.setVerticalGroup(
            SentEmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SentEmPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(10, 10, 10))
        );

        SearchEmPanel.setBackground(new java.awt.Color(0, 0, 0));
        SearchEmPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchEmPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SearchEmPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SearchEmPanelMouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Email Document_96px.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout SearchEmPanelLayout = new javax.swing.GroupLayout(SearchEmPanel);
        SearchEmPanel.setLayout(SearchEmPanelLayout);
        SearchEmPanelLayout.setHorizontalGroup(
            SearchEmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchEmPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(10, 10, 10))
        );
        SearchEmPanelLayout.setVerticalGroup(
            SearchEmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchEmPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(10, 10, 10))
        );

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Compose Email");

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sent Mail");

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Update Email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(37, 37, 37))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(SentEmPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SearchEmPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComposeEmPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(ComposeEmPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(SentEmPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(35, 35, 35)
                .addComponent(SearchEmPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addGap(33, 33, 33))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComposeEmPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComposeEmPanelMouseClicked
        // TODO add your handling code here:
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
    }//GEN-LAST:event_ComposeEmPanelMouseClicked

    private void ComposeEmPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComposeEmPanelMouseEntered
        // TODO add your handling code here:
        ComposeEmPanel.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_ComposeEmPanelMouseEntered

    private void ComposeEmPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComposeEmPanelMouseExited
        // TODO add your handling code here:
        ComposeEmPanel.setBackground(Color.black);
    }//GEN-LAST:event_ComposeEmPanelMouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        ComposeEmPanel.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        ComposeEmPanel.setBackground(Color.black);
    }//GEN-LAST:event_jLabel1MouseExited

    private void SentEmPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SentEmPanelMouseClicked
        // TODO add your handling code here:
         p1.setVisible(false);
         p2.AddRowsToTable();
        p2.setVisible(true);
        p3.setVisible(false);
    }//GEN-LAST:event_SentEmPanelMouseClicked

    private void SentEmPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SentEmPanelMouseEntered
        // TODO add your handling code here:
        SentEmPanel.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_SentEmPanelMouseEntered

    private void SentEmPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SentEmPanelMouseExited
        // TODO add your handling code here:
        SentEmPanel.setBackground(Color.black);
    }//GEN-LAST:event_SentEmPanelMouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
         p1.setVisible(false);
         p2.AddRowsToTable();
        p2.setVisible(true);
        p3.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        SentEmPanel.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        SentEmPanel.setBackground(Color.black);
    }//GEN-LAST:event_jLabel2MouseExited

    private void SearchEmPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchEmPanelMouseClicked
        // TODO add your handling code here:
         p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(true);
    }//GEN-LAST:event_SearchEmPanelMouseClicked

    private void SearchEmPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchEmPanelMouseEntered
        // TODO add your handling code here:
        SearchEmPanel.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_SearchEmPanelMouseEntered

    private void SearchEmPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchEmPanelMouseExited
        // TODO add your handling code here:
        SearchEmPanel.setBackground(Color.black);
    }//GEN-LAST:event_SearchEmPanelMouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
         p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        SearchEmPanel.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        SearchEmPanel.setBackground(Color.black);
    }//GEN-LAST:event_jLabel3MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ComposeEmPanel;
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JPanel SearchEmPanel;
    private javax.swing.JPanel SentEmPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
