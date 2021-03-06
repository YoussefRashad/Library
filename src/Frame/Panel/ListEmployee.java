/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame.Panel;

import java.util.ArrayList;

import DataFile.Employee;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class ListEmployee extends javax.swing.JPanel {

    /**
     * Creates new form ListAdmin
     */
    public ListEmployee() {
        initComponents();
        //AddRowsToTable();

    }

    public void AddRowsToTable() {
        resetTable();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        Object[] rowData = new Object[14];

        ArrayList<Employee> Emp = new Employee().ListAllEmployee();

        for (Employee a : Emp) {
            rowData[0] = a.getID();
            rowData[1] = a.getName();
            rowData[2] = a.getIDNational();
            rowData[3] = a.getEmail();
            rowData[4] = a.getPass();
            rowData[5] = a.getPhoneNo();
            rowData[6] = a.getOfficeHour();
            rowData[7] = a.getSalary();
            rowData[8] = a.getQualification();
            model.addRow(rowData);
        }

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * //////regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setFont(new java.awt.Font("Monotype Corsiva", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "IDNational", "Email", "Password", "PhoneNumber", "OfficHour", "Salary", "Qualification"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
