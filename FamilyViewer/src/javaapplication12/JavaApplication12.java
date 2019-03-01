package javaapplication12;
import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.Date;
public class JavaApplication12 extends Applet implements ActionListener, ItemListener, AdjustmentListener{
    List 
            lst1=new List(10);
    TextArea
            txta=new TextArea(4,50);
    TextField
            txtf=new TextField(); 
    Label
            lblTitle=new Label("My Family Album"),
            lblDesc=new Label("Image Description");
    Button
            btnDesc=new Button("Show description"),
            btnNext=new Button(">>>"),
            btnPrev=new Button("<<<");
    Scrollbar
            sb1 = new Scrollbar(0,10,10,0,210);

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void init()
    {
        //place components
        setLayout(null);
        resize(750,500);
        txta.setBounds(450,120,200,100);
        add(txta);
        lblTitle.setBounds(500,50,300,20);
        add(lblTitle);
        lblDesc.setBounds(500,70,120,20);
        add(lblDesc);
        btnDesc.setBounds(275,150,100,20);
        add(btnDesc);
        btnPrev.setBounds(50,50,50,20);
        add(btnPrev);
        btnNext.setBounds(150,50,50,20);
        add(btnNext);
        sb1.setBounds(50,90,150,20);
        add(sb1);
        sb1.addAdjustmentListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    /*public void adjustmentValueChanged(AdjustmentEvent a) // for the scrollbars
    {
        if (a.getSource() == sb1)
            txtfNum1.setText(Integer.toString(sb1.getValue()));
        else
            txtfNum2.setText(Integer.toString(sb2.getValue()));
    }*/