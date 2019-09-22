/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

/**
 *
 * @author mylv
 */
public class Bai3 {

    public static void main(String[] args) {
        char[] a = {'m', 'y', 'd', 'e', 'p', 't', 'r', 'a', 'i'};
        char[] b = sapxep(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");

        }
    }

    static char[] sapxep(char[] a) {
        char n = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
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
