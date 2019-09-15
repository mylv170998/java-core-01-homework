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
public class Bai2 {
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao so a=");
        int a = sc.nextInt();
        boolean fl = chanle(a);
        System.out.println(fl);
    }
        static boolean chanle(int a){
            boolean flag=true;
            if (a%2==0) {
                flag=true;
            }
            else{
                flag=false;
            }
            return flag;
        }
    
    
}
