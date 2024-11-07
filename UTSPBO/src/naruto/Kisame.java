package naruto;

public class Kisame extends Akatsuki {
    private String senjataUtama;

    public Kisame(String nama, String desaAsal, String jenisElement, String senjataUtama) {
        super(nama, desaAsal, jenisElement); // Memanggil constructor superclass
        this.senjataUtama = senjataUtama;
    }

    @Override
    public void perkenalan() {
        System.out.println("Saya Kisame Hoshigaki, menggunakan senjata " + senjataUtama);
    }
}
