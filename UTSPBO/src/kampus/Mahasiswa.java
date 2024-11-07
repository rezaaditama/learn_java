package kampus; //Mendefinisikan package kampus

/*  Nama : Reza Aditama (231106040939)
    Kelas : 3 Reguler C  */

//Membuat kelas Mahasiswa yang merupakan turunan dari kelas Manusia
public class Mahasiswa extends Manusia{

    //Membuat attribute
    private String nim; //Membuat attribute nim (String)
    private String kelas; //membuat attribute kelas (String)

    //Membuat Getter untuk attribute nim
    public String getNim() {
        return nim; //Mengembalikan nilai Nim
    }

    //Membuat Setter untuk attribute nim
    public void setNim(String nim) {
        this.nim = nim;
    } 

    //Membuat Getter untuk attribute kelas
    public String getKelas() {
        return kelas; //Mengembalikan nilai kelas
    }

    //Membuat Setter untuk attribute kelas
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    //Membuat method kelasApa()
    public void kelasApa() {
        System.out.println("Saya " + nama + " dengan nim " + nim +" umur " + umur + " tahun, sedang belajar di kelas " + kelas + ".");
    }

    @Override //Method yang menimpa nama yang sama

    //Membuat method siapaKamu()
    public void siapaKamu() {
        System.out.println("\nSaya adalah mahasiswa"); //Menampilkan output
    }
}
