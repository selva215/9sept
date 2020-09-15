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
public class palindrome {
    public static void main(String[] args){
        Scanner obj=new Scanner (System.in);
        System.out.println("enter a string:");
        String s=obj.next();
        String st="";
        int n=s.length();
        for(int i=n-1;i>=0;i--)
        {
            st=st+s.charAt(i);
        }
        if(st.equals(s))
            System.out.println("the string is palindrome");
        else
             System.out.println("the string is not a palindrome");
    }
}
