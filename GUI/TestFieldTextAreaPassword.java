package GUI;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestFieldTextAreaPassword {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Welcome to the world of java...");
        frame.setVisible(true); 
        frame.setLayout(null);
        frame.setSize(400, 300);
        JTextField tf1=new JTextField("Enter your userid");
        tf1.setBounds(100,50,100,30);
        frame.add(tf1);
        JPasswordField pf=new JPasswordField();
        pf.setBounds(200,100,50,60);
        frame.add(pf);
        JTextArea area=new JTextArea("write somethings...");
        area.setBounds(100,500,50,60);
        frame.add(area);
    }
    
}
