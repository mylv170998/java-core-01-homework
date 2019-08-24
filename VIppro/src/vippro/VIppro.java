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
public class VIppro {

    public static Scanner x = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập vào số phần tử của mảng: ");
        int i, b, tong;
        int n = x.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (i = 0; n > i; i++) {
            System.out.printf("a[%d]=", i);
            A[i] = x.nextInt();

        }
        b = 0;

        for (i = 0; i < n; i++) {
            if (i % 2 == 0) {
                B[b] = A[i];
                b++;
            }
        }
        System.out.print("Các phần tử ở vị trí chẵn là: ");
        for (i = 0; i < b; i++) {
            System.out.println(B[i]);
        }
        tong = 0;
        for (i = 0; i < n; i++) {
            if (A[i] % 7 == 0) {
                tong = tong + A[i];

            }
        }
        System.out.print("Tổng các số chia hết cho 7 là:");
        System.out.print(tong);
    }
}
 class NewClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap x=");
        int x= sc.nextInt();
        for (int i=0;i<x;i++){
            if (i==5) continue;
            System.out.print(i);
        }
                
    }
    
}