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
public class PenerapanEnkapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hitung Luas Persegi Panjang");
        System.out.println("============================");
        System.out.println(" ");
        Data r = new Data();
        r.setPanjang(10);
        r.setLebar(6.5);
        System.out.println("Panjang = "+r.getPanjang());
        System.out.println("Lebar   = "+r.getLebar());
        System.out.println("Luas    = "+r.getLuas());
    }
    
}
