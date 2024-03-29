/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalmanagement;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author Carl
 */
public class RENT_A_CAR extends javax.swing.JFrame {

    /**
     * Creates new form RENT_A_CAR
     */
    public RENT_A_CAR() {
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        returncar_lbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rentacar_lbl = new javax.swing.JLabel();
        carplate1_lbl = new javax.swing.JLabel();
        name1_lbl = new javax.swing.JLabel();
        date_lbl = new javax.swing.JLabel();
        duedate_lbl = new javax.swing.JLabel();
        PlateNo = new javax.swing.JComboBox<>();
        savebtn1 = new javax.swing.JButton();
        clearbtn1 = new javax.swing.JButton();
        namefield1 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        savebtn2 = new javax.swing.JButton();
        clearbtn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car Plate no", "Name", "Return Date"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        returncar_lbl.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        returncar_lbl.setText("RETURN CAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(returncar_lbl)
                        .addGap(179, 179, 179))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(returncar_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(555, Short.MAX_VALUE))
        );

        rentacar_lbl.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        rentacar_lbl.setText("RENT A CAR");

        carplate1_lbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        carplate1_lbl.setText("Car plate no:");

        name1_lbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        name1_lbl.setText("Name:");

        date_lbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        date_lbl.setText("Date:");

        duedate_lbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        duedate_lbl.setText("Due Date:");

        PlateNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "DAK3186", "NBJ1432", "ACU1122", "JAK2314" }));
        PlateNo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PlateNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlateNoActionPerformed(evt);
            }
        });

        savebtn1.setText("Save");
        savebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtn1ActionPerformed(evt);
            }
        });

        clearbtn1.setText("Clear");
        clearbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtn1ActionPerformed(evt);
            }
        });

        namefield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namefield1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car Plate no", "Name", "Date", "Due Date"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        savebtn2.setText("Return");
        savebtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtn2ActionPerformed(evt);
            }
        });

        clearbtn2.setText("Clear");
        clearbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carplate1_lbl)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(duedate_lbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(savebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(clearbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(name1_lbl)
                                        .addComponent(date_lbl))
                                    .addGap(162, 162, 162)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(namefield1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PlateNo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(rentacar_lbl)
                                    .addGap(15, 15, 15)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(savebtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(clearbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rentacar_lbl)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carplate1_lbl)
                    .addComponent(PlateNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name1_lbl)
                    .addComponent(namefield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_lbl)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(duedate_lbl, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clearbtn1)
                            .addComponent(savebtn1))))
                .addGap(65, 65, 65)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(savebtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearbtn2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlateNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlateNoActionPerformed
     String[] genderArray = {"DAK3186", "NBJ1432", "ACU1122", "JAK2314"};
        JComboBox genderOption = new JComboBox(genderArray);            
    }//GEN-LAST:event_PlateNoActionPerformed

    private void savebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtn1ActionPerformed
SimpleDateFormat dFormat = new SimpleDateFormat ("yyyy-MM-dd");
String date = dFormat.format(jDateChooser1.getDate());
String date2 = dFormat.format(jDateChooser2.getDate());
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
       model.addRow(new Object[]{PlateNo.getSelectedIndex(),
                                 namefield1.getText(),
                                 date,
                                 date2,
                                    });
                                    }//GEN-LAST:event_savebtn1ActionPerformed

    private void clearbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtn1ActionPerformed
        PlateNo.setSelectedIndex(0);
        namefield1.setText(" ");
        jDateChooser1.setCalendar(null);
        jDateChooser2.setCalendar(null);

    }//GEN-LAST:event_clearbtn1ActionPerformed

    private void savebtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtn2ActionPerformed
        TableModel model1 = jTable2.getModel();
        int[] indexs = jTable2.getSelectedRows();
      Object [] row = new Object [4];
      DefaultTableModel model2 = (DefaultTableModel) jTable3.getModel();
      for (int i = 0; i <indexs.length; i++){
          row[0]=model1.getValueAt(indexs[i], 0);
          row[1]=model1.getValueAt(indexs[i], 1);
          row[2]=model1.getValueAt(indexs[i], 3);
          row[3]=model1.getValueAt(indexs[i], 3);
          
          
          model2.addRow(row);
      }
      
    }//GEN-LAST:event_savebtn2ActionPerformed

    private void clearbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtn2ActionPerformed
        

    }//GEN-LAST:event_clearbtn2ActionPerformed

    private void namefield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namefield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namefield1ActionPerformed

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
            java.util.logging.Logger.getLogger(RENT_A_CAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RENT_A_CAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RENT_A_CAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RENT_A_CAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RENT_A_CAR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> PlateNo;
    private javax.swing.JLabel carplate1_lbl;
    private javax.swing.JButton clearbtn1;
    private javax.swing.JButton clearbtn2;
    private javax.swing.JLabel date_lbl;
    private javax.swing.JLabel duedate_lbl;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel name1_lbl;
    private javax.swing.JTextField namefield1;
    private javax.swing.JLabel rentacar_lbl;
    private javax.swing.JLabel returncar_lbl;
    private javax.swing.JButton savebtn1;
    private javax.swing.JButton savebtn2;
    // End of variables declaration//GEN-END:variables
}
