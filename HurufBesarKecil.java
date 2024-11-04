/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * *
 * @author ACER
 * Nama: Siti Furkotun Najiyah
 * NIM: 23215056
 * PRODI: Teknik Informatika
 */
import java.util.Scanner;

public class HurufBesarKecil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();

        // Mengubah seluruh kalimat menjadi huruf besar
        String hurufBesar = kalimat.toUpperCase();

        // Mengubah seluruh kalimat menjadi huruf kecil
        String hurufKecil = kalimat.toLowerCase();

        System.out.println("\n====Hasil Formatting====");
        System.out.println("Huruf Besar: " + hurufBesar);
        System.out.println("Huruf Kecil: " + hurufKecil);
    }
}