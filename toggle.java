/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise13;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Thiagarajan
 */
public class toggle implements ActionListener {
    JButton r,g,b,c,y,o;
    JFrame f;
    toggle()
    {
       
       f=new JFrame("Background Color");
       r=new JButton("RED");
       r.setBounds(50,50,100,50);
       r.setForeground(Color.red);
       r.setBackground(Color.white);
       g=new JButton("GREEN");
       g.setBounds(100,120,100,50);
       g.setForeground(Color.green);
       g.setBackground(Color.white);
       b=new JButton("BLUE");
       b.setBounds(150,190,100,50);
       b.setForeground(Color.blue);
       b.setBackground(Color.white);
       c=new JButton("CYAN");
       c.setBounds(200,260,100,50);
       c.setForeground(Color.cyan);
       c.setBackground(Color.white);
       y=new JButton("YELLOW");
       y.setBounds(250,330,100,50);
       y.setForeground(Color.yellow);
       y.setBackground(Color.white);
       o=new JButton("ORANGE");
       o.setBounds(300,400,100,50);
       o.setForeground(Color.orange);
       o.setBackground(Color.white);
       
       r.addActionListener(this);
       g.addActionListener(this);
       b.addActionListener(this);
       c.addActionListener(this);
       y.addActionListener(this);
       o.addActionListener(this);

       f.add(r);f.add(c);f.add(g);f.add(b);f.add(y);f.add(o);
       f.setSize(500,500);  
       f.setLayout(null);  
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==r)
            f.getContentPane().setBackground(Color.red);
        if(e.getSource()==g)
            f.getContentPane().setBackground(Color.green);
        if(e.getSource()==b)
            f.getContentPane().setBackground(Color.blue);
        if(e.getSource()==c)
            f.getContentPane().setBackground(Color.cyan);
        if(e.getSource()==y)
            f.getContentPane().setBackground(Color.yellow);
        if(e.getSource()==o)
            f.getContentPane().setBackground(Color.orange);
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new toggle();
        // TODO code application logic here
    }
    
}
