package Sensor;

import Veritabanı.IsikEkle;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
//import com.fazecast.jSerialComm.SerialPort;

public class SensorIsik {

    int sayi = 0;

    public SensorIsik(String isik) {
        this.isik = isik;
        if (x == 0) {
            ciz();
            x++;
        }
        else{
            System.out.println("artık iki+");
        }
    }

    public void ciz() {
        window = new JFrame();
        window.setTitle("Işık Sensörü GUI");
        window.setSize(600, 400);
        window.setLayout(new BorderLayout());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create the line graph
        series = new XYSeries("Işık Sensörü Verileri");
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        JFreeChart chart = ChartFactory.createXYLineChart("Işık Sensörü Verileri", "Zaman (saniye)", "Okunan Değer", dataset);
        window.add(new ChartPanel(chart), BorderLayout.CENTER);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    static int x = 0;
    String isik;

    static JFrame window;
    static XYSeries series;

    public static void main(String[] args) {
        //calistir("deneme");
    }

    public void calistir() throws SQLException {
        System.out.println(isik);
        series.add(x++, Integer.parseInt(isik));
        window.repaint();
        IsikEkle ekleIsik = new IsikEkle(Integer.parseInt(isik));
        
    }
}
