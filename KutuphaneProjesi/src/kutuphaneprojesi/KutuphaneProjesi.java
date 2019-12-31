/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kutuphaneprojesi;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale.Category;

/**
 *
 * @author kaan1
 */
public class KutuphaneProjesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException  {
     Database db=new Database();
    // db.baglantiKur();
     login lg=new login();
     lg.setVisible(true);
    //db.veriGuncelle();
    //CategoryDAO cdao=new CategoryDAO();
    
   
     }
    
   
   
     
     
//String insert="INSERT INTO `kitap` (`barkod`, `isim`, `yazar`, `yayinEvi`) VALUES ('5', 'Yeni Kayıt', 'Menderes Çakıcı', 'Palme')";
     //db.veriEkle(insert);// test amacıyla buraya yazıyorum normalde swing üzerinden çağırılacak
    }

   
    

