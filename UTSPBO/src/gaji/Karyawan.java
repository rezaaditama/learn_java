package gaji; //Mendefinisikan paket gaji

/*  Nama : Reza Aditama (231106040939)
    Kelas : 3 Reguler C  */

//Membuat kelas Karyawan
public class Karyawan { 

    //Membuat Attribut kelas
    protected String nik;       //Membuat atribut NIK (String)
    protected String nama;      //Membuat atribut nama (String)
    protected int golongan;     //Membuat atribut golongan (Integer)
    protected String jabatan;   //Membuat atribut jabatan (String)

    //Membuat konstruktor untuk menginisiasi atribut karyawan
    public Karyawan(String nik, String nama, int golongan, String jabatan) {
        this.nik = nik;
        this.nama = nama;
        this.golongan = golongan;
        this.jabatan = jabatan;
    }

    //Getter untuk atribut NIK
    public String getNik() {
        return nik; //Mengembalikan nilai NIK
    }

    //Setter untuk atribut NIK
    public void setNik(String nik) {
        this.nik = nik; //Mengatur nilai NIK
    }

    //Getter untuk attribut nama
    public String getNama() {
        return nama; //Mengembalikan nilai nama
    }

    //Setter untuk attribut nama
    public void setNama(String nama) {
        this.nama = nama; //Mengatur nilai nama
    }

    //Getter untuk attribut golongan
    public int getGolongan() {
        return golongan; //Mengembalikan nilai golongan
    }

    //Setter untuk attribut golongan
    public void setGolongan(int golongan) {
        this.golongan = golongan; //Mengatur nilai golongan
    }

    //Getter untuk attribut jabatan
    public String getJabatan() {
        return jabatan; //Mengembalikan nilai jabatan
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan; //Mengatur nilai jabatan
    }
}

