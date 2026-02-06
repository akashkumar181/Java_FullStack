package GUI;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class ComboBoxRadioButtonCheckBox {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Welcome to the world of java...");
        frame.setVisible(true); 
        frame.setLayout(null);
        frame.setSize(400, 300);
        JLabel label1=new JLabel("Which is your favourite language");
        label1.setBounds(50,30,300,30);
        frame.add(label1);
        JCheckBox checkBox=new JCheckBox("Java");
        checkBox.setBounds(50,60,60,30);
        frame.add(checkBox);
        JCheckBox checkBox2=new JCheckBox("c++");
        checkBox2.setBounds(50,90,90,30);
        frame.add(checkBox2);
        JRadioButton rb1=new JRadioButton("python");
        rb1.setBounds(50,120,90,30);
        frame.add(rb1);
        JRadioButton rb2=new JRadioButton("c");
        rb2.setBounds(50,150,90,30);
        frame.add(rb2);
        String data[]={"java","c++","python","c"};
        JComboBox comboBox=new JComboBox(data);
        comboBox.setBounds(50,180,100,30);
        frame.add(comboBox);


    }
    
}
