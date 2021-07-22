package jguess;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Object declarations
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Welcome banner
        System.out.println("== jGuess ==");
        System.out.println("My number is less than 10!");

        // Variables
        int number = random.nextInt(10);
        int userNumber = 15052004; // That's my birth date!

        while(userNumber != number) {
            System.out.print("My number is: ");
            userNumber = input.nextInt();
            if (userNumber < number) {
                System.out.println("My number is bigger!");
            } else if (userNumber > number) {
                System.out.println("My number is smaller!");
            } else {
                System.out.println("That's my number!");
            }
        }

    }
}
