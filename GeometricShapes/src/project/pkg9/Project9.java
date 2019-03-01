package project.pkg9;

import java.awt.*;
import javax.swing.JFrame;
public class Project9 {
    
    public static void main(String[] args)
    {
       JFrame frame = new JFrame();
       Container cPan = frame.getContentPane();
       frame.setSize(500,500);
       frame.setVisible(true);
       Graphics g = cPan.getGraphics();

       g.drawString("Geometric Shapes",150,20);
       
       
       int []x = {100,150,200};
       int []y = {100,70,100};

        g.setColor(Color.black);
        g.fillPolygon(x,y,x.length);
       
       
      /* g.setColor(Color.black);
       g.drawLine(200,30,200,80);
       
       g.setColor(Color.black);
       g.drawLine(100, 80, 300, 80);
       
       g.setColor(Color.black);
       g.drawLine(300,80, 300, 110);
       
       g.setColor(Color.black);
       g.drawLine(100,80, 100, 110);
       
       g.drawString("Polygons", 75, 120);
       g.drawString("Ovals", 285, 120);
       
       g.setColor(Color.black);
       g.drawLine(100,125, 100, 150);
       
       g.setColor(Color.black);
       g.drawLine(300,125, 300, 150);
       
       g.setColor(Color.black);
       g.drawLine(25,150, 175, 150);
       
       g.setColor(Color.black);
       g.drawLine(25,150, 25, 175);
       
       g.setColor(Color.black);
       g.drawLine(100,150, 100, 175);
       
       g.setColor(Color.black);
       g.drawLine(175,150, 175, 175);
       
       g.setColor(Color.black);
       g.drawLine(250,150, 350, 150);
       
       g.setColor(Color.black);
       g.drawLine(250,150, 250, 175);
       
       g.setColor(Color.black);
       g.drawLine(350,150, 350, 175);*/
       
       // Rectangle
       g.setColor(Color.black);
       g.fillRect(50,400,400,50);
        g.drawRect(50,400,400,50);
        g.fillRect(75, 400, 50, 300);
        g.drawRect(75,400,50,300);
        g.fillRect(175, 400, 50, 300);
        g.drawRect(175,400,50,300);
        g.fillRect(275, 400, 50, 300);
        g.drawRect(275,400,50,300);
       
       /*//Triangle
       g.setColor(Color.black);
       int []x = {70,100,130};
       int []y = {210,175,210};

       g.setColor(Color.black);
       g.fillPolygon(x,y,x.length);
       
       //Quadrilateral
       g.setColor(Color.black);
       int []a = {145,165,185,205};
       int []b = {210,175,175,210};

       g.setColor(Color.black);
       g.fillPolygon(a,b,a.length);
       
       // Circle
       g.setColor(Color.black);
       g.fillOval(230,175,35,35);
       g.drawOval(230,175,35,35);
       
       // Oval
       g.setColor(Color.black);
       g.fillOval(310,175,80,35);
       g.drawOval(310,175,80,35);*/
    }
}