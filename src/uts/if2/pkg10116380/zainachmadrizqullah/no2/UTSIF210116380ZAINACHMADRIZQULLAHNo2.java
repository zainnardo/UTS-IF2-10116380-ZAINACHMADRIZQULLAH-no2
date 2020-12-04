/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10116380.zainachmadrizqullah.no2;

import java.util.Scanner;

/**
*NAMA   : ZAIN ACHMAD RIZQULLAH
*KELAS  : PBO2
*NIM    : 10116380
*Deskripsi Program : UNTUK MENABUNG DAN MENARIK UANG
 */
public class UTSIF210116380ZAINACHMADRIZQULLAHNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("=======Program Penarikan Uang========");
        System.out.print("Masukkan Saldo Awal : " );
        Scanner scn = new Scanner(System.in);
        int saldo = scn.nextInt();
        
        System.out.print("Jumlah Uang Yang diambil : " );
        int ambil = scn.nextInt();
        
        Tabungan tbg = new Tabungan(saldo);
        System.out.println("Saldo Anda Sekarang : " +tbg.ambilUang(ambil));
    }
    
    
    
}
