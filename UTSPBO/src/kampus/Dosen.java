package kampus; //Mendifinisikan package kampus

/*  Nama : Reza Aditama (231106040939)
    Kelas : 3 Reguler C  */

//Membuat kelas Dosen yang merupakan turunan dari kelas Manusia 
public class Dosen extends Manusia {
    private String nip;
    private String mataKuliah;

    //Membuat Getter untuk attribute nip
    public String getNip() {
        return nip; //Mengembalikan nilai nip
    }

    //Membuat Setter untuk attribute nip
    public void setNip(String nip) {
        this.nip = nip;
    }

    //Membuat Getter attribute Mata kuliah
    public String getMataKuliah() {
        return mataKuliah; //Mengembalikan nilai mataKuliah
    }

    //Membuat Setter attributer Mata Kuliah
    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    //Membuat method mengajarApa()
    public void mengajarApa() {
        System.out.println("Saya " + nama + " dengan NIP " + nip + " umur " + umur + " tahun sedang mengajar mata kuliah " + mataKuliah + ".");
    }

    @Override //Method yang menimpa nama yang sama

    //Membuat method siapaKamu()
    public void siapaKamu() {
        System.out.println("Saya adalah dosen.");
    }
}

