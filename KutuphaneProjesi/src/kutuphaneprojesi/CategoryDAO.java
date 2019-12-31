/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kutuphaneprojesi;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kaan1
 */
public class CategoryDAO {
    Database db=new Database();
    
    public List<Category> getCategories(){
        List<Category> clist=new ArrayList();
        db.baglantiKur();
        try {
            Statement stat = db.conn.createStatement();
            ResultSet Rs = stat.executeQuery("SELECT* FROM kitap");
            while (db.rs.next()) {
                //String yazarAdi = rs.getString("yazar");
                Category tmp=new Category(db.rs.getInt("barkod"),db.rs.getString("isim"),db.rs.getString("yazar"),db.rs.getString("yayinEvi"));
                clist.add(tmp);
                    
                
                //System.out.println(yazarAdi);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, 
                    null, ex);
       
        }
         
        return clist;
    }
    
    
    
}
