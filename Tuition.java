/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.main.tuition;

/**
 *
 * @author Emma
 */

public class Tuition {
    public static void main(String[] args) {
        // Initial tuition
        
        double tuition = 10000.0;
        
        // Double the initial tuition
        
        double targetTuition = tuition * 2; 
        
        // 7% annual increase
        
        double increaseRate = 0.07;
        
        int years = 0;
        
        System.out.println("Year\tTuition");
        
        System.out.println("----\t-------");
        
        // initial year
        System.out.printf("0\t$%.2f%n", tuition);
        
        while (tuition < targetTuition) {
            
            // Increase by 7%
            
            tuition = tuition * (1 + increaseRate);  
            years++;
            System.out.printf("%d\t$%.2f%n", years, tuition);
        }
        
        System.out.println("\nTuition will be doubled in " + years + " years.");
        
        System.out.printf("Final tuition: $%.2f%n", tuition);
    }
}


