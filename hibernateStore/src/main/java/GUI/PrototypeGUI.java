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

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import BUS.CustomerBUS;
import Entity.customer;
public class PrototypeGUI extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    CustomerBUS cusBUS = new CustomerBUS();
    public PrototypeGUI() {
        initComponents();
        cusBUS.list();
        showTable((ArrayList<customer>) cusBUS.getList());
    }
    
    private void showTable(ArrayList<customer> arrCustomer)
    {
        tbl_customer.removeAll();
        DefaultTableModel defaultModel = (DefaultTableModel) tbl_customer.getModel();
        defaultModel.setRowCount(0);
        Vector data;
        for(customer cus : arrCustomer)
        {
            data = new Vector();
            data.add(cus.getCustomerID());//indext table = 0
            data.add(cus.getFirst_name());//1
            data.add(cus.getLast_name());//2
            data.add(cus.getAddress());//3
            data.add(cus.getCity());//4
            defaultModel.addRow(data);
        }
        tbl_customer.setModel(defaultModel);
    }
    
    private void showCustomerValue()
    {
        int row = tbl_customer.getSelectedRow();
        String value = tbl_customer.getModel().getValueAt(row, 0).toString();
        if (cusBUS.getCustomerById(value)!=null)
            {
                txt_customerID.setText(tbl_customer.getModel().getValueAt(row, 0).toString());
                txt_firstname.setText(tbl_customer.getModel().getValueAt(row, 1).toString());
                txt_lastname.setText(tbl_customer.getModel().getValueAt(row, 2).toString());
                txt_address.setText(tbl_customer.getModel().getValueAt(row, 3).toString());
                txt_city.setText(tbl_customer.getModel().getValueAt(row, 4).toString());
            }
    }
    
    private void editCustomer()
    {
        int row = tbl_customer.getSelectedRow();
        if(row == -1)
        {
           JOptionPane.showMessageDialog(new JFrame(), "Chưa chọn dòng để sửa", "Dialog",
           JOptionPane.ERROR_MESSAGE);
        }else{
           int customerID = (int) tbl_customer.getModel().getValueAt(row, 0);
           String firstName = txt_firstname.getText();
           String lastName = txt_lastname.getText();
           String address = txt_address.getText();
           String city = txt_city.getText();
//           int status =1; 
           customer cus = new customer(customerID, firstName, lastName, address, city);
           cusBUS.set(cus);
           JOptionPane.showMessageDialog(new JFrame(), "Sửa thành công", "Dialog",
                   JOptionPane.INFORMATION_MESSAGE);
           
           cusBUS.getList();
           showTable((ArrayList<customer>) cusBUS.getList());
        }       
    }
    private void delCustomer ()
    {
        int row = tbl_customer.getSelectedRow();
        if(row == -1)
        {
           JOptionPane.showMessageDialog(new JFrame(), "Chưa chọn dòng để xoá", "Dialog",
           JOptionPane.ERROR_MESSAGE);
        }else{
           int customerID = (int) tbl_customer.getModel().getValueAt(row, 0);
           String firstName = txt_firstname.getText();
           String lastName = txt_lastname.getText();
           String address = txt_address.getText();
           String city = txt_city.getText();
//           int status =1; 
           customer cus = new customer(customerID, firstName, lastName, address, city);
           cusBUS.delete(cus);
           JOptionPane.showMessageDialog(new JFrame(), "Xoá thành công", "Dialog",
                   JOptionPane.INFORMATION_MESSAGE);
           
           cusBUS.getList();
           showTable((ArrayList<customer>) cusBUS.getList());
        }
    }
    
  private void addCustomer(){
      int customerID = tbl_customer.getRowCount()+1;
      String firstName = txt_firstname.getText();
      String lastName = txt_lastname.getText();
      String address = txt_address.getText();
      String city = txt_city.getText();
      customer cus = new customer(customerID, firstName, lastName, address, city);
      cusBUS.add(cus);
      cusBUS.getList();
      showTable((ArrayList<customer>) cusBUS.getList());
  }
  private void Search()
  {
      int customerID = Integer.parseInt(jlb_customerid.getText());
      String firstName = txt_firstname1.getText();
      String lastName = txt_lastname1.getText();
      String address = txt_address1.getText();
      String city = txt_city1.getText();
      customer cus = new customer(customerID, firstName, lastName, address, city);
      cusBUS.getCustomerById(jlb_customerid.getText());
      cusBUS.list();
      showTable((ArrayList<customer>) cusBUS.getList());
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
        tbl_customer = new javax.swing.JTable();
        btn_add = new javax.swing.JToggleButton();
        btn_del = new javax.swing.JToggleButton();
        btn_Update = new javax.swing.JToggleButton();
        btn_Refresh = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlb_customerid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_customerID = new javax.swing.JLabel();
        jlb_firstname = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        jlb_lastname = new javax.swing.JLabel();
        txt_lastname = new javax.swing.JTextField();
        jlb_address = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btn_restore = new javax.swing.JToggleButton();
        jlb_customerID = new javax.swing.JLabel();
        jlb_city = new javax.swing.JLabel();
        txt_city = new javax.swing.JTextField();
        jlb_firstname1 = new javax.swing.JLabel();
        txt_firstname1 = new javax.swing.JTextField();
        jlb_lastname1 = new javax.swing.JLabel();
        txt_lastname1 = new javax.swing.JTextField();
        jlb_address1 = new javax.swing.JLabel();
        txt_address1 = new javax.swing.JTextField();
        jlb_city1 = new javax.swing.JLabel();
        txt_city1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Customer Management");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 261, 77));

        tbl_customer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbl_customer.setForeground(new java.awt.Color(255, 153, 51));
        tbl_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustomerID", "FirstName", "LastName", "Addess", "City"
            }
        )
        {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        }

    );
    tbl_customer.setRowHeight(40);
    tbl_customer.setRowMargin(2);
    tbl_customer.setSelectionBackground(new java.awt.Color(153, 255, 153));
    tbl_customer.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tbl_customerMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tbl_customer);

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

    jlb_customerid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
    jPanel1.add(jlb_customerid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 70, 52));

    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(255, 153, 51));
    jLabel5.setText("CustomerID:");
    jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 138, 52));

    jSeparator1.setBackground(new java.awt.Color(255, 153, 51));
    jSeparator1.setForeground(new java.awt.Color(255, 153, 51));
    jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 1270, 10));

    txt_customerID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    txt_customerID.setForeground(new java.awt.Color(255, 153, 51));
    txt_customerID.setText("....");
    jPanel1.add(txt_customerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 70, 52));

    jlb_firstname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jlb_firstname.setForeground(new java.awt.Color(255, 153, 51));
    jlb_firstname.setText("Firstname:");
    jPanel1.add(jlb_firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 110, 52));

    txt_firstname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    txt_firstname.setForeground(new java.awt.Color(255, 153, 51));
    txt_firstname.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txt_firstnameActionPerformed(evt);
        }
    });
    jPanel1.add(txt_firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 170, 52));

    jlb_lastname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jlb_lastname.setForeground(new java.awt.Color(255, 153, 51));
    jlb_lastname.setText("Lastname:");
    jPanel1.add(jlb_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 110, 52));

    txt_lastname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    txt_lastname.setForeground(new java.awt.Color(255, 153, 51));
    txt_lastname.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txt_lastnameActionPerformed(evt);
        }
    });
    jPanel1.add(txt_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 150, 52));

    jlb_address.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jlb_address.setForeground(new java.awt.Color(255, 153, 51));
    jlb_address.setText("Address:");
    jPanel1.add(jlb_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 130, 50));

    txt_address.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    txt_address.setForeground(new java.awt.Color(255, 153, 51));
    txt_address.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txt_addressActionPerformed(evt);
        }
    });
    jPanel1.add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, 200, 52));

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

    jlb_customerID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jlb_customerID.setForeground(new java.awt.Color(255, 153, 51));
    jlb_customerID.setText("CustomerID:");
    jPanel1.add(jlb_customerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 138, 52));

    jlb_city.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jlb_city.setForeground(new java.awt.Color(255, 153, 51));
    jlb_city.setText("City:");
    jPanel1.add(jlb_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 270, 130, 50));

    txt_city.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    txt_city.setForeground(new java.awt.Color(255, 153, 51));
    txt_city.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txt_cityActionPerformed(evt);
        }
    });
    jPanel1.add(txt_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 270, 200, 52));

    jlb_firstname1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jlb_firstname1.setForeground(new java.awt.Color(255, 153, 51));
    jlb_firstname1.setText("Firstname:");
    jPanel1.add(jlb_firstname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 110, 52));

    txt_firstname1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    txt_firstname1.setForeground(new java.awt.Color(255, 153, 51));
    txt_firstname1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txt_firstname1ActionPerformed(evt);
        }
    });
    txt_firstname1.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            txt_firstname1KeyReleased(evt);
        }
    });
    jPanel1.add(txt_firstname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 170, 52));

    jlb_lastname1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jlb_lastname1.setForeground(new java.awt.Color(255, 153, 51));
    jlb_lastname1.setText("Lastname:");
    jPanel1.add(jlb_lastname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 110, 52));

    txt_lastname1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    txt_lastname1.setForeground(new java.awt.Color(255, 153, 51));
    txt_lastname1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txt_lastname1ActionPerformed(evt);
        }
    });
    txt_lastname1.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            txt_lastname1KeyReleased(evt);
        }
    });
    jPanel1.add(txt_lastname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 150, 52));

    jlb_address1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jlb_address1.setForeground(new java.awt.Color(255, 153, 51));
    jlb_address1.setText("Address:");
    jPanel1.add(jlb_address1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, 130, 50));

    txt_address1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    txt_address1.setForeground(new java.awt.Color(255, 153, 51));
    txt_address1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txt_address1ActionPerformed(evt);
        }
    });
    txt_address1.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            txt_address1KeyReleased(evt);
        }
    });
    jPanel1.add(txt_address1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 410, 200, 52));

    jlb_city1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jlb_city1.setForeground(new java.awt.Color(255, 153, 51));
    jlb_city1.setText("City:");
    jPanel1.add(jlb_city1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 410, 130, 50));

    txt_city1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    txt_city1.setForeground(new java.awt.Color(255, 153, 51));
    txt_city1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txt_city1ActionPerformed(evt);
        }
    });
    txt_city1.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            txt_city1KeyReleased(evt);
        }
    });
    jPanel1.add(txt_city1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 410, 200, 52));

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

    private void tbl_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_customerMouseClicked
        showCustomerValue();
    }//GEN-LAST:event_tbl_customerMouseClicked

    private void btn_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addMouseClicked

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        addCustomer();

    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
        delCustomer();

    }//GEN-LAST:event_btn_delActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        editCustomer();
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_RefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RefreshMouseClicked
        showTable((ArrayList<customer>) cusBUS.getList());

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
        showTable((ArrayList<customer>) cusBUS.getList());
    }//GEN-LAST:event_btn_RefreshActionPerformed

    private void jlb_customeridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlb_customeridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlb_customeridActionPerformed

    private void jlb_customeridKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jlb_customeridKeyReleased
        Search();
    }//GEN-LAST:event_jlb_customeridKeyReleased

    private void txt_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstnameActionPerformed

    private void txt_lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lastnameActionPerformed

    private void txt_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressActionPerformed

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

    private void txt_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cityActionPerformed

    private void txt_city1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_city1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_city1ActionPerformed

    private void txt_address1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_address1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_address1ActionPerformed

    private void txt_lastname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lastname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lastname1ActionPerformed

    private void txt_firstname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstname1ActionPerformed

    private void txt_firstname1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_firstname1KeyReleased
        Search();
    }//GEN-LAST:event_txt_firstname1KeyReleased

    private void txt_lastname1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_lastname1KeyReleased
        Search();
    }//GEN-LAST:event_txt_lastname1KeyReleased

    private void txt_address1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_address1KeyReleased
        Search();
    }//GEN-LAST:event_txt_address1KeyReleased

    private void txt_city1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_city1KeyReleased
        Search();
    }//GEN-LAST:event_txt_city1KeyReleased

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
            java.util.logging.Logger.getLogger(PrototypeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrototypeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrototypeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrototypeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrototypeGUI().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlb_address;
    private javax.swing.JLabel jlb_address1;
    private javax.swing.JLabel jlb_city;
    private javax.swing.JLabel jlb_city1;
    private javax.swing.JLabel jlb_customerID;
    private javax.swing.JTextField jlb_customerid;
    private javax.swing.JLabel jlb_firstname;
    private javax.swing.JLabel jlb_firstname1;
    private javax.swing.JLabel jlb_lastname;
    private javax.swing.JLabel jlb_lastname1;
    private javax.swing.JTable tbl_customer;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_address1;
    private javax.swing.JTextField txt_city;
    private javax.swing.JTextField txt_city1;
    private javax.swing.JLabel txt_customerID;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_firstname1;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_lastname1;
    // End of variables declaration//GEN-END:variables
}
