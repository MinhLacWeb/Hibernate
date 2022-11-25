/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.CategoryBUS;
import Entity.category;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

  public class CategoryGUI extends javax.swing.JFrame {

   CategoryBUS cateBUS = new CategoryBUS();
   ArrayList<category> category = (ArrayList<category>) cateBUS.getList();
   
    public CategoryGUI() throws ClassNotFoundException {
            initComponents();
            tbl_category.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD, 12));
            tbl_category.getTableHeader().setOpaque(false);
            tbl_category.getTableHeader().setBackground(Color.orange);
            list();
            showTable((ArrayList<category>) cateBUS.getList());

    }
    
    public void showTable(ArrayList<category> arrCategory) // Xuất ra Table từ ArrayList
    {
        tbl_category.removeAll();
        DefaultTableModel defaultModel = (DefaultTableModel) tbl_category.getModel();
        defaultModel.setRowCount(0);
        Vector data;
        for (category cate : arrCategory) {
            data = new Vector();
            data.add(cate.getCategoryID());//indext table = 0
            data.add(cate.getName());//1
            data.add(cate.getDescription());//2
            defaultModel.addRow(data);
        }
        tbl_category.setModel(defaultModel);
    }
    
    
       private void showCategoryValue()
        {
            int row = tbl_category.getSelectedRow();
            String value = tbl_category.getModel().getValueAt(row, 0).toString();
            if(cateBUS.getCategoryById(value)!=null)
            {
                txt_categoryID.setText(tbl_category.getModel().getValueAt(row, 0).toString());
                txt_name.setText(tbl_category.getModel().getValueAt(row, 1).toString());
                txt_description.setText(tbl_category.getModel().getValueAt(row, 2).toString());
            }
        }
    public void list() // Chép ArrayList lên table
    {
        if (cateBUS.getList() == null) {
            cateBUS.list();
        }
        ArrayList<category> arrCategory = (ArrayList<category>) cateBUS.getList();
//        model.setRowCount(0);
        showTable(arrCategory);
    }

    private void Search()
    {
        String categoryID = txt_categoryIDSearch.getText();
        String name = txt_nameSearch.getText();
        String description = txt_decriptionSearch.getText();
        showTable(cateBUS.search(categoryID,name,description));
    }
 
    
    
    private void editCategory()
           
    {
        int row = tbl_category.getSelectedRow();
        if(row == -1)
        {
           JOptionPane.showMessageDialog(new JFrame(), "Chưa chọn dòng để sửa", "Dialog",
           JOptionPane.ERROR_MESSAGE);
        }else{
           int categoryID = (int) tbl_category.getModel().getValueAt(row, 0);     
           String name = txt_name.getText();
           String description = txt_description.getText();
           
           category cate = new category(categoryID, name, description);
           cateBUS.set(cate);
           
                   JOptionPane.showMessageDialog(new JFrame(), "Sửa thành công");
           
           refresh();
        }
    }
    
    
    private void delCategory(){
        int row = tbl_category.getSelectedRow();
        if (row == -1){
            JOptionPane.showMessageDialog(new JFrame(), "Chưa chọn dòng để sửa", "Dialog",
            JOptionPane.ERROR_MESSAGE);
            
        }else{
            int categoryID = (int)tbl_category.getModel().getValueAt(row, 0);
            
            String name = txt_name.getText();
            String description = txt_description.getText();
            
            category cate = new category(categoryID, name, description);
            cateBUS.delete(cate);
            
                JOptionPane.showMessageDialog(new JFrame(), "Xoá thành công");
                
            category = (ArrayList<category>) cateBUS.getList();
            showTable((ArrayList<category>) cateBUS.getList());
            resetText();
            row = -1;
       }      
    }
    
    
