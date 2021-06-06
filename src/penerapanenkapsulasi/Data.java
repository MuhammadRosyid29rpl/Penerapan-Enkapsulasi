/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penerapanenkapsulasi;

/**
 *
 * @author ASUS TUF A15
 */
public class Data {
    private double lebar;
    private double panjang;
    
    public Data(){
        double lebar = 0;
        double panjang = 0;
    }
    private double luas (double p,double l){
        return p*l;
    }
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    public void setLebar(double lebar){
        this.lebar = lebar;
    }
    public double getPanjang(){
        return panjang;
    }
    public double getLebar(){
        return lebar;
    }
    public double getLuas(){
        return luas(panjang,lebar);
    }
}
