/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10116380.zainachmadrizqullah.no2;

/**
*NAMA   : ZAIN ACHMAD RIZQULLAH
*KELAS  : PBO2
*NIM    : 10116380
*Deskripsi Program : UNTUK MENABUNG DAN MENARIK UANG
 */
public class Tabungan {
    private int saldo;
      
    public Tabungan(int saldo){
         this.saldo = saldo;
    }
   
    public int ambilUang(int jumlah){
       return saldo - jumlah; 
    }
}