//    private void addProduct(){
//        int productID = tbl_product.getRowCount()+1;
//        int categoryID = Integer.parseInt(txtCategoryID.getText());
//        String product_name = txtProductName.getText();
//        int amount = Integer.parseInt(txtAmount.getText());
//        float price = Float.parseFloat(txtPrice.getText()); 
//        product pro = new product(productID, categoryID, product_name, amount, price);
//        proBUS.add(pro);
//        proBUS.getList();
//        showTable((ArrayList<product>) proBUS.getList());
//    }
    public void refresh(){
        cateBUS.list();
        category = (ArrayList<category>) cateBUS.getList();
        showTable((ArrayList<category>) cateBUS.getList());
    }
    
    
    private void resetText(){
        txt_categoryID.setText("");
        txt_name.setText("");
        txt_description.setText("");
    }
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_category = new javax.swing.JTable();
        btn_add = new javax.swing.JToggleButton();
        btn_del = new javax.swing.JToggleButton();
        btn_Update = new javax.swing.JToggleButton();
        btn_Refresh = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_categoryIDSearch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_decriptionSearch = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        txt_nameSearch = new javax.swing.JTextField();
        txt_categoryID = new javax.swing.JLabel();
        jlb_name = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jlb_description = new javax.swing.JLabel();
        txt_description = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btn_restore = new javax.swing.JToggleButton();
        jlb_category = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Category Management");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 10, 280, 77));

        tbl_category.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbl_category.setForeground(new java.awt.Color(255, 153, 51));
        tbl_category.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CategoryID", "Name", "Description"
            }
        )
        {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        }

    );
    tbl_category.setRowHeight(40);
    tbl_category.setRowMargin(2);
    tbl_category.setSelectionBackground(new java.awt.Color(153, 255, 153));
    tbl_category.setSelectionForeground(new java.awt.Color(0, 0, 0));
    tbl_category.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tbl_categoryMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tbl_category);

    jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 101, 1270, 157));

    btn_add.setBackground(new java.awt.Color(102, 255, 102));
    btn_add.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    btn_add.setForeground(new java.awt.Color(255, 255, 255));
    btn_add.setText("Thêm");
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
    jPanel1.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, 230, 90));

    btn_del.setBackground(new java.awt.Color(255, 0, 0));
    btn_del.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    btn_del.setForeground(new java.awt.Color(255, 255, 255));
    btn_del.setText("Xóa");
    btn_del.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_delActionPerformed(evt);
        }
    });
    jPanel1.add(btn_del, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 610, 230, 90));

    btn_Update.setBackground(new java.awt.Color(102, 255, 102));
    btn_Update.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    btn_Update.setForeground(new java.awt.Color(255, 255, 255));
    btn_Update.setText("Sửa");
    btn_Update.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_UpdateActionPerformed(evt);
        }
    });
    jPanel1.add(btn_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 610, 230, 90));

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

    txt_categoryIDSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    txt_categoryIDSearch.setForeground(new java.awt.Color(255, 153, 51));
    txt_categoryIDSearch.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txt_categoryIDSearchActionPerformed(evt);
        }
    });
    txt_categoryIDSearch.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            txt_categoryIDSearchKeyReleased(evt);
        }
    });
    jPanel1.add(txt_categoryIDSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 270, 52));

    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(255, 153, 51));
    jLabel5.setText("CategoryID:");
    jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 138, 52));

    jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 153, 51));
    jLabel6.setText("Description:");
    jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 410, 120, 50));

    txt_decriptionSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    txt_decriptionSearch.setForeground(new java.awt.Color(255, 153, 51));
    txt_decriptionSearch.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txt_decriptionSearchActionPerformed(evt);
        }
    });
    txt_decriptionSearch.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            txt_decriptionSearchKeyReleased(evt);
        }
    });
    jPanel1.add(txt_decriptionSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 410, 270, 52));

    jSeparator1.setBackground(new java.awt.Color(255, 153, 51));
    jSeparator1.setForeground(new java.awt.Color(255, 153, 51));
    jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 1270, 10));

    jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(255, 153, 51));
    jLabel10.setText("Name:");
    jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 70, 52));

    txt_nameSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    txt_nameSearch.setForeground(new java.awt.Color(255, 153, 51));
    txt_nameSearch.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txt_nameSearchActionPerformed(evt);
        }
    });
    txt_nameSearch.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            txt_nameSearchKeyReleased(evt);
        }
    });
    jPanel1.add(txt_nameSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 270, 52));

    txt_categoryID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    txt_categoryID.setForeground(new java.awt.Color(255, 153, 51));
    txt_categoryID.setText("....");
    jPanel1.add(txt_categoryID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 138, 52));

    jlb_name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jlb_name.setForeground(new java.awt.Color(255, 153, 51));
    jlb_name.setText("Name:");
    jPanel1.add(jlb_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 70, 52));

    txt_name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    txt_name.setForeground(new java.awt.Color(255, 153, 51));
    txt_name.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txt_nameActionPerformed(evt);
        }
    });
    jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 270, 52));

    jlb_description.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jlb_description.setForeground(new java.awt.Color(255, 153, 51));
    jlb_description.setText("Description:");
    jPanel1.add(jlb_description, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 270, 120, 50));

    txt_description.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    txt_description.setForeground(new java.awt.Color(255, 153, 51));
    txt_description.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txt_descriptionActionPerformed(evt);
        }
    });
    jPanel1.add(txt_description, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 270, 270, 52));

    jSeparator2.setBackground(new java.awt.Color(255, 153, 51));
    jSeparator2.setForeground(new java.awt.Color(255, 153, 51));
    jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 334, 1270, 10));

    btn_restore.setBackground(new java.awt.Color(102, 255, 102));
    btn_restore.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    btn_restore.setForeground(new java.awt.Color(255, 255, 255));
    btn_restore.setText("Khôi phục");
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
    jPanel1.add(btn_restore, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 230, 90));

    jlb_category.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jlb_category.setForeground(new java.awt.Color(255, 153, 51));
    jlb_category.setText("CategoryID:");
    jPanel1.add(jlb_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 138, 52));

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

    private void tbl_categoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_categoryMouseClicked
         showCategoryValue();
    }//GEN-LAST:event_tbl_categoryMouseClicked

    private void btn_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addMouseClicked

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        CategoryAdd a = new CategoryAdd();
        a.setVisible(true);

    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
        delCategory();

    }//GEN-LAST:event_btn_delActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
           editCategory();
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_RefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RefreshMouseClicked

    }//GEN-LAST:event_btn_RefreshMouseClicked

    private void btn_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RefreshActionPerformed
        // TODO add your handling code here:
        refresh();
    }//GEN-LAST:event_btn_RefreshActionPerformed

    private void txt_categoryIDSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_categoryIDSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_categoryIDSearchActionPerformed

    private void txt_categoryIDSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_categoryIDSearchKeyReleased
        // TODO add your handling code here:
        Search();
    }//GEN-LAST:event_txt_categoryIDSearchKeyReleased

    private void txt_decriptionSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_decriptionSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_decriptionSearchActionPerformed

    private void txt_decriptionSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_decriptionSearchKeyReleased
        // TODO add your handling code here:
            Search();
    }//GEN-LAST:event_txt_decriptionSearchKeyReleased

    private void txt_nameSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameSearchActionPerformed

    private void txt_nameSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nameSearchKeyReleased
        // TODO add your handling code here:
            Search();
    }//GEN-LAST:event_txt_nameSearchKeyReleased

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_descriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descriptionActionPerformed

    private void btn_restoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_restoreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_restoreMouseClicked

    private void btn_restoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restoreActionPerformed
//        try {
//            CategoryRecovery a = new CategoryRecovery();
//            a.setVisible(true);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(CategoryManagement.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btn_restoreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Window Vista".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CategoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CategoryGUI().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(CategoryGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_Refresh;
    private javax.swing.JToggleButton btn_Update;
    private javax.swing.JToggleButton btn_add;
    private javax.swing.JToggleButton btn_del;
    private javax.swing.JToggleButton btn_restore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlb_category;
    private javax.swing.JLabel jlb_description;
    private javax.swing.JLabel jlb_name;
    private javax.swing.JTable tbl_category;
    private javax.swing.JLabel txt_categoryID;
    private javax.swing.JTextField txt_categoryIDSearch;
    private javax.swing.JTextField txt_decriptionSearch;
    private javax.swing.JTextField txt_description;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_nameSearch;
    // End of variables declaration//GEN-END:variables
}
