package project.pkg9.pkg2;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Project92 {
    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Project 9");
        frame.setSize(300,300);
        frame.setLocation(0,0);
        frame.setVisible(true);
        
        Container cPane = frame.getContentPane();
        Graphics g = cPane.getGraphics();
        
        String option;
        do
        {
                        g.clearRect(0,0,(int)cPane.getSize().getWidth(),(int)cPane.getSize().getHeight());

            displayMenu(g);
            
            option = JOptionPane.showInputDialog("Enter your option");
            // clear the frame window
            
            if (option.equals("a"))
                displayTriangle(g);  
            if (option.equals("b"))
                displayEllipse(g);
            else
                displayPolygon(g);
            
            option = JOptionPane.showInputDialog("Continue(y/n)");
            // clear the frame window
            g.clearRect(0,0,(int)cPane.getSize().getWidth(),(int)cPane.getSize().getHeight());
        } while (option.equals("y"));
    }
    
    static void displayMenu(Graphics g)
    {
        g.drawString("-------------Menu-------------", 00, 20);
        g.drawString("a. Compute the area of triangles.",00,40);
        g.drawString("b. Compute the area of ellipse.",0,60);
        g.drawString("c. Compute the area of polygons.",0,80);
    }
    
    static void displayTriangle(Graphics g)
    {
        int w,h;
        String value,hei;
        double a;
        
        // ask for its width and length
        value = JOptionPane.showInputDialog("What is the base value? ");
        w = Integer.parseInt(value);
        
        hei = JOptionPane.showInputDialog("What is the height value? ");
        h = Integer.parseInt(hei);
        
        int []x = {(w/2),w,(w/2)+w};
        int []y = {100,100-h,100};
        
        a = (w * h)/2;
        
        g.setColor(Color.black);
        g.fillPolygon(x,y,x.length);
        g.drawString("Base value:",0,120+h);
        String base = String.valueOf(w);
        g.drawString(base, 100, 120+h);
        
        g.drawString("Height value:",0,20+120+h);
        String Height = String.valueOf(h);
        g.drawString(Height, 100, 20+120+h);
        
        g.drawString("Area:",0,40+120+h);
        String Area = String.valueOf(a);
        g.drawString(Area, 100, 40+120+h);  
        
    }
    
    static void displayEllipse(Graphics g)
    {
        int a, b;
        String maj,min;
        double tot;
        
        maj = JOptionPane.showInputDialog("What is the major axis value? ");
        a = Integer.parseInt(maj);
        
        min = JOptionPane.showInputDialog("What is the major axis value? ");
        b = Integer.parseInt(min);
        
        tot = Math.PI * (a/2) * (b/2);
        g.setColor(Color.black);
        g.fillOval(50,50,a,b);
        g.drawOval(50,50,a,b);
        
        g.drawString("Major axis:",0,120+b);
        String majax = String.valueOf(a);
        g.drawString(maj, 100, 120+b);
        
        g.drawString("Minor axis:",0,20+120+b);
        String minax = String.valueOf(b);
        g.drawString(min, 100, 20+120+b);
        
        g.drawString("Area:",0,40+120+b);
        String Area = String.valueOf(tot);
        g.drawString(Area, 100, 40+120+b); 
        
    }
    
    static void displayPolygon(Graphics g)
    {
        
    }
}