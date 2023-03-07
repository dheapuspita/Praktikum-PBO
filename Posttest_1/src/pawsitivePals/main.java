package pawsitivePals;
import java.io.*;
import java.util.Scanner;
import java.io.IOException;

public class main {
 
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String pilih ;
        char ulang = 'y';
        
        String namaPemilik[] = new String[30];
        String alamat[] = new String[30];
        String noTelp[] = new String[30];
        String namaKucing[] = new String[30];
        String jenis[] = new String[30];
        String durasi[] = new String[30];

        int data = 1;
        
        int load, load2, load3, load4, k = 1;
        int i = 1;
        String ubah;
        int j; 
        
        while (ulang == 'y' || ulang == 'Y') {
            System.out.println("=================================");
            System.out.println("      Program Manajemen Data     ");
            System.out.println(" Penitipan Kucing Pawsitive Pals ");
            System.out.println("         ^•ﻌ•^ ^•ﻌ•^ ^•ﻌ•^         ");                         
            System.out.println("=================================");
            System.out.println("[1] Lihat Data Penitipan         ");
            System.out.println("[2] Tambah Data Penitipan        ");
            System.out.println("[3] Ubah Data Penitipan          ");
            System.out.println("[4] Hapus Data Penitipan         ");
            System.out.println("[5] Keluar Dari Program          ");
            System.out.println("=================================");
            System.out.print("Masukkan Pilihan Menu : ");
            pilih = br.readLine();
            
            if(!pilih.matches("[0-9]+")){
                   System.out.println("===============");
                   System.out.println("Masukkan Angka!");
                   System.out.println("===============");
                  } else{
                    load3 = Integer.parseInt(pilih);
                 if(load3 == 5){
                    break;
                 }
            
            switch(load3) {
                case 1:
                    if(data == 1){
                        System.out.println("=================");
                        System.out.println("Data Masih Kosong");
                        System.out.println("=================");
                    }else{
                        System.out.println("=====================");
                        System.out.println("Data Penitipan Kucing");
                        System.out.println("=====================");
                    for ( j = 1; j < data; j++) {
                        System.out.println("Nama Pemilik : "+ namaPemilik[j]);
                        System.out.println("Alamat : "+  alamat[j]);
                        System.out.println("No Telepon : "+ noTelp[j]);
                        System.out.println("Nama Kucing : "+ namaKucing[j]);
                        System.out.println("Jenis : "+  jenis[j]);
                        System.out.println("Durasi Penitipan : "+ durasi[j]);
                        System.out.println("=====================");
                    }
                }
                    break;
                
                case 2:
                    while (ulang == 'y' || ulang == 'Y') {
                      data++;
                      load = i;
                    for (i = load; i < data; i++) {
                        System.out.println("==========================");
                        System.out.println("Data Ke : " + i);
                        System.out.print("Nama Pemilik : ");
                        namaPemilik[i] = br.readLine();
                        if(!namaPemilik[i].matches("[a-zA-Z_ ]+")){
                            System.out.println("===============");
                            System.out.println("Masukkan Huruf!");
                            System.out.println("===============");
                            data--;
                            break; 
                        }
                        System.out.print("Alamat : ");
                        alamat[i] = br.readLine();
                        if(!alamat[i].matches("[a-zA-Z_ -]+")){
                            System.out.println("===============");
                            System.out.println("Masukkan Huruf!");
                            System.out.println("===============");
                            data--;
                            break;
                        }
                        System.out.print("No Telepon : ");
                        noTelp[i] = br.readLine();
                        if(!noTelp[i].matches("[0-9]+")){
                            System.out.println("===============");
                            System.out.println("Masukkan angka!");
                            System.out.println("===============");
                            data--;
                            break; 
                        }
                        System.out.print("Nama Kucing : ");
                        namaKucing[i] = br.readLine();
                        if(!namaKucing[i].matches("[a-zA-Z_ ]+")){
                            System.out.println("===============");
                            System.out.println("Masukkan Huruf!");
                            System.out.println("===============");
                            data--;
                            break; 
                        }
                        System.out.print("Jenis : ");
                        jenis[i] = br.readLine();
                        if(!jenis[i].matches("[a-zA-Z_ ]+")){
                            System.out.println("===============");
                            System.out.println("Masukkan Huruf!");
                            System.out.println("===============");
                            data--;
                            break; 
                        }
                        System.out.print("Durasi Penitipan : ");
                        durasi[i] = br.readLine();
                        if(!durasi[i].matches("[a-zA-Z_ ]+")){
                            System.out.println("===============");
                            System.out.println("Masukkan Huruf!");
                            System.out.println("===============");
                            data--;
                            break; 
                        }
                        }
                            System.out.println("============================");
                            System.out.print("Ingin Tambah Data Lagi? y/t : ");
                            ulang = input.next().charAt(0);
                        }                                
                        break;
                
                case 3:
                    if(data == 1){
                        System.out.println("=================");
                        System.out.println("Data Masih Kosong");
                        System.out.println("=================");
                    }else{ 
                        System.out.println("=====================");
                        System.out.println("Data Penitipan Kucing");
                        System.out.println("=====================");
                    for ( j = 1; j < data; j++) {
                        System.out.println("Nama Pemilik : "+ namaPemilik[j]);
                        System.out.println("Alamat : "+  alamat[j]);
                        System.out.println("No Telepon : "+ noTelp[j]);
                        System.out.println("Nama Kucing : "+ namaKucing[j]);
                        System.out.println("Jenis : "+  jenis[j]);
                        System.out.println("Durasi Penitipan : "+ durasi[j]);
                        System.out.println("=====================");
                    }

                    while(ulang == 'y' || ulang == 'Y'){
                        System.out.print("Ubah Data Ke : ");
                        ubah = br.readLine();
                     
                    if(!ubah.matches("[0-9]+")){
                        System.out.println("===============");
                        System.out.println("Masukkan Angka!");
                        System.out.println("===============");
                    }else{
                        load4 = Integer.parseInt(ubah);
                        load2 = data;
                    for (k = load4; k < load2; k++) {
                        System.out.println("=====================");
                        System.out.print("Nama Pemilik Baru : ");
                        namaPemilik[k] = br.readLine();
                         if(!namaPemilik[k].matches("[a-zA-Z_ ]+")){
                                System.out.println("===============");
                                System.out.println("Masukkan Huruf!");
                                System.out.println("===============");
                                load2--;
                                break;
                            }
                        System.out.print("Alamat Baru : ");
                        alamat[k] = br.readLine();
                         if(!alamat[k].matches("[a-zA-Z_ ]+")){
                                System.out.println("===============");
                                System.out.println("Masukkan Huruf!");
                                System.out.println("===============");
                                load2--;
                                break;         
                            }
                        System.out.print("No Telepon Baru : ");
                        noTelp[k] = br.readLine();
                         if(!noTelp[k].matches("[0-9]+")){
                                System.out.println("===============");
                                System.out.println("Masukkan Huruf!");
                                System.out.println("===============");
                                load2--;
                                break;
                            }
                        System.out.print("Nama Kucing Baru : ");
                        namaKucing[k] = br.readLine();
                         if(!namaKucing[k].matches("[a-zA-Z_ ]+")){
                                System.out.println("===============");
                                System.out.println("Masukkan Huruf!");
                                System.out.println("===============");
                                load2--;
                                break;
                            }
                        System.out.print("Jenis : ");
                        jenis[k] = br.readLine();
                         if(!jenis[k].matches("[a-zA-Z_ ]+")){
                                System.out.println("===============");
                                System.out.println("Masukkan Huruf!");
                                System.out.println("===============");
                                load2--;
                                break;
                            }
                        System.out.print("Durasi Penitipan : ");
                        durasi[k] = br.readLine();
                         if(!durasi[k].matches("[a-zA-Z_ ]+")){
                                System.out.println("===============");
                                System.out.println("Masukkan Huruf!");
                                System.out.println("===============");
                                load2--;
                                break;
                            }
                        load2 -= load2;
                    }
                }
                       System.out.println("==========================");
                       System.out.println("Data Telah Berhasil Diubah");
                       System.out.println("==========================");
                       System.out.print("Ingin Ubah Data Lagi? y/t  : ");
                       ulang = input.next().charAt(0);        
                   }

                     }
                    break;
                
                case 4:
                     while(ulang == 'y' || ulang == 'Y'){
                    if(data == 1){
                        System.out.println("=================");
                        System.out.println("Data Masih Kosong");
                        System.out.println("=================");
                        break;
                    }else{
                        System.out.println("=====================");
                        System.out.println("      Data Awal      ");
                        System.out.println("=====================");
                    for ( j = 1; j < data; j++) {
                        System.out.println("Nama Pemilik : "+ namaPemilik[j]);
                        System.out.println("Alamat : "+  alamat[j]);
                        System.out.println("No Telepon : "+ noTelp[j]);
                        System.out.println("Nama Kucing : "+ namaKucing[j]);
                        System.out.println("Jenis : "+  jenis[j]);
                        System.out.println("Durasi Penitipan : "+ durasi[j]);
                        System.out.println("=====================");
                    }
                        data--;
                        i--;
                    
                        if(i<1){
                            i++;
                    }
                        if(data<1){
                           data++;
                     } 
                         
                        System.out.println("=====================");
                        System.out.println("     Data Akhir      ");
                        System.out.println("=====================");
                        if(data == 1){
                           System.out.println("=====================");
                           System.out.println("  Data Telah Kosong  ");
                           System.out.println("=====================");     
                        }
                        for ( j = 1; j < data; j++) {
                            System.out.println("Nama Pemilik : "+ namaPemilik[j]);
                            System.out.println("Alamat : "+  alamat[j]);
                            System.out.println("No Telepon : "+ noTelp[j]);
                            System.out.println("Nama Kucing : "+ namaKucing[j]);
                            System.out.println("Jenis : "+  jenis[j]);
                            System.out.println("Durasi Penitipan : "+ durasi[j]);
                            System.out.println("=====================");
                        }
                        
                        System.out.println("==================================");
                        System.out.println("Data Ke\t" + data + " " + "Telah Terhapus ");
                        System.out.println("==================================");
                        System.out.print("Ingin Hapus Data Lagi? y/t  : ");
                        ulang = input.next().charAt(0);
                    }
                    }
                    break;
            
                default:
                     System.out.println("======================");
                     System.out.println("Pilihan Tidak Tersedia");
                     System.out.println("======================");
                     break;
                }
                    System.out.print("Lanjut Kembali Ke Menu? y/t : ");
                    ulang = input.next().charAt(0);
            }
        }
    }
}