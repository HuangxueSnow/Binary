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
        
            String s;
            for(int i = 0; i < n; i++){
                int a = reader.nextInt();
                s = Binary(a);
                int count = s.length()/4;
                System.out.print(s.substring(0, 4));
                for(i = 1; i < count; i++){
                    int m = 4*i;
                    System.out.print(" "+s.substring(m, m+4));
                }
                System.out.println();
            }
            

        
    }
     private static String Binary(int b) {
         
         String d = "";
         do {
             d=b%2+d;
             b=b/2;
         } while (b!=0);
        
         int l=4-d.length()%4;
         if (l==4) l=0;
         for (int i=0;i<l;i++) 
             d="0"+d;
         
         return d;
     }
    
}
