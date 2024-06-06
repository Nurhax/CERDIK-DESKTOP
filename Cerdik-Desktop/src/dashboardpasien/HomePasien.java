/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboardpasien;

import cerdik.desktop.JDBC.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ELITEBOOK
 */
public class HomePasien extends javax.swing.JFrame {

    /**
     * Creates new form HomePasien
     */
    public HomePasien() {
        initComponents();
    }
    
    JDBC JDBCManager = new JDBC();
    

    
     DefaultListModel modelDetail = new DefaultListModel();
     DefaultListModel modelInfoObat = new DefaultListModel();
     DefaultListModel modelGejala = new DefaultListModel();
     ArrayList<String> SaranPenyajianSave = new ArrayList<>();
     ArrayList<String> DetailObatSave = new ArrayList<>();
     
     
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListGejala = new javax.swing.JList<>();
        DeleteGejala = new javax.swing.JButton();
        TextNamaPasien = new javax.swing.JLabel();
        TextHalo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IDPasienPlaceHolder = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListInfoObat = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        SaranPenyajian = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        SaranPenyajianPlaceHolder = new javax.swing.JLabel();
        DetailObatPlaceHolder = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListDetail = new javax.swing.JList<>();
        jCalendar2Jadwal = new com.toedter.calendar.JCalendar();
        jPanel4 = new javax.swing.JPanel();
        LogOut = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        Help = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(1002, 576));

        jPanel3.setBackground(new java.awt.Color(224, 229, 236));

        ListGejala.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListGejalaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListGejala);

        DeleteGejala.setBackground(new java.awt.Color(166, 193, 217));
        DeleteGejala.setText("Delete");
        DeleteGejala.setBorder(null);
        DeleteGejala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteGejalaActionPerformed(evt);
            }
        });

        TextNamaPasien.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        TextNamaPasien.setText("Nama Pasien");

        TextHalo.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        TextHalo.setText("Halo");

        jLabel3.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel3.setText("ID Kamu:");

        IDPasienPlaceHolder.setFont(new java.awt.Font("Impact", 0, 11)); // NOI18N
        IDPasienPlaceHolder.setText("IDPasienPlaceHolder");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteGejala, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(TextHalo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextNamaPasien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IDPasienPlaceHolder)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextHalo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextNamaPasien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(IDPasienPlaceHolder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeleteGejala, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(224, 229, 236));

        ListInfoObat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListInfoObatMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ListInfoObat);

        jLabel2.setText("Saran Penyajian");

        SaranPenyajian.setText("Detail ");

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setText("Informasi Obat");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(SaranPenyajian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SaranPenyajianPlaceHolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DetailObatPlaceHolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SaranPenyajianPlaceHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SaranPenyajian)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DetailObatPlaceHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(224, 229, 236));

        jLabel5.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel5.setText("Jadwal Obat");

        jPanel6.setBackground(new java.awt.Color(224, 229, 236));

        jScrollPane4.setViewportView(ListDetail);

        jCalendar2Jadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCalendar2JadwalMouseClicked(evt);
            }
        });
        jCalendar2Jadwal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendar2JadwalPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCalendar2Jadwal, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCalendar2Jadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(166, 193, 217));

        LogOut.setBackground(new java.awt.Color(224, 229, 236));
        LogOut.setText("Log Out");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        Home.setBackground(new java.awt.Color(224, 229, 236));
        Home.setText("Home");
        Home.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        Help.setBackground(new java.awt.Color(224, 229, 236));
        Help.setText("Help");
        Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Help, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(Help, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208)
                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteGejalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteGejalaActionPerformed
        // TODO add your handling code here:
        if (ListGejala.getSelectedIndex() == -1) {
             JOptionPane.showMessageDialog(this, "Pilih gejala yang ingin anda hapus dahulu !");
        } else {
             int response = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menghapus gejala ?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );
             if (response == JOptionPane.YES_OPTION) {
                  //Code Hapus Gejala Pasien (YES OPTION)
                  try{
                       int IDUser = JDBCManager.getIDFromDB(TextNamaPasien.getText());
                       Connection hapusDataJadwal = DriverManager.getConnection("jdbc:mysql://localhost/cerdik","root","");
                       Statement statement = hapusDataJadwal.createStatement();
                       String QueryHapusJadwal = "DELETE FROM JADWAL WHERE GEJALA = " + "'" + modelGejala.get(ListGejala.getSelectedIndex()) + "'" + "AND IDPASIEN = " + "'" + IDUser + "'" + "AND IDOBAT = (SELECT IDOBAT FROM JADWAL WHERE IDPASIEN = " + "'" + IDUser + "')";
                       statement.executeUpdate(QueryHapusJadwal);
                       statement.close();
                       hapusDataJadwal.close();
                  }catch(Exception e){
                      System.out.println("Error! " + e);
                  }
                   JOptionPane.showMessageDialog(this, "Berhasil dihapus");
             }   
        } 
    }//GEN-LAST:event_DeleteGejalaActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_HomeActionPerformed

    private void HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpActionPerformed
        // TODO add your handling code here:
        HelpCenter changeToHelp = new HelpCenter();
        changeToHelp.setLocationRelativeTo(null);
        changeToHelp.setVisible(true);
        changeToHelp.IDPasienPlaceHolder.setText(IDPasienPlaceHolder.getText());
        this.dispose();
    }//GEN-LAST:event_HelpActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin keluar dari aplikasi?", "Select", JOptionPane.YES_NO_OPTION);
        if (i == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_LogOutActionPerformed

    private void jCalendar2JadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCalendar2JadwalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCalendar2JadwalMouseClicked

    private void jCalendar2JadwalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendar2JadwalPropertyChange
        // TODO add your handling code here:
        getGejala();
        getInfoObat();
        getOverviewJadwal();
    }//GEN-LAST:event_jCalendar2JadwalPropertyChange

    private void ListGejalaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListGejalaValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ListGejalaValueChanged

    private void ListInfoObatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListInfoObatMouseClicked
        // TODO add your handling code here:
        try{
            if(ListInfoObat.getSelectedIndex() > -1){
                
                if(SaranPenyajianSave.get(ListInfoObat.getSelectedIndex()).length() > 25){
                    SaranPenyajianPlaceHolder.setText(SaranPenyajianSave.get(ListInfoObat.getSelectedIndex()).substring(0,25));
                }else{
                    SaranPenyajianPlaceHolder.setText(SaranPenyajianSave.get(ListInfoObat.getSelectedIndex()));
                }
                if(DetailObatSave.get(ListInfoObat.getSelectedIndex()).length() > 25){
                    DetailObatPlaceHolder.setText(DetailObatSave.get(ListInfoObat.getSelectedIndex()).substring(0, 25));
                }else{
                    DetailObatPlaceHolder.setText(DetailObatSave.get(ListInfoObat.getSelectedIndex()));
                }
                
            }
        }catch(Exception e){
            System.out.println("Error! " + e);
        }
    }//GEN-LAST:event_ListInfoObatMouseClicked

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
            java.util.logging.Logger.getLogger(HomePasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePasien().setVisible(true);
                
                
            }
        });
    }
    
    //Mengambil info obat dari tabel obat dengan join tabel obat dan tabel jadwal
    public void getInfoObat(){
        modelInfoObat.removeAllElements();
        SaranPenyajianSave.clear();
        DetailObatSave.clear();
        ListInfoObat.setModel(modelInfoObat);
        try{
            int IDUser = JDBCManager.getIDFromDB(TextNamaPasien.getText());
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String dateString = dateFormat.format(jCalendar2Jadwal.getDate());
            
            Connection cekInfoObat = DriverManager.getConnection("jdbc:mysql://localhost/cerdik","root","");
            Statement statement = cekInfoObat.createStatement();
            String queryGetObat = "SELECT OBAT.NAMA, OBAT.SARAN_PENYAJIAN, OBAT.JENIS FROM JADWAL NATURAL JOIN OBAT WHERE IDPasien = " + "'" + IDUser + "'" + "AND Start_Date <= " + "'" + dateString + "'" + " AND End_Date >= " + "'" + dateString + "'";
            ResultSet result = statement.executeQuery(queryGetObat);
            while(result.next()){
                modelInfoObat.addElement(result.getString("NAMA"));
                SaranPenyajianSave.add(result.getString("SARAN_PENYAJIAN"));
                DetailObatSave.add(result.getString("JENIS"));
            }
            ListInfoObat.setModel(modelInfoObat);
            cekInfoObat.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error! " + e);
        }
    }
    

    
    public void getOverviewJadwal(){
        modelDetail.removeAllElements();
        ListDetail.setModel(modelDetail);
        try{
            int IDUser = JDBCManager.getIDFromDB(TextNamaPasien.getText());
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String dateString = dateFormat.format(jCalendar2Jadwal.getDate());
            
            Connection getOverview = DriverManager.getConnection("jdbc:mysql://localhost/cerdik","root","");
            Statement statement = getOverview.createStatement();
            String queryOverview = "SELECT OBAT.NAMA, GEJALA, DOSIS FROM JADWAL NATURAL JOIN OBAT WHERE IDPasien = " + "'" + IDUser + "'" + "AND Start_Date <= " + "'" + dateString + "'" + " AND End_Date >= " + "'" + dateString + "'";
            ResultSet result = statement.executeQuery(queryOverview);
            while(result.next()){
                modelDetail.addElement(result.getString("NAMA") + " " + result.getString("GEJALA") + " " + result.getString("DOSIS"));
            }
            ListDetail.setModel(modelDetail);
            getOverview.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error! " + e);
        }
    }
    
    
    //Mengambil gejala dari database dengan rentang waktu lebih dari start_date jadwal dan kurang dari end_date jadwal
    public void getGejala(){
        modelGejala.removeAllElements();
        ListGejala.setModel(modelGejala);
        try{
            int IDUser = JDBCManager.getIDFromDB(TextNamaPasien.getText());
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String dateString = dateFormat.format(jCalendar2Jadwal.getDate());
            
            Connection cekGejala = DriverManager.getConnection("jdbc:mysql://localhost/cerdik","root","");
            Statement statement = cekGejala.createStatement();
            String queryGejala = "SELECT GEJALA FROM JADWAL WHERE IDPasien = " + "'" + IDUser + "'" + "AND Start_Date <= " + "'" + dateString + "'" + " AND End_Date >= " + "'" + dateString + "'";
            ResultSet result = statement.executeQuery(queryGejala);
            while(result.next()){
                modelGejala.addElement(result.getString("GEJALA"));
            }
            ListGejala.setModel(modelGejala);
            cekGejala.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error! " + e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteGejala;
    public javax.swing.JLabel DetailObatPlaceHolder;
    private javax.swing.JButton Help;
    private javax.swing.JButton Home;
    public javax.swing.JLabel IDPasienPlaceHolder;
    private javax.swing.JList<String> ListDetail;
    private javax.swing.JList<String> ListGejala;
    private javax.swing.JList<String> ListInfoObat;
    private javax.swing.JButton LogOut;
    private javax.swing.JLabel SaranPenyajian;
    public javax.swing.JLabel SaranPenyajianPlaceHolder;
    private javax.swing.JLabel TextHalo;
    public javax.swing.JLabel TextNamaPasien;
    private com.toedter.calendar.JCalendar jCalendar2Jadwal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
