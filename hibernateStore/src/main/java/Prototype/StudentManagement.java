package Prototype;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



//
//import BUS.StudentBUS;
//import DTO.Student;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LacKhaiMinh
 */
public class StudentManagement extends javax.swing.JFrame {
    
//    StudentBUS stBUS = new StudentBUS();
//    /**
//     * Creates new form Customer
//     */
//    ArrayList<Student> student = stBUS.getList();
//    public StudentManagement() throws ClassNotFoundException {
//            initComponents();
//
//            tbl_student.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD, 12));
//            tbl_student.getTableHeader().setOpaque(false);
//            tbl_student.getTableHeader().setBackground(Color.orange);
//            stBUS.listStudent();
//            showTable(student);
//
//    }
//    
//    private void showTable(ArrayList<Student> student)
//    {
//        tbl_student.removeAll();
//        DefaultTableModel defaultModel = (DefaultTableModel) tbl_student.getModel();
//        defaultModel.setRowCount(0);
//        for(Student st : student)
//        {
//            if(st.getStatus()==1){
//                int studentID = st.getStudentID();
//                String lastName = st.getLastName();
//                String firstName= st.getFirstName();
//                String enrollDate = st.getEnrollDate();
//                
//                defaultModel.addRow(new Object[]{studentID, lastName, firstName, enrollDate});
//            }
//        }
//    }
//    
//    private void showStudentValue()
//    {
//        int row = tbl_student.getSelectedRow();
//        int value = (int) tbl_student.getModel().getValueAt(row, 0);
//        if (stBUS.CheckStudentID(value))
//        {
//            txt_studentID.setText(tbl_student.getModel().getValueAt(row, 0).toString());
//            txt_lastname.setText(tbl_student.getModel().getValueAt(row, 1).toString());
//            txt_firstname.setText(tbl_student.getModel().getValueAt(row, 2).toString());
//            txt_enrollDate.setText(tbl_student.getModel().getValueAt(row, 3).toString());
//        }
//    }
//    
//    private void setStudent()
//    {
//        int row = tbl_student.getSelectedRow();
//        if(row == -1)
//        {
//           JOptionPane.showMessageDialog(new JFrame(), "Chưa chọn dòng để sửa", "Dialog",
//           JOptionPane.ERROR_MESSAGE);
//        }else{
//           int studentID = (int) tbl_student.getModel().getValueAt(row, 0);
//           String lastName = txt_lastname.getText();
//           String firstName = txt_firstname.getText();
//           String enrollDate = txt_enrollDate.getText();
//           int status =1; 
//           Student tc = new Student(studentID, lastName, firstName, enrollDate, status);
//            try {
//                stBUS.SetStudent(tc);
//                JOptionPane.showMessageDialog(new JFrame(), "Sửa thành công", "Dialog",
//                JOptionPane.ERROR_MESSAGE);
//                student = stBUS.getList();
//            }catch (ClassNotFoundException ex) {
//                JOptionPane.showMessageDialog(new JFrame(), "Sửa thất bại", "Dialog",
//                JOptionPane.ERROR_MESSAGE);
//                Logger.getLogger(CourseManagement.class.getName()).log(Level.SEVERE, null, ex);
//            }
//           showTable(student);
//        }
//        
//    }
//    
//    private void Search()
//    {
//        String studentid = jlb_studentid.getText();
//        String lastname = jlb_ln.getText();
//        String fristname = jlb_fn.getText();
//        String enrolldate = jlb_ed.getText();
//        showTable(stBUS.search(studentid, lastname, fristname, enrolldate));
//    }
//    
//    private void delStudent(){
//        int row = tbl_student.getSelectedRow();
//        try {    
//           int studentID = (int)tbl_student.getModel().getValueAt(row, 0);
//           String lastName = tbl_student.getModel().getValueAt(row, 1).toString();
//           String firstName = tbl_student.getModel().getValueAt(row, 2).toString();
//           String hireDate = tbl_student.getModel().getValueAt(row, 3).toString();
//           int status = 0;
//           Student tc = new Student(studentID, lastName, firstName, hireDate, status);
//           stBUS.ChangeStatusStudent(tc);
//           student = stBUS.getList();
//           stBUS.listStudent();
//           showTable(student);
//        } catch (ClassNotFoundException ex) { 
//            Logger.getLogger(StudentManagement.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    

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
        tbl_student = new javax.swing.JTable();
        btn_add = new javax.swing.JToggleButton();
        btn_del = new javax.swing.JToggleButton();
        btn_Update = new javax.swing.JToggleButton();
        btn_Refresh = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlb_studentid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlb_ed = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jlb_ln = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jlb_fn = new javax.swing.JTextField();
        txt_studentID = new javax.swing.JLabel();
        jlb_lastname = new javax.swing.JLabel();
        txt_lastname = new javax.swing.JTextField();
        jlb_firstname = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        jlb_enrollDate = new javax.swing.JLabel();
        txt_enrollDate = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btn_restore = new javax.swing.JToggleButton();
        jlb_student1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 720));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Student Management");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 261, 77));

        tbl_student.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbl_student.setForeground(new java.awt.Color(255, 153, 51));
        tbl_student.setModel(new javax.swing.table.DefaultTableModel(
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
    tbl_student.setRowHeight(40);
    tbl_student.setRowMargin(2);
    tbl_student.setSelectionBackground(new java.awt.Color(153, 255, 153));
    tbl_student.setSelectionForeground(new java.awt.Color(0, 0, 0));
    tbl_student.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tbl_studentMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tbl_student);

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

    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_user_50px_5.png"))); // NOI18N
    jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, 60));

    jLabel3.setBackground(new java.awt.Color(255, 255, 255));
    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 153, 51));
    jLabel3.setText("Search:");
    jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 352, 146, 50));

    jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_search_50px.png"))); // NOI18N
    jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 352, -1, -1));

    jlb_studentid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jlb_studentid.setForeground(new java.awt.Color(255, 153, 51));
    jlb_studentid.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jlb_studentidActionPerformed(evt);
        }
    });
    jlb_studentid.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jlb_studentidKeyReleased(evt);
        }
    });
    jPanel1.add(jlb_studentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 190, 52));

    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(255, 153, 51));
    jLabel5.setText("StudentID:");
    jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 138, 52));

    jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 153, 51));
    jLabel6.setText("EnrollDate");
    jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 412, 120, 50));

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
    jLabel9.setText("Lastname:");
    jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 110, 52));

    jlb_ln.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jlb_ln.setForeground(new java.awt.Color(255, 153, 51));
    jlb_ln.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jlb_lnActionPerformed(evt);
        }
    });
    jlb_ln.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jlb_lnKeyReleased(evt);
        }
    });
    jPanel1.add(jlb_ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 200, 52));

    jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(255, 153, 51));
    jLabel10.setText("Firstname:");
    jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 110, 52));

    jlb_fn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jlb_fn.setForeground(new java.awt.Color(255, 153, 51));
    jlb_fn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jlb_fnActionPerformed(evt);
        }
    });
    jlb_fn.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jlb_fnKeyReleased(evt);
        }
    });
    jPanel1.add(jlb_fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, 200, 52));

    txt_studentID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    txt_studentID.setForeground(new java.awt.Color(255, 153, 51));
    txt_studentID.setText("....");
    jPanel1.add(txt_studentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 138, 52));

    jlb_lastname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jlb_lastname.setForeground(new java.awt.Color(255, 153, 51));
    jlb_lastname.setText("Lastname:");
    jPanel1.add(jlb_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 110, 52));

    txt_lastname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    txt_lastname.setForeground(new java.awt.Color(255, 153, 51));
    txt_lastname.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txt_lastnameActionPerformed(evt);
        }
    });
    jPanel1.add(txt_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 200, 52));

    jlb_firstname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jlb_firstname.setForeground(new java.awt.Color(255, 153, 51));
    jlb_firstname.setText("Firstname:");
    jPanel1.add(jlb_firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 110, 52));

    txt_firstname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    txt_firstname.setForeground(new java.awt.Color(255, 153, 51));
    txt_firstname.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txt_firstnameActionPerformed(evt);
        }
    });
    jPanel1.add(txt_firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, 200, 52));

    jlb_enrollDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jlb_enrollDate.setForeground(new java.awt.Color(255, 153, 51));
    jlb_enrollDate.setText("EnrollDate");
    jPanel1.add(jlb_enrollDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 272, 130, 50));

    txt_enrollDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    txt_enrollDate.setForeground(new java.awt.Color(255, 153, 51));
    txt_enrollDate.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txt_enrollDateActionPerformed(evt);
        }
    });
    jPanel1.add(txt_enrollDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 270, 250, 52));

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

    jlb_student1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jlb_student1.setForeground(new java.awt.Color(255, 153, 51));
    jlb_student1.setText("StudentID:");
    jPanel1.add(jlb_student1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 138, 52));

    getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
