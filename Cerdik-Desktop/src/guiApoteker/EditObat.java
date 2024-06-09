/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiApoteker;

import static cerdik.desktop.Apoteker.addObat;
import static cerdik.desktop.Apoteker.editObat;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gabri
 */
public class EditObat extends javax.swing.JDialog {

     private DefaultTableModel tableModel;
     
    /**
     * Creates new form AddObat
     */
    public EditObat(java.awt.Frame parent, boolean modal, DefaultTableModel tableModel,Obat selectedObat) {
        super(parent, modal);
        this.tableModel = tableModel;
        initComponents();
        setObatDetails(selectedObat);
    }
    
    private void setObatDetails(Obat selectedObat){
        EditObatNama.setText(selectedObat.getNamaObat());
        EditObatJenis.setText(selectedObat.getJenisObat());
        EditObatStok.setText(Integer.toString(selectedObat.getStokObat()));
        EditObatSaran.setText(selectedObat.getSaranPenyajianObat());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EditObatNama = new javax.swing.JTextField();
        EditObatJenis = new javax.swing.JTextField();
        EditObatStok = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        EditButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        EditObatSaran = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        EditObatNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditObatNamaActionPerformed(evt);
            }
        });

        jLabel1.setText("Jenis");

        jLabel2.setText("Nama");

        jLabel3.setText("Stok");

        EditButton.setText("Edit");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Saran Penyajian");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EditObatJenis, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EditObatStok)
                            .addComponent(EditObatNama)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditObatSaran, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(EditButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditObatNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditObatJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditObatStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditObatSaran, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(44, 44, 44)
                .addComponent(EditButton)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        String nama = EditObatNama.getText();
        String jenis = EditObatJenis.getText();
        String stokStr = EditObatStok.getText();
        String saranPenyajian  = EditObatSaran.getText() ; 
        int stok;

        try {
            stok = Integer.parseInt(stokStr);
        } catch (NumberFormatException e) {
            // Handle invalid number format
            javax.swing.JOptionPane.showMessageDialog(this, "Stok harus berupa angka.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Create an Obat object
        Obat obat = new Obat(nama, jenis, stok );
        obat.setSaranPenyajian(saranPenyajian);

        // Add the Obat data to the table model
        editObat(nama, jenis,saranPenyajian, stok);

        // Close the dialog after adding the data
        
        this.dispose();
        
        
    }//GEN-LAST:event_EditButtonActionPerformed

    private void EditObatNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditObatNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditObatNamaActionPerformed

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            // Create a DefaultTableModel
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.addColumn("Nama");
            tableModel.addColumn("Jenis");
            tableModel.addColumn("Stok");
            
            Obat selectedObat = new Obat("Kuceng", "Meong", 1);
            selectedObat.setSaranPenyajian("GAK DISAJIKAN JUGA GA SIH?!");
            

            // Pass the tableModel to the AddObat constructor
            EditObat dialog = new EditObat(new javax.swing.JFrame(), true, tableModel,selectedObat);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditButton;
    private javax.swing.JTextField EditObatJenis;
    private javax.swing.JTextField EditObatNama;
    private javax.swing.JTextField EditObatSaran;
    private javax.swing.JTextField EditObatStok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
