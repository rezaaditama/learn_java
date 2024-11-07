package mobil_2;

public class TestDrive {
    public static void main(String[] args) {
        Mobil Mobil_Tama = new Mobil();
        Mobil_Tama.setJumlah_pintu(15);
        Mobil_Tama.setIsi_Tangki(10);
        Mobil_Tama.setWarna("Biru");

        System.out.println("Mobilku berjumlah " + Mobil_Tama.getJumlah_pintu() + " pintu, yang berwarna " + Mobil_Tama.getWarna() + " berisi " + Mobil_Tama.getIsi_Tangki() + " liter" );
    }
}
