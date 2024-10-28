package com.mycompany.freeicecream;

import java.util.Scanner;
 
public class FreeIceCream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int n = scanner.nextInt(); 
        long x = scanner.nextLong();
        scanner.nextLine();
 
        int distressedChildren = 0;
 
        
        for (int i = 0; i < n; i++) {
            char operation = scanner.next().charAt(0);
            long amount = scanner.nextLong();
            scanner.nextLine();
 
            if (operation == '+') {
                x += amount;
            } else if (operation == '-') {
                if (x >= amount) {
                    x -= amount; 
                } else {
                    distressedChildren++;
                }
            }
        }
 
       
        System.out.println(x + " " + distressedChildren);
    }
}