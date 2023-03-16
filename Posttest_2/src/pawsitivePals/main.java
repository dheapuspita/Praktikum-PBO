package pawsitivePals;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class penitipan {
    String namaPemilik, alamat, noTelp, namaKucing, jenis, durasi;

    public penitipan(String namaPemilik, String alamat, String noTelp, String namaKucing, String jenis, String durasi) {
        this.namaPemilik = namaPemilik;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.namaKucing = namaKucing;
        this.jenis = jenis;
        this.durasi = durasi;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getNamaKucing() {
        return namaKucing;
    }

    public void setNamaKucing(String namaKucing) {
        this.namaKucing = namaKucing;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getDurasi() {
        return durasi;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }
    
    public void dataTitip(){
        System.out.println("Nama Pemilik : "+ this.namaPemilik);
        System.out.println("Alamat : "+ this.alamat);
        System.out.println("No Telepon : "+ this.noTelp);
        System.out.println("Nama Kucing : "+ this.namaKucing);
        System.out.println("Jenis : "+ this.jenis);
        System.out.println("Durasi Penitipan : "+ this.durasi);
    }
}

public class main {

    public static void main(String[] args) throws IOException {
        InputStreamReader prepare = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(prepare);
        ArrayList <penitipan> dataPenitipan = new ArrayList<>();
        int data = 1;
        
        while(true){
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
            int menu = Integer.parseInt(input.readLine());
            
            switch(menu) {
                case 1:
                    if(data == 1){
                        System.out.println("=================");
                        System.out.println("Data Masih Kosong");
                        System.out.println("=================");
                    }else{
                        System.out.println("=====================");
                        System.out.println("Data Penitipan Kucing");
                        System.out.println("=====================");
                    for (int i = 0; i < dataPenitipan.size(); i += 1) {
                        System.out.println("Data Penitipan ke- " + (i + 1));
                        System.out.println("Nama Pemilik : " + dataPenitipan.get(i).getNamaPemilik());
                        System.out.println("Alamat : " + dataPenitipan.get(i).getAlamat());
                        System.out.println("No Telepon : " + dataPenitipan.get(i).getNoTelp());
                        System.out.println("Nama Kucing : " + dataPenitipan.get(i).getNamaKucing());
                        System.out.println("Jenis : " + dataPenitipan.get(i).getJenis());
                        System.out.println("Durasi Penitipan : " + dataPenitipan.get(i).getDurasi());
                    }
                }
                    break;

                case 2:
                        System.out.println("=====================");
                        System.out.println("Tambah Data Penitipan");
                        System.out.println("=====================");
                        System.out.println("Nama Pemilik : ");
                        String namaPemilik = input.readLine();
                        System.out.println("Alamat : ");
                        String alamat = input.readLine();
                        System.out.println("No Telepon : ");
                        String noTelp = input.readLine();
                        System.out.println("Nama Kucing : ");
                        String namaKucing= input.readLine();
                        System.out.println("Jenis : ");
                        String jenis = input.readLine();
                        System.out.println("Durasi Penitipan : ");
                        String durasi = input.readLine();
                        penitipan dataBaru = new penitipan(namaPemilik, alamat, noTelp, namaKucing, jenis, durasi);
                        dataPenitipan.add(dataBaru);
                        break;
                    
                case 3:
                    if(data == 1){
                        System.out.println("=================");
                        System.out.println("Data Masih Kosong");
                        System.out.println("=================");
                    }else{ 
                        System.out.println("=====================");
                        System.out.println(" Ubah Data Penitipan ");
                        System.out.println("=====================");
                        System.out.println("No Telp : ");
                        String nomor = input.readLine();
                    for (penitipan penitipan : dataPenitipan) {
                        if (penitipan.getNoTelp().equals(nomor)) {
                            System.out.print("Nama Pemilik : ");
                            penitipan.SetNamaPemilik(input.readLine());
                            System.out.print("Alamat : ");
                            penitipan.SetAlamat(input.readLine());
                            System.out.print("No Telepon : ");
                            penitipan.SetNoTelp(Integer.parseInt(input.readLine()));
                            System.out.print("Nama Kucing : ");
                            penitipan.SetNamaKucing(Integer.parseInt(input.readLine()));
                            System.out.print("Jenis : ");
                            penitipan.SetJenis(Integer.parseInt(input.readLine()));
                            System.out.print("Durasi Penitipan : ");
                            penitipan.SetDurasi(Integer.parseInt(input.readLine()));
                            System.out.println("==========================");
                            System.out.println("Data Telah Berhasil Diubah");
                            System.out.println("==========================");
                            break;
                        }
                    }
                    }
                    break;
                    
                case 4:
                    if(data == 1){
                        System.out.println("=================");
                        System.out.println("Data Masih Kosong");
                        System.out.println("=================");
                        break;
                    }else{
                        System.out.println("=====================");
                        System.out.println(" Hapus Data Penitipan");
                        System.out.println("=====================");
                        System.out.print("No Telepon : ");
                        String no = input.readLine();
                    for (int i = 0; i < dataPenitipan.size(); i++) {
                        if (dataPenitipan.get(i).getNoTelp().equals(no)) {
                            dataPenitipan.remove(i);
                            System.out.println("======================");
                            System.out.println("  Data Telah Terhapus ");
                            System.out.println("======================");
                            break;
                        }
                    }
                    break;
                    
                case 5:
                   System.exit(0);
                   
                default:
                    System.out.println("======================");
                    System.out.println("Pilihan Tidak Tersedia");
                    System.out.println("======================");
                    break;
            }
        }
    
        }
    }
}