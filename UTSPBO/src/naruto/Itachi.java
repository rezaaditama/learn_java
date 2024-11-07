package naruto;

public class Itachi extends Akatsuki{
    private String jutsuKhusus;

    public Itachi(String nama, String desaAsal, String jenisElement, String jutsuKhusus) {
        // Memanggil constructor superclass
        super(nama, desaAsal, jenisElement);
        this.jutsuKhusus = jutsuKhusus;
    }

    @Override
    public void perkenalan() {
        System.out.println("Saya Itachi Uchiha, pengguna " + jutsuKhusus);
    }
}

