package array;
import java.util.Scanner;

public class BelajarArray {
    public static void main(String[] args) {
        
        //Membuat array
        String[] buah = new String[5];

        //Membuat Scanner
        Scanner scan = new Scanner(System.in);

        //Menginput  data menggunakan looping
        for(int i = 0; i < buah.length;i++){
            System.out.print("Buah ke- " + i + " : ");
            buah[i] = scan.nextLine();
        }
        System.out.println("====================================");

        //Menampilkan array dalam bentuk looping
        for( String b: buah) {
            System.out.println(b);
        } scan.close();
    } 
}
