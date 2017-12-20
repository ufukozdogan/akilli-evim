package Proje;

import Veritabanı.VeriTabaniBaglanti;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class IsikSorguPaneli extends javax.swing.JFrame {

    public IsikSorguPaneli() {
        initComponents();
    }

    String tarih1;
    String tarih2;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        geri = new javax.swing.JLabel();
        baslik = new javax.swing.JLabel();
        banner = new javax.swing.JLabel();
        sorgulabel = new javax.swing.JLabel();
        tarih = new javax.swing.JTextField();
        aydinlanmaNeZaman = new javax.swing.JButton();
        kararmaNeZaman = new javax.swing.JButton();
        tumİstatistikler = new javax.swing.JButton();
        not = new javax.swing.JLabel();
        not1 = new javax.swing.JLabel();
        spiral = new javax.swing.JLabel();
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
        getContentPane().add(geri, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 80, 40));

        baslik.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        baslik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        baslik.setText("Işık Sensörü Bilgi Merkezi");
        getContentPane().add(baslik, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 10, 390, 50));

        banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/banner2.png"))); // NOI18N
        banner.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 60));

        sorgulabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        sorgulabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sorgulabel.setText("Lütfen sorgu yapmak istediğiniz tarihi yazın.");
        getContentPane().add(sorgulabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 390, -1));

        tarih.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        getContentPane().add(tarih, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 170, -1));

        aydinlanmaNeZaman.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        aydinlanmaNeZaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/sunrise.png"))); // NOI18N
        aydinlanmaNeZaman.setText("Hava Ne Zaman Aydınlandı?");
        aydinlanmaNeZaman.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        aydinlanmaNeZaman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aydinlanmaNeZaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aydinlanmaNeZamanMouseClicked(evt);
            }
        });
        getContentPane().add(aydinlanmaNeZaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 210, 40));

        kararmaNeZaman.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        kararmaNeZaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/sunset.png"))); // NOI18N
        kararmaNeZaman.setText("Hava Ne Zaman Karardı?");
        kararmaNeZaman.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        kararmaNeZaman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kararmaNeZaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kararmaNeZamanMouseClicked(evt);
            }
        });
        getContentPane().add(kararmaNeZaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 210, 40));

        tumİstatistikler.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        tumİstatistikler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/istatistik.png"))); // NOI18N
        tumİstatistikler.setText("Tüm İstatistikler");
        tumİstatistikler.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        tumİstatistikler.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tumİstatistikler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tumİstatistiklerMouseClicked(evt);
            }
        });
        getContentPane().add(tumİstatistikler, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 210, 40));

        not.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        not.setForeground(new java.awt.Color(255, 0, 0));
        not.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        not.setText("Bu alanı doldurmak Hava Ne Zaman Aydınlandı / Karardı aksiyonları için zorunludur.");
        getContentPane().add(not, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 390, 30));

        not1.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        not1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        not1.setText("Tarih formatı YYYY-AA-GG şeklindedir.");
        getContentPane().add(not1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 400, 20));

        spiral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/wave.png"))); // NOI18N
        getContentPane().add(spiral, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 300, -1, -1));

        arkaplan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/background3.jpg"))); // NOI18N
        getContentPane().add(arkaplan, new org.netbeans.lib.awtextra.AbsoluteConstraints(-660, -160, -1, -1));

        setSize(new java.awt.Dimension(409, 455));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aydinlanmaNeZamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aydinlanmaNeZamanMouseClicked
        VeriTabaniBaglanti vb = new VeriTabaniBaglanti();
        vb.baglan();

        if (tarih.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lütfen formata uygun, geçerli bir tarih giriniz.", "Hata Aldınız", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                ResultSet rs;
                PreparedStatement ps;
                String sorgu = "select time(tarih) from isik where isikDegeri =500 and date(tarih) = ?";
                ps = vb.con.prepareStatement(sorgu);
                ps.setString(1, tarih.getText());
                rs = ps.executeQuery();
                if (rs.next()) {
                    this.tarih1 = rs.getString(1);
                    JOptionPane.showMessageDialog(this, "Aydınlanma saati: " + tarih1, "Hava kaçta aydınlandı?", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Girilen tarihe uygun veri bulunamadı.", "Veritabanı boş.", JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }//GEN-LAST:event_aydinlanmaNeZamanMouseClicked

    private void tumİstatistiklerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tumİstatistiklerMouseClicked
        VeriTabaniBaglanti vb = new VeriTabaniBaglanti();
        vb.baglan();
        try {
            ResultSet rs;
            PreparedStatement ps;
            String sorgu = " select date(tarih), time(tarih) from isik where isikDegeri = 450 or isikDegeri=500 order by tarih";
            ps = vb.con.prepareStatement(sorgu);
            rs = ps.executeQuery();
            IsikSorguAltPaneli sorgup = new IsikSorguAltPaneli();
            while (rs.next()) {
                this.tarih1 = rs.getString(1);
                this.tarih2 = rs.getString(2);
                sorgup.setVisible(true);
                sorgup.sonuc.append("" + tarih1 + " " + tarih2 + "\n");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_tumİstatistiklerMouseClicked

    private void kararmaNeZamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kararmaNeZamanMouseClicked
        VeriTabaniBaglanti vb = new VeriTabaniBaglanti();
        vb.baglan();
        if (tarih.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lütfen formata uygun, geçerli bir tarih giriniz.", "Hata Aldınız", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                ResultSet rs;
                PreparedStatement ps;
                String sorgu = " select time(tarih) from isik where isikDegeri = 450 and date(tarih) = ?";
                ps = vb.con.prepareStatement(sorgu);
                ps.setString(1, tarih.getText());
                rs = ps.executeQuery();
                if (rs.next()) {
                    this.tarih1 = rs.getString(1);
                    JOptionPane.showMessageDialog(this, "Kararma saati: " + tarih1, "Hava kaçta karardı?", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Girilen tarihe uygun veri bulunamadı.", "Veritabanı boş.", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }//GEN-LAST:event_kararmaNeZamanMouseClicked

    private void geriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriMouseClicked
        VeritabaniSecimPaneli vts = new VeritabaniSecimPaneli();
        vts.setVisible(true);
        this.hide();
    }//GEN-LAST:event_geriMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IsikSorguPaneli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arkaplan;
    private javax.swing.JButton aydinlanmaNeZaman;
    private javax.swing.JLabel banner;
    private javax.swing.JLabel baslik;
    private javax.swing.JLabel geri;
    private javax.swing.JButton kararmaNeZaman;
    private javax.swing.JLabel not;
    private javax.swing.JLabel not1;
    private javax.swing.JLabel sorgulabel;
    private javax.swing.JLabel spiral;
    private javax.swing.JTextField tarih;
    private javax.swing.JButton tumİstatistikler;
    // End of variables declaration//GEN-END:variables
}
