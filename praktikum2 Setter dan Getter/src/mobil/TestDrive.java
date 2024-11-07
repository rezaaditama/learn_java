package mobil;

public class TestDrive {
    
    public static void main(String[] args) {
        Mobil mobilku = new Mobil();
        mobilku.Warna = "Merah";
        System.out.println("Mobilku yang berwarna " + mobilku.Warna + " maju sebanyak " + mobilku.Maju(0) + 
        " meter");
    }
}
