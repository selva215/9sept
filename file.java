/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author Thiagarajan
 */
public class file {
    public static void main (String[] args) throws FileNotFoundException, IOException{
        Scanner obj=new Scanner(System.in);
        System.out.println("enter file name");
        String str=obj.next();
        File f=new File(str);
        System.out.println("INFORMATION ABOUT THE FILE");
        System.out.println("Availablity of file:"+f.exists());
        System.out.println("File name:"+f.getName());
        System.out.println("Writable:"+f.canWrite());
        System.out.println("Readable:"+f.canRead());
        System.out.println("Length of the file:"+f.length());
        int index=str.lastIndexOf(".");
        if(index>0)
        {
            String a=str.substring(index+1);
            System.out.println("Type of file:"+a);
        }
    }
    
}
