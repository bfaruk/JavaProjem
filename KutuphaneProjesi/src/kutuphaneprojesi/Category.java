/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kutuphaneprojesi;

/**
 *
 * @author kaan1
 */
public class Category {               //*********************************************************************************************************//
    private int barkod;
    private String isim;
    private String yazar;
    private String yayinEvi;

    public Category() {
    }

    public Category(int barkod, String isim, String yazar, String yayinEvi) {
        this.barkod = barkod;
        this.isim = isim;
        this.yazar = yazar;
        this.yayinEvi = yayinEvi;
    }

    public int getBarkod() {
        return barkod;
    }

    public void setBarkod(int barkod) {
        this.barkod = barkod;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getYayinEvi() {
        return yayinEvi;
    }

    public void setYayinEvi(String yayinEvi) {
        this.yayinEvi = yayinEvi;
    }

    @Override
    public String toString() {
        return "CategoryDAO{" + "barkod=" + barkod + ", isim=" + isim + ", yazar=" + yazar + ", yayinEvi=" + yayinEvi + '}';
    }
 
    
    
    
}
    

