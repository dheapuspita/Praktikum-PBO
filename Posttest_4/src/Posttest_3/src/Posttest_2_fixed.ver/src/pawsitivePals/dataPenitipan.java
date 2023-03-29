package pawsitivePals;

public class dataPenitipan {
    String namaPemilik;
    String alamat;
    String noTelp;
    String namaKucing;
    String jenis;
    String durasi;

    public dataPenitipan(String namaPemilik, String alamat, String noTelp, String namaKucing, String jenis, String durasi) {
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
}