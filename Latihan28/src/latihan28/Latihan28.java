/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan28;
import java.util.Scanner;
public class Latihan28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====Program Mengganti Kata====");

        // Meminta user untuk memasukkan kalimat
        System.out.println("Masukkan kalimat : ");
        String kalimat = sc.nextLine();

        // Meminta user untuk memasukkan kata yang akan diganti
        System.out.println("Masukkan kata yang akan diganti : ");
        String kataLama = sc.nextLine();

        // Meminta user untuk memasukkan kata pengganti
        System.out.println("Masukkan kata pengganti : ");
        String kataBaru = sc.nextLine();

        // Mengganti kata dalam kalimat
        String kalimatBaru = kalimat.replace(kataLama, kataBaru);

        // Menampilkan kalimat baru
        System.out.println("Kalimat baru : " + kalimatBaru);
    }
}
    
    
