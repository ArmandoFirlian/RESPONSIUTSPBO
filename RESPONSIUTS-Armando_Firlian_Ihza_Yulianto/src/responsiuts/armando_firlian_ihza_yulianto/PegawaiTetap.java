/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiuts.armando_firlian_ihza_yulianto;

/**
 *
 * @author ASUS
 */
public class PegawaiTetap extends Pegawai {
    private double tunjangan;

    public PegawaiTetap(String namaPegawai, int gaji, int tunjanganToko) {
        super(namaPegawai, gaji);
        tunjangan = tunjanganToko;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(int tunjanganToko) {
        tunjangan = tunjanganToko;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tunjangan: " + "Rp." + tunjangan);
    }
}