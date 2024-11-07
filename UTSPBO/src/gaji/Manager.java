package gaji; //Mendefinisikan paket gaji

/*  Nama : Reza Aditama (231106040939)
    Kelas : 3 Reguler C  */

//Membuat kelas Manager yang merupakan turunan dari kelas Karyawan
class Manager extends Karyawan {

    //Membuat attribut untuk kelas manager
    private float tunjanganJabatan;     //Membuat attribut tunjanganJabatan (float)
    private float tunjanganGolongan;    //Membuat attribut tunjanganGolongan (float)
    private float tunjanganKehadiran;   //Membuat attribut tunjanganKehadiran (float)
    private int kehadiran;              //Membuat attribut kehadiran (Integer)

    //Membuat konstruktor untuk membuat objek baru
    public Manager(String nik, String nama, int golongan, String jabatan) {
        //Memanggil konstruktor kelas induk (karyawan) untuk menginisiasi attribut yang di wariskan (inheritance)
        super(nik, nama, golongan, jabatan); 
    }

    //Membuat Getter untuk attribut kehadiran
    public int getKehadiran() {
        return kehadiran; //Mengembalikan nilai attribut kehadiran
    }

    //Membuat Setter untuk attribut kehadiran
    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran; //Mengatur nilai attribut kehadiran
    }

    //Menghitung tunjangan kehadiran
    public float tunjanganKehadiran(int hadir) {
        tunjanganKehadiran = hadir*10000; //Menghitung tunjangan kehadiran (hadir x 10.0000)
        return tunjanganKehadiran; //Mengembalikan nilai tunjanganKehadiran
    }

    //Menghitung tunjangan jabatan menggunakan pengkondisian
    public float tunjanganJabatan(String jabatan) {
        if (jabatan.equalsIgnoreCase("Manager")) {
            tunjanganJabatan = 2000000; //Jika jabatan = manager maka tunjangan jabatannya 2.000.000
        } else if (jabatan.equalsIgnoreCase("Kabag")) {
            tunjanganJabatan = 1000000; //Jika jabatan = kabag maka tunjangan jabatannya 1.000.000
        } else {
            tunjanganJabatan = 0; //Jika jabatannya bukan manager atau kabag maka tunjangan jabatannya 0
        }
        return tunjanganJabatan; //Mengembalikan nilai tunjanganJabatan
    }

    //Menghitung tunjangan golongan menggunakan pengkondisian
    public float tunjaganGolongan(int Golongan) {
        if (golongan == 1) {
            tunjanganGolongan = 500000; //Jika golongan = 1 maka tunjangan golongannya 500.000
        } else if (golongan == 2) {
            tunjanganGolongan = 1000000; //Jika golongan = 2 maka tunjangan golongannya 1.000.000
        } else if (golongan == 3) {
            tunjanganGolongan = 1500000; //Jika golongan = 3 maka tunjangan golongannya 1.500.000
        } else {
            tunjanganGolongan = 0; //Jika bukan golongan 1, 2 dan 3 maka tunjangan golongannya 0
        }
        return tunjanganGolongan; //Mengembalikan nilai tunjanganGolongan
    }

    //Menghitung jumlah gaji
    public float totalGaji() {
        float totalGaji = tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran; //Menjumlahkan semua tunjangan
        return totalGaji; //Mengembalikan nilai totalGaji
    }
}
