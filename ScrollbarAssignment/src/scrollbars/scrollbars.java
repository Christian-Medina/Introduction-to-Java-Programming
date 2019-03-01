/*
Scrollbars

Creating scrollbar: Scrollbar sb1 = newScrollbar(direction, v1, v2, v3, v4);
    Direction: 0 for horizontal and 1 for vertical scrollbar
    v1=initial position of thumb v2= width of the thumb
    v3=minimum value of scrollbar v4=maxmimu value of scrollbar
Add it to applet: add(sb1), attach a listener to the scrollbar: sb1.addAdjustmentListener(this);
Return current value of the bar: int n=sb1.getValue();
Change the value of the bar: sb1.setValue(int value);
*/
package scrollbars;

import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;


    public class scrollbars extends Applet implements ActionListener, 
            ItemListener, AdjustmentListener
    {
        // create components
        Scrollbar
                sb1 = new Scrollbar(0,10,10,0,210),
                sb2 = new Scrollbar(0,10,10,0,210);
        TextField
                txtfNum1 = new TextField(),
                txtfNum2 = new TextField(),
                txtfResult = new TextField();
        Button
                btnOpp = new Button("    ");
        
        Choice ch = new Choice();
        int n1, n2;
        String opp;
        
        public void init()
        {
            // add components to applet
            setLayout(null);
            sb1.setBounds(50,10,200,20);
            add(sb1);
            txtfNum1.setBounds(260,10,30,20);
            add(txtfNum1);
            
            sb2.setBounds(50,50,200,20);
            add(sb2);
            txtfNum2.setBounds(260,50,30,20);
            add(txtfNum2);
            
            txtfResult.setBounds(90,90,200,20);
            add(txtfResult);
            btnOpp.setBounds(50,90,30,20);
            add(btnOpp);
            
            btnOpp.addActionListener(this);
            sb1.addAdjustmentListener(this);
            sb2.addAdjustmentListener(this);
            
            // add items to dropdown menu
            String[] chItems = {"Sum","Subtract","times"};
            
            for (int i = 0; i < chItems.length;++i)
                ch.add(chItems[i]);
            ch.setBounds(50,140,200,50); // add the choice menu to the applet
            ch.addItemListener(this);
            add(ch);
        }
        
        public void actionPerformed(ActionEvent e) // for the button 
        {
            if (e.getSource() == btnOpp)
            {
                String num1 = txtfNum1.getText();
                String num2 = txtfNum2.getText();
                n1 = Integer.parseInt(num1);
                n2 = Integer.parseInt(num2);
                switch (opp)
                {
                    case"+":txtfResult.setText(num1+"+"+num2+"="+
                            Integer.toString((n1+n2)));
                            break;
                    case"-":txtfResult.setText(num1+"-"+num2+"="+
                            Integer.toString((n1-n2)));
                            break;
                    case"*":txtfResult.setText(num1+"*"+num2+"="+
                            Integer.toString((n1*n2)));
                            break;
                }
        }
    }
        
        public void adjustmentValueChanged(AdjustmentEvent a) // for the scrollbars
        {
            if (a.getSource() == sb1)
                txtfNum1.setText(Integer.toString(sb1.getValue()));
            else
                txtfNum2.setText(Integer.toString(sb2.getValue()));
        }
        
        public void itemStateChanged(ItemEvent i) // for choice list
        {
            if(i.getSource() == ch)
            {
                int index = ch.getSelectedIndex();
                String item = ch.getItem(index);
                if(item.equals("Sum"))
                {
                    opp = "+";
                    btnOpp.setLabel("+");
                }
                else if (item.equals("Subtract"))
                {
                    opp = "-";
                    btnOpp.setLabel("-");
                }
                else
                {
                    opp = "*";
                    btnOpp.setLabel("*");
                }
            }
        }
    
}