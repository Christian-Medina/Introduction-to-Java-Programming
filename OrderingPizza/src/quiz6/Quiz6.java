/* 
Christian Medina
Professor Ahmadnia
Quiz 6
This program displays pizza so that the user can choose and input their information. A report of the order is then shown.
*/
package quiz6;
import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.Date;
import java.lang.Math;
public class Quiz6 extends Applet implements ActionListener, ItemListener, AdjustmentListener{
    Calendar 
            c = Calendar.getInstance();
    int day = c.get(Calendar.DATE);
    int month = c.get(Calendar.MONTH)+1;
    int year = c.get(Calendar.YEAR);  
    int hour = c.get(Calendar.HOUR);
    int min = c.get(Calendar.MINUTE);
    int sec = c.get(Calendar.SECOND);   
    Date 
            todayDate = new Date();
    long currentTime = c.getTimeInMillis();
    TextArea
            txta=new TextArea(10,100);
    TextArea
            txta2=new TextArea(50,TextArea.SCROLLBARS_NONE);
    TextField
            txtfName=new TextField(),
            txtfPhone=new TextField();
    CheckboxGroup cbg=new CheckboxGroup();
    Checkbox 
            opSm=new Checkbox("10",cbg,false),
            opMed=new Checkbox("12",cbg,false),
            opLar=new Checkbox("14",cbg,false);
    Label
            lblTitle=new Label("Domino's Pizza"),
            lblDate=new Label("Today's date: "+month+"/"+day+"/"+year),
            lblChoice=new Label("Choose your pizza (Basic $7.00)"),
            lblCrust=new Label("Select the Crust (0.50 extra)"),
            lblSize=new Label("Select size ($1.00,$2.00,$3.00 extra)"),
            lblNum=new Label("Number of Pizzas"),
            lblName = new Label("Your Name"),
            lblPhone = new Label("Phone Number");
    Button
            btnOrder=new Button("Click to order"),
            btnNext=new Button(">>>"),
            btnChoice=new Button("Next"),
            btnPrev=new Button("<<<");
    Choice 
            ch =new Choice(),
            ch2=new Choice();
    int index=0,choice=0,Rchoice=0,i=1;
    double total=0;
    Image
            img,img2;
    public void init()
    {
        setLayout(null);
        resize(600,550);
        lblTitle.setBounds(200,25,100,20);
        add(lblTitle);
        lblDate.setBounds(175,50,200,20);
        add(lblDate);
        lblChoice.setBounds(175,75,200,20);
        add(lblChoice);
        lblCrust.setBounds(20,225,200,20);
        add(lblCrust);
        lblSize.setBounds(300,225,200,20);
        add(lblSize);
        lblNum.setBounds(50,300,100,20);
        add(lblNum);
        lblName.setBounds(250,300,100,20);
        add(lblName);
        lblPhone.setBounds(450,300,100,20);
        add(lblPhone);
        btnNext.setBounds(230,100,40,30);
        add(btnNext);
        btnPrev.setBounds(230,175,40,30);
        add(btnPrev);
        btnChoice.setBounds(75,50,50,30);
        add(btnChoice);
        btnOrder.setBounds(75,375,450,20);
        add(btnOrder);
        txtfName.setBounds(250,325,100,25);
        add(txtfName);
        txtfPhone.setBounds(450,325,100,25);
        add(txtfPhone);
        txta.setBounds(75,400,450,120);
        add(txta);
        txta2.setBounds(235,135,40,40);
        add(txta2);     
        opSm.setLocation(300,250);
        opSm.setSize(50,20);
        add(opSm);
        opMed.setLocation(375,250);
        opMed.setSize(50,20);
        add(opMed);
        opLar.setLocation(450,250);
        opLar.setSize(50,20);
        add(opLar);      
        String[] chItems = {"Hand Tossed","Pan","New York"}; 
        for (int i = 0; i < chItems.length;++i)
            ch.add(chItems[i]);
        ch.setBounds(20,250,200,50); // add the choice menu to the applet
        ch.addItemListener(this);
        add(ch);
        String[] chItems2 = {"1","2","3"}; 
        for (int i = 0; i < chItems2.length;++i)
            ch2.add(chItems2[i]);
        ch2.setBounds(50,325,50,50); // add the choice menu to the applet
        ch2.addItemListener(this);
        add(ch2);       
        btnNext.addActionListener(this);
        btnPrev.addActionListener(this);
        btnOrder.addActionListener(this);
        btnChoice.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) // for the button 
    {
        String line, strName, strPhone;
        if(e.getSource()==btnChoice)
        {
            if(index==0)
            {
                txta2.append("   ");
                img = getImage(this.getClass().getResource("Cheese.png"));
                txta2.append("1");
                index++;
                repaint();
            }
            else if(index==1)
            {
                txta2.append("   ");
                img=getImage(this.getClass().getResource("Pepperoni.jpg"));
                txta2.append("2");
                index++;
                repaint();
            }
            else if(index==2)
            {
                txta2.append("   ");
                img=getImage(this.getClass().getResource("Supreme.jpg"));
                txta2.append("3");
                index=0;
                repaint();
            }
        }
        if(e.getSource()==btnNext)
        {
            if(index==1)
            {
                choice=0;
                img2=getImage(this.getClass().getResource("Cheese.png"));
                repaint();
            }
            else if(index==2)
            {
                choice=1;
                img2=getImage(this.getClass().getResource("Pepperoni.jpg"));
                repaint();
            }
            else if(index==0)
            {
                choice=2;
                img2=getImage(this.getClass().getResource("Supreme.jpg"));
                repaint();
            }
        }
        if(e.getSource()==btnPrev)
        {
            img2=getImage(this.getClass().getResource(""));
            choice=0;
            total=0;
            repaint();
        }
        if(e.getSource()==btnOrder)
        {
            strName=txtfName.getText();
            strPhone=txtfPhone.getText();
            line=strName+", "+strPhone+"\n";//name and phone number
            txta.append(line);
            if(choice==0)//pizza type
            {
                txta.append("Basic Pizza type: 1\t7.00\n");
                total=total+7.00;
            }
            else if(choice==1)//pizza type
            {
                txta.append("Basic Pizza type: 2\t8.00\n");
                total=total+8.00;
            }
            else if(choice==2)//pizza type
            {
                txta.append("Basic Pizza type: 3\t9.00\n");
                total=total+9.00;
            }
            int index1 = ch.getSelectedIndex();
            String item = ch.getItem(index1);
            if(item.equals("Hand Tossed"))//crust type
            {
                txta.append("Crust:\tHand Tossed\t0.05\n");
                total=total+.05;
            }
            else if (item.equals("Pan"))
            {
                txta.append("Crust:\tPan\t0.05\n");
                total=total+.05;
            }
            else if (item.equals("New York"))
            {
                txta.append("Crust:\tNew York\t0.05\n");
                total=total+.05;
            }
            txta.append("Size:\t");
            if(opSm.getState()==true)
            {
                txta.append("10 inches\t1.00\n");
                total=total+1.00;
            }
            else if(opMed.getState()==true)
            {
                txta.append("12 inches\t2.00\n");
                total=total+2.00;
            }
            else if(opLar.getState()==true)
            {
                txta.append("14 inches\t3.00\n");
                total=total+3.00;
            }
            int index2 = ch2.getSelectedIndex();
            String item2 = ch2.getItem(index2);
            if(item2.equals("1"))//crust type
            {
                txta.append("Number of pizzas 1\n");
            }
            else if (item2.equals("2"))
            {
                txta.append("Number of pizzas 2\n");
                total=total*2;
            }
            else if (item2.equals("3"))
            {
                txta.append("Number of pizzas 3\n");
                total=total*3;
            }
            txta.append("Total $"+total+"0");
        }
    }
    public void paint(Graphics g)
    {
        g.drawImage(img,75,100,80,90,this);
        g.drawImage(img2,325,100,80,90,this);
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