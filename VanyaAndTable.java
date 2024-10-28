package com.mycompany.vanyaandtable;

import java.util.Scanner;
 
public class VanyaAndTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int k = scanner.nextInt();
        scanner.nextLine();
 
        int[] frequency = new int[10];
 
        
        for (int i = 0; i < 4; i++) {
            String row = scanner.nextLine();
            for (int j = 0; j < 4; j++) {
                char c = row.charAt(j);
                if (c != '.') {
                    frequency[c - '0']++;
                }
            }
        }
 
     
        int limit = 2 * k;
        boolean valid = true;
 
        for (int i = 1; i <= 9; i++) {
            if (frequency[i] > limit) {
                valid = false;
                break;
            }
        }
 
 
        System.out.println(valid ? "YES" : "NO");
    }
}