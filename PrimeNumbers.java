/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.main.primenumbers;

/**
 *
 * @author Emma
 */
import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
                Scanner save = new Scanner(System.in);
// count number;
        int count = 0;
        int number = 2;
        // first 50 prime numbers;
        System.out.println("First 50 prime numbers:");
        
        while (count < 50) {
            // if is prime number
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
               // if () count % 10 ==o)
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        }
    }
    
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
