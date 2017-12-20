package Proje;

import Sensor.SerialTest;
import javax.swing.JTextField;

public class GrafikPaneli extends javax.swing.JFrame {

    public GrafikPaneli() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        arduinologo = new javax.swing.JLabel();
        baslik = new javax.swing.JLabel();
        baslik1 = new javax.swing.JLabel();
        banner = new javax.swing.JLabel();
        grafikResim = new javax.swing.JLabel();
        veritabanıResim = new javax.swing.JLabel();
        arduino = new javax.swing.JLabel();
        baglan = new javax.swing.JButton();
        veritabaniBaglan = new javax.swing.JButton();
        telif = new javax.swing.JLabel();
        footer = new javax.swing.JLabel();
        mega = new javax.swing.JLabel();
        arkaplan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arduino Ölçüm Takip Sistemi");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        arduinologo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/arduinologo.png"))); // NOI18N
        getContentPane().add(arduinologo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 2, -1, 70));

        baslik.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        baslik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        baslik.setText("Veri Takip & Kayıt Sistemi");
        getContentPane().add(baslik, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 320, -1));

        baslik1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        baslik1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        baslik1.setText("Arduino");
        getContentPane().add(baslik1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 280, -1));

        banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/banner.png"))); // NOI18N
        banner.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -70, 770, 140));

        grafikResim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/graph.png"))); // NOI18N
        getContentPane().add(grafikResim, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        veritabanıResim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/pie-chart.png"))); // NOI18N
        getContentPane().add(veritabanıResim, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        arduino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/arduino2.png"))); // NOI18N
        getContentPane().add(arduino, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        baglan.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        baglan.setText("Arduino'ya Bağlan ve Verileri Oku");
        baglan.setToolTipText("Arduino üzerinden gönderilen verileri  gerçek zamanlı olarak grafiğe döker. Aynı zamanda da veritabanına işler.");
        baglan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        baglan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baglan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                baglanMouseClicked(evt);
            }
        });
        getContentPane().add(baglan, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 250, 50));

        veritabaniBaglan.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        veritabaniBaglan.setText("Bilgi Merkezine Git");
        veritabaniBaglan.setToolTipText("Veritabanı üzerindeki verilerden istenilen zamana karşılık gelen veriyi kullanıcıya gösterir.");
        veritabaniBaglan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        veritabaniBaglan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        veritabaniBaglan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                veritabaniBaglanMouseClicked(evt);
            }
        });
        getContentPane().add(veritabaniBaglan, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 250, 50));

        telif.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        telif.setForeground(new java.awt.Color(0, 0, 0));
        telif.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telif.setText(" Gizem Ezgi Erten & Ufuk Özdoğan © 2017 ");
        getContentPane().add(telif, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 400, 20));

        footer.setBackground(new java.awt.Color(255, 255, 255));
        footer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/whitespace.png"))); // NOI18N
        footer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 320, 730, 30));

        mega.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        mega.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mega.setText("Bu sistem Arduino ATMega 2560 kullanılarak tasarlanmıştır.");
        getContentPane().add(mega, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 680, -1));

        arkaplan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/background3.jpg"))); // NOI18N
        getContentPane().add(arkaplan, new org.netbeans.lib.awtextra.AbsoluteConstraints(-560, -180, -1, -1));

        setSize(new java.awt.Dimension(696, 376));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void baglanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baglanMouseClicked
        SerialTest st = new SerialTest();
        st.initialize();
    }//GEN-LAST:event_baglanMouseClicked

    private void veritabaniBaglanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_veritabaniBaglanMouseClicked
        VeritabaniSecimPaneli vtsecim = new VeritabaniSecimPaneli();
        vtsecim.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_veritabaniBaglanMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GrafikPaneli().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arduino;
    private javax.swing.JLabel arduinologo;
    private javax.swing.JLabel arkaplan;
    private javax.swing.JButton baglan;
    private javax.swing.JLabel banner;
    private javax.swing.JLabel baslik;
    private javax.swing.JLabel baslik1;
    private javax.swing.JLabel footer;
    private javax.swing.JLabel grafikResim;
    private javax.swing.JLabel mega;
    private javax.swing.JLabel telif;
    private javax.swing.JButton veritabaniBaglan;
    private javax.swing.JLabel veritabanıResim;
    // End of variables declaration//GEN-END:variables


}


