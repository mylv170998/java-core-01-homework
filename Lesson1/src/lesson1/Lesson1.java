/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;

import java.util.Scanner;

/**
 *
 * @author mylv
 */
public class Lesson1 {

    public static Scanner sc = new Scanner(System.in);
    private static double nghiem1;

    public static void main(String[] args) {
        ///bai 1
        System.out.print("Nhập vào số a= ");
        float a = sc.nextFloat();
        System.out.print("Nhập vào số b=");
        float b = sc.nextFloat();
        float tong = a + b;
        float tich = a * b;
        float hieu = a - b;

        System.out.print("Tổng của a và b là: ");
        System.out.println(tong);
        System.out.print("Hiệu của a và b là: ");
        System.out.println(hieu);
        System.out.print("Tích của a và b là: ");
        System.out.println(tich);
        if (b == 0) {
            System.out.println(" Không thể chia a cho b!");
        } else {
            float thuong = a / b;
            System.out.print("Thương của a và b là: ");
            System.out.println(thuong);
        }
        float z = (float) Math.pow(a, b);
        System.out.print("a^b= ");
        System.out.println(z);
        /////bai 2      
        System.out.print("nhập vào số m= ");
        float m = sc.nextFloat();
        System.out.print("nhập vào số n= ");
        float n = sc.nextFloat();
        System.out.print("nhập vào số p= ");
        float p = sc.nextFloat();
        if (m == 0) {
            float nghiem = -p / n;
            System.out.println("Nghiệm của phương trình là :");
            System.out.print(nghiem);
        } else {
            float h = n * n - p * 4 * m;
            if (h < 0) {
                System.out.print("Phuong trinh vo nghiem");
            } else {
                float k = (float) Math.sqrt(h);

                float n1 = (-n - k) / (2 * m);
                float n2 = (-n + k) / (2 * m);
                // not an number 
                System.out.print("Nghiem x1= ");
                System.out.println(n1);
                System.out.print("Nghiem x2= ");
                System.out.println(n2);

            }

        }
    }
}
