package com.company;

import java.util.Random;
import java.util.Scanner;

public class Guess_the_number {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int num = rand.nextInt(101);
        int count = 0;
        while (true){
            count++;
            System.out.print("Enter a number : ");
            int guess = sc.nextInt();
            if (guess == num){
                break;
            }
            else if (guess<num) {
                System.out.println("Greater number please!");
            }
            else {
                System.out.println("Smaller number please!");
            }
        }
        System.out.println("You guessed the in " + count + " guesses.");
    }
}
