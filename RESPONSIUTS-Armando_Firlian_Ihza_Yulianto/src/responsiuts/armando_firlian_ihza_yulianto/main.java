/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiuts.armando_firlian_ihza_yulianto;

/**
 *
 * @author ASUS
 */
// Main.java
public class main {
    public static void main(String[] args) {
        // Membuat objek Produk
        Produk laptop = new Elektronik("ROG", 15000000, 2);
        Produk Chitato = new Makanan("Chitato", 55000, "2024-12-30");

        // Membuat objek Pegawai
        Pegawai mando = new PegawaiTetap("Armando", 5000000, 1200000);
        Pegawai andi = new PegawaiKontrak("Andi", 3000000, 6);

        // Menampilkan informasi
        System.out.println("1. Output Produk");
        laptop.tampilkanInfo();
        System.out.println();

        System.out.println("2. Output Pegawai");
        mando.tampilkanInfo();
        System.out.println();

        System.out.println("3. Output Polimorfisme");
        Chitato.tampilkanInfo();
        System.out.println();
        andi.tampilkanInfo();
    }
}
