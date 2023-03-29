package pawsitivePals;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws IOException{
        InputStreamReader prepare = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(prepare);
        ArrayList <dataPenitipan> penitipan = new ArrayList<>();
        ArrayList <dataKucing> dtKucing = new ArrayList<>();
        
        String pilih;
        int pil;         
        char ulang = 'y';
        int load;
        int i;
        
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
            pilih = input.readLine();
         
            if(!pilih.matches("[0-9]+")){
                   System.out.println("===============");
                   System.out.println("Masukkan Angka!");
                   System.out.println("===============");
                  } else{
                    load = Integer.parseInt(pilih);
                 if(load == 5){
                    break;
                 }
            
            switch(load) {
                case 1:
                        System.out.println("=====================");
                        System.out.println("   Pilih Lihat Data  ");
                        System.out.println("=====================");
                        System.out.println("[1] Lihat Data Penitipan ");
                        System.out.println("[2] Lihat Data Kucing ");
                        System.out.println("[3] Lihat Data Pemilik ");
                        System.out.println("=====================");
                        System.out.print("Masukkan Pilihan Menu : ");
                        pil = Integer.parseInt(input.readLine());
                        
                        if (pil == 1) {
                            System.out.println("=====================");
                            System.out.println("Data Penitipan Kucing");
                            System.out.println("=====================");
                            for (i = 0; i < penitipan.size(); i += 1) {
                                System.out.println("Data Penitipan ke- " + (i + 1));
                                System.out.println("Nama Pemilik : "+ penitipan.get(i).getNamaPemilik());
                                System.out.println("Alamat : "+ penitipan.get(i).getAlamat());
                                System.out.println("No Telepon : "+ penitipan.get(i).getNoTelp());
                                System.out.println("Nama Kucing : "+ penitipan.get(i).getNamaKucing());
                                System.out.println("Jenis : "+ penitipan.get(i).getJenis());
                                System.out.println("Durasi Penitipan : "+ penitipan.get(i).getDurasi());
                                System.out.println("=====================");
                            }
                        } else if (pil == 2) {
                            System.out.println("=====================");
                            System.out.println("     Data Kucing     ");
                            System.out.println("=====================");
                            for (i = 0; i < penitipan.size(); i += 1) {
                                System.out.println("Nama Kucing : "+ penitipan.get(i).getNamaKucing());
                                System.out.println("Jenis : "+ penitipan.get(i).getJenis());
                                System.out.println("Durasi Penitipan : "+ penitipan.get(i).getDurasi());
                                System.out.println("Umur : "+ dtKucing.get(i).getUmur());
                                System.out.println("Berat : "+ dtKucing.get(i).getBerat());
                                System.out.println("=====================");
                            }
                        } else {
                            System.out.println("=====================");
                            System.out.println("     Data Pemilik    ");
                            System.out.println("=====================");
                            for (i = 0; i < penitipan.size(); i += 1) {
                                System.out.println("Nama Pemilik : "+penitipan.get(i).getNamaPemilik());
                                System.out.println("Alamat : "+penitipan.get(i).getAlamat());
                                System.out.println("No Telepon : "+penitipan.get(i).getNoTelp());
                                System.out.println("=====================");
                            }
                        }
                        break;
                        
                case 2:
                    while (ulang == 'y' || ulang == 'Y') {
                        System.out.println("==========================");
                        System.out.print("Nama Pemilik : ");
                        String namaPemilik = input.readLine();
                        if(!namaPemilik.matches("[a-zA-Z_ ]+")){
                            System.out.println("===============");
                            System.out.println("Masukkan Huruf!");
                            System.out.println("===============");
                            break; 
                        }
                        System.out.print("Alamat : ");
                        String alamat = input.readLine();
                        if(!alamat.matches("[a-zA-Z_ -]+")){
                            System.out.println("===============");
                            System.out.println("Masukkan Huruf!");
                            System.out.println("===============");
                            break;
                        }
                        System.out.print("No Telepon : ");
                        String noTelp = input.readLine();
                        if(!noTelp.matches("[0-9]+")){
                            System.out.println("===============");
                            System.out.println("Masukkan Angka!");
                            System.out.println("===============");
                            break; 
                        }
                        System.out.print("Nama Kucing : ");
                        String namaKucing = input.readLine();
                        if(!namaKucing.matches("[a-zA-Z_ ]+")){
                            System.out.println("===============");
                            System.out.println("Masukkan Huruf!");
                            System.out.println("===============");
                            break; 
                        }
                        System.out.print("Jenis : ");
                        String jenis = input.readLine();
                        if(!jenis.matches("[a-zA-Z_ ]+")){
                            System.out.println("===============");
                            System.out.println("Masukkan Huruf!");
                            System.out.println("===============");
                            break; 
                        }
                        System.out.print("Umur : ");
                        String umur = input.readLine();
                        if(!umur.matches("[a-zA-Z_ ]+")){
                            System.out.println("===============");
                            System.out.println("Masukkan Huruf!");
                            System.out.println("===============");
                            break; 
                        }
                        System.out.print("Berat : ");
                        String berat = input.readLine();
                        if(!berat.matches("[a-zA-Z_ ]+")){
                            System.out.println("===============");
                            System.out.println("Masukkan Huruf!");
                            System.out.println("===============");
                            break; 
                        }
                        System.out.print("Durasi Penitipan : ");
                        String durasi = input.readLine();
                        if(!durasi.matches("[a-zA-Z_ ]+")){
                            System.out.println("===============");
                            System.out.println("Masukkan Huruf!");
                            System.out.println("===============");
                            break; 
                        }
                            dataPenitipan dataPenitipanBaru = new dataPenitipan(namaPemilik, alamat, noTelp, namaKucing, jenis, durasi);
                            penitipan.add(dataPenitipanBaru);
                            
                            dataKucing dataKucingBaru = new dataKucing(namaKucing, jenis, umur, berat, durasi);
                            dtKucing.add(dataKucingBaru);
                            
                            System.out.println("============================");
                            System.out.print("Ingin Tambah Data Lagi? y/t : ");
                            ulang = input.readLine().charAt(0); 
                        }                            
                        break;
                        
                case 3:
                    while(ulang == 'y' || ulang == 'Y'){
                        System.out.println("=====================");
                        System.out.println("Data Penitipan Kucing");
                        System.out.println("=====================");
                    for (i = 0; i < penitipan.size(); i += 1) {
                        System.out.println("Data Penitipan ke- " + (i + 1));
                        System.out.println("Nama Pemilik : "+ penitipan.get(i).getNamaPemilik());
                        System.out.println("Alamat : "+ penitipan.get(i).getAlamat());
                        System.out.println("No Telepon : "+ penitipan.get(i).getNoTelp());
                        System.out.println("Nama Kucing : "+ penitipan.get(i).getNamaKucing());
                        System.out.println("Jenis : "+ penitipan.get(i).getJenis());
                        System.out.println("Durasi Penitipan : "+ penitipan.get(i).getDurasi());
                        System.out.println("=====================");
                    }

                    System.out.print("Nama Pemilik : ");
                    String nama = input.readLine();
                    for (dataPenitipan datapenitipan : penitipan) {
                        if (datapenitipan.getNamaPemilik().equals(nama)) {
                            System.out.println("=====================");
                            System.out.print("Nama Pemilik Baru : ");
                            datapenitipan.setNamaPemilik(input.readLine());
                             
                            System.out.print("Alamat Baru : ");
                            datapenitipan.setAlamat(input.readLine());
                         
                            System.out.print("No Telepon Baru : ");
                            datapenitipan.setAlamat(input.readLine());
                         
                            System.out.print("Nama Kucing Baru : ");
                            datapenitipan.setAlamat(input.readLine());
                        
                            System.out.print("Jenis : ");
                            datapenitipan.setAlamat(input.readLine());
                         
                            System.out.print("Durasi Penitipan : ");
                            datapenitipan.setAlamat(input.readLine());
                            }
                        break;
                    }
                       System.out.println("==========================");
                       System.out.println("Data Telah Berhasil Diubah");
                       System.out.println("==========================");
                       System.out.print("Ingin Ubah Data Lagi? y/t  : ");
                       ulang = input.readLine().charAt(0);        
                    }
                    break;
                    
                case 4:
                     while(ulang == 'y' || ulang == 'Y'){
                        System.out.println("=====================");
                        System.out.println("      Data Awal      ");
                        System.out.println("=====================");
                    for (i = 0; i < penitipan.size(); i += 1) {
                        System.out.println("Data Penitipan ke- " + (i + 1));
                        System.out.println("Nama Pemilik : "+ penitipan.get(i).getNamaPemilik());
                        System.out.println("Alamat : "+ penitipan.get(i).getAlamat());
                        System.out.println("No Telepon : "+ penitipan.get(i).getNoTelp());
                        System.out.println("Nama Kucing : "+ penitipan.get(i).getNamaKucing());
                        System.out.println("Jenis : "+ penitipan.get(i).getJenis());
                        System.out.println("Durasi Penitipan : "+ penitipan.get(i).getDurasi());
                        System.out.println("=====================");
                    } 
                    
                    System.out.print("Nama Pemilik : ");
                    String napem = input.readLine();
                    for (i = 0; i < penitipan.size(); i++) {
                        if (penitipan.get(i).getNamaPemilik().equals(napem)) {
                            penitipan.remove(i);
                        }
                        
                        System.out.println("=====================");
                        System.out.println(" Data Telah Terhapus ");
                        System.out.println("=====================");
                        System.out.print("Ingin Hapus Data Lagi? y/t  : ");
                        ulang = input.readLine().charAt(0);
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
                    ulang = input.readLine().charAt(0);
                }
            }
        }
    }