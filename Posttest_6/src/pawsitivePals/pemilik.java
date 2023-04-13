package pawsitivePals;

public final class pemilik {
    private String namaPemilik;
    private String alamat;
    private String noTelp;
    
    public void identitas(String namaPemilik, String noTelp){
        System.out.println("Penitip adalah"+ namaPemilik +" dengan nomor telepon "+ noTelp);
    }
    
    public pemilik(String namaPemilik, String alamat, String noTelp) {
        this.namaPemilik = namaPemilik;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }

    public interface Status {
        public void reguler();
        public void vip();
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
    
    public void dataPemilik(){
        System.out.println("Nama Pemilik : "+namaPemilik);
        System.out.println("Alamat : "+alamat);
        System.out.println("No Telepon : "+noTelp);
    }
}
