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
public class Ikan extends HewanLaut{
    
    private int panjangSirip;
    
    public Ikan(String nama, String warna, int masaHidup, String caraBerkembangBiak, String makanan, int panjangSirip) {
        super(nama, warna, masaHidup, caraBerkembangBiak, makanan);
        this.panjangSirip = panjangSirip;
    }

    public int getPanjangSirip() {
        return panjangSirip;
    }

    public void setPanjangSirip(int panjangSirip) {
        this.panjangSirip = panjangSirip;
    }
    
}
