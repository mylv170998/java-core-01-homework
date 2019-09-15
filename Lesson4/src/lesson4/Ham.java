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
        System.out.println("Nhap do dai k=");
        int k = sc.nextInt();
        int[] a = new int[k];
        for (int i = 0; i < k; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        System.out.println("  ");
        int[] mangsx = sapxep(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
    }

    static int[] sapxep(int[] a) {
        int n;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    n = a[i];
                    a[i] = a[j];
                    a[j] = n;

                }
            }
        }
        return a;
    }
}
