/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary;

import java.util.Scanner;

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
        if (n <= 20 && n>=1){
            String s;
            String NumArray[] = new String [n];
            for(int i = 0; i < n; i++){
                String a = reader.next();
                s = Binary(a);
                NumArray[i] = s;
            }
            for(int j = 0; j < n; j++){
                System.out.println(NumArray[j]);
            }
        }
        
    }
     private static String Binary(String a) {
         int b = Integer.parseInt(a);
         int c;
         int e = 0;
         int f = 0;
         String d = "";
         while(b != 0){
             c = b % 2;
             if(c == 0){
                 b = b/2;
                 String o = "0";
                 d = d+o;
             }else{
                 b = (b-1)/2;
                 String l = "1";
                 d = d+l;
             }
             e += 1;
             f = e %4;
             if(f == 0){
                 String q = " ";
                 d = d + q;
             }
         }
         return d;
     }
    
}
