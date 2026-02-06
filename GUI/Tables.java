package GUI;

import javax.swing.JFrame;
import javax.swing.JTable;

public class Tables {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Welcome to the world of java...");
        frame.setVisible(true); 
        frame.setLayout(null);
        frame.setSize(400, 300);
        String column[]={"ID","Name","Salary"};
        String data[][]={{"101","Akash","100000"},
                         {"102","Mohan","10000"},
                          {"103","Vikash","50000"},
                        {"104","Gita","50000"}};
    JTable table=new JTable(data,column);
    table.setBounds(300,200,300,300);
    frame.add(table);
    }
}
