/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;




/**
 *
 * @author Thiagarajan
 */
public class cbstrream {
    public static void main(String[] args) throws Exception{
        FileInputStream f1=new FileInputStream("byte_inputstream.jpg");
        FileOutputStream f2=new FileOutputStream("byte_outputstream.jpg");
        int r;
        while((r=f1.read())!=-1)
            f2.write(r);
        f1.close();
        f2.close();
        FileReader re=new FileReader("char_reader.jpg");
        FileWriter w=new FileWriter("char_writer.jpg");
        int r1;
        while((r1=re.read())!=-1)
            w.write(r1);
        re.close();
        w.close();
        
    }
    
}
