// package Assignments.04-functions;

import java.util.Scanner;

public class VotingAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide Age : ");
        int age = sc.nextInt();
        voting(age);
    }
    static void voting(int age) {
        if (age >= 18) {
            System.out.println("You are eligible for vote.");
        } else {
            System.out.println("You are not eligible for vote.");
        }
    }
}

/*
 * Outputs --
 * 
 * Provide Age : 22
 * You are eligible for vote.
 */