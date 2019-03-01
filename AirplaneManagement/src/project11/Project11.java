package project11;
import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Project11 extends Applet implements ActionListener, ItemListener, AdjustmentListener {
        List lst1=new List();
        List lst2=new List();
    Label
            lblTitle=new Label("Chip Tickets Agency"),
            lblDepart=new Label("Depart"),
            lblArrive=new Label("Arrive"),
            lblCity=new Label("City/Airport"),
            lblAir=new Label("City/Airport"),
            lblName=new Label("Name"),
            lblPhone=new Label("Phone Number"),
            lblNum=new Label("Number of Tickets"),
            lblTick=new Label("Type of Tickets"),
            lblConf=new Label("Confirmation");
    TextField
            txtName=new TextField(),
            txtPhone=new TextField();
    Button
            btnBuy=new Button("Buy Ticket(s)");
    public void init()
    {
        resize(500,500);
        //place components
        setLayout(null);
        lblTitle.setBounds(150,20,150,20);
        add(lblTitle);
        lblDepart.setBounds(70,55,150,20);
        add(lblDepart);
        lblArrive.setBounds(220,55,150,20);
        add(lblArrive);
        lblCity.setBounds(70,75,150,20);
        add(lblCity);
        lblAir.setBounds(220,75,150,20);
        add(lblAir);
        lblName.setBounds(375,130,150,20);
        add(lblName);
        lblPhone.setBounds(355,180,150,20);
        add(lblPhone);
        lblNum.setBounds(50,260,150,20);
        add(lblNum);
        lblTick.setBounds(50,310,150,20);
        add(lblTick);
        lblConf.setBounds(300,310,150,20);
        add(lblConf);
        txtName.setBounds(350,150,100,30);
        add(txtName);
        txtPhone.setBounds(350,200,100,30);
        add(txtPhone);
        btnBuy.setBounds(50,425,100,30);
        add(btnBuy);
        lst1.setBounds(50,100,100,150);
        add(lst1);
        lst2.setBounds(200,100,100,150);
        add(lst2);
        //add the list Depart
        String[] Depart={"LAX","Ontario","Fullerton","John Wayne","La Verne"};
        String[] Arrive={"New York","Paris","London","Las Vegas","Hawaii","Dallas"};
        for(int i=0;i<Depart.length;i++)
        {
            lst1.add(Depart[i],i);
        }
        for(int i=0;i<Arrive.length;i++)
        {
            lst2.add(Arrive[i],i);
        }
        /*
        or fill the list one item at a time
        lst1.add("One");
        lst1.add("Two");
        */
        btnBuy.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnBuy)
        {
            String item=lst1.getSelectedItem();//select the highlighted item from the list
            txtName.setText(item);
        }
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
    
/*

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
            txtName=new TextField("Hello World");
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
        txtName.setLocation(10,110);
        txtName.setSize(90,20);
        add(txtName);
        btnShow.setLocation(120,110);
        btnShow.setSize(60,30);
        add(btnShow);
        btnShow.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(chkBold.getState()==true && chkItalic.getState()==true)//if bold box is on or off
        {
            txtName.setFont(fBoldItalic);
        }
        else if(chkItalic.getState()==true)
        {
            txtName.setFont(fItalic);
        }
        else if(chkBold.getState()==true)
        {
            txtName.setFont(fBold);
        }
        if(opRed.getState()==true)
        {
            txtName.setForeground(Color.red);
        }
        else if(opBlue.getState()==true)
        {
            txtName.setForeground(Color.blue);
        }
        else if(opGreen.getState()==true)
        {
            txtName.setForeground(Color.green);
        }
        txtName.setText("Hello World");
    }
*/