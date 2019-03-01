/* 
Christian Medina
Professor Ahmadnia
Number 1
This program gives the user the option of 9 rental cars and allows them to reserve the car of their choice. Once the amount of days has been selected, a report is printed.
*/
package final1;
import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Final1 extends Applet implements ActionListener, ItemListener, AdjustmentListener{
    Label
            lblTitle=new Label("Avis Rent a Car"),
            lblType=new Label("Type of Cars:"),
            lblSub=new Label("Subcompacts (Hyundai Accent or similar). $24.95/day"),
            lblInter=new Label("Intermediate (Chevy Cruze or similar). $30.95/day"),
            lblFull=new Label("Full size (Chrysler, Impala or similar). $35.95/day"),
            lblDay=new Label("Number of days (1-7)"),
            lblSelect=new Label("Selected Car");
    Button
            btnNext1=new Button("Next Car >>"),
            btnNext2=new Button("Next Car >>"),
            btnNext3=new Button("Next Car >>"),
            btnRes1=new Button("Reserve"),
            btnRes2=new Button("Reserve"),
            btnRes3=new Button("Reserve"),
            btnReport=new Button("Press to see report");
    Image
            img1,Rimg1,
            img2,Rimg2,
            img3,Rimg3;
    Choice
            ch=new Choice();
    TextArea
            txta=new TextArea(50,TextArea.SCROLLBARS_VERTICAL_ONLY);
    int index1=0,index2=0,index3=0,type=0,mod=0;
    double total=0;
    public void init()
    {
        setLayout(null);
        resize(750,750);
        txta.setBounds(450,600,250,145);
        add(txta);
        btnReport.setBounds(200,625,150,30);
        add(btnReport);
        btnNext1.setBounds(360,100,75,30);
        add(btnNext1);
        btnNext2.setBounds(360,275,75,30);
        add(btnNext2);
        btnNext3.setBounds(360,450,75,30);
        add(btnNext3);
        btnRes1.setBounds(360,150,75,30);
        add(btnRes1);
        btnRes2.setBounds(360,325,75,30);
        add(btnRes2);
        btnRes3.setBounds(360,500,75,30);
        add(btnRes3);
        lblTitle.setBounds(350,20,100,20);
        add(lblTitle);
        lblType.setBounds(10,40,100,20);
        add(lblType);
        lblSelect.setBounds(575,75,50,20);
        add(lblSelect);
        lblDay.setBounds(10,600,200,20);
        add(lblDay);
        lblFull.setBounds(10,425,300,20);
        add(lblFull);
        lblInter.setBounds(10,250,300,20);
        add(lblInter);
        lblSub.setBounds(10,75,300,20);
        add(lblSub);
        String[] chItems = {"1","2","3","4","5","6","7"}; 
        for (int i = 0; i < chItems.length;++i)
            ch.add(chItems[i]);
        ch.setBounds(30,625,50,50); 
        ch.addItemListener(this);
        add(ch);
        btnNext1.addActionListener(this);
        btnNext2.addActionListener(this);
        btnNext3.addActionListener(this);
        btnRes1.addActionListener(this);
        btnRes2.addActionListener(this);
        btnRes3.addActionListener(this);
        btnReport.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnNext1)
        {
            if(index1==0)
            {
                img1 = getImage(this.getClass().getResource("Fit.jpg"));
                index1++;
                repaint();
            }
            else if(index1==1)
            {
                img1 = getImage(this.getClass().getResource("Rio.jpg"));
                index1++;
                repaint();
            }
            else if(index1==2)
            {
                img1 = getImage(this.getClass().getResource("Accent.png"));
                index1=0;
                repaint();
            }
        }
        if(e.getSource()==btnNext2)
        {
            if(index2==0)
            {
                img2 = getImage(this.getClass().getResource("Accord.jpg"));
                index2++;
                repaint();
            }
            else if(index2==1)
            {
                img2 = getImage(this.getClass().getResource("Cruze.png"));
                index2++;
                repaint();
            }
            else if(index2==2)
            {
                img2 = getImage(this.getClass().getResource("Escape.png"));
                index2=0;
                repaint();
            }
        }
        if(e.getSource()==btnNext3)
        {
            if(index3==0)
            {
                img3 = getImage(this.getClass().getResource("300.jpg"));
                index3++;
                repaint();
            }
            else if(index3==1)
            {
                img3 = getImage(this.getClass().getResource("Audi.jpg"));
                index3++;
                repaint();
            }
            else if(index3==2)
            {
                img3 = getImage(this.getClass().getResource("Impala.jpg"));
                index3=0;
                repaint();
            }
        }
        if(e.getSource()==btnRes1)
        {
            if(index1==1)
            {
                Rimg1 = getImage(this.getClass().getResource("Fit.jpg"));
                Rimg2 = getImage(this.getClass().getResource(""));
                Rimg3 = getImage(this.getClass().getResource(""));
                type=1;
                mod=1;
                repaint();
            }
            else if(index1==2)
            {
                Rimg1 = getImage(this.getClass().getResource("Rio.jpg"));
                Rimg2 = getImage(this.getClass().getResource(""));
                Rimg3 = getImage(this.getClass().getResource(""));
                type=1;
                mod=2;
                repaint();
            }
            else if(index1==0)
            {
                Rimg1 = getImage(this.getClass().getResource("Accent.png"));
                Rimg2 = getImage(this.getClass().getResource(""));
                Rimg3 = getImage(this.getClass().getResource(""));
                type=1;
                mod=3;
                repaint();
            }
        }
        if(e.getSource()==btnRes2)
        {
            if(index2==1)
            {
                Rimg1 = getImage(this.getClass().getResource(""));
                Rimg2 = getImage(this.getClass().getResource("Accord.jpg"));
                Rimg3 = getImage(this.getClass().getResource(""));
                type=2;
                mod=4;
                repaint();
            }
            else if(index2==2)
            {
                Rimg1 = getImage(this.getClass().getResource(""));
                Rimg2 = getImage(this.getClass().getResource("Cruze.png"));
                Rimg3 = getImage(this.getClass().getResource(""));
                type=2;
                mod=5;
                repaint();
            }
            else if(index2==0)
            {
                Rimg1 = getImage(this.getClass().getResource(""));
                Rimg2 = getImage(this.getClass().getResource("Escape.png"));
                Rimg3 = getImage(this.getClass().getResource(""));
                type=2;
                mod=6;
                repaint();
            }
        }
        if(e.getSource()==btnRes3)
        {
            if(index3==1)
            {
                Rimg1 = getImage(this.getClass().getResource(""));
                Rimg2 = getImage(this.getClass().getResource(""));
                Rimg3 = getImage(this.getClass().getResource("300.jpg"));
                type=3;
                mod=7;
                repaint();
            }
            else if(index3==2)
            {
                Rimg1 = getImage(this.getClass().getResource(""));
                Rimg2 = getImage(this.getClass().getResource(""));
                Rimg3 = getImage(this.getClass().getResource("Audi.jpg"));
                type=3;
                mod=8;
                repaint();
            }
            else if(index3==0)
            {
                Rimg1 = getImage(this.getClass().getResource(""));
                Rimg2 = getImage(this.getClass().getResource(""));
                Rimg3 = getImage(this.getClass().getResource("Impala.jpg"));
                type=3;
                mod=9;
                repaint();
            }
        }
        if(e.getSource()==btnReport)
        {
            txta.append("Car Type: ");
            if(type==1)
            {
                txta.append("Subcompact\n");
                total=24.95;
            }
            else if(type==2)
            {
                txta.append("Intermediate\n");
                total=30.95;
            }
            else if(type==3)
            {
                txta.append("Full Size\n");
                total=35.95;
            }
            txta.append("Car Model: ");
            if(mod==1)
            {
                txta.append("Honda Fit\n");
            }
            else if(mod==2)
            {
                txta.append("Kia Rio\n");
            }
            else if(mod==3)
            {
                txta.append("Hyundai Accent\n");
            }
            else if(mod==4)
            {
                txta.append("Honda Accord\n");
            }
            else if(mod==5)
            {
                txta.append("Chevy Cruze\n");
            }
            else if(mod==6)
            {
                txta.append("Ford Escapse\n");
            }
            else if(mod==7)
            {
                txta.append("Chrysler 300\n");
            }
            else if(mod==8)
            {
                txta.append("Audi A7\n");
            }
            else if(mod==9)
            {
                txta.append("Chevy Impala\n");
            }
            txta.append("No. of days: ");
            int index6 = ch.getSelectedIndex();
            String item = ch.getItem(index6);
            if(item.equals("1"))
            {
                txta.append("1");
                total=total*1;
            }
            else if (item.equals("2"))
            {
                txta.append("2");
                total=total*2;
            }
            else if (item.equals("3"))
            {
                txta.append("3");
                total=total*3;
            }
            else if (item.equals("4"))
            {
                txta.append("4");
                total=total*4;
            }
            else if (item.equals("5"))
            {
                txta.append("5");
                total=total*5;
            }
            else if (item.equals("6"))
            {
                txta.append("6");
                total=total*6;
            }
            else if (item.equals("7"))
            {
                txta.append("7");
                total=total*7;
            }
            txta.append("\nTotal Pay: $"+total);
        }
    }
    public void paint(Graphics g)
    {
        g.drawImage(img1,10,100,175,140,this);
        g.drawImage(img2,10,275,175,140,this);
        g.drawImage(img3,10,450,175,140,this);
        g.drawImage(Rimg1,475,100,175,140,this);
        g.drawImage(Rimg2,475,275,175,140,this);
        g.drawImage(Rimg3,475,450,175,140,this);
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
