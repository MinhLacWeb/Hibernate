/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import BUS.CustomerBUS;
import Entity.customer;
import Entity.khachhang;
import BUS.KhachHangBUS;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Admin
 */
public class test extends javax.swing.JFrame {
    private CustomerBUS cusBUS = new CustomerBUS();
//    private KhachHangBUS khBUS = new KhachHangBUS();
    /**
     * Creates new form test
     */
    public test() {
        initComponents();
        list();
        outModel((ArrayList<customer>) cusBUS.getList());
//        outModel((ArrayList<khachhang>) khBUS.getKhBUS());
    }
    
    public void outModel(ArrayList<customer> arrCustomer) // Xuất ra Table từ ArrayList
    {
        DefaultTableModel defaultModel = (DefaultTableModel) jTable1.getModel();
        Vector data;
        defaultModel.setRowCount(0);
        for (customer c : arrCustomer) {
            data = new Vector();
            data.add(c.getCustomerID());//indext table = 0
            data.add(c.getFull_name());//1
            data.add(c.getAddress());//2
            data.add(c.getCity());//3 ý dòng xết ấy
            defaultModel.addRow(data);
        }
        jTable1.setModel(defaultModel);
    }
    /// asdasdasdas test commit 2 222
    public void list() // Chép ArrayList lên table
    {
        if (cusBUS.getList() == null) {
            cusBUS.list();
        }
        ArrayList<customer> arrCustomer = (ArrayList<customer>) cusBUS.getList();
//        model.setRowCount(0);
        outModel(arrCustomer);
    }
    
    
//    public void outModel(ArrayList<khachhang> nv) // Xuất ra Table từ ArrayList
//    {   
//        DefaultTableModel defaultModel = (DefaultTableModel) jTable1.getModel();
//        Vector data;
//        defaultModel.setRowCount(0);
//        for (khachhang n : nv) {
//            data = new Vector();
//            data.add(n.getId_KH());//indext table = 0
//            data.add(n.getFirst_name());//1
//            data.add(n.getLast_name());//2
//            data.add(n.getPhone());//3 ý dòng xết ấy
//            defaultModel.addRow(data);
//        }
//        jTable1.setModel(defaultModel);
//    }
//
//    public void list() // Chép ArrayList lên table
//    {
//        if (khBUS.getKhBUS() == null) {
//            khBUS.list();
//            
//        }
//        ArrayList<khachhang> nv = (ArrayList<khachhang>) khBUS.getKhBUS();
//        System.out.println(khBUS.getKhBUS());
////        model.setRowCount(0);
//        outModel(nv);
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustomerID", "Fullname", "Address", "City"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
