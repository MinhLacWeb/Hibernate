/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import BUS.BillBUS;
import Entity.customer;
import Entity.bill;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Admin
 */
public class BillGUI extends javax.swing.JFrame {
    private BillBUS bBUS = new BillBUS();
    /**
     * Creates new form OrderGUI
     */
    public BillGUI() {
        initComponents();
        list();
        outModel((ArrayList<bill>) bBUS.getList());
    }
    
    public void outModel(ArrayList<bill> arrBill) // Xuất ra Table từ ArrayList
    {
        DefaultTableModel defaultModel = (DefaultTableModel) tbl_bill.getModel();
        Vector data;
        defaultModel.setRowCount(0);
        for (bill b : arrBill) {
            data = new Vector();
            data.add(b.getBillID());
            data.add(b.getCustomerID());
            data.add(b.getDate());
            data.add(b.getTotal());
            data.add(b.getNote());
            defaultModel.addRow(data);
        }
        tbl_bill.setModel(defaultModel);
    }

    public void list() // Chép ArrayList lên table
    {
        if (bBUS.getList() == null) {
            bBUS.list();
        }
        ArrayList<bill> arrBill = (ArrayList<bill>) bBUS.getList();
//        model.setRowCount(0);
        outModel(arrBill);
    }
    
    private void Search()
    {
        String billID = jlb_billid.getText();
        String customerID = jlb_customerid.getText();
        String date = jlb_date.getText();
        
        outModel(bBUS.search(billID,customerID,date));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_bill = new javax.swing.JTable();
        btn_add = new javax.swing.JToggleButton();
        btn_Refresh = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlb_billid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlb_ed = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jlb_customerid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jlb_date = new javax.swing.JTextField();
        txt_studentID = new javax.swing.JLabel();
        jlb_lastname = new javax.swing.JLabel();
        jlb_firstname = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jlb_student1 = new javax.swing.JLabel();
        txt_studentID1 = new javax.swing.JLabel();
        txt_studentID2 = new javax.swing.JLabel();
        jlb_firstname1 = new javax.swing.JLabel();
        txt_studentID3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Bill Management");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 261, 77));

        tbl_bill.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbl_bill.setForeground(new java.awt.Color(255, 153, 51));
        tbl_bill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "customerID", "Date", "total","note"
            }
        )
        {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        }

    );
    tbl_bill.setRowHeight(40);
    tbl_bill.setRowMargin(2);
    tbl_bill.setSelectionBackground(new java.awt.Color(153, 255, 153));
    tbl_bill.setSelectionForeground(new java.awt.Color(0, 0, 0));
    tbl_bill.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tbl_billMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tbl_bill);

    jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 101, 1270, 157));

    btn_add.setBackground(new java.awt.Color(102, 255, 102));
    btn_add.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    btn_add.setForeground(new java.awt.Color(255, 255, 255));
    btn_add.setText("Xem");
    btn_add.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            btn_addMouseClicked(evt);
        }
    });
    btn_add.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_addActionPerformed(evt);
        }
    });
    jPanel1.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 610, 230, 90));

    btn_Refresh.setBackground(new java.awt.Color(102, 255, 255));
    btn_Refresh.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    btn_Refresh.setForeground(new java.awt.Color(255, 255, 255));
    btn_Refresh.setText("Làm Mới");
    btn_Refresh.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            btn_RefreshMouseClicked(evt);
        }
    });
    btn_Refresh.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_RefreshActionPerformed(evt);
        }
    });
    jPanel1.add(btn_Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 610, 230, 90));
    jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, 60));

    jLabel3.setBackground(new java.awt.Color(255, 255, 255));
    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 153, 51));
    jLabel3.setText("Search:");
    jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 352, 146, 50));
    jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 352, -1, -1));

    jlb_billid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jlb_billid.setForeground(new java.awt.Color(255, 153, 51));
    jlb_billid.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jlb_billidActionPerformed(evt);
        }
    });
    jlb_billid.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jlb_billidKeyReleased(evt);
        }
    });
    jPanel1.add(jlb_billid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 190, 52));

    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(255, 153, 51));
    jLabel5.setText("BillID:");
    jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 138, 52));

    jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 153, 51));
    jLabel6.setText("Total:");
    jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 412, 110, 50));

    jlb_ed.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jlb_ed.setForeground(new java.awt.Color(255, 153, 51));
    jlb_ed.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jlb_edActionPerformed(evt);
        }
    });
    jlb_ed.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jlb_edKeyReleased(evt);
        }
    });
    jPanel1.add(jlb_ed, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 410, 250, 52));

    jSeparator1.setBackground(new java.awt.Color(255, 153, 51));
    jSeparator1.setForeground(new java.awt.Color(255, 153, 51));
    jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 1270, 10));

    jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel9.setForeground(new java.awt.Color(255, 153, 51));
    jLabel9.setText("CustomerID:");
    jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 140, 52));

    jlb_customerid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jlb_customerid.setForeground(new java.awt.Color(255, 153, 51));
    jlb_customerid.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jlb_customeridActionPerformed(evt);
        }
    });
    jlb_customerid.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jlb_customeridKeyReleased(evt);
        }
    });
    jPanel1.add(jlb_customerid, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 180, 52));

    jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(255, 153, 51));
    jLabel10.setText("Date:");
    jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 110, 52));

    jlb_date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jlb_date.setForeground(new java.awt.Color(255, 153, 51));
    jlb_date.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jlb_dateActionPerformed(evt);
        }
    });
    jlb_date.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jlb_dateKeyReleased(evt);
        }
    });
    jPanel1.add(jlb_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, 200, 52));

    txt_studentID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    txt_studentID.setForeground(new java.awt.Color(255, 153, 51));
    txt_studentID.setText("....");
    jPanel1.add(txt_studentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(1038, 270, 220, 52));

    jlb_lastname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jlb_lastname.setForeground(new java.awt.Color(255, 153, 51));
    jlb_lastname.setText("CustomerID:");
    jPanel1.add(jlb_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 120, 52));

    jlb_firstname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jlb_firstname.setForeground(new java.awt.Color(255, 153, 51));
    jlb_firstname.setText("Total:");
    jPanel1.add(jlb_firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 270, 110, 52));

    jSeparator2.setBackground(new java.awt.Color(255, 153, 51));
    jSeparator2.setForeground(new java.awt.Color(255, 153, 51));
    jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 334, 1270, 10));

    jlb_student1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jlb_student1.setForeground(new java.awt.Color(255, 153, 51));
    jlb_student1.setText("BillID:");
    jPanel1.add(jlb_student1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 138, 52));

    txt_studentID1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    txt_studentID1.setForeground(new java.awt.Color(255, 153, 51));
    txt_studentID1.setText("....");
    jPanel1.add(txt_studentID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 270, 180, 52));

    txt_studentID2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    txt_studentID2.setForeground(new java.awt.Color(255, 153, 51));
    txt_studentID2.setText("....");
    jPanel1.add(txt_studentID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 138, 52));

    jlb_firstname1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jlb_firstname1.setForeground(new java.awt.Color(255, 153, 51));
    jlb_firstname1.setText("Date:");
    jPanel1.add(jlb_firstname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 80, 52));

    txt_studentID3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    txt_studentID3.setForeground(new java.awt.Color(255, 153, 51));
    txt_studentID3.setText("....");
    jPanel1.add(txt_studentID3, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 270, 260, 52));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 1300, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 720, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_billMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_billMouseClicked
        //        showStudentValue();
    }//GEN-LAST:event_tbl_billMouseClicked

    private void btn_RefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RefreshMouseClicked
        //        showTable(student);
    }//GEN-LAST:event_btn_RefreshMouseClicked

    private void btn_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RefreshActionPerformed
        //        try {
            //            // TODO add your handling code here:
            //            stBUS.listStudent();
            //            student = stBUS.getList();
            //            showTable(student);
            //        } catch (ClassNotFoundException ex) {
            //            Logger.getLogger(StudentManagement.class.getName()).log(Level.SEVERE, null, ex);
            //        }
    }//GEN-LAST:event_btn_RefreshActionPerformed

    private void jlb_billidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlb_billidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlb_billidActionPerformed

    private void jlb_billidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jlb_billidKeyReleased
        // TODO add your handling code here:
                Search();
    }//GEN-LAST:event_jlb_billidKeyReleased

    private void jlb_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlb_edActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlb_edActionPerformed

    private void jlb_edKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jlb_edKeyReleased
        // TODO add your handling code here:
        //        Search();
    }//GEN-LAST:event_jlb_edKeyReleased

    private void jlb_customeridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlb_customeridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlb_customeridActionPerformed

    private void jlb_customeridKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jlb_customeridKeyReleased
        // TODO add your handling code here:
        //        Search();
    }//GEN-LAST:event_jlb_customeridKeyReleased

    private void jlb_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlb_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlb_dateActionPerformed

    private void jlb_dateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jlb_dateKeyReleased
        // TODO add your handling code here:
        //        Search();
    }//GEN-LAST:event_jlb_dateKeyReleased

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        //        AddStudent a = new AddStudent();
        //        a.setVisible(true);
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addMouseClicked

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
                if ("Window Vista".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BillGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_Refresh;
    private javax.swing.JToggleButton btn_add;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jlb_billid;
    private javax.swing.JTextField jlb_customerid;
    private javax.swing.JTextField jlb_date;
    private javax.swing.JTextField jlb_ed;
    private javax.swing.JLabel jlb_firstname;
    private javax.swing.JLabel jlb_firstname1;
    private javax.swing.JLabel jlb_lastname;
    private javax.swing.JLabel jlb_student1;
    private javax.swing.JTable tbl_bill;
    private javax.swing.JLabel txt_studentID;
    private javax.swing.JLabel txt_studentID1;
    private javax.swing.JLabel txt_studentID2;
    private javax.swing.JLabel txt_studentID3;
    // End of variables declaration//GEN-END:variables
}
