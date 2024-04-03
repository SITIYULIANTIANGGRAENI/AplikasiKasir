/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasikasir_siti;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author OWNER
 */
public class FormPelanggan extends javax.swing.JFrame {
Connection konek;
PreparedStatement pst;
ResultSet rst;
    /**
     * Creates new form FormPelanggan
     */
    public FormPelanggan() {
        initComponents();
    konek = Koneksi.koneksiDb();
        updateTabel();
    }

    public void updateTabel(){
        try{
            String sql = "select * from pelanggan";
             pst = konek.prepareStatement(sql);
             rst = pst.executeQuery();
             tblpelanggan.setModel(DbUtils.resultSetToTableModel(rst));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void clear(){
         txtpelanggan.setText("");
         txtnama.setText("");
         txtalamat.setText("");
         txtnotelepon.setText("");
     }
    
     private void simpan() {
         try{
             String sql ="insert into pelanggan (PelangganID,NamaPelanggan,Alamat,NomorTelepon) value (?,?,?,?)";
             pst = konek.prepareStatement(sql);
             pst.setString(1, txtpelanggan.getText());
             pst.setString(2,txtnama.getText());
             pst.setString(3, txtalamat.getText());
             pst.setString(4,txtnotelepon.getText ());
             pst.execute();
             JOptionPane.showMessageDialog(null, "Data Tersimpan");
         }catch (Exception e) {
             JOptionPane.showMessageDialog(null,e);
         }
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtnotelepon = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        btnsimpan = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblpelanggan = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtpelanggan = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtalamat.setColumns(20);
        txtalamat.setRows(5);
        jScrollPane1.setViewportView(txtalamat);

        btnsimpan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-bookmark-20.png"))); // NOI18N
        btnsimpan.setText("SIMPAN");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnedit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-edit-20.png"))); // NOI18N
        btnedit.setText("EDIT");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnhapus.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-cancel-20.png"))); // NOI18N
        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnkeluar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnkeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-logout-rounded-20.png"))); // NOI18N
        btnkeluar.setText("KELUAR");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        tblpelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblpelanggan.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblpelangganAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(tblpelanggan);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-customer-30.png"))); // NOI18N
        jLabel1.setText("INPUT PELANGGAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(141, 141, 141))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-customer-30_1.png"))); // NOI18N
        jLabel2.setText("Id Pelanggan");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-checked-identification-documents-20.png"))); // NOI18N
        jLabel3.setText("Nama Pelanggan");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-address-20.png"))); // NOI18N
        jLabel4.setText("Alamat");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-ringing-phone-20.png"))); // NOI18N
        jLabel5.setText("No Telepon");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jLabel5))
                                        .addComponent(jLabel2))
                                    .addGap(43, 43, 43)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtpelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtnama)
                                            .addComponent(txtnotelepon, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnsimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnkeluar)
                                        .addComponent(btnedit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnhapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(22, 22, 22))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)))))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtpelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnsimpan))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jLabel3))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnedit))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jLabel4)
                            .addGap(67, 67, 67)
                            .addComponent(jLabel5))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtnotelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(btnhapus)
                            .addGap(38, 38, 38)
                            .addComponent(btnkeluar)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        try {
            String pelanggan = txtpelanggan.getText();
            String nama = txtnama.getText();
            String alamat = txtalamat.getText();
            String notelepon = txtnotelepon.getText();
            String sql = "update pelanggan set PelangganID ='"+pelanggan+"',NamaPelanggan ='"+nama+"',Alamat = '"+alamat+"',NoTelepon ='"+notelepon+"'";
            pst = konek.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"data berhasil di update");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        updateTabel();
        clear();
        // TODO add your handling code here:
    }//GEN-LAST:event_btneditActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        try{
            String sql = "delete * Form Pelanggan where PelangganID =?";
            pst = konek.prepareStatement(sql);
            pst.setString(1, txtpelanggan.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null,"data berhasil di hapus");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        new MenuUtama().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void tblpelangganAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblpelangganAncestorAdded
        try{
            int baris = tblpelanggan.getSelectedRow();
            String tabelKlik = (tblpelanggan.getModel()).getValueAt(baris,0).toString();
            String sql ="select * Form Pelanggan where PelangganID = '"+tabelKlik+"'";
            pst = konek.prepareStatement(sql);
            rst = pst.executeQuery();
            if (rst.next()){
                String datapelanggan = rst.getString("PelangganID");
                txtpelanggan.setText(datapelanggan);
                String datanama = rst.getString("NamaPelanggan");
                txtnama.setText(datanama);
                String dataalamat = rst.getString("Alamat");
                txtalamat.setText(dataalamat);
                String datanotelepon = rst.getString("NomorTelepon");
                txtnotelepon.setText(datanotelepon);
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tblpelangganAncestorAdded

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
simpan();
clear();// TODO add your handling code here:
    }//GEN-LAST:event_btnsimpanActionPerformed

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
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblpelanggan;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnotelepon;
    private javax.swing.JTextField txtpelanggan;
    // End of variables declaration//GEN-END:variables
}
