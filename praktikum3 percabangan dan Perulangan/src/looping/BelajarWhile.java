package looping;
import java.util.Scanner;

public class BelajarWhile {

    //Membuat variabel dan scanner
    public static void main(String[] args) {
    boolean running = true;
    int counter = 0;
    String jawab;
    Scanner scan = new Scanner(System.in);

    while (running) {
        System.out.println("Apakah anda ingin keluar?");
        System.out.print("Jawab [iya/tidak] : ");

        jawab = scan.nextLine();

        //Cek jawaban kalau ya maka hentikan pengulangan
        if (jawab.equalsIgnoreCase("ya")) {
            running = false;
        }
        counter++;
    }
    scan.close();
    System.out.println("Anda sudah melakukan pengulangan sebanyak " + counter + " kali");
    }
}
