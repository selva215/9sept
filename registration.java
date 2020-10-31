/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise13;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Thiagarajan
 */
public class registration implements ActionListener {
    JFrame f1;
    JLabel l1,l2,l3,l4,l5,l;
    JTextField t1,t2,t3;
    JPasswordField p1,p2;
    JButton b;
    JCheckBox cb;
    registration()
    {
        f1=new JFrame();
        l=new JLabel("----------REGISTRATION-----------");
        l.setBounds(200,10,250,20);
        l1=new JLabel("First Name");
        l1.setBounds(50,50,150,20);
        l2=new JLabel("Last Name");
        l2.setBounds(280,50,150,20);
        l3=new JLabel("Email");
        l3.setBounds(50,100,150,20);
        l4=new JLabel("Password");
        l4.setBounds(50,150,150,20);
        l5=new JLabel("Confirm Password");
        l5.setBounds(50,200,150,20);
        t1=new JTextField();
        t1.setBounds(120,50,150,20);
        t2=new JTextField();
        t2.setBounds(350,50,150,20);
        t3=new JTextField();
        t3.setBounds(170,100,150,20);
        p1=new JPasswordField();
        p1.setBounds(170,150,150,20);
        p2=new JPasswordField();
        p2.setBounds(170,200,150,20);
        b=new JButton("Register now");
        b.setBounds(200,300,150,20);
        cb=new JCheckBox("I accept to the Terms of use &Privacy Policy");
        cb.setBounds(50,250,280,20);
        b.addActionListener(this);
        f1.add(l1); f1.add(l2); f1.add(l3); f1.add(l4); f1.add(l5);
        f1.add(t1); f1.add(t2); f1.add(t3); f1.add(p1); f1.add(p2);
        f1.add(b);f1.add(cb);f1.add(l);
        f1.setSize(500,500);  
        f1.setLayout(null);  
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        String str=p1.getText();
        String str1=p2.getText();
        if(str.equals(str1))
            JOptionPane.showMessageDialog(null,"Registration successful");
        else
            JOptionPane.showMessageDialog(null,"Passwords don't match");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new registration();
        // TODO code application logic here
    }
    
}
