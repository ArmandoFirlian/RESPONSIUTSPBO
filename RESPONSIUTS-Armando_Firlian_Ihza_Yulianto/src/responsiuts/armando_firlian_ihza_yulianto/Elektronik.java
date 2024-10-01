/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiuts.armando_firlian_ihza_yulianto;

/**
 *
 * @author ASUS
 */
public class Elektronik extends Produk {
    private int garansi;

    public Elektronik(String namaProduk, int harga, int garansiToko) {
        super(namaProduk, harga);
        garansi = garansiToko;
    }

    public int getGaransi() {
        return garansi;
    }

    public void setGaransi(int garansiToko) {
        garansi = garansiToko;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Garansi: " + garansi + " tahun");
    }
}