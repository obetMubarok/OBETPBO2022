package OperatorLogika;

public class ContohBeasiswa {

    public static void main(String[] args) {
        int absen = 0;
        int nilai = 90;

        // nilai>=88 
        // absen =0 
        /*if (nilai >= 88) {//true
            if(3 == 0){//false
                System.out.println("dapat Beasiswa");
            }
        }*/
        if(nilai >= 88 && absen == 0){
            System.out.println("dapat beasiswa");
        }else{
            System.out.println("tidak dapat beasiswa");
        }
    }
}
