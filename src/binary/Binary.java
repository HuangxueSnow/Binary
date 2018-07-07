/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Administrator
 */
public class Binary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        
            String s;
            for(int i = 0; i < n; i++){
                int a = reader.nextInt();
                printHex(a);
            }
    }

    private static void printHex(int a) 
    {
        Stack stack=new Stack();
        Integer b=a;
        do {
            Integer r=b%16;
            stack.push(r);
            b=b/16;
        } while (b!=0);
        
        while (!stack.empty()) {
            b=(Integer)stack.pop();
            System.out.print(String.format("%4s",Integer.toBinaryString(b)).replace(" ", "0")+" ");
        }
    }
}
