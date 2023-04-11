/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0002;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Acer Nitro5
 */
public class J1SP0002 {

    /**
     * @param args the command line arguments
     */
    private static final Scanner sc = new Scanner(System.in);
    // ham check dau vao
    private static int checkInput() {
        while (true) {
            try {
                int temp = Integer.parseInt(sc.nextLine().trim());
                if (temp < 0) {
                    throw new NumberFormatException();
                }
                return temp;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input");
                System.out.print("Please try again: ");
            }
        }
    }
    //ham nhap so luong mang
    private static int inputsizeofArray() {
        System.out.println("Enter number of array: ");
        int n = checkInput();
        return n;
    }
    //random ra gia tri mang
    private static int[] valueofArray(int n) {
        int[] a = new int[n];
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rd.nextInt(n);
        }
        return a;
    }
    //ham in ra mang chua sap xep
    private static void displayArrayUnsorted(int[] a) {
        
        System.out.print("Unsorted array: [");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
    // ham in ra mang da sap xep
     private static void displayArraySorted(int[] a) {
        
        System.out.print("Sorted array: [");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
         System.out.println();
    }
     private static void SelectionSort(int[] a) {
    int indexMin, i, j;
 
        // lap qua ta ca cac so
        for (i = 0; i < a.length - 1; i++) {
            // thiet lap phan tu hien tai la min
            indexMin = i;
 
            // kiem tra phan tu hien tai co phai la nho nhat khong
            for (j = i + 1; j < a.length; j++) {
                if (a[j] < a[indexMin]) {
                    indexMin = j;
                }
            }
 
            if (indexMin != i) {
                // Trao doi cac so
                int temp = a[indexMin];
                a[indexMin] = a[i];
                a[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int n = inputsizeofArray();
        int[] a = valueofArray(n);
        displayArrayUnsorted(a);
        System.out.println();
        SelectionSort(a);
        displayArraySorted(a);
    }
    
}
