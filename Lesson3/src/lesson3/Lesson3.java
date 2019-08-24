/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3;

import java.util.Scanner;

/**
 *
 * @author mylv
 */
public class Lesson3 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ////bai 1

        int dodai = 10;
        int tong = 0;

        int[] a = new int[dodai];
        int i;
        for (i = 0; i < dodai; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = sc.nextInt();

        }
        for (i = 0; i < dodai; i++) {
            tong = tong + a[i];

        }
        System.out.print("tong =");
        System.out.println(tong);
        ////bai 2
        System.out.print("Cac phan tu o vi tri chan :");
        for (i = 0; i < dodai; i++) {
            if (i % 2 == 0) {
                System.out.print(a[i] + "  ");
            }
        }
        System.out.println("Cac phan tu o vi tri le :");
        for (i = 0; i < dodai; i++) {
            if (i % 2 != 0) {
                System.out.print(a[i] + "  ");
            }

        }
        System.out.println("Cac phan tu chia het cho 2 la:");
        for (i = 0; i < dodai; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i] + "  ");
            }
        }
        int tongchan=0;
        for (i=0;i<1;i++){
            if (a[i]%2==0){
                tong=tong+a[i];
            }
        System.out.println("Tong cac phan tu chan la:" + tongchan);
        }
        System.out.println("Cac phan tu chia cho 5 du 1 la:");
        for (i=0;i<1;i++){
            if (a[i]%5==1){
                System.out.println(a[i]+"  ");
            }
        }
    }
    

}
