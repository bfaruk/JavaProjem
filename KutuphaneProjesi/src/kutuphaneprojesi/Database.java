/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kutuphaneprojesi;

import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kaan1
 */
public class Database implements IDatabase {

    Connection conn = null;
    ResultSet rs = null;

    @Override
    public void baglantiKur() {
        final String userName = "root";
        final String password = "";
        final String connString
                = "jdbc:mysql://localhost:3306/kutuphane";

        try {
            String SQL = "SELECT * FROM `kitap`";
            conn = DriverManager.getConnection(connString, userName, password);
            PreparedStatement stat = conn.prepareStatement(SQL);
            rs = stat.executeQuery();
            
            

        } catch (SQLException e) {
            System.out.println(e + "\n bağlantı Başarısız");
           
        }

    }

    @Override
    public boolean veriEkle(String insert) {
        //PreparedStatement  stat=conn.prepareStatement(insert);
        baglantiKur();
        try {
            PreparedStatement posted = conn.prepareStatement(insert);
            posted.executeUpdate();
            return true;
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null,"Bilgileri Hatalı Girdiniz");
            System.out.println(e);
            return false;
        } 

    }

    @Override
    public void veriSil(String SQL_sil) {
        baglantiKur();
        int barkod = parseInt(SQL_sil);
        String sorgu = "DELETE FROM kitap WHERE barkod=' " + barkod + "'";
        try {
            PreparedStatement stat = conn.prepareStatement(sorgu);
            stat.executeUpdate();
            System.out.println(barkod + " Silindi");
        } catch (SQLException e) {
            System.out.println(e);

        }
    }

    @Override
    public void veriGuncelle() {
        baglantiKur();
        CategoryDAO cdao=new CategoryDAO();
        
    
    }
}
