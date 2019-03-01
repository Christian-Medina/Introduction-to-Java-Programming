package listbox;
import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
Lists
allow you to set up a list of items from which the user can make a selection
List components
    List()
    List(int rows)
    List(int rows,boolean mode)
        mode=true formultiple selections false for single
Adding items to List
    List lst1=new List(3);
    lst1.add(item); or lst1.add(item,int position);
more about lists
    NOTE the index of the first item in the list is zero
    int n=lst1.getItemCount();//n=number of items in lst1
    String st=lst1.getItem(int index);//st=iem at position index
    String st=lst1.getSelectedItem();//st=selected item in the list
    lst1.removeAll();//clear list
Remove seleced items
    pos=lst1.getSelectedIndex();//find the index of seleted item
    lst1.remove(int pos);//remove item at position pos
    lst1.remove(String item);//remove item from the list
*/
public class Listbox extends Applet implements ActionListener{
    //create components
    List lst1=new List(3);//display 3 items at a time
    TextField
            txtf=new TextField();
    Button
            btnDisplay=new Button("Display"),
            btnRemove=new Button("Remove");
    public void init()
    {
        //place components
        setLayout(null);
        txtf.setBounds(10,10,100,30);
        add(txtf);
        btnDisplay.setBounds(120,10,60,30);
        add(btnDisplay);
        btnRemove.setBounds(180,10,60,30);
        add(btnRemove);
        lst1.setBounds(10,50,100,50);
        add(lst1);
        //add the list items
        String[] items={"One","Two","Three","Four","Five","Six"};
        for(int i=0;i<items.length;i++)
        {
            lst1.add(items[i],i);
        }
        /*
        or fill the list one item at a time
        lst1.add("One");
        lst1.add("Two");
        */
        btnDisplay.addActionListener(this);
        btnRemove.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnDisplay)
        {
            String item=lst1.getSelectedItem();//select the highlighted item from the list
            txtf.setText(item);
        }
        else if(e.getSource()==btnRemove)
        {
            int pos=lst1.getSelectedIndex();//get the index of the highlighted item
            lst1.remove(pos);
        }
    }
}