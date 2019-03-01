package checkbox;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class CheckBox extends Applet implements ActionListener {
    Checkbox chkBold=new Checkbox("Bold"),
            chkItalic=new Checkbox("Italic"),
            chkBoldItalic=new Checkbox("Italic Bold");
    //creating radio buttons
    CheckboxGroup cbg=new CheckboxGroup();
    Checkbox 
            opRed=new Checkbox("Red",cbg,false),
            opBlue=new Checkbox("Blue",cbg,false),
            opGreen=new Checkbox("Green",cbg,false);
    TextField
            txtf=new TextField("Hello World");
    Button
            btnShow=new Button("Show");
    Font
            fBold=new Font("Times New Roman",Font.BOLD,14),
            fItalic=new Font("Times New Roman",Font.ITALIC,14),
            fBoldItalic=new Font("Times New Roman",Font.ITALIC+Font.BOLD,12);
    public void init()
    {
        //place the components in applet
        setLayout(null);
        chkBold.setLocation(10,10);
        chkBold.setSize(90,20);
        add(chkBold);
        chkItalic.setLocation(10,50);
        chkItalic.setSize(90,20);
        add(chkItalic);
        chkBoldItalic.setLocation(10,90);
        chkBoldItalic.setSize(90,20);
        opRed.setLocation(110,10);
        opRed.setSize(90,20);
        add(opRed);
        opBlue.setLocation(110,50);
        opBlue.setSize(90,20);
        add(opBlue);
        opGreen.setLocation(110,90);
        opGreen.setSize(90,20);
        add(opGreen);
        txtf.setLocation(10,110);
        txtf.setSize(90,20);
        add(txtf);
        btnShow.setLocation(120,110);
        btnShow.setSize(60,30);
        add(btnShow);
        btnShow.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(chkBold.getState()==true && chkItalic.getState()==true)//if bold box is on or off
        {
            txtf.setFont(fBoldItalic);
        }
        else if(chkItalic.getState()==true)
        {
            txtf.setFont(fItalic);
        }
        else if(chkBold.getState()==true)
        {
            txtf.setFont(fBold);
        }
        if(opRed.getState()==true)
        {
            txtf.setForeground(Color.red);
        }
        else if(opBlue.getState()==true)
        {
            txtf.setForeground(Color.blue);
        }
        else if(opGreen.getState()==true)
        {
            txtf.setForeground(Color.green);
        }
        txtf.setText("Hello World");
    }
}