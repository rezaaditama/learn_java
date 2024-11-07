package mobil;

public class Mobil {
    String Warna;
    int Jumlah_pintu;
    float Isi_Tangki;

    public static int Maju(int maju) {
        int majuKedepan = 10;
        majuKedepan = majuKedepan + maju;
        return(majuKedepan);
    }

    public static int Mundur(int mundur) {
        int mundurBelakang = 10;
        mundurBelakang = mundurBelakang + mundur;
        return(mundurBelakang);
    }
}
