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
public class Hewan {
    protected String nama;
    protected String warna;
    protected String habitat;
    protected int masaHidup;
    protected String caraBerkembangBiak;
    protected String makanan;

    public Hewan(String nama, String warna, String habitat, int masaHidup, String caraBerkembangBiak, String makanan) {
        this.nama = nama;
        this.warna = warna;
        this.habitat = habitat;
        this.masaHidup = masaHidup;
        this.caraBerkembangBiak = caraBerkembangBiak;
        this.makanan = makanan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getMasaHidup() {
        return masaHidup;
    }

    public void setMasaHidup(int masaHidup) {
        this.masaHidup = masaHidup;
    }

    public String getCaraBerkembangBiak() {
        return caraBerkembangBiak;
    }

    public void setCaraBerkembangBiak(String caraBerkembangBiak) {
        this.caraBerkembangBiak = caraBerkembangBiak;
    }

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }
    
    
    
}
