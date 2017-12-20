package Sensor;

import static Sensor.SensorIsik.window;
import Veritabanı.SicaklikEkle;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
//import com.fazecast.jSerialComm.SerialPort;

public class SensorSicaklik {

    int sayi = 0;
    

    public SensorSicaklik(String sicaklik) {
        this.sicaklik = sicaklik;
        if (x == 0) {
            ciz();
            x++;
        } else {
            System.out.println("artık iki+");
        }
    }

    public void ciz() {
        window = new JFrame();
        window.setTitle("Sıcaklık Sensörü GUI");
        window.setSize(600, 400);
        window.setLayout(new BorderLayout());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create the line graph
        series = new XYSeries("Sıcaklık Sensörü Verileri");
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        JFreeChart chart = ChartFactory.createXYLineChart("Sıcaklık Sensörü Verileri", "Zaman (saniye)", "Okunan Değer", dataset);
        window.add(new ChartPanel(chart), BorderLayout.CENTER);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        /*bottomPanel = new JPanel();
        degerTanimi = new JLabel("Şu anki sıcaklık değeri: ");
        degerPaneli = new JLabel();
        bottomPanel.add(degerTanimi);
        bottomPanel.add(degerPaneli);
        window.add(bottomPanel, BorderLayout.SOUTH);
        */
        window.setVisible(true);
    }
    static int x = 0;
    String sicaklik;

    static JFrame window;
    JPanel bottomPanel;
    static XYSeries series;
    
    //public JLabel degerPaneli;
    //JLabel degerTanimi;

    public static void main(String[] args) {
        //calistir("deneme");
    }

    public void calistir() throws SQLException {
        System.out.println(sicaklik);
        series.add(x++, Integer.parseInt(sicaklik));
        window.repaint();
        SicaklikEkle ekleSicaklik = new SicaklikEkle(Integer.parseInt(sicaklik));
    }
    
}
