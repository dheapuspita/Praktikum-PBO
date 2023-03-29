package pawsitivePals;

public class pemilik {
    String namaPemilik;
    private String alamat;
    private String noTelp;
    private int umr;
    
    public void identitas(String namaPemilik, int umr){
        System.out.println("Penitip adalah"+namaPemilik+"yang berumur"+umr);
    }

    public pemilik(String namaPemilik, String alamat, String noTelp) {
        this.namaPemilik = namaPemilik;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.umr = umr;
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
    
    public int getUmr() {
        return umr;
    }

    public void setUmr(int umr) {
        this.umr = umr;
    }
    
    public void dataPemilik(){
        System.out.println("Nama Pemilik : "+namaPemilik);
        System.out.println("Alamat : "+alamat);
        System.out.println("No Telepon : "+noTelp);
        System.out.println("Umur Pemilik : "+umr);
    }
}