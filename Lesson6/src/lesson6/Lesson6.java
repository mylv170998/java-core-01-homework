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
public class Lesson6 {

    /**
     * @param args the command line arguments
     */
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("do dai mang a =");
        int a = sc.nextInt();
        System.out.println("do dai mang b =");
        int b = sc.nextInt();
        int mang1[] = new int[a];
        int mang2[] = new int[b];
        System.out.println("nhap phan tu mang 1: ");
        for (int i = 0; i < a; i++) {
            System.out.print("mang1[" + i + "]=");
            mang1[i] = sc.nextInt();

        }
        int k = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - 1; j++) {
                if (mang1[i] < mang1[j]) {
                    k = mang1[i];
                    mang1[i] = mang1[j];
                    mang1[j] = k;
                }
            }
        }
        for (int i = 0; i < a; i++) {
            System.out.print(mang1[i] + "  ");
        }
        System.out.println("nhap phan tu mang2 : ");
        for (int i = 0; i < b; i++) {
            System.out.print("mang2[" + i + "]=");
            mang2[i] = sc.nextInt();
        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b - 1; j++) {
                if (mang2[i] < mang2[j]) {
                    k = mang2[i];
                    mang2[i] = mang2[j];
                    mang2[j] = k;
                }
            }
        }
        for (int i = 0; i < b; i++) {
            System.out.print(mang2[i] + "  ");
        }
        int c= a+b;
        int mang3[]= new int[c];
        for (int i=0;i<c;i++){
            if(i<a) {
                mang3[i]=mang1[i];
            }
            else {
                mang3[i]=mang2[i-a];
            }
        }
          for (int i = 0; i < c; i++) {
            for (int j = 0; j < c - 1; j++) {
                if (mang3[i] < mang3[j]) {
                    k = mang3[i];
                    mang3[i] = mang3[j];
                    mang3[j] = k;
                }
            }
        }
          System.out.println("Mang 3 sau khi sap xep");
        for (int i = 0; i < c; i++) {
            System.out.print(mang3[i] + "  ");
        }      
        

    }

}
