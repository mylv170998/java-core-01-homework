/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

import java.util.Scanner;

/**
 *
 * @author mylv
 */
public class Lesson4 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        int a[][] = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("a[" + i + "," + j + "]=");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mang vua nhap");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(a[i][j] + "   ");
            }
            System.out.println();
        }

        System.out.println("Nhung phan tu chia het cho 3 la : ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (a[i][j] % 3 == 0) {
                    System.out.println("a[" + i + "][" + j + "]=" + a[i][j] + "  ");
                }
            }
        }
        System.out.println("Cac thang la so nguyen to la : ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {

                boolean ngto = false;
                if (a[i][j] < 2) {
                    ngto = true;
                }
                for (int k = 2; k < a[i][j]; k++) {
                    if (a[i][j] % k == 0) {
                        ngto = true;
                        break;
                    }
                }
                if (!ngto) {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
 ///////bai 2
        System.out.println("\n");
        System.out.println("Nhap n=");
        int n = sc.nextInt();
     int b[][]= new int [n][n];
     for (int in=0;in<n;in++){
         for (int jn=0;jn<n;jn++){
             System.out.print("a["+in+"]["+jn+"]= ");
             a[in][jn]=sc.nextInt();
         }
     }
     System.out.println("Mang vua nhap");
        for (int in = 0; in < n; in++) {
            for (int jn = 0; jn < n; jn++) {
                System.out.print(a[in][jn] + "   ");
            }
            System.out.println();
        }
     int tongcheo=0;
        for (int in = 0; in < n; in++) {
            for (int jn = 0; jn < n; jn++) {
               if (in==jn){
                   tongcheo = tongcheo + a[in][jn];
               } 
            }
        }
        System.out.println("Tong cac thang nam o duong cheo chinh la: " + tongcheo);
        
    }

}
