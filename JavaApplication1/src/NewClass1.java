
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mylv
 */
public class NewClass1 {
    public static Scanner x = new Scanner(System.in);
    public static void main (String[] args){
        System.out.print("Nhập vào số phần tử của mảng: ");
    int i;
       int  n = x.nextInt();
        int[]  A = new int[n];
         System.out.print("Nhập các phần tử của mảng: \n"); 
         for (i=0;n>=i;i++) {
             System.out.printf("a[%d]=",i);
           A[i]= x.nextInt();
                }
        

  