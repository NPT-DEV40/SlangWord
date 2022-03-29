/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package slangword;

import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author 84399
 */
public class S_L_D_E extends javax.swing.JFrame {

    /**
     * Creates new form S_L_D_E
     */
    public S_L_D_E() {
        initComponents();
        
        SlangWord slangword = new SlangWord();
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(tableData.getModel());
        Vector main = new Vector();
        Vector header = new Vector();
        header.add("STT");
        header.add("Slang Word");
        header.add("Meaning");
        String k[][] = new String[slangword.sizeMap][slangword.sizeMap];
        k = slangword.getData();
        for(int i=0;i < slangword.sizeMap;i++) {
            Vector row = new Vector();
            row.add(k[i][0]);
            row.add(k[i][1]);
            row.add(k[i][2]);
            main.add(row);
        }
        tableData.setModel(new DefaultTableModel(main,header));
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
        Search_slag = new javax.swing.JTextField();
        Search_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        Delete_slang = new javax.swing.JButton();
        Edit_Slang = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Search_definition = new javax.swing.JTextField();
        Search_button1 = new javax.swing.JButton();
        List_button = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("                Search");

        jLabel2.setText("Slag");

        Search_slag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_slagActionPerformed(evt);
            }
        });

        Search_button.setText("Search Slag");
        Search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_buttonActionPerformed(evt);
            }
        });

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Slang Word", "Meaning"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableData);

        Delete_slang.setText("DELETE");
        Delete_slang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_slangActionPerformed(evt);
            }
        });

        Edit_Slang.setText("EDIT");
        Edit_Slang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_SlangActionPerformed(evt);
            }
        });

        jLabel3.setText("Definition");

        Search_button1.setText("Search definition");
        Search_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_button1ActionPerformed(evt);
            }
        });

        List_button.setText("List");
        List_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                List_buttonActionPerformed(evt);
            }
        });

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(275, 275, 275))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Search_slag, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Search_definition, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Search_button)
                                .addGap(43, 43, 43)
                                .addComponent(Delete_slang)
                                .addGap(51, 51, 51)
                                .addComponent(List_button)))
                        .addGap(59, 59, 59)
                        .addComponent(Edit_Slang)
                        .addGap(32, 32, 32)
                        .addComponent(Search_button1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Search_slag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Search_definition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(List_button)
                    .addComponent(Edit_Slang)
                    .addComponent(Search_button1)
                    .addComponent(Delete_slang)
                    .addComponent(Search_button))
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Search_slagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_slagActionPerformed

    }//GEN-LAST:event_Search_slagActionPerformed

    private void Search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_buttonActionPerformed
        SlangWord slangword = new SlangWord();
        String key_slag = Search_slag.getText();

        Vector main = new Vector();
        Vector header = new Vector();
        header.add("STT");
        header.add("Slang Word");
        header.add("Meaning");
        String[][] temp = null;
        if(key_slag.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Nhap tu muon tim kiem vao", "Inane error",
						JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        temp = slangword.getMeaning(key_slag);
        if(temp == null) {
            JOptionPane.showMessageDialog(this, "Khong the tim thay","Inane error", JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i = 0; i < temp.length; i++) {
                    Vector row = new Vector();
                    row.add(temp[i][0]);
                    row.add(temp[i][1]);  
                    row.add(temp[i][2]);  
                    main.add(row);
            }
        }
        tableData.setModel(new DefaultTableModel(main,header));
        try {
                for (int ii = 0; ii < temp.length; ii++)
                        slangword.saveHistory(temp[ii][1], temp[ii][2]);
        } catch (Exception e1) {
                e1.printStackTrace();
        }
    }//GEN-LAST:event_Search_buttonActionPerformed

    
    private void Delete_slangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_slangActionPerformed
        SlangWord slangword = new SlangWord();
        DefaultTableModel model;
        model = (DefaultTableModel) tableData.getModel();
        int row = tableData.getSelectedRow();
        int col = tableData.getSelectedColumn();
        if(row==-1||col==-1) {
            return;
        }
        String Data = (String) tableData.getValueAt(row, 1);
        int n = JOptionPane.showConfirmDialog(this, "Ban muon xoa tu nay khong", "An Inane Question", JOptionPane.YES_NO_OPTION);
        if(n==0) {
            slangword.delete(Data, (String) tableData.getValueAt(row, 2));
            model.removeRow(row);
            JOptionPane.showMessageDialog(this, "Da xoa");
        }
    }//GEN-LAST:event_Delete_slangActionPerformed

    private void Edit_SlangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_SlangActionPerformed
        SlangWord slangword = new SlangWord();
        String dataCopy[][] = slangword.getData();
        String[][] result = new String[slangword.sizeMap][100];
        int row = tableData.getSelectedRow();
        System.out.println(row);
        int col = tableData.getSelectedColumn();
        System.out.println(col);
        if (row == col && row == -1)
                return;
        String Data = (String) tableData.getValueAt(row, col);
        if(col == 2) {
            System.out.println("Old SlangWord: \t" + row + "\t" + dataCopy[row][2]);
            System.out.println((String) tableData.getValueAt(row, 2));
            slangword.set((String) tableData.getValueAt(row, 1), dataCopy[row][2], (String) tableData.getValueAt(row, 2));
            JOptionPane.showMessageDialog(this, "Da chinh sua");
        }
        tableData.setFocusable(false);
    }//GEN-LAST:event_Edit_SlangActionPerformed

    private void Search_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_button1ActionPerformed
        SlangWord slangword = new SlangWord();
        String key_definition = Search_definition.getText();

        Vector main = new Vector();
        Vector header = new Vector();
        header.add("STT");
        header.add("Slang Word");
        header.add("Meaning");
        String[][] temp = null;
        if(key_definition.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Please input slang word you want to find", "Inane error",
						JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        temp = slangword.findDefinition(key_definition);
        if(temp == null) {
            JOptionPane.showMessageDialog(this, "Khong the tim thay","Inane error", JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i = 0; i < temp.length; i++) {
                    Vector row = new Vector();
                    row.add(temp[i][0]);
                    row.add(temp[i][1]);  
                    row.add(temp[i][2]);  
                    main.add(row);
            }
        }
        tableData.setModel(new DefaultTableModel(main,header));
        
        try {
                for (int ii = 0; ii < temp.length; ii++)
                        slangword.saveHistory(temp[ii][1], temp[ii][2]);
        } catch (Exception e1) {
                e1.printStackTrace();
        }
    }//GEN-LAST:event_Search_button1ActionPerformed

    private void List_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_List_buttonActionPerformed
        SlangWord slangword = new SlangWord();
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(tableData.getModel());
        Vector main = new Vector();
        Vector header = new Vector();
        header.add("STT");
        header.add("Slang Word");
        header.add("Meaning");
        String k[][] = new String[slangword.sizeMap][slangword.sizeMap];
        k = slangword.getData();
        for(int i=0;i < slangword.sizeMap;i++) {
            Vector row = new Vector();
            row.add(k[i][0]);
            row.add(k[i][1]);
            row.add(k[i][2]);
            main.add(row);
        }
        tableData.setModel(new DefaultTableModel(main,header));
    }//GEN-LAST:event_List_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(S_L_D_E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(S_L_D_E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(S_L_D_E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(S_L_D_E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new S_L_D_E().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete_slang;
    private javax.swing.JButton Edit_Slang;
    private javax.swing.JButton List_button;
    private javax.swing.JButton Search_button;
    private javax.swing.JButton Search_button1;
    private javax.swing.JTextField Search_definition;
    private javax.swing.JTextField Search_slag;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableData;
    // End of variables declaration//GEN-END:variables
}
