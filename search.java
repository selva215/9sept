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
public class search {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the list sie:");
        int n=obj.nextInt();
        Integer a[]=new Integer[n];
        System.out.println("Enter the list elements");
        for(int i=0;i<n;i++)
            a[i]=obj.nextInt();
        System.out.println("Enter the number to be searched");
        int s=obj.nextInt();
        search1<Integer,Integer> obj1=new search1<>();
        obj1.search1(a,s);
    }    
}
class search1<T,N>
{
    int flag=0;
    public <T,N> void search1(T list[],N num)
    {
        for(int i=0;i<list.length;i++)
        {
            if(list[i]==num)
            {
                flag=1;
                break;
            } 
            else
                flag=0;
        }
        if(flag==1)
            System.out.println("The number is present in the list");
        else
            System.out.println("The number is not present");
    }
}
        