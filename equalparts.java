/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise8;

import java.util.Scanner;

/**
 *
 * @author Thiagarajan
 */
public class equalparts {
    public  static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String s="abcdefgh";
        System.out.println("string:"+s);
        String b="";
        int len=s.length();
        System.out.println("enter no of parts:");
        int n=obj.nextInt();
        int c=len/n;
        int k;
        if(len%n!=0)
            System.out.println("the given string cannot be divided into equal parts");
        else
        {
            for(int i=0;i<len;i=i+c)
            {
                k=i;
                for(int j=0;j<c;j++)
                {
                    b=b+s.charAt(i);
                    i++;
                }
                 b=b+" ";
                 i=k;
            }
             System.out.println(b);
        }
       
    }
    
}
