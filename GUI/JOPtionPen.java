package GUI;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOPtionPen {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        
        JOptionPane.showMessageDialog(null, "Welcome to DotTrip");
        JOptionPane.showMessageDialog(null, "Welcome to DotTrip","Alert",JOptionPane.WARNING_MESSAGE);
        String name=JOptionPane.showInputDialog("Enter your name");
        System.out.println(name);
    }
}
