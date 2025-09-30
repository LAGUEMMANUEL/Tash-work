/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.main.whileloop;

/**
 *
 * @author Emma
 */
import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args){
        Scanner save = new Scanner(System.in);
        System.out.println("Enter the intial value of N; ");
        int n1;
        n1 = save.nextInt();
        System.out.println("Enter the maximum of N");
        int n2 = save.nextInt();

        //using a for loop
        for(int n=n1; n<=n2;n--){
            if(n%2==0){
            System.out.println(n);
        }
    }
    }
}

