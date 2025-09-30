/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.main.nested;

/**
 *
 * @author Emma
 */

import java.util.Scanner;

public class Nested {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 7, y = 9, z = 10;

        if (x > y) {
            if (x > z) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }

      
    }
}