/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.main.sum;

/**
 *
 * @author Emma
 */
import java.util.Scanner;

public class SUM {
    public static void main(String[] args) {
        Scanner save = new Scanner(System.in);
        
        System.out.println("Enter integers (0 to end):");
        
        int sum = 0;
        int number;
        
        System.out.print("Enter an integer: ");
        number = save.nextInt();
      
        while (number != 0) {
            // sum the number;
            sum += number;
            
            // go to the next number
            System.out.print("Enter an integer: ");
            number = save.nextInt();
        }
        
        // show the result;
        System.out.println("The sum of the integers is: " + sum);
        
    }
}
