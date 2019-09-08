/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls5;

import java.util.Scanner;

/**
 *
 * @author mylv
 */
public class Ls5 {

    public static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("matran1");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a[][] = new int[x][y];
        int b[][] = new int[x][y];
        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                System.out.println("a["+i+"]["+j+"]=");
                a[i][j]= sc.nextInt();
                
            }
        }
        
        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                System.out.println("b["+i+"]["+j+"]=");
                b[i][j]=sc.nextInt();
            }
        }
        
    }
    
}
