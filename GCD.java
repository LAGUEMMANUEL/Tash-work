/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.main.gcd;

/**
 *
 * @author Emma
 */

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
       // Enter the first positive integer;
        do {
            System.out.print("Enter first positive integer: ");
            n1 = input.nextInt();
            if (n1<=0) {
                System.out.println("Please enter positive integer!");
            }
        } while (n1 <= 0);
        
        // Enter the second positive integer;
        do {
            System.out.print("Enter second positive integer: ");
            n2 = input.nextInt();
            if (n2<=0) {
                System.out.println("Please enter positive integer!");
            }
        } while (n2 <= 0);
        
        // Find GCD 
        int gcd = 1;
        int min = Math.min(n1, n2);
        
        for (int k = 1; k <= min; k++) {
            if (n1%k == 0 && n2 % k == 0) {
                gcd = k;
            }
        }
        
        System.out.println("The greatest common divisor of " + n1 + " and " + n2 + " is " + gcd);
        
        
    }
}
