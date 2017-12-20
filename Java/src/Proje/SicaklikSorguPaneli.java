package Proje;

import Veritabanı.VeriTabaniBaglanti;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class SicaklikSorguPaneli extends javax.swing.JFrame {

    public SicaklikSorguPaneli() {
        initComponents();
    }

    String tarih1;
    String tarih2;
    String tarih3;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        geri = new javax.swing.JLabel();
        baslik1 = new javax.swing.JLabel();
        banner = new javax.swing.JLabel();
        sorgulabel = new javax.swing.JLabel();
        tarih = new javax.swing.JTextField();
        gunuBul = new javax.swing.JButton();
        tumİstatistik = new javax.swing.JButton();
        not = new javax.swing.JLabel();
        spiral = new javax.swing.JLabel();
        not1 = new javax.swing.JLabel();
        arkaplan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Işık Sensörü Sorgu Paneli");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        geri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/geri.png"))); // NOI18N
        geri.setText("Geri");
        geri.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriMouseClicked(evt);
            }
        });
        getContentPane().add(geri, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, 40));

        baslik1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        baslik1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        baslik1.setText("Sıcaklık Sensörü Bilgi Merkezi");
        getContentPane().add(baslik1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 390, 50));

        banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/banner4.png"))); // NOI18N
        banner.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 410, 70));

        sorgulabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        sorgulabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sorgulabel.setText("Lütfen sorgu yapmak istediğiniz tarihi yazın.");
        getContentPane().add(sorgulabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 390, -1));

        tarih.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        getContentPane().add(tarih, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 170, -1));

        gunuBul.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        gunuBul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/listele.png"))); // NOI18N
        gunuBul.setText("Günü Listele");
        gunuBul.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        gunuBul.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gunuBul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gunuBulMouseClicked(evt);
            }
        });
        getContentPane().add(gunuBul, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 190, 40));

        tumİstatistik.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        tumİstatistik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/istatistik.png"))); // NOI18N
        tumİstatistik.setText("Tüm İstatistikler");
        tumİstatistik.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        tumİstatistik.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tumİstatistik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tumİstatistikMouseClicked(evt);
            }
        });
        getContentPane().add(tumİstatistik, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 190, 40));

        not.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        not.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        not.setText("Tarih formatı YYYY-AA-GG şeklindedir.");
        getContentPane().add(not, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 400, 20));

        spiral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/wave.png"))); // NOI18N
        getContentPane().add(spiral, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 300, -1, -1));

        not1.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        not1.setForeground(new java.awt.Color(255, 0, 0));
        not1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        not1.setText("Bu alanı doldurmak Günü Listele aksiyonu için zorunludur.");
        getContentPane().add(not1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 390, 30));

        arkaplan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/background3.jpg"))); // NOI18N
        getContentPane().add(arkaplan, new org.netbeans.lib.awtextra.AbsoluteConstraints(-660, -160, -1, -1));

        setSize(new java.awt.Dimension(409, 455));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tumİstatistikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tumİstatistikMouseClicked
        VeriTabaniBaglanti vb = new VeriTabaniBaglanti();
        vb.baglan();
        try {
            ResultSet rs;
            PreparedStatement ps;
            String sorgu = "select date(tarih), time(tarih), sicaklikDegeri from sicaklik";
            ps = vb.con.prepareStatement(sorgu);
            rs = ps.executeQuery();
            SicaklikSorguAltPaneli sorgup = new SicaklikSorguAltPaneli();
            while (rs.next()) {
                this.tarih1 = rs.getString(1);
                this.tarih2 = rs.getString(2);
                this.tarih3 = rs.getString(3);
                sorgup.setVisible(true);
                sorgup.sonuc.append("Tarih : " + tarih1 + "   Saat: " + tarih2 + "   Sıcaklık : " + tarih3 + "\n");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_tumİstatistikMouseClicked

    private void gunuBulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gunuBulMouseClicked
        VeriTabaniBaglanti vb = new VeriTabaniBaglanti();
        vb.baglan();

        if (tarih.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lütfen formata uygun, geçerli bir tarih giriniz.", "Hata Aldınız", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                ResultSet rs;
                PreparedStatement ps;
                String sorgu = "select time(tarih), sicaklikDegeri from sicaklik where date(tarih) = ?";
                ps = vb.con.prepareStatement(sorgu);
                ps.setString(1, tarih.getText());
                rs = ps.executeQuery();
                SicaklikSorguAltPaneli2 sorgup2 = new SicaklikSorguAltPaneli2();
                while (rs.next()) {
                    this.tarih1 = rs.getString(1);
                    this.tarih2 = rs.getString(2);
                    sorgup2.setVisible(true);
                    sorgup2.sonuc.append("Saat : " + tarih1 + "   Sıcaklık Değeri: " + tarih2 + "\n");
                }
             /*   if (!rs.next()) {
                    JOptionPane.showMessageDialog(this, "Girilen tarihe uygun veri bulunamadı.", "Veritabanı boş.", JOptionPane.ERROR_MESSAGE);

                }*/
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }//GEN-LAST:event_gunuBulMouseClicked

    private void geriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriMouseClicked
        VeritabaniSecimPaneli vts = new VeritabaniSecimPaneli();
        vts.setVisible(true);
        this.hide();
    }//GEN-LAST:event_geriMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SicaklikSorguPaneli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arkaplan;
    private javax.swing.JLabel banner;
    private javax.swing.JLabel baslik1;
    private javax.swing.JLabel geri;
    private javax.swing.JButton gunuBul;
    private javax.swing.JLabel not;
    private javax.swing.JLabel not1;
    private javax.swing.JLabel sorgulabel;
    private javax.swing.JLabel spiral;
    private javax.swing.JTextField tarih;
    private javax.swing.JButton tumİstatistik;
    // End of variables declaration//GEN-END:variables
}
