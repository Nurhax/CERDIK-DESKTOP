/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uinakes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class editJadwal extends javax.swing.JFrame {

    /**
     * Creates new form tambahJadwal
     */
    public editJadwal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    DefaultListModel modelSearchObat = new DefaultListModel();
    public static String simpanNamaObat;
    public int simpanIDJadwal;
    public static String simpanGejala;
    public int simpanIDObat;
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        gejalaTextField = new javax.swing.JTextField();
        inputDosisObat = new javax.swing.JTextField();
        searchObatButton = new javax.swing.JButton();
        jCalendarEdit = new com.toedter.calendar.JCalendar();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cariObatSearchbar = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jadwalMulaiTextField = new javax.swing.JTextField();
        jadwalSelesaiTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        HasilCariObat = new javax.swing.JList<>();
        NamaPlaceHolder = new javax.swing.JLabel();
        IDPasienPlaceHolder = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NamaObatSaatIniPlaceHolder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1002, 576));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1002, 1447));

        jPanel1.setPreferredSize(new java.awt.Dimension(1002, 1447));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ID Pasien");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nama ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Jadwal Pasien");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Gejala");

        jLabel11.setText("Cari Obat ");

        searchObatButton.setText("Cari");
        searchObatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchObatButtonActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(200, 200, 200));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Edit Jadwal");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setText("Dosis Obat: ");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jLabel14.setText("Jadwal Mulai");

        jLabel15.setText("Jadwal Selesai");

        jadwalMulaiTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jadwalMulaiTextFieldMouseClicked(evt);
            }
        });

        jadwalSelesaiTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jadwalSelesaiTextFieldMouseClicked(evt);
            }
        });

        HasilCariObat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HasilCariObatMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(HasilCariObat);

        NamaPlaceHolder.setText("NamaPlaceHolder");

        IDPasienPlaceHolder.setText("IDPasienPlaceHolder");

        jLabel5.setText("Nama Obat:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 33, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jadwalMulaiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inputDosisObat, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane2)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel11)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jadwalSelesaiTextField)
                                                .addComponent(gejalaTextField)
                                                .addComponent(cariObatSearchbar, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(27, 27, 27)
                                            .addComponent(NamaObatSaatIniPlaceHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(5, 5, 5)))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchObatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 394, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCalendarEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NamaPlaceHolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(IDPasienPlaceHolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(479, 479, 479))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel3)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NamaPlaceHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IDPasienPlaceHolder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jCalendarEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jadwalMulaiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jadwalSelesaiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(gejalaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cariObatSearchbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchObatButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputDosisObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(NamaObatSaatIniPlaceHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1196, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        getIDJadwalForEdit();
        getIDObatForEdit();
        try{
            Connection editDataPasien = DriverManager.getConnection("jdbc:mysql://localhost/cerdik","root","");
            Statement statement = editDataPasien.createStatement();
            String editQuery = "UPDATE JADWAL SET START_DATE = " + "'" + jadwalMulaiTextField.getText() + "'," + "END_DATE = " + "'" + jadwalSelesaiTextField.getText() + "'," + "GEJALA = " + "'" + gejalaTextField.getText() + "'," + "DOSIS = " + "'" + inputDosisObat.getText() + "'," + "IDOBAT = " + simpanIDObat +"ISConfirmed Apoteker =1, IsConfirmed Nakes = 0"+ " WHERE IDJADWAL = " + simpanIDJadwal ;
            System.out.println(editQuery);
            statement.executeUpdate(editQuery);
            editDataPasien.close();
            statement.close();
            JOptionPane.showMessageDialog(this,"Data telah diedit!");
            jadwalPasien gantiFrame = new jadwalPasien();
            gantiFrame.getAllPasien();
            gantiFrame.setLocationRelativeTo(null);
            gantiFrame.setVisible(true);
            this.dispose();
        }catch(Exception e){
            System.out.println("Error! " + e);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void searchObatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchObatButtonActionPerformed
        // Mencari obat yang memakai substring input
        modelSearchObat.clear();
        HasilCariObat.setModel(modelSearchObat);
        try{
            Connection getObat = DriverManager.getConnection("jdbc:mysql://localhost/cerdik","root","");
            Statement statement = getObat.createStatement();
            String queryGetObat = "SELECT NAMA FROM OBAT WHERE NAMA LIKE " + "'%" + cariObatSearchbar.getText().substring(0,3)+ "%'";
            ResultSet result = statement.executeQuery(queryGetObat);
            while(result.next()){
                modelSearchObat.addElement(result.getString("NAMA"));
            }
            HasilCariObat.setModel(modelSearchObat);
            getObat.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error! " + e);
        }
    }//GEN-LAST:event_searchObatButtonActionPerformed

    private void jadwalMulaiTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jadwalMulaiTextFieldMouseClicked
        // TODO add your handling code here:
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = dateFormat.format(jCalendarEdit.getDate());
        jadwalMulaiTextField.setText(dateString);
    }//GEN-LAST:event_jadwalMulaiTextFieldMouseClicked

    private void jadwalSelesaiTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jadwalSelesaiTextFieldMouseClicked
        // TODO add your handling code here:
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = dateFormat.format(jCalendarEdit.getDate());
        jadwalSelesaiTextField.setText(dateString);
    }//GEN-LAST:event_jadwalSelesaiTextFieldMouseClicked

    private void HasilCariObatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HasilCariObatMouseClicked
        // TODO add your handling code here:
        if(HasilCariObat.getSelectedIndex() > -1){
            NamaObatSaatIniPlaceHolder.setText(modelSearchObat.get(HasilCariObat.getSelectedIndex()).toString());
        }
    }//GEN-LAST:event_HasilCariObatMouseClicked
    
    public void getIDJadwalForEdit(){
        try{
            Connection getIDJadwal = DriverManager.getConnection("jdbc:mysql://localhost/cerdik","root","");
            Statement statement = getIDJadwal.createStatement();
            String queryGetIDJadwal = "SELECT IDJADWAL FROM JADWAL WHERE IDPASIEN = " + Integer.valueOf(IDPasienPlaceHolder.getText()) + 
                              " AND IDNAKES = " + jadwalPasien.saveIDNakes + 
                              " AND GEJALA = '" + simpanGejala + 
                              "' AND IDOBAT = (SELECT IDOBAT FROM OBAT WHERE OBAT.NAMA = '" + simpanNamaObat + "')";
            ResultSet result = statement.executeQuery(queryGetIDJadwal);
            result.first();
            simpanIDJadwal = result.getInt("IDJADWAL");
            getIDJadwal.close();
            statement.close();
            System.out.println("DAPET IDJADWAL!");
        }catch(Exception e){
            System.out.println("Error! " + e);
        }
    }
    
    public void getIDObatForEdit(){
        try{
            Connection getIDObat = DriverManager.getConnection("jdbc:mysql://localhost/cerdik","root","");
            Statement statement = getIDObat.createStatement();
            String queryGetIDObat = "SELECT IDOBAT FROM OBAT WHERE NAMA = '" + NamaObatSaatIniPlaceHolder.getText()  +"'";
            ResultSet result = statement.executeQuery(queryGetIDObat);
            result.first();
            simpanIDObat = result.getInt("IDOBAT");
            getIDObat.close();
            statement.close();
            System.out.println("DAPET IDOBAT!");
        }catch(Exception e){
            System.out.println("Error! " + e);
        }
    }
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
            java.util.logging.Logger.getLogger(editJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editJadwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> HasilCariObat;
    public javax.swing.JLabel IDPasienPlaceHolder;
    public javax.swing.JLabel NamaObatSaatIniPlaceHolder;
    public javax.swing.JLabel NamaPlaceHolder;
    private javax.swing.JTextField cariObatSearchbar;
    public javax.swing.JTextField gejalaTextField;
    public javax.swing.JTextField inputDosisObat;
    private com.toedter.calendar.JCalendar jCalendarEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextField jadwalMulaiTextField;
    public javax.swing.JTextField jadwalSelesaiTextField;
    private javax.swing.JButton searchObatButton;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
