package GUI;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class tree {
    public static void main(String[] args) {
        JFrame frame2=new JFrame("Main");
        frame2.setSize(400,400);
        frame2.setVisible(true);
        DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color=new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode font=new DefaultMutableTreeNode("Font");
        style.add(color);
        style.add(font);
        DefaultMutableTreeNode r=new DefaultMutableTreeNode("Red");
        DefaultMutableTreeNode b=new DefaultMutableTreeNode("Blue");
        DefaultMutableTreeNode g=new DefaultMutableTreeNode("Green");
        DefaultMutableTreeNode bl=new DefaultMutableTreeNode("Black");
        DefaultMutableTreeNode italic=new DefaultMutableTreeNode("Italic");
        DefaultMutableTreeNode bold=new DefaultMutableTreeNode("Bold");
        color.add(r);
        color.add(b);
        color.add(g);
        color.add(bl);
        font.add(italic);
        font.add(bold);
       JTree jt=new JTree(style);
       frame2.add(jt);
        

    }
}
