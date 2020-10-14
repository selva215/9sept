/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise11;

import java.util.Scanner;

/**
 *
 * @author Thiagarajan
 */
public class thread3 {
    public static void main (String[] args)throws InterruptedException{
        Scanner obj=new Scanner(System.in);
        System.out.println("enter no of array elements");
        int n=obj.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
            a[i]=obj.nextInt();  
        sample s=new sample(n,a);
        Thread t1=new Thread(s);
        divide d=new divide(n,a);
        Thread t2=new Thread(d);
        average g=new average(n,a);
        Thread t3=new Thread();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}
class sample implements Runnable
{
    public int n,a[];
    sample(int n,int a[])
    {
        this.n=n;
        this.a=a;
    }
    @Override
    public void run()
    {
       System.out.println("Array elements");
       for(int i=0;i<n;i++)
           System.out.println(a[i]+" ");
    } 
    
   
}
class divide extends sample implements Runnable
{
    divide(int n,int a[])
    {
        this.n=n;
        this.a=a;
    }
    @Override
    public void run()
    {
        System.out.println("elements divisible by 5");
        for(int i=0;i<n;i++)
        {
            if(a[i]%5==0)
                System.out.println(a[i]);
        }
    }          
}
class average extends sample implements Runnable
{
    average(int n,int a[])
    {
        this.n=n;
        this.a=a;
    }
    @Override
    public void run()
    {
        int avg=0,sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
            avg=sum/n;
        }
     System.out.println("Average:"+avg);
    }
}