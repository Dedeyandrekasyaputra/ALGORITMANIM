/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGASALGORITME;
import java.util.Scanner;
public class RUNNIM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("NIM : ");
        String nim = input.nextLine();

        NIM objNim = new NIM();
        objNim.setNim(nim);
        System.out.println("Jenjang Perndidikan = "+objNim.getJenjang());
        System.out.println("Tahun Masuk = 20"+objNim.getTahun());
        System.out.println("Fakultas = "+objNim.getFakultas());
        System.out.println("Jurusan = "+objNim.getJurusan());
        System.out.println("Jenis kelamin = "+objNim.getJenisKelamin());
        System.out.println("Nomor Urut Mahasiswa = "+objNim.getNomorurut());
    }
}