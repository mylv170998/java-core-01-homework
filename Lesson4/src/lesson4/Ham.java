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
public class Ham {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap do dai k=");
        int k = sc.nextInt();
        int[] a = new int[k];
        for (int i = 0; i < k; i++) {

            System.out.print("a[" + i + "]=");

            a[i] = sc.nextInt();
        }
        int tongmang = 0;
        System.out.print(" tong cac phan tu trong mang la:");
        tongmang = tong(a);
        System.out.print(tongmang);
    }

    static int tong(int[] a) {
        int tong = 0;
        for (int i = 0; i < a.length; i++) {
            tong = tong + a[i];
        }
        return tong;
    }
}
