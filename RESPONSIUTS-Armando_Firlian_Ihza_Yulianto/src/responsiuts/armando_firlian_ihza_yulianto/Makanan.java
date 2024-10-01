/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiuts.armando_firlian_ihza_yulianto;

/**
 *
 * @author ASUS
 */
public class Makanan extends Produk {
    private String tanggalKadaluarsa;

    public Makanan(String namaProduk, int harga, String tanggalKadaluarsaToko) {
        super(namaProduk, harga);
        tanggalKadaluarsa = tanggalKadaluarsaToko;
    }

    public String getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }

    public void setTanggalKadaluarsa(String tanggalKadaluarsaToko) {
        tanggalKadaluarsa = tanggalKadaluarsaToko;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa);
    }
}