
package Veritabanı;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VeriTabaniBaglanti {
    
    public Connection con;
    private String url = "jdbc:mysql://localhost:3306/";
    private String driver = "com.mysql.jdbc.Driver";
    private String dbname  = "arduino";
    private String userName = "root";
    private String password = "";
    
    public void baglan()
    {
        
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url+dbname,userName,password);
                        
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "hata"+ex);
        }
        
    }
    
    
    
    
}
