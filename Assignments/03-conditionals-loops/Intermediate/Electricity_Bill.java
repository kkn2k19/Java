// 06.04.2024
// Calculate Electricity Bill

/*   Write a program in C to calculate and print the electricity bill of a given customer.
 The customer id, name and unit consumed by the user should be taken from the keyboard and display the total amount to pay to the customer. 
 The charge are as follows: 
     Unit                                                        Charge/Unit     
     upto 199                                                    @1.20
     200 and above but less than 400                             @1.50
     400 and above but less than 600                             @1.80
     600 and above                                               @2.00
     If bill exceeds Rs.400 then a subcharge of 15% will be charged and the minimum bill should be of Rs.100/-  */

import java.util.Scanner;

public class Electricity_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide the details: id no., customer name, unit consumed: ");
        int id = sc.nextInt();
        String name = sc.next();
        int uc = sc.nextInt();
        double rate;
        if (uc <= 199) {
            rate = 1.20;
        } else if (uc >= 200 && uc < 400) {
            rate = 1.50;
        } else if (uc >= 400 && uc < 600) {
            rate = 1.80;
        } else {
            rate = 2.00;
        }
        double bill = uc * rate;
        double subcharge = 0;
        if (bill > 400) {
            subcharge = 0.15 * bill;
        }
        double netAmount = bill + subcharge;
        if (netAmount < 100) {
            netAmount = 100;
        }
        System.out.println("Electricity Bill for the id no.: " + id);
        System.out.println("Customer name: " + name);
        System.out.println("unit consumed: " + uc);
        System.out.println("Amount Charged: " + bill);
        System.out.println("Subcharge Amount: " + subcharge);
        System.out.println("Net Payable Amount: " + netAmount);
    }
}

/*
 * Output --
 * 
 * Provide the details: id no., customer name, unit consumed: 1448 Karan 420
 * Electricity Bill for the id no.: 1448
 * Customer name: Karan
 * unit consumed: 420
 * Amount Charged: 756.0
 * Subcharge Amount: 113.39999999999999
 * Net Payable Amount: 869.4
 */