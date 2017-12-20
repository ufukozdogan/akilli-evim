package Proje;

import Veritabanı.VeriTabaniBaglanti;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GirisPaneli extends javax.swing.JFrame {

    public GirisPaneli() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baslik = new javax.swing.JLabel();
        tanim = new javax.swing.JLabel();
        kullanici_simge = new javax.swing.JLabel();
        isim = new javax.swing.JTextField();
        sifre_simge = new javax.swing.JLabel();
        sifre = new javax.swing.JPasswordField();
        girisYap = new javax.swing.JButton();
        telif = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Akıllı Ev Sistemi Giriş Ekranı");
        setPreferredSize(new java.awt.Dimension(400, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        baslik.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        baslik.setForeground(new java.awt.Color(0, 0, 0));
        baslik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        baslik.setText("GERÇEK ZAMANLI SİSTEMLER");
        getContentPane().add(baslik, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 410, -1));

        tanim.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        tanim.setForeground(new java.awt.Color(0, 0, 0));
        tanim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanim.setText("Akıllı/Güvenli Ev Projesi");
        getContentPane().add(tanim, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 410, -1));

        kullanici_simge.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        kullanici_simge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kullanici_simge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/user.png"))); // NOI18N
        getContentPane().add(kullanici_simge, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        isim.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        getContentPane().add(isim, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 190, 30));

        sifre_simge.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        sifre_simge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/password.png"))); // NOI18N
        getContentPane().add(sifre_simge, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));
        getContentPane().add(sifre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 190, 30));

        girisYap.setBackground(new java.awt.Color(255, 255, 255));
        girisYap.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        girisYap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/login.png"))); // NOI18N
        girisYap.setText(" Giriş Yap");
        girisYap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        girisYap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                girisYapMouseClicked(evt);
            }
        });
        getContentPane().add(girisYap, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 130, -1));

        telif.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        telif.setForeground(new java.awt.Color(0, 0, 0));
        telif.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telif.setText("Gizem Ezgi Erten & Ufuk Özdoğan © 2017 ");
        getContentPane().add(telif, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 400, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/houses.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 360, -1, 120));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/background.png"))); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-420, -210, -1, -1));

        setSize(new java.awt.Dimension(417, 503));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void girisYapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisYapMouseClicked
        try {
            girisKontrol();
        } catch (SQLException ex) {
            Logger.getLogger(GirisPaneli.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_girisYapMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisPaneli().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel baslik;
    private javax.swing.JButton girisYap;
    private javax.swing.JTextField isim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel kullanici_simge;
    private javax.swing.JPasswordField sifre;
    private javax.swing.JLabel sifre_simge;
    private javax.swing.JLabel tanim;
    private javax.swing.JLabel telif;
    // End of variables declaration//GEN-END:variables

    private void girisKontrol() throws SQLException {
        VeriTabaniBaglanti vb = new VeriTabaniBaglanti();
        vb.baglan();
        
        ResultSet rs;
	PreparedStatement ps;

        String sorgu = "select * from admin where user=? and password=?";
        ps = vb.con.prepareStatement(sorgu);
        ps.setString(1, isim.getText());
        ps.setString(2, sifre.getText());
        rs = ps.executeQuery();

        if (rs.next()) {
             GrafikPaneli ekran = new GrafikPaneli();
             ekran.setVisible(true);
             this.dispose();             
        }
        else{
            JOptionPane.showMessageDialog(this,"Kullanıcı adı veya parola hatalı. Lütfen kontrol edip tekrar deneyiniz.", "Giriş Başarısız",
        JOptionPane.WARNING_MESSAGE);
        }
    }
}

