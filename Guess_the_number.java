package com.company;

import java.util.Random;
import java.util.Scanner;

public class Guess_the_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(101);
        System.out.println("Enter a number to guess : ");
        int guss = sc.nextInt();
        int count = 1;
        while (guss != num){
            if (guss<num){
                System.out.println("Greater number please!");
            }
            else if (guss>num){
                System.out.println("Smaller number please!");
            }
            count++;
        System.out.println("Enter a number to guess : ");
        guss = sc.nextInt();
        }
        System.out.println("You guessed the number in " + count + " tries.");
    }
}
