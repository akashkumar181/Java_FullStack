package GUI;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.Image;
import java.awt.Toolkit;

public class filechooser {
    public static void main(String[] args) {
        // JFileChooser jf= new JFileChooser();
        // jf.showSaveDialog(null);
        JFrame frame3=new JFrame("Main");
        frame3.setSize(400,400);
        frame3.setVisible(true);
        Image icon = Toolkit.getDefaultToolkit().getImage(
                "C:\\Users\\HP\\Downloads\\linkedin-logo.png");
       frame3.setIconImage(icon);
         frame3.setVisible(true);



    }
    
}
