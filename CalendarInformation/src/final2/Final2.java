/* 
Christian Medina
Professor Ahmadnia
Number 2
This program uses a menu bar for the user to select a season followed by a month. When a month is selected an image correlating to the month is displayed along with a small description about the month.
*/
package final2;
import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Final2 extends Applet implements ActionListener{
    Image img;
    String pic[]={"January.jpg","February.png","March.png","April.jpg","May.png","June.png","July.png","August.png","September.jpg","October.jpg","November.png","December.jpg"};
    Frame frmMenu=new Frame("Final");
    JLabel lblImage=new JLabel();
    MenuBar mnuMain=new MenuBar();
    Menu 
            mnuSpr=new Menu("Spring"),
            mnuSum=new Menu("Summer"),
            mnuFal=new Menu("Fall"),
            mnuWin=new Menu("Winter");
    MenuItem
            mnu1=new MenuItem("January"),
            mnu2=new MenuItem("February"),
            mnu3=new MenuItem("March"),
            mnu4=new MenuItem("April"),
            mnu5=new MenuItem("May"),
            mnu6=new MenuItem("June"),
            mnu7=new MenuItem("July"),
            mnu8=new MenuItem("August"),
            mnu9=new MenuItem("September"),
            mnu10=new MenuItem("October"),
            mnu11=new MenuItem("November"),
            mnu12=new MenuItem("December");
    TextArea
            txta=new TextArea();
    public void createInterface()
    {
        mnuMain.add(mnuSpr);
        mnuSpr.addActionListener(this);
        mnuSpr.add(mnu4);
        mnuSpr.add(mnu5);
        mnuSpr.add(mnu6);
        mnuMain.add(mnuSum);
        mnuSum.addActionListener(this);
        mnuSum.add(mnu7);
        mnuSum.add(mnu8);
        mnuSum.add(mnu9);
        mnuMain.add(mnuFal);
        mnuFal.addActionListener(this);
        mnuFal.add(mnu10);
        mnuFal.add(mnu11);
        mnuFal.add(mnu12);
        mnuMain.add(mnuWin);
        mnuWin.addActionListener(this);
        mnuWin.add(mnu1);
        mnuWin.add(mnu2);
        mnuWin.add(mnu3);
        frmMenu.setMenuBar(mnuMain); 
        mnu1.addActionListener(this);
        mnu2.addActionListener(this);
        mnu3.addActionListener(this);
        mnu4.addActionListener(this);
        mnu5.addActionListener(this);
        mnu6.addActionListener(this);
        mnu7.addActionListener(this);
        mnu8.addActionListener(this);
        mnu9.addActionListener(this);
        mnu10.addActionListener(this);
        mnu11.addActionListener(this);
        mnu12.addActionListener(this);
        txta.setBounds(260,250,325,200);
        frmMenu.add(txta);
        lblImage.setBounds(50,50,100,100);
        frmMenu.add(lblImage);
        frmMenu.setVisible(true);
        frmMenu.setSize(600,500);
    }
    public void actionPerformed(ActionEvent e)
    {
        String strMenuItem=e.getActionCommand();
        if(strMenuItem.equals("January"))//jan
        {
            txta.setText(" ");
            lblImage.setIcon(new ImageIcon(getClass().getResource(pic[0])));
            txta.append("January is the first month of the year\n in the Julian and Gregorian calendars and the first\n month to have the length of 31 days.\nThe first day of the month is known as\n New Year's Day.");

        }
        else if(strMenuItem.equals("February"))//feb
        {
            txta.setText(" ");
            lblImage.setIcon(new ImageIcon(getClass().getResource(pic[1])));
            txta.append("February is the second month of the year\n in the Julian and Gregorian calendars.\n The month has 28 days in \ncommon years or 29 days in leap years, with the \nquadrennial 29th day being called the \"leap day.\"");
        }
        else if(strMenuItem.equals("March"))//mar
        {
            txta.setText(" ");
            lblImage.setIcon(new ImageIcon(getClass().getResource(pic[2])));
            txta.append("March is the third month of the year\n in both the Julian and Gregorian calendars.\n It is the second month to have a\n length of 31 days. In the Northern Hemisphere,\n the meteorological beginning of spring\n occurs on the first day of March.");
        }
        else if(strMenuItem.equals("April"))//apr
        {
            txta.setText(" ");
            lblImage.setIcon(new ImageIcon(getClass().getResource(pic[3])));
            txta.append("April is the fourth month of the year\n in the Gregorian calendar, the fifth in the early\n Julian and the first month to have the length of 30 days.\n And it is the spring in the northern\n hemisphere and autumn in the southern hemisphere.");

        }
        else if(strMenuItem.equals("May"))//may
        {
            txta.setText(" ");
            lblImage.setIcon(new ImageIcon(getClass().getResource(pic[4])));
            txta.append("May is the fifth month of the year\n in the Julian and Gregorian Calendars.\n May in the Southern Hemisphere is the seasonal\n equivalent of November in the Northern Hemisphere\n and vice versa.");

        }
        else if(strMenuItem.equals("June"))//jun
        {
            txta.setText(" ");
            lblImage.setIcon(new ImageIcon(getClass().getResource(pic[5])));
            txta.append("June is the sixth month of the year\n in the Julian and Gregorian calendars and the\n second month to have the length of 30 days.\n June contains the summer solstice in the Northern\n Hemisphere, the day with the most daylight hours,\n and the winter solstice\n in the Southern Hemisphere.");

        }
        else if(strMenuItem.equals("July"))//jul
        {
            txta.setText(" ");
            lblImage.setIcon(new ImageIcon(getClass().getResource(pic[6])));
            txta.append("July is the seventh month of the year\n in the Julian and Gregorian Calendars and the fourth\n month to have the length of 31 days. It was\n named by the Roman Senate in honor of the\n Roman general, Julius Caesar, it being the\n month of his birth.\n Prior to that, it was called Quintilis.");

        }
        else if(strMenuItem.equals("August"))//aug
        {
            txta.setText(" ");
            lblImage.setIcon(new ImageIcon(getClass().getResource(pic[7])));
            txta.append("August is the eighth month of the year\n in the Julian and Gregorian calendars and the fifth\n month to have the length of 31 days.\n In the Southern Hemisphere, August is\n the seasonal equivalent of February\n in the Northern Hemisphere.");

        }
        else if(strMenuItem.equals("September"))//sep
        {
            txta.setText(" ");
            lblImage.setIcon(new ImageIcon(getClass().getResource(pic[8])));
            txta.append("September is the ninth month of the year\n in the Julian and Gregorian calendars and the third\n month to have the length of 30 days. September in the\n Northern Hemisphere is the seasonal equivalent\n of March in the Southern Hemisphere.");

        }
        else if(strMenuItem.equals("October"))//oct
        {
            txta.setText(" ");
            lblImage.setIcon(new ImageIcon(getClass().getResource(pic[9])));
            txta.append("October is the tenth month of the year\n in the Julian and Gregorian Calendars and the sixth\n month to have the length of 31 days.\n The eighth month in the old Roman calendar,\n October retained its name after January\n and February were inserted into the calendar that\n had originally been created by the Romans.");

        }
        else if(strMenuItem.equals("November"))//nov
        {
            txta.setText(" ");
            lblImage.setIcon(new ImageIcon(getClass().getResource(pic[10])));
            txta.append("November is the eleventh and penultimate month of\n the year in the Julian and Gregorian Calendars and\n the fourth and last month to have\n the length of 30 days.\n November was the ninth month\n of the ancient Roman calendar.");

        }
        else if(strMenuItem.equals("December"))//dec
        {
            txta.setText(" ");
            lblImage.setIcon(new ImageIcon(getClass().getResource(pic[11])));
            txta.append("December is the twelfth and last month of the year\n in the Julian and Gregorian Calendars.\n It is the seventh and last month to have\n the length of 31 days.December got its name because\n it was originally the tenth month of the\n year in the Roman calendar.");

        }
    }
    public static void main(String args[])
    {
        Final2 myMenu=new Final2();
        myMenu.createInterface();
    }
    public void paint(Graphics g)
    {
        g.drawImage(img,50,250,100,100,this); 
    }
}