package pawsitivePals;

public class dataKucing extends kucing {
    String umur;
    String berat;

    public dataKucing(String umur, String berat, String namaKucing, String jenis, String durasi) {
        super(namaKucing, jenis, durasi);
        this.umur = umur;
        this.berat = berat;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getBerat() {
        return berat;
    }

    public void setBerat(String berat) {
        this.berat = berat;
    }
    
    public void tampil(){
        System.out.println("Nama Kucing : "+ namaKucing);
        System.out.println("Jenis : "+jenis);
        System.out.println("Durasi Penitipan : "+durasi);
        System.out.println("Umur : "+umur);
        System.out.println("Berat : "+berat);
    }
}
