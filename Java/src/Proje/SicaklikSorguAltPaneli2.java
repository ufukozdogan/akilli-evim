package Proje;

public class SicaklikSorguAltPaneli2 extends javax.swing.JFrame {

    public SicaklikSorguAltPaneli2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baslik = new javax.swing.JLabel();
        banner = new javax.swing.JLabel();
        sonucPane = new javax.swing.JScrollPane();
        sonuc = new javax.swing.JTextArea();
        geri = new javax.swing.JLabel();
        arkaplan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Işık Bilgi Merkezi Tüm İstatistikler");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        baslik.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        baslik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        baslik.setText("Günün Sıcaklık Özeti");
        getContentPane().add(baslik, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 60));

        banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/banner4.png"))); // NOI18N
        banner.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 60));

        sonuc.setColumns(20);
        sonuc.setRows(5);
        sonucPane.setViewportView(sonuc);

        getContentPane().add(sonucPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 400, 370));

        geri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/geri.png"))); // NOI18N
        geri.setText("Geri");
        geri.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriMouseClicked(evt);
            }
        });
        getContentPane().add(geri, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 80, 40));

        arkaplan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/background3.jpg"))); // NOI18N
        getContentPane().add(arkaplan, new org.netbeans.lib.awtextra.AbsoluteConstraints(-550, -130, -1, -1));

        setSize(new java.awt.Dimension(418, 488));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void geriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriMouseClicked
        this.dispose();
    }//GEN-LAST:event_geriMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SicaklikSorguAltPaneli2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arkaplan;
    private javax.swing.JLabel banner;
    private javax.swing.JLabel baslik;
    private javax.swing.JLabel geri;
    public javax.swing.JTextArea sonuc;
    private javax.swing.JScrollPane sonucPane;
    // End of variables declaration//GEN-END:variables
}
