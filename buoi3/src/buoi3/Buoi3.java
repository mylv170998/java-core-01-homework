/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3;

import java.util.Scanner;

/**
 *
 * @author mylv
 */
public class Buoi3 {

    public static Scanner x = new Scanner(System.in);

    public static void main(String[] args) {

        int soluong = x.nextInt();
        String[] StArray = new String[soluong];
        System.out.print("Nhap vao string: ");
        for (int i = 0; i < StArray.length; i++) {

            StArray[i] = x.nextLine();

        }
        System.out.println("mang dau vao: ");
        for (int i = 0; i < StArray.length; i++) {
            System.out.println(StArray[i]);
        }
        
    }

}
