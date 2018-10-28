/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author Dul mu'in
 */
public class Burung extends HewanDarat{
    
    private int panjangSayap;
    
    public Burung(String nama, String warna, int masaHidup, String makanan) {
        super(nama, warna, masaHidup, "Bertelur", makanan, 2);
    }

    public int getPanjangSayap() {
        return panjangSayap;
    }

    public void setPanjangSayap(int panjangSayap) {
        this.panjangSayap = panjangSayap;
    }
    
}
