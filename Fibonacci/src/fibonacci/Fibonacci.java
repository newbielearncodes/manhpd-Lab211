/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Acer Nitro5
 */
public class Fibonacci {

    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-2)+fibonacci(n-1);
    }
//    public void display(){
//        System.out.println("Day so fibonacci la: ");
//        for(int i=0;i<45;i++){
//            if(fibonacci(i)==44){
//                System.out.println(fibonacci(i));
//            }
//            System.out.println(fibonacci(i)+", ");
//        }
//    }
    
    
    public static void main(String[] args) {
        
System.out.println("Day so fibonacci la: ");
        for(int i=0;i<45;i++){
            if(i==44){
                System.out.print(fibonacci(i) + "\n");
                break;
            }
            System.out.print(fibonacci(i)+", ");
        }
    }
    
}
