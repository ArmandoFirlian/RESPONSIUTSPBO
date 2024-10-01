/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiuts.armando_firlian_ihza_yulianto;

/**
 *
 * @author ASUS
 */
public class PegawaiKontrak extends Pegawai {
    private int lamaKontrak;

    public PegawaiKontrak(String namaPegawai, int gaji, int lamaKontrakParam) {
        super(namaPegawai, gaji);
        lamaKontrak = lamaKontrakParam;
    }

    public int getLamaKontrak() {
        return lamaKontrak;
    }

    public void setLamaKontrak(int lamaKontrakParam) {
        lamaKontrak = lamaKontrakParam;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Lama Kontrak: " + lamaKontrak + " bulan");
    }
}
