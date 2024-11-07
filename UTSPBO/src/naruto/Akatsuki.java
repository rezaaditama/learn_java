package naruto;

public class Akatsuki {
    protected String nama;
    protected String desaAsal;
    protected String jenisElement;

    public Akatsuki(String nama, String desaAsal, String jenisElement) {
        this.nama = nama;
        this.desaAsal = desaAsal;
        this.jenisElement = jenisElement;
    }

    public void perkenalan() {
        System.out.println("Saya anggota akatsuki");
    }
}
