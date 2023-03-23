/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package de8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author honahl
 */
public class form extends javax.swing.JFrame {
    // set de luu ID (set la collection de luu gia tri duy nhat)
    private Set<Integer> setID = new HashSet<>();
    // luu cac cau thu
    private List<CauThu> lCauThus = new ArrayList<>();

    /**
     * Creates new form form
     */
    public form() {
        initComponents();
//        khoiTaoListCacCauThu();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        IDTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        HoTenTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ViTriComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        NamSinhTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        SaveButton = new javax.swing.JButton();
        SearchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SearchTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel1.setText("TÌM KIẾM VÀ THÊM CẦU THỦ");

        IDTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 153)));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel2.setText("id");

        HoTenTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 153)));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel3.setText("họ và tên");

        ViTriComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thủ Môn", "Hậu Vệ", "Tiền Vệ", "Tiền Đạo", " " }));
        ViTriComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel4.setText("vị trí ");

        NamSinhTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 153)));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel5.setText("năm sinh");

        SaveButton.setBackground(new java.awt.Color(204, 204, 204));
        SaveButton.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        SaveButton.setText("SAVE");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        SearchButton.setBackground(new java.awt.Color(204, 204, 204));
        SearchButton.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        SearchButton.setText("SEARCH");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        SearchTable.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        SearchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Ho Và Tên", "Vị Trí", "Năm sinh"
            }
        ));
        jScrollPane1.setViewportView(SearchTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HoTenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ViTriComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NamSinhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(311, 311, 311))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NamSinhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(HoTenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(ViTriComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        if (chechEmpty()) {
            saveCauThu();
        } else {
            JOptionPane.showMessageDialog(this, "Ko duoc bo trong");
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        if (!HoTenTextField.getText().isEmpty()) {
            SEARCH();
        } else {
            JOptionPane.showMessageDialog(this, "Ko duoc bo trong");
        }
    }//GEN-LAST:event_SearchButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
            }
        });

    }

//    public void khoiTaoListCacCauThu() {
//        FileReader file = null;
//        BufferedReader bufferedReader = null;
//        try {
//            file = new FileReader("/home/honahl/Documents/finalOopTrain/De8/src/de8/cauthu.dat");
//            bufferedReader = new BufferedReader(file);
//            String ScauThu = "";
//            while ((ScauThu = bufferedReader.readLine()) != null) {
//                String[] TTcauThu = ScauThu.split("\\$");
//                CauThu cauThu = new CauThu(Integer.parseInt(TTcauThu[0]), TTcauThu[1], Integer.parseInt(TTcauThu[3]), TTcauThu[2]);
//                setID.add(cauThu.getId());
//                lCauThus.add(cauThu);
//            }
//            taoBang(lCauThus);
//        } catch (Exception e) {
//
//            e.printStackTrace();
//        }
//
//    }

    public void saveCauThu() {
        
        FileWriter file = null;
        BufferedWriter writerFile = null;
        String $ = "$";
        
        try {
            file = new FileWriter("/home/honahl/Documents/finalOopTrain/De8/src/de8/cauthu.dat", true);
            writerFile = new BufferedWriter(file);

            if (!setID.contains(Integer.parseInt(IDTextField.getText()))) {
                
                // tao doi tuong roi them vao List
                CauThu cauThu = new CauThu();
                cauThu.setId(Integer.parseInt(IDTextField.getText().trim()));
                cauThu.setHovaten(HoTenTextField.getText());
                cauThu.setViTri(ViTriComboBox.getSelectedItem().toString());
                cauThu.setNamSinh(Integer.parseInt(NamSinhTextField.getText().trim()));
                lCauThus.add(cauThu);
                setID.add(cauThu.getId());
                
                // luu cac cau thu vao file cauthu.dat
                String sCauThu = cauThu.getId() + $ + cauThu.getHovaten() + $
                        + cauThu.getViTri() + $ + cauThu.getNamSinh();
                writerFile.append(sCauThu);
                writerFile.newLine();
                // file.close();
                writerFile.close();
                JOptionPane.showMessageDialog(this, "luu thanh cong");
                taoBang(lCauThus);
            } else {
                JOptionPane.showMessageDialog(this, "id cau thu da ton tai");
            }

        } catch (Exception e) {
            System.out.println("ghi file ko thanh cong");
            JOptionPane.showMessageDialog(this, "ghi file ko thanh cong");
            e.printStackTrace();
        }
    }
    // tim kiem cac cau thu cos ten 
    public void SEARCH() {
        List<CauThu> searchList = new ArrayList<>();
        for (CauThu cauThu : lCauThus) {
            if (cauThu.getHovaten().equals(HoTenTextField.getText().trim())) {
                searchList.add(cauThu);
            }
        }
        if (searchList.isEmpty()) {
            JOptionPane.showMessageDialog(this, "khong tim thay cau thu nao");
        }else{
            taoBang(searchList);
        }
    }

    // tao bang voi mot list cac cau thu 
    public void taoBang(List<CauThu> CT) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Ho Va Ten");
        model.addColumn("Vi Tri");
        model.addColumn("nam sinh");
        for (CauThu cauThu : CT) {

            Object[] obj = {cauThu.getId(), cauThu.getHovaten(),
                 cauThu.getViTri(), cauThu.getNamSinh()};
            model.addRow(obj);

        }
        SearchTable.setModel(model);
    }

    //kiem tra neu de trong cho nao de nhap
    private Boolean chechEmpty() {
        if (HoTenTextField.getText().isEmpty()) {
            return false;
        } else if (IDTextField.getText().isEmpty()) {
            return false;
        } else if (NamSinhTextField.getText().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HoTenTextField;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JTextField NamSinhTextField;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTable SearchTable;
    private javax.swing.JComboBox<String> ViTriComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}