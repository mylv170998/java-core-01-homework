/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author mylv
 */
public class Testclient {

    /**
     * @param args the command line arguments
     * @throws java.net.UnknownHostException
     */
    public static void main(String[] args) throws UnknownHostException, IOException {
        // TODO code application logic here
        Socket socket = new Socket("172.19.200.85", 4000);
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            String str = sc.nextLine();
            dos.writeUTF(str);
            if(str.equals("q"))
            {
                break;
            }
            String str2 = dis.readUTF();
            System.out.println(str2);
        }
    }
    
}
