package gaji; //Mendefinisikan paket gaji
import java.util.Scanner; //Mengimpor class scanner untuk membaca input dari user

/*  Nama : Reza Aditama (231106040939)
    Kelas : 3 Reguler C  */

//Membuat kelas Main untuk menjalankan program
public class Main {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); //Membaca dan menerima input dari pengguna
    System.out.println("========= Program Perhitungan Gaji Karyawan ========="); //Menampilkan output

    //Meminta input NIK dari pengguna
    System.out.print("Masukkan NIK : "); //Menampilkan output
    String nik = scanner.nextLine(); //Meminta input NIK (String)

    //Meminta input Nama dari pengguna
    System.out.print("Masukkan Nama : "); //Menampilkan output
    String nama = scanner.nextLine(); //Meminta input nama (string)

    //Meminta input golongan
    System.out.print("Masukkan Golongan (1/2/3) : "); //Menampilkan output
    int golongan = scanner.nextInt(); //Meminta input golongan (String)
    
    // Mengosongkan buffer input setelah penggunaan nextInt
    scanner.nextLine();

    //Meminta input jabatan
    System.out.print("masukkan Jabatan (Manager/Kabag) : "); //Menampilkan output
    String jabatan = scanner.nextLine(); //Meminta input jabatan (string)

    //Membuat objek Manager baru
    Manager manager = new Manager(nik, nama, golongan, jabatan);

    //Meminta input jumlah kehadiran
    System.out.print("Masukkan Jumlah Kehadiran : "); //Menampilkan output
    int kehadiran = scanner.nextInt(); //Meminta input jumlah kehadiran (integer)
    manager.setKehadiran(kehadiran); //Memanggil setKehadiran (Setter)

    //Menghitung tunjangan dan total gaji
    float tunjanganKehadiran = manager.tunjanganKehadiran(kehadiran);
    float tunjanganJabatan = manager.tunjanganJabatan(jabatan);
    float tunjanganGolongan = manager.tunjaganGolongan(golongan);
    float totalGaji = manager.totalGaji();

    //Menampilkan identitas
    System.out.println("\n===== Hasil Perhitungan =====");
    System.out.println("NIK      : " + manager.getNik()); //Menampilkan NIK
    System.out.println("NAMA     : " + manager.getNama()); //Menampilkan nama
    System.out.println("GOLONGAN : " + manager.getGolongan()); //Menampilkan golongan
    System.out.println("JABATAN  : " + manager.getJabatan()); //Menampilkan jabatan 

    //Menampilkan tunjangan
    System.out.println("\nTUNJANGAN GOLONGAN : " + tunjanganGolongan);
    System.out.println("TUNJANGAN JABATAN    : " + tunjanganJabatan);
    System.out.println("TUNJANGAN KEHADIRAN  : " + tunjanganKehadiran);

    //Menampilkan total gaji
    System.out.println("\nGAJI TOTAL : " + totalGaji);

    scanner.close();
    } 
}
