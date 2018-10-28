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
public class HewanDarat extends Hewan {

    protected int jumlahKaki;

    public HewanDarat(String nama, String warna, int masaHidup, String caraBerkembangBiak, String makanan, int jumlahKaki) {
        super(nama, warna, "Darat", masaHidup, caraBerkembangBiak, makanan);
        this.jumlahKaki = jumlahKaki;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

}
