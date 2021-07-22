package jguess;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("== jGuess ==");
        System.out.println("My number is less than 10!");
        int number = random.nextInt(10);

        System.out.print("My number is: ");
        int userNumber = input.nextInt();

        if (userNumber < number) {
            System.out.println("My number is bigger!");
        } else if (userNumber > number) {
            System.out.println("My number is smaller!");
        } else {
            System.out.println("That's my number!");
        }
    }
}
