/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package slangword;

import javax.swing.JOptionPane;

/**
 *
 * @author 84399
 */
public class Definition_Quiz extends javax.swing.JFrame {

    /**
     * Creates new form Definition_Quiz
     */
    String s[];
    SlangWord slangWord = new SlangWord();
    public Definition_Quiz() {
        initComponents();
        
        s = (slangWord.getInstance()).quiz(2);
        Text_Ques.setText("Slang " + "`" + s[0] + "`" + " nghia là?");
        ans_1.setText("A." + s[1]);        
        ans_2.setText("B." + s[2]);
        ans_3.setText("C." + s[3]);
        ans_4.setText("D." + s[4]);
    }
    
    public void answer(int ans) {
        System.out.println(s[ans]);
        System.out.println(s[5]);
        if (s[ans].equals(s[5])) {
                JOptionPane.showMessageDialog(this, "Correct Answer.");

        } else {
                JOptionPane.showMessageDialog(this, "Wrong Answer", "Inane error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ans_1 = new javax.swing.JButton();
        ans_2 = new javax.swing.JButton();
        ans_3 = new javax.swing.JButton();
        ans_4 = new javax.swing.JButton();
        Text_Ques = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        B_B = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ans_1.setText("jButton1");
        ans_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans_1ActionPerformed(evt);
            }
        });

        ans_2.setText("jButton2");
        ans_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans_2ActionPerformed(evt);
            }
        });

        ans_3.setText("jButton3");
        ans_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans_3ActionPerformed(evt);
            }
        });

        ans_4.setText("jButton4");
        ans_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans_4ActionPerformed(evt);
            }
        });

        Text_Ques.setText("jLabel2");

        jLabel1.setText("Definition Quiz");

        B_B.setText("BACK");
        B_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_BActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Text_Ques, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ans_1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                                .addComponent(ans_2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ans_3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ans_4, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(278, 278, 278)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(287, 287, 287)
                                .addComponent(B_B)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(Text_Ques)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ans_1)
                    .addComponent(ans_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ans_3)
                    .addComponent(ans_4))
                .addGap(33, 33, 33)
                .addComponent(B_B)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ans_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans_1ActionPerformed
        this.answer(1);
    }//GEN-LAST:event_ans_1ActionPerformed

    private void ans_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans_2ActionPerformed
        this.answer(2);
    }//GEN-LAST:event_ans_2ActionPerformed

    private void ans_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans_3ActionPerformed
        this.answer(3);
    }//GEN-LAST:event_ans_3ActionPerformed

    private void ans_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans_4ActionPerformed
        this.answer(4);
    }//GEN-LAST:event_ans_4ActionPerformed

    private void B_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_BActionPerformed
        Menu_Quiz menu_q = new Menu_Quiz();
        menu_q.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_B_BActionPerformed

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
            java.util.logging.Logger.getLogger(Definition_Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Definition_Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Definition_Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Definition_Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Definition_Quiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_B;
    private javax.swing.JLabel Text_Ques;
    private javax.swing.JButton ans_1;
    private javax.swing.JButton ans_2;
    private javax.swing.JButton ans_3;
    private javax.swing.JButton ans_4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