//        AddStudent a = new AddStudent();
//        a.setVisible(true);
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_addMouseClicked

    private void tbl_studentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_studentMouseClicked
//        showStudentValue();

    }//GEN-LAST:event_tbl_studentMouseClicked

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
//        delStudent();
//        
    }//GEN-LAST:event_btn_delActionPerformed

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

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
//        setStudent();

    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void jlb_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlb_edActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlb_edActionPerformed

    private void jlb_studentidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlb_studentidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlb_studentidActionPerformed

    private void jlb_lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlb_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlb_lnActionPerformed

    private void jlb_fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlb_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlb_fnActionPerformed

    private void txt_lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lastnameActionPerformed

    private void txt_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstnameActionPerformed

    private void txt_enrollDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_enrollDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_enrollDateActionPerformed

    private void btn_RefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RefreshMouseClicked
//        showTable(student);
//        
    }//GEN-LAST:event_btn_RefreshMouseClicked

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

    private void jlb_studentidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jlb_studentidKeyReleased
        // TODO add your handling code here:
//        Search();
    }//GEN-LAST:event_jlb_studentidKeyReleased

    private void jlb_lnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jlb_lnKeyReleased
        // TODO add your handling code here:
//        Search();
    }//GEN-LAST:event_jlb_lnKeyReleased

    private void jlb_fnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jlb_fnKeyReleased
        // TODO add your handling code here:
//        Search();
    }//GEN-LAST:event_jlb_fnKeyReleased

    private void jlb_edKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jlb_edKeyReleased
        // TODO add your handling code here:
//        Search();
    }//GEN-LAST:event_jlb_edKeyReleased

    /**
     * @param args the command line arguments
     */



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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jlb_ed;
    private javax.swing.JLabel jlb_enrollDate;
    private javax.swing.JLabel jlb_firstname;
    private javax.swing.JTextField jlb_fn;
    private javax.swing.JLabel jlb_lastname;
    private javax.swing.JTextField jlb_ln;
    private javax.swing.JLabel jlb_student1;
    private javax.swing.JTextField jlb_studentid;
    private javax.swing.JTable tbl_student;
    private javax.swing.JTextField txt_enrollDate;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JLabel txt_studentID;
    // End of variables declaration//GEN-END:variables
}
