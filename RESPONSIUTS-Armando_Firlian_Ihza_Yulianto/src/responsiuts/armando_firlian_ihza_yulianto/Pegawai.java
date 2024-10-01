/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiuts.armando_firlian_ihza_yulianto;

/**
 *
 * @author ASUS
 */
public class Pegawai {
    private String namaPegawai;
    private double gaji;

    public Pegawai(String namaPegawaiToko, int gajiToko) {
        namaPegawai = namaPegawaiToko;
        gaji = gajiToko;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawaiToko) {
        namaPegawai = namaPegawaiToko;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(int gajiToko) {
        gaji = gajiToko;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + namaPegawai);
        System.out.println("Gaji: " + "Rp." + gaji);
    }
}


