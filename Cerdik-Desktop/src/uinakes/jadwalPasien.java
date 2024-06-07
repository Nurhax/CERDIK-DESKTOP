/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uinakes;

import cerdik.desktop.JDBC.JDBC;
import cerdik.desktop.Pasien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class jadwalPasien extends javax.swing.JFrame {

    /**
     * Creates new form jadwalPasien
     */
    public jadwalPasien() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    JDBC JDBCNakes = new JDBC();
    
    public static int saveIDNakes;
    static DefaultListModel listPasienModel = new DefaultListModel();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inputJadwal = new javax.swing.JButton();
        konfirmasiObatButton = new javax.swing.JButton();
        helpCenterButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        tambahButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPasien = new javax.swing.JList<>();
        hapusButton = new javax.swing.JButton();
        editButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        outputNama = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        outputId = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        outputPenyakit = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        outputObat = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1002, 576));

        jPanel1.setBackground(new java.awt.Color(200, 200, 200));

        inputJadwal.setText("Input");
        inputJadwal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inputJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputJadwalActionPerformed(evt);
            }
        });

        konfirmasiObatButton.setText("Konfirm");
        konfirmasiObatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konfirmasiObatButtonActionPerformed(evt);
            }
        });

        helpCenterButton.setText("Help");
        helpCenterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpCenterButtonActionPerformed(evt);
            }
        });

        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(helpCenterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(konfirmasiObatButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LogoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(inputJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(konfirmasiObatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(helpCenterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        tambahButton.setText("Tambah Jadwal");
        tambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahButtonActionPerformed(evt);
            }
        });

        listPasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listPasienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listPasien);

        hapusButton.setText("Hapus");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        editButton1.setText("Edit");
        editButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("Data Pasien");

        jLabel2.setText("Nama Pasien :");

        jLabel3.setText("Id Pasien      :");

        jLabel4.setText("Gejala :");

        jLabel5.setText("Obat   :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(outputId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(outputPenyakit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(outputObat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(outputNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(outputNama))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(outputId))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(outputPenyakit))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(outputObat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel6.setText("List Pasien (IDPasien dan Nama)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tambahButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(editButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hapusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel6)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(hapusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(editButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(tambahButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void konfirmasiObatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konfirmasiObatButtonActionPerformed
        // TODO add your handling code here:
        konfirmasiObat gantiFrame = new konfirmasiObat();
        konfirmasiObat.simpanIDNakes = saveIDNakes;
        gantiFrame.setLocationRelativeTo(null);
        gantiFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_konfirmasiObatButtonActionPerformed

    private void inputJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputJadwalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputJadwalActionPerformed

    private void helpCenterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpCenterButtonActionPerformed
        // TODO add your handling code here:
        helpCenter gantiFrame = new helpCenter();
        helpCenter.simpanIDNakesCenter = saveIDNakes;
        gantiFrame.setLocationRelativeTo(null);
        gantiFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_helpCenterButtonActionPerformed

    private void editButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButton1ActionPerformed
        // TODO add your handling code here:
        if(listPasien.getSelectedIndex() > -1){
            editJadwal editUI = new editJadwal();
            editUI.NamaPlaceHolder.setText(outputNama.getText());
            editUI.IDPasienPlaceHolder.setText(outputId.getText());
            editUI.gejalaTextField.setText(outputPenyakit.getText());
            editUI.NamaObatSaatIniPlaceHolder.setText(outputObat.getText());
            editJadwal.simpanNamaObat = outputObat.getText();
            editJadwal.simpanGejala = outputPenyakit.getText();
            //Ngambil jadwal start,jadwal end dan dosis untuk edit obat
            try{
            Connection getDataEdit = DriverManager.getConnection("jdbc:mysql://localhost/cerdik","root","");
            Statement statement = getDataEdit.createStatement();
            String getData = "SELECT START_DATE, END_DATE, DOSIS FROM JADWAL NATURAL JOIN OBAT WHERE IDPASIEN = " + "'" + outputId.getText() + "'" + " AND GEJALA = " + "'" + outputPenyakit.getText() + "'" + "AND OBAT.NAMA = " + "'" + outputObat.getText() + "'";
            ResultSet result = statement.executeQuery(getData);
            result.next();
            editUI.jadwalMulaiTextField.setText(result.getString("START_DATE"));
            editUI.jadwalSelesaiTextField.setText(result.getString("END_DATE"));
            editUI.inputDosisObat.setText(result.getString("DOSIS"));
            getDataEdit.close();
            statement.close();
            }catch(Exception e){
                System.out.println("Error! " + e);
            }
            editUI.setLocationRelativeTo(null);
            editUI.setVisible(true);
        }
    }//GEN-LAST:event_editButton1ActionPerformed

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(null, "Apakah anda yakin untuk menghapus data jadwal ini?", "Select", JOptionPane.YES_NO_OPTION);
        if(i == 0){
            //Query hapus data dan remove dari model serta arraylist
            try{
                Connection hapusJadwalPasien = DriverManager.getConnection("jdbc:mysql://localhost/cerdik","root","");
                Statement statement = hapusJadwalPasien.createStatement();
                String queryHapusJadwalPasien = "DELETE FROM JADWAL WHERE GEJALA = " + "'" + Pasien.listPasien.get(listPasien.getAnchorSelectionIndex()).getGejala() + "'" + "AND IDOBAT = " + "'" + Pasien.listPasien.get(listPasien.getAnchorSelectionIndex()).getGejala() + "'";
                statement.executeUpdate(queryHapusJadwalPasien);
                hapusJadwalPasien.close();
                statement.close();
            }catch(Exception e){
                System.out.println("Error! " + e);
            }
        }
    }//GEN-LAST:event_hapusButtonActionPerformed
 
    private void tambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahButtonActionPerformed
        // TODO add your handling code here:
        tambahJadwal gantiFrame = new tambahJadwal();
        gantiFrame.setLocationRelativeTo(null);
        gantiFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tambahButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin keluar dari aplikasi?", "Select", JOptionPane.YES_NO_OPTION);
        if (i == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void listPasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listPasienMouseClicked
        // TODO add your handling code here:
        if(listPasien.getSelectedIndex() > -1){
            outputNama.setText(Pasien.listPasien.get(listPasien.getSelectedIndex()).getUsername());
            outputId.setText(Pasien.listPasien.get(listPasien.getSelectedIndex()).getID());
            outputPenyakit.setText(Pasien.listPasien.get(listPasien.getSelectedIndex()).getGejala());
            outputObat.setText(Pasien.listPasien.get(listPasien.getSelectedIndex()).getObat());
        }
        
    }//GEN-LAST:event_listPasienMouseClicked

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
            java.util.logging.Logger.getLogger(jadwalPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jadwalPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jadwalPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jadwalPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jadwalPasien().setVisible(true);
            }
        });
    }
    
    public void getAllPasien(){
                //auto fill jadwal pasien yang udah pernah diinput
                listPasienModel.clear();
                listPasien.setModel(listPasienModel);
                try{
                    Connection getPasienForNakes = DriverManager.getConnection("jdbc:mysql://localhost/cerdik","root","");
                    Statement statement = getPasienForNakes.createStatement();
                    String getPasienQuery = "SELECT AKUN.USERNAME, AKUN.ACCOUNTID, GEJALA, OBAT.NAMA FROM JADWAL NATURAL JOIN AKUN NATURAL JOIN OBAT WHERE IDNAKES = " + saveIDNakes + " AND AKUN.ROLE = 'PASIEN'";
                    ResultSet result = statement.executeQuery(getPasienQuery);
                    while(result.next()){
                        listPasienModel.addElement(result.getString("ACCOUNTID") + " " + result.getString("USERNAME"));
                        Pasien.listPasien.add(new Pasien(result.getString("USERNAME"), Integer.toString(result.getInt("ACCOUNTID")), result.getString("GEJALA"), result.getString("OBAT.NAMA")));
                    }
                    listPasien.setModel(listPasienModel);
                    
                    getPasienForNakes.close();
                    statement.close();
                    
                }catch(Exception e){
                    System.out.println("Error! " + e);
                }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton editButton1;
    private javax.swing.JButton hapusButton;
    private javax.swing.JButton helpCenterButton;
    private javax.swing.JButton inputJadwal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton konfirmasiObatButton;
    private static javax.swing.JList<String> listPasien;
    private javax.swing.JLabel outputId;
    private javax.swing.JLabel outputNama;
    private javax.swing.JLabel outputObat;
    private javax.swing.JLabel outputPenyakit;
    private javax.swing.JButton tambahButton;
    // End of variables declaration//GEN-END:variables
}
