package Veritabanı;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SicaklikEkle {

    int deger;

    public SicaklikEkle(Integer deger) throws SQLException {
        this.deger = deger;
        VeriTabaniBaglanti vb = new VeriTabaniBaglanti();
        vb.baglan();

        java.util.Date dt = new java.util.Date();
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = sdf.format(dt);
        
        System.out.println(currentTime);
        System.out.println(this.deger);
        
        String sorgu = "insert into sicaklik (sicaklikDegeri, tarih) VALUES (?,?)";
        PreparedStatement preparedStatement = vb.con.prepareStatement(sorgu);
        preparedStatement.setInt(1, this.deger);
        preparedStatement.setString(2, currentTime);

        preparedStatement.executeUpdate();
    }

    public static void main(String[] args){
        
    }
}
