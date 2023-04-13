package pawsitivePals;

public abstract class kucing {
    protected String namaKucing;
    protected String jenis;
    protected String durasi;
    
    public abstract void lamaDurasi();

    public kucing(String namaKucing, String jenis, String durasi) {
        this.namaKucing = namaKucing;
        this.jenis = jenis;
        this.durasi = durasi;
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
    
    public void dataKucing(){
        System.out.println("Nama Kucing : "+ namaKucing);
        System.out.println("Jenis : "+jenis);
        System.out.println("Durasi Penitipan : "+durasi);
    }
}