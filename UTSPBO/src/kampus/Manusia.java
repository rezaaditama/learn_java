package kampus; //Mendifinisikan package kampus

/*  Nama : Reza Aditama (231106040939)
    Kelas : 3 Reguler C  */

//Membuat kelas manusia
public class Manusia {
    
    //Membuat attribut kelas
    protected String nama; //Membuat atribut nama (String)
    protected int umur; //Membuat atribut umur (integer)

    //Membuat Getter untuk atribut nama
    public String getNama() {
        return nama; //Mengembalikan nilai nama
    }

    //Membuat Setter untuk atribut nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    //Membuat Getter untuk attribut umur
    public int getUmur() {
        return umur; //Mengembalikan nilai umur
    }

    //Membuat Setter untuk attribut umur
    public void setUmur(int umur) {
        this.umur = umur;
    }

    //Membuat method siapaKamu()
    public void siapaKamu() {
        System.out.println("Saya manusia"); //Mengeluarkan output
    }
}
