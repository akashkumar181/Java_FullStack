package GUI;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu {
  public static void main(String[] args) {
    JFrame frame1=new JFrame("Main ");
    frame1.setSize(400,400);
   
    JMenuBar mb=new JMenuBar();
    JMenu menu,submenu;
    JMenuItem i1,i2,i3,i4,i5;
    menu=new JMenu("Menu");
    submenu=new JMenu("Submenu");
    i1=new JMenuItem("Item 1");
    i2=new JMenuItem("Item 2");
    i3=new JMenuItem("Item 3");
    i4=new JMenuItem("Item 4");
    i5=new JMenuItem("Item 5");
    menu.add(i1);
    menu.add(i2);
    menu.add(i3);
   
    submenu.add(i4);
    submenu.add(i5);
    menu.add(submenu);
    mb.add(menu);
    frame1.setJMenuBar(mb);
    frame1.setVisible(true);
   
         
    



  }  
}
