/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Admin
 */
public class SaleGUI extends javax.swing.JFrame {

    /**
     * Creates new form SaleGUI
     */
    public SaleGUI() {
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

        jPanel1 = new javax.swing.JPanel();
        btn_add = new javax.swing.JToggleButton();
        btn_del = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_restore = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_cart = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_cart1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        btn_del1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        btn_Refresh = new javax.swing.JToggleButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_add.setBackground(new java.awt.Color(102, 255, 102));
        btn_add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("Thêm sản phẩm");
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
        jPanel1.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 270, 330, 80));

        btn_del.setBackground(new java.awt.Color(255, 0, 0));
        btn_del.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_del.setForeground(new java.awt.Color(255, 255, 255));
        btn_del.setText("Hủy giỏ hàng");
        btn_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delActionPerformed(evt);
            }
        });
        jPanel1.add(btn_del, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 350, 160, 60));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, 60));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 352, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 153, 51));
        jSeparator1.setForeground(new java.awt.Color(255, 153, 51));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 940, 10));

        btn_restore.setBackground(new java.awt.Color(102, 255, 102));
        btn_restore.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_restore.setForeground(new java.awt.Color(255, 255, 255));
        btn_restore.setText("Thanh Toán");
        btn_restore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_restoreMouseClicked(evt);
            }
        });
        btn_restore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restoreActionPerformed(evt);
            }
        });
        jPanel1.add(btn_restore, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 620, 330, 90));

        tbl_cart.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbl_cart.setForeground(new java.awt.Color(255, 153, 51));
        tbl_cart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TeacherID", "Lastname", "Firstname", "HireDate"
            }
        )
        {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        }

    );
    tbl_cart.setRowHeight(40);
    tbl_cart.setRowMargin(2);
    tbl_cart.setSelectionBackground(new java.awt.Color(153, 255, 153));
    tbl_cart.setSelectionForeground(new java.awt.Color(0, 0, 0));
    tbl_cart.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tbl_cartMouseClicked(evt);
        }
    });
    jScrollPane2.setViewportView(tbl_cart);

    jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 940, 290));
    jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 60, 180, 40));

    jLabel3.setBackground(new java.awt.Color(255, 255, 255));
    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 153, 51));
    jLabel3.setText("Giỏ hàng");
    jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 90, 50));

    jLabel5.setBackground(new java.awt.Color(255, 255, 255));
    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(255, 153, 51));
    jLabel5.setText("VNĐ");
    jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 560, 50, 50));

    tbl_cart1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    tbl_cart1.setForeground(new java.awt.Color(255, 153, 51));
    tbl_cart1.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "TeacherID", "Lastname", "Firstname", "HireDate"
        }
    )
    {
        public boolean isCellEditable(int row, int column){
            return false;
        }
    }

    );
    tbl_cart1.setRowHeight(40);
    tbl_cart1.setRowMargin(2);
    tbl_cart1.setSelectionBackground(new java.awt.Color(153, 255, 153));
    tbl_cart1.setSelectionForeground(new java.awt.Color(0, 0, 0));
    tbl_cart1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tbl_cart1MouseClicked(evt);
        }
    });
    jScrollPane3.setViewportView(tbl_cart1);

    jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 940, 290));

    jLabel6.setBackground(new java.awt.Color(255, 255, 255));
    jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 153, 51));
    jLabel6.setText("Danh sách sản phẩm");
    jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 210, 50));

    jLabel7.setBackground(new java.awt.Color(255, 255, 255));
    jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(255, 153, 51));
    jLabel7.setText("Số lượng:");
    jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 210, 100, 50));
    jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 220, 220, 40));

    jLabel8.setBackground(new java.awt.Color(255, 255, 255));
    jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(255, 153, 51));
    jLabel8.setText("ID SP:");
    jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 160, 100, 50));

    jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 110, 220, 40));

    jLabel9.setBackground(new java.awt.Color(255, 255, 255));
    jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel9.setForeground(new java.awt.Color(255, 153, 51));
    jLabel9.setText("Loại SP:");
    jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 100, 80, 50));
    jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 170, 220, 40));

    btn_del1.setBackground(new java.awt.Color(255, 0, 0));
    btn_del1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    btn_del1.setForeground(new java.awt.Color(255, 255, 255));
    btn_del1.setText("Xóa");
    btn_del1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_del1ActionPerformed(evt);
        }
    });
    jPanel1.add(btn_del1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 350, 170, 60));

    jButton1.setText("...");
    jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 60, 40, 40));

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
    jPanel1.add(btn_Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 410, 330, 70));

    jLabel10.setBackground(new java.awt.Color(255, 255, 255));
    jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(255, 153, 51));
    jLabel10.setText("Mã KH:");
    jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 50, 80, 50));

    jLabel11.setBackground(new java.awt.Color(255, 255, 255));
    jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel11.setForeground(new java.awt.Color(255, 153, 51));
    jLabel11.setText("Thành tiền:");
    jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 560, 130, 50));

    jLabel12.setBackground(new java.awt.Color(255, 255, 255));
    jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel12.setForeground(new java.awt.Color(255, 153, 51));
    jLabel12.setText("...");
    jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 560, 170, 50));

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

    private void btn_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addMouseClicked

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        //        AddStudent a = new AddStudent();
        //        a.setVisible(true);
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
        //        delStudent();
    }//GEN-LAST:event_btn_delActionPerformed

    private void btn_restoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_restoreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_restoreMouseClicked

    private void btn_restoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restoreActionPerformed
        //        try {
            //            StudentRecovery a = new StudentRecovery();
            //            a.setVisible(true);
            //        } catch (ClassNotFoundException ex) {
            //            Logger.getLogger(StudentManagement.class.getName()).log(Level.SEVERE, null, ex);
            //        }
    }//GEN-LAST:event_btn_restoreActionPerformed

    private void tbl_cartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_cartMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_cartMouseClicked

    private void tbl_cart1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_cart1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_cart1MouseClicked

    private void btn_del1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_del1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_del1ActionPerformed

    private void btn_RefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RefreshMouseClicked
        //        showTable(category);
    }//GEN-LAST:event_btn_RefreshMouseClicked

    private void btn_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RefreshActionPerformed
        //        try {
            //            // TODO add your handling code here:
            //            cateBUS.listCategory();
            //            category = cateBUS.getList();
            //            showTable(category);
            //        } catch (ClassNotFoundException ex) {
            //            Logger.getLogger(CategoryManagement.class.getName()).log(Level.SEVERE, null, ex);
            //        }
    }//GEN-LAST:event_btn_RefreshActionPerformed

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
            java.util.logging.Logger.getLogger(SaleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaleGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_Refresh;
    private javax.swing.JToggleButton btn_add;
    private javax.swing.JToggleButton btn_del;
    private javax.swing.JToggleButton btn_del1;
    private javax.swing.JToggleButton btn_restore;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tbl_cart;
    private javax.swing.JTable tbl_cart1;
    // End of variables declaration//GEN-END:variables
}