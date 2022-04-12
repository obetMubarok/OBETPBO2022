package Scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        String nama;
        int umur;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();//lebih 1 kata
        
        System.out.print("Masukkan umur : ");
        umur = input.nextInt();
        
        input.close();
        //input.next();
        System.out.println("Nama anda : "+nama+" dan umur anda "+umur+" tahun");
        
    }
}
