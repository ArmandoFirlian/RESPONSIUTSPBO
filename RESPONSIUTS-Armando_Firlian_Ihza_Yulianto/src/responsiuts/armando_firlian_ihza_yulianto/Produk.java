/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiuts.armando_firlian_ihza_yulianto;

/**
 *
 * @author ASUS
 */
public class Produk {
    private String namaProduk;
    private double harga;

    public Produk(String namaProdukToko, int hargaToko) {
        namaProduk = namaProdukToko;
        harga = hargaToko;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProdukToko) {
        namaProduk = namaProdukToko;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(int hargaToko) {
        harga = hargaToko;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + "Rp." + harga);
    }
}
