package naruto;

public class Main {
    public static void main(String[] args) {
        Itachi itachi = new Itachi("Itachi Uchiha", "Konoha", "Api", "Amaterasu");
        itachi.perkenalan();

        Obito obito = new Obito("Obito Uchiha", "Konoha", "Api", "Kamui");
        obito.perkenalan();

        Kisame kisame = new Kisame("Kisame Hoshigaki", "Kirigakure", "Air", "Samehada");
        kisame.perkenalan();

        Pain pain = new Pain("Pain", "Amegakure", "Rinnegan", "Shinra Tensei");
        pain.perkenalan();
    }
}
