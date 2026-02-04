package GUI;
import java.util.*;

import javax.swing.*;


public class FrameAndButtoon{
    public static void main(String[] args) {
        
        System.out.println("Good to go...");
        JFrame frame=new JFrame("Welcome to the world of java...");
        frame.setVisible(true); 
        frame.setLayout(null);
        frame.setSize(400, 300); 
        JButton b1=new JButton("click me");
        JLabel l1=new JLabel("Click the button");
        l1.setBounds(100,100,100,70);
        b1.setBounds(120,100,100,20);
        frame.add(b1);
        frame.add(l1);

    }
}