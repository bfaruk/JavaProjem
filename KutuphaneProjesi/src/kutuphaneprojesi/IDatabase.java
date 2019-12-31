/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kutuphaneprojesi;

import java.sql.Connection;


/**
 *
 * @author kaan1
 */
public interface IDatabase {
    void baglantiKur();
    boolean veriEkle(String insert);
    void veriSil(String SQL_sil);
    void veriGuncelle();
    
    
    
}
