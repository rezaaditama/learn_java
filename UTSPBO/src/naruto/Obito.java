package naruto;

public class Obito extends Akatsuki {
    private String dojutsuKhusus;

    public Obito(String nama, String desaAsal, String jenisElement, String dojutsuKhusus) {
        super(nama, desaAsal, jenisElement); // Memanggil constructor superclass
        this.dojutsuKhusus = dojutsuKhusus;
    }

    @Override
    public void perkenalan() {
        System.out.println("Saya Obito Uchiha, pengguna " + dojutsuKhusus);
    }
}
