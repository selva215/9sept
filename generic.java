/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise12;


import java.util.Scanner;

/**
 *
 * @author Thiagarajan
 */
public class generic {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the list sie");
        int n=obj.nextInt();
        Integer a[]=new Integer[30];
        System.out.println("Enter the list elements");
        for(int i=0;i<n;i++)
            a[i]=obj.nextInt();
        generic1<Integer> obj1=new generic1<>();
        obj1.count(a,n);
        obj1.exchange(a,n);
        obj1.maximum(a,n);
    }
            
}
class generic1<T>
{
    Scanner obj=new Scanner(System.in);
    public <T> void count(T list[],int num)
    {
        int count=0;
        for(int i=0;i<(int)num;i++)
        {
            if((int)list[i]%2!=0)
            {
               count++; 
            }
        }
        System.out.println("No.of odd numbers in the list:"+count);
    }
    public <T> void exchange(T list[],int num)
    {
        System.out.println("Enter the positions to be exchanged");
        int n1=obj.nextInt();
        int n2=obj.nextInt();
        T c;
        if(n1<num && n2<num)
        {
            System.out.println("List elements before swapping");
            for(int i=0;i<(int)num;i++)
                System.out.print(list[i]+" ");
            c=list[n1];
            list[n1]=list[n2];
            list[n2]=c;
            System.out.print("\nList elements after swapping\n");
            for(int i=0;i<(int)num;i++)
                System.out.print(list[i]+" ");
        }
        else
            System.out.println("Enter valid index");
       
    }
    public <T> void maximum(T list[],int num)
    {
        System.out.println("\nTO FIND MAXIMUM ELEMENT IN A GIVEN RANGE");
        System.out.println("Enter the starting index");
        int begin=obj.nextInt();
        System.out.println("Enter the end index");
        int end=obj.nextInt();
        if(begin<num && end<num)
        {
            System.out.println("Elements in the given range");
            for(int i=begin;i<=end;i++)
                System.out.print(list[i]+" ");
            int max=(int)list[begin];
            for(int i=begin;i<end;i++)
            {           
                if((int)list[i]>max)
                    max=(int)list[i];
            }
            System.out.println("\nLargest element in the given range:"+max);
        }
        else
            System.out.println("Enter valid index");  
        
    }
}