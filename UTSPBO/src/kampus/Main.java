package kampus; //Mendefinisikan package kampus

/*  Nama : Reza Aditama (231106040939)
    Kelas : 3 Reguler C  */

//Membuat kelas Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setNama("Berlina Wulandari");
        dosen.setUmur(20);
        dosen.setNip("231106040939");
        dosen.setMataKuliah("Pemrograman Berbasis Object");
        dosen.siapaKamu();
        dosen.mengajarApa();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama("Reza Aditama");
        mahasiswa.setUmur(17);
        mahasiswa.setNim("231106040938");
        mahasiswa.setKelas("3 Reguler C");
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
}
