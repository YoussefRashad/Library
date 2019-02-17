package Frame.Panel;

import DataFile.Mail;
import Safety.Validation;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class RemoveMail extends javax.swing.JPanel {

    ArrayList<Mail> mail;
    ArrayList<Object> specific;
    ArrayList<Object> done;
    ArrayList<Integer> eID;
    String eName;
    DefaultTableModel manipulate;
    
    public RemoveMail() {
        initComponents();
        this.mail = new Mail().ListMails();
        for(Mail m : mail)
            jComboBoxToMail.addItem(m.getToEmail());
         jPanelWrongEmail.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel24 = new javax.swing.JLabel();
        jPanelAdd = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanelRemove = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelSuccessOfFail = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldIDMail = new javax.swing.JTextField();
        jComboBoxSelected = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxToMail = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanelReset8 = new javax.swing.JPanel();
        jLabelReset8 = new javax.swing.JLabel();
        jPanelsearch = new javax.swing.JPanel();
        jLabelsearch = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        jPanelAdd1 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanelRemove1 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanelRemove2 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanelRemove3 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jPanelWrongEmail = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();

        jLabel24.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Add Item");

        jPanelAdd.setBackground(new java.awt.Color(105, 105, 105));
        jPanelAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelAddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelAddMouseExited(evt);
            }
        });

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Plus_48px.png"))); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel25MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelAddLayout = new javax.swing.GroupLayout(jPanelAdd);
        jPanelAdd.setLayout(jPanelAddLayout);
        jPanelAddLayout.setHorizontalGroup(
            jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelAddLayout.setVerticalGroup(
            jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel25)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel26.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Remove Item");

        jPanelRemove.setBackground(new java.awt.Color(105, 105, 105));
        jPanelRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelRemoveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelRemoveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelRemoveMouseExited(evt);
            }
        });

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Cancel_48px.png"))); // NOI18N
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel27MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel27MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelRemoveLayout = new javax.swing.GroupLayout(jPanelRemove);
        jPanelRemove.setLayout(jPanelRemoveLayout);
        jPanelRemoveLayout.setHorizontalGroup(
            jPanelRemoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRemoveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelRemoveLayout.setVerticalGroup(
            jPanelRemoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRemoveLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel27)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(105, 105, 105));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("To Mail");

        jLabelSuccessOfFail.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabelSuccessOfFail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSuccessOfFail.setText("Remove Mail ...!");

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Mail", "To", "Cc", "Subject", "EmailBody"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Mail");

        jComboBoxSelected.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N
        jComboBoxSelected.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jComboBoxSelected.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID Mail selected");

        jComboBoxToMail.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N
        jComboBoxToMail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jComboBoxToMail.setBorder(null);

        jLabel13.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Search");

        jLabel14.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Reset");

        jPanelReset8.setBackground(new java.awt.Color(105, 105, 105));
        jPanelReset8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelReset8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelReset8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelReset8MouseExited(evt);
            }
        });

        jLabelReset8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Reset_48px.png"))); // NOI18N
        jLabelReset8.setText("Items");
        jLabelReset8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelReset8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelReset8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelReset8MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelReset8Layout = new javax.swing.GroupLayout(jPanelReset8);
        jPanelReset8.setLayout(jPanelReset8Layout);
        jPanelReset8Layout.setHorizontalGroup(
            jPanelReset8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReset8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelReset8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelReset8Layout.setVerticalGroup(
            jPanelReset8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReset8Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelReset8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelsearch.setBackground(new java.awt.Color(105, 105, 105));
        jPanelsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelsearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelsearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelsearchMouseExited(evt);
            }
        });

        jLabelsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Search_48px.png"))); // NOI18N
        jLabelsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelsearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelsearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelsearchMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelsearchLayout = new javax.swing.GroupLayout(jPanelsearch);
        jPanelsearch.setLayout(jPanelsearchLayout);
        jPanelsearchLayout.setHorizontalGroup(
            jPanelsearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelsearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelsearch, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelsearchLayout.setVerticalGroup(
            jPanelsearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelsearchLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelsearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel28.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Add ");

        jPanelAdd1.setBackground(new java.awt.Color(105, 105, 105));
        jPanelAdd1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelAdd1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelAdd1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelAdd1MouseExited(evt);
            }
        });

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Plus_48px.png"))); // NOI18N
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel29MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel29MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelAdd1Layout = new javax.swing.GroupLayout(jPanelAdd1);
        jPanelAdd1.setLayout(jPanelAdd1Layout);
        jPanelAdd1Layout.setHorizontalGroup(
            jPanelAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdd1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelAdd1Layout.setVerticalGroup(
            jPanelAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdd1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel29)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel30.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Remove Selected");

        jPanelRemove1.setBackground(new java.awt.Color(105, 105, 105));
        jPanelRemove1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelRemove1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelRemove1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelRemove1MouseExited(evt);
            }
        });

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Cancel_48px.png"))); // NOI18N
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel31MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel31MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelRemove1Layout = new javax.swing.GroupLayout(jPanelRemove1);
        jPanelRemove1.setLayout(jPanelRemove1Layout);
        jPanelRemove1Layout.setHorizontalGroup(
            jPanelRemove1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRemove1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelRemove1Layout.setVerticalGroup(
            jPanelRemove1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRemove1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel31)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel32.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));

        jLabel33.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Remove All");

        jPanelRemove2.setBackground(new java.awt.Color(105, 105, 105));
        jPanelRemove2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelRemove2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelRemove2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelRemove2MouseExited(evt);
            }
        });

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Trash_48px.png"))); // NOI18N
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel34MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel34MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelRemove2Layout = new javax.swing.GroupLayout(jPanelRemove2);
        jPanelRemove2.setLayout(jPanelRemove2Layout);
        jPanelRemove2Layout.setHorizontalGroup(
            jPanelRemove2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRemove2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelRemove2Layout.setVerticalGroup(
            jPanelRemove2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRemove2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel34)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel35.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Remove Mails");

        jPanelRemove3.setBackground(new java.awt.Color(105, 105, 105));
        jPanelRemove3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelRemove3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelRemove3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelRemove3MouseExited(evt);
            }
        });

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Cancel_48px.png"))); // NOI18N
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel36MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel36MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelRemove3Layout = new javax.swing.GroupLayout(jPanelRemove3);
        jPanelRemove3.setLayout(jPanelRemove3Layout);
        jPanelRemove3Layout.setHorizontalGroup(
            jPanelRemove3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRemove3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelRemove3Layout.setVerticalGroup(
            jPanelRemove3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRemove3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel36)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelWrongEmail.setBackground(new java.awt.Color(105, 105, 105));

        jLabel16.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Cancel_20px.png"))); // NOI18N
        jLabel16.setText("Wrong ID");

        javax.swing.GroupLayout jPanelWrongEmailLayout = new javax.swing.GroupLayout(jPanelWrongEmail);
        jPanelWrongEmail.setLayout(jPanelWrongEmailLayout);
        jPanelWrongEmailLayout.setHorizontalGroup(
            jPanelWrongEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWrongEmailLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelWrongEmailLayout.setVerticalGroup(
            jPanelWrongEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWrongEmailLayout.createSequentialGroup()
                .addComponent(jLabel16)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jTextFieldIDMail, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanelWrongEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)
                        .addComponent(jComboBoxSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(347, 347, 347)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanelRemove1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanelRemove2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanelRemove3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxToMail, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelSuccessOfFail, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanelsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanelReset8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(285, 285, 285))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelSuccessOfFail)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jComboBoxToMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelReset8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel14))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldIDMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jPanelWrongEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelRemove1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel33)))
                            .addComponent(jLabel32)
                            .addComponent(jPanelRemove2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jPanelAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelRemove3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel35)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelReset8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReset8MouseClicked
        // TODO add your handling code here:
        Reset();
    }//GEN-LAST:event_jLabelReset8MouseClicked

    private void jLabelReset8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReset8MouseEntered
        // TODO add your handling code here
        SetColorPanel(jPanelReset8);
    }//GEN-LAST:event_jLabelReset8MouseEntered

    private void jLabelReset8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReset8MouseExited
        // TODO add your handling code here:
        GetColorPanel(jPanelReset8);
    }//GEN-LAST:event_jLabelReset8MouseExited

    private void jPanelReset8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelReset8MouseClicked
        // TODO add your handling code here:
        Reset();
    }//GEN-LAST:event_jPanelReset8MouseClicked

    private void jPanelReset8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelReset8MouseEntered
        // TODO add your handling code here:
        SetColorPanel(jPanelReset8);
    }//GEN-LAST:event_jPanelReset8MouseEntered

    private void jPanelReset8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelReset8MouseExited
        // TODO add your handling code here:
        GetColorPanel(jPanelReset8);
    }//GEN-LAST:event_jPanelReset8MouseExited

    private void jLabelsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelsearchMouseClicked
        // TODO add your handling code here:
        Search();
    }//GEN-LAST:event_jLabelsearchMouseClicked

    private void jLabelsearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelsearchMouseEntered
        // TODO add your handling code here:
        SetColorPanel(jPanelsearch);
    }//GEN-LAST:event_jLabelsearchMouseEntered

    private void jLabelsearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelsearchMouseExited
        // TODO add your handling code here:
        GetColorPanel(jPanelsearch);
    }//GEN-LAST:event_jLabelsearchMouseExited

    private void jPanelsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelsearchMouseClicked
        // TODO add your handling code here:
        Search();
    }//GEN-LAST:event_jPanelsearchMouseClicked

    private void jPanelsearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelsearchMouseEntered
        // TODO add your handling code here:
        SetColorPanel(jPanelsearch);
    }//GEN-LAST:event_jPanelsearchMouseEntered

    private void jPanelsearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelsearchMouseExited
        // TODO add your handling code here:
        GetColorPanel(jPanelsearch);
    }//GEN-LAST:event_jPanelsearchMouseExited

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel25MouseEntered

    private void jLabel25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseExited
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jLabel25MouseExited

    private void jPanelAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAddMouseClicked
        // TODO add your handling code here:

        
    }//GEN-LAST:event_jPanelAddMouseClicked

    private void jPanelAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAddMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanelAddMouseEntered

    private void jPanelAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAddMouseExited
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jPanelAddMouseExited

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseEntered
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jLabel27MouseEntered

    private void jLabel27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel27MouseExited

    private void jPanelRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRemoveMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jPanelRemoveMouseClicked

    private void jPanelRemoveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRemoveMouseEntered
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jPanelRemoveMouseEntered

    private void jPanelRemoveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRemoveMouseExited
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jPanelRemoveMouseExited

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        // TODO add your handling code here:
        AddItem();
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseEntered
        // TODO add your handling code here:
        SetColorPanel(jPanelAdd);
    }//GEN-LAST:event_jLabel29MouseEntered

    private void jLabel29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseExited
        // TODO add your handling code here:
        GetColorPanel(jPanelAdd);
    }//GEN-LAST:event_jLabel29MouseExited

    private void jPanelAdd1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAdd1MouseClicked
        // TODO add your handling code here:

        AddItem();
    }//GEN-LAST:event_jPanelAdd1MouseClicked

    private void jPanelAdd1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAdd1MouseEntered
        // TODO add your handling code here:
        SetColorPanel(jPanelAdd);
    }//GEN-LAST:event_jPanelAdd1MouseEntered

    private void jPanelAdd1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAdd1MouseExited
        // TODO add your handling code here:
        GetColorPanel(jPanelAdd);
    }//GEN-LAST:event_jPanelAdd1MouseExited

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        // TODO add your handling code here:
        Remove();
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseEntered
        // TODO add your handling code here:
        SetColorPanel(jPanelRemove1);
    }//GEN-LAST:event_jLabel31MouseEntered

    private void jLabel31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseExited
          GetColorPanel(jPanelRemove1);
    }//GEN-LAST:event_jLabel31MouseExited

    private void jPanelRemove1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRemove1MouseClicked
        // TODO add your handling code here:
         Remove();
    }//GEN-LAST:event_jPanelRemove1MouseClicked

    private void jPanelRemove1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRemove1MouseEntered
        // TODO add your handling code here:
        SetColorPanel(jPanelRemove1);
    }//GEN-LAST:event_jPanelRemove1MouseEntered

    private void jPanelRemove1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRemove1MouseExited
        // TODO add your handling code here:
        GetColorPanel(jPanelRemove2);
    }//GEN-LAST:event_jPanelRemove1MouseExited

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        // TODO add your handling code here:
         RemoveAll();
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseEntered
        // TODO add your handling code here:
         GetColorPanel(jPanelRemove2);
    }//GEN-LAST:event_jLabel34MouseEntered

    private void jLabel34MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseExited
        // TODO add your handling code here:
         GetColorPanel(jPanelRemove2);
    }//GEN-LAST:event_jLabel34MouseExited

    private void jPanelRemove2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRemove2MouseClicked
        // TODO add your handling code here:
        RemoveAll();
    }//GEN-LAST:event_jPanelRemove2MouseClicked

    private void jPanelRemove2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRemove2MouseEntered
        // TODO add your handling code here:
         SetColorPanel(jPanelRemove3);
    }//GEN-LAST:event_jPanelRemove2MouseEntered

    private void jPanelRemove2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRemove2MouseExited
        // TODO add your handling code here:
         GetColorPanel(jPanelRemove3);
    }//GEN-LAST:event_jPanelRemove2MouseExited

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        // TODO add your handling code here:
        RemoveMails();
    }//GEN-LAST:event_jLabel36MouseClicked

    private void jLabel36MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseEntered
        // TODO add your handling code here:
         SetColorPanel(jPanelRemove3);
    }//GEN-LAST:event_jLabel36MouseEntered

    private void jLabel36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseExited
        // TODO add your handling code here:
         GetColorPanel(jPanelRemove3);
    }//GEN-LAST:event_jLabel36MouseExited

    private void jPanelRemove3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRemove3MouseClicked
        // TODO add your handling code here:
         RemoveMails();
    }//GEN-LAST:event_jPanelRemove3MouseClicked

    private void jPanelRemove3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRemove3MouseEntered
        // TODO add your handling code here:
         SetColorPanel(jPanelRemove3);
    }//GEN-LAST:event_jPanelRemove3MouseEntered

    private void jPanelRemove3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRemove3MouseExited
        // TODO add your handling code here:
         GetColorPanel(jPanelRemove3);
    }//GEN-LAST:event_jPanelRemove3MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxSelected;
    private javax.swing.JComboBox<String> jComboBoxToMail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelReset8;
    private javax.swing.JLabel jLabelSuccessOfFail;
    private javax.swing.JLabel jLabelsearch;
    private javax.swing.JPanel jPanelAdd;
    private javax.swing.JPanel jPanelAdd1;
    private javax.swing.JPanel jPanelRemove;
    private javax.swing.JPanel jPanelRemove1;
    private javax.swing.JPanel jPanelRemove2;
    private javax.swing.JPanel jPanelRemove3;
    private javax.swing.JPanel jPanelReset8;
    private javax.swing.JPanel jPanelWrongEmail;
    private javax.swing.JPanel jPanelsearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldIDMail;
    // End of variables declaration//GEN-END:variables
  private void SetColorPanel(JPanel p) {

        p.setBackground(new Color(0, 64, 128));
    }

    private void GetColorPanel(JPanel p) {

        p.setBackground(new Color(105,105,105));
    }

    private void Search() {
           this.manipulate = (DefaultTableModel) jTable1.getModel();
        Object [] columns = new Object[5];
        
        this.eName = (String) jComboBoxToMail.getSelectedItem();
        this.eID = new ArrayList<>();
        this.specific = new ArrayList<>();
        jComboBoxToMail.setEnabled(false);
        
        if(!this.specific.isEmpty())
            this.specific.clear();
        
        for(Mail m : this.mail)
        {
            if(m.getToEmail().equals(this.eName))
            {
                columns[0] = m.getIDMail();
                this.eID.add(m.getIDMail());
                columns[1] = m.getToEmail();
                columns[2] = m.getCcEmail();
                columns[3] = m.getSubject();
                columns[4] = m.getEmailbody();
                
                this.specific.add(this.mail);
                this.manipulate.addRow(columns);
            }
        }
    }

    private void Reset() {
         for(int counter = jTable1.getRowCount()-1; counter >= 0; counter--) this.manipulate.removeRow(counter);
        jComboBoxToMail.setSelectedIndex(0);
        jComboBoxToMail.setEnabled(true);
        jTextFieldIDMail.setText("");
        new javax.swing.DefaultComboBoxModel<>(new String[] {  });
        jPanelWrongEmail.setVisible(false);
    }

    private void AddItem() {
         Validation validate = new Validation();
        this.done = new ArrayList<>();
        jTextFieldIDMail.setEditable(false);
        boolean found = false;
        
        if(!jTextFieldIDMail.getText().equals(""))
        {
            if(validate.checkID(jTextFieldIDMail.getText()))
            {
                for(int counter = 0; counter < this.eID.size(); counter++)
                {
                    if(jTextFieldIDMail.getText().equals(this.eID.get(counter)))
                    {
                        found = true;
                        this.done.add(this.specific.get(counter));
                        jComboBoxSelected.addItem(jTextFieldIDMail.getText());
                    }
                }
                if(!found)
                    JOptionPane.showMessageDialog(null, "This ID Does Not Exist. Please Try Again.");
                    
                jTextFieldIDMail.setEditable(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid ID. Please Try Again.");
                jTextFieldIDMail.setEditable(true);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please Fill The Missing Field.");
            jTextFieldIDMail.setEditable(true);
        }
    }

    private void Remove() {
        int id = (int)jComboBoxSelected.getSelectedItem();
        jComboBoxSelected.setEnabled(false);
        
        for(int counter = 0; counter < this.done.size(); counter++)
        {
            if(this.eID.get(counter).equals(id))
            {
                this.done.remove(counter);
                jComboBoxSelected.removeItem(id);
            }
        }
        jComboBoxSelected.setEnabled(true);
    }

    private void RemoveAll() {
        this.done.clear();
        new javax.swing.DefaultComboBoxModel<>(new String[] {  });
    }

    private void RemoveMails() {
      Mail finish = new Mail();
        finish.RemoveEmail(this.eName);
    }

   

}
