/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Obet Mubarok
 */
public class Lotre {

    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userNumber = numberScanner.nextInt();
        Random rnd = new Random();
        int winningNum = rnd.nextInt(10) + 1;
        System.out.println("Your Number: " + userNumber);
        System.out.println("The winning number is: " + winningNum);
    }
}
