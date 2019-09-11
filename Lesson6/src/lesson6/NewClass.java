/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6;

import java.util.Scanner;

/**
 *
 * @author mylv
 */
public class NewClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang :");
        int n = sc.nextInt();
        int [] A= new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i=0;i<n;i++){
            System.out.println("A["+i+"]=");
             A[i]= sc.nextInt();
            
        }
        int k = 0;
        boolean fl= true;
        for (int i=0;i<n;i++){
            for (int j=0;j<n-1;j++){
                if (A[i]<A[j]){
                    fl=false;
                    k=A[i];
                   
                    A[i]=A[j];  
                    A[j]=k;
                }
            }
        }
        for (int i=0;i<n;i++){
        if (!fl){
            System.out.print(" " + A[i]);
        }
        else System.out.print(" "+ A[i]);
        }
    }
}
