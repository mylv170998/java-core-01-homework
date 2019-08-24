/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vippro;

import java.util.Scanner;

/**
 *
 * @author mylv
 */
public class NewClass1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
     System.out.print("nhap n=");
     int n =  sc.nextInt();
     for (int i=0;i<n;i++){
         if (i%2==0) {
             System.out.print(i+ "   ");
         }
     }
     ////////
     ////////
     ///////
     
     System.out.print("nhap x=");
     int x = sc.nextInt();
     
     for (int j=2;j<=x;j++){
    
         if (x%j==0){
              System.out.print("X ko phai so nguyen to");
             
             System.out.print(    j +" " );
         }
         else {System.out.print("X la so nguyen to");}
        break;
     }
     
    } 
}
