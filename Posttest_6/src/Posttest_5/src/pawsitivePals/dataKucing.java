package pawsitivePals;

public class dataKucing extends kucing {
    protected int umur;
    protected double berat;
    
    public final void tampilUsia(String namaKucing, int umur){
        System.out.println("Kucing dengan nama "+ namaKucing + "berumur"+ umur);
    }
    
    public void lamaDurasi(){
        System.out.println("Kucing bernama" + namaKucing + "dititipkan selama"+ durasi);
    }
    
    public dataKucing(int umur, double berat, String namaKucing, String jenis, String durasi) {
        super(namaKucing, jenis, durasi);
        this.umur = umur;
        this.berat = berat;
    }
    
    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }
    
    public void data(){
        System.out.println("Nama Kucing : "+ namaKucing);
        System.out.println("Jenis : "+jenis);
        System.out.println("Durasi Penitipan : "+durasi);
        System.out.println("Umur : "+umur);
        System.out.println("Berat : "+berat);
    }
}