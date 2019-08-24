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
public class NewClass {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String [] args ){
        System.out.print("Nhap so thu nhat X :");
        int X = sc.nextInt();
        System.out.print("Nhap so thu hai Y:");
        int Y =sc.nextInt();
        int y3=Y%10; int x3=X*y3;
        int y2=(Y/10)%10; int x2=X*y2;
        int y1=(Y/100)%10; int x1 =X*y1;
        int ketqua= X*Y;
        System.out.println("   "+ X);
        System.out.println("   "+ Y);
        System.out.println("---------");
        System.out.println("   "+ x3);
        System.out.println("  "+ x2);
        System.out.println(" "+ x1);
        System.out.println("---------");
        System.out.println(" "+ ketqua);
                
        
    }
    
}
