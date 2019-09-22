/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls8;

import java.util.Scanner;

/**
 *
 * @author mylv
 */
public class LS8 {
    static int x,y;
    static int endX,endY;
      final static int length=5;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
         endX  =(int)(Math.random()*length);endY =(int)(Math.random()*length);
         x = 2; y = 2;
         
       while (true ){
         show();
         String Kituvuanhap = input();
         move(Kituvuanhap);
         boolean  ketqua = check();
       }
        
    }
    static void show(){
        
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if (i==y && j==x){
                    System.out.print("x ");
                }
                else if (i==endX && j==endY){
                    System.out.print("O ");
                }
                else {
                    System.out.print("- ");
                }
            }
                System.out.println("");
            
        }
    }

    static String input() {
       Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao :TRAI PHAI TREN DUOI:");
       String input= sc.nextLine();
       
       return input;
    }
    static void move(String Kituvuanhap){
        switch (Kituvuanhap)
        {case "TRAI": x=x-1;
               break;
        case "PHAI" : x=x+1;
               break;
        case "TREN" : y=y-1;
               break;
        case "DUOI" : y=y+1;
        
            
        }
    }
    static boolean check(){
      boolean check=false;
      if (x==endX && y==endY){
          check=true;
          System.out.println("THANG ROI");
         
          
      }
      else {
          check=false;
      }
        return check;
  }
}
