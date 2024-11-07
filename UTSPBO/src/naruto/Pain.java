package naruto;

public class Pain extends Akatsuki {
    private String jutsuKhusus;

    public Pain(String nama, String desaAsal, String jenisElement, String jutsuKhusus) {
        super(nama, desaAsal, jenisElement); // Memanggil constructor superclass
        this.jutsuKhusus = jutsuKhusus;
    }

    @Override
    public void perkenalan() {
        System.out.println("Saya Pain, pengendali " + jutsuKhusus);
    }
}
