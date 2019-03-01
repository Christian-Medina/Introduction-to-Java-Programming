package guihandout;
import java.awt.*;
import javax.swing.*;
public class Guihandout {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Project 9");
        frame.setSize(300,300);
        frame.setLocation(0,0);
        frame.setVisible(true);
        Container cPane=frame.getContentPane();
        Graphics g=cPane.getGraphics();
        String option;
        do{
           displayMenu(g);
           option=JOptionPane.showInputDialog("Ener your option");
           //clear the frame window
           g.clearRect(0,0,(int)cPane.getSize().getWidth(),(int)cPane.getSize().getHeight());
           if(option.equals("a"))
           {
               displayRectangle(g);
           }
           else
           {
               displayPolygon(g);
           }
           option=JOptionPane.showInputDialog("Coninue(y/n)? ");
           //clear the frame window
           g.clearRect(0,0,(int)cPane.getSize().getWidth(),(int)cPane.getSize().getHeight());
        }while(option.equals("y"));
    }
    static void displayMenu(Graphics g)
    {
        g.drawString("---------Menu----------",50,50);
        g.drawString("a.Display a rectangle ",50,70);
        g.drawString("b.Display polygon   ",50,90);
    }
    static void displayRectangle(Graphics g)
    {
        int w,h;
        //ask for width and length
        String temp=JOptionPane.showInputDialog("What is the width value? ");
        w=Integer.parseInt(temp);
        temp=JOptionPane.showInputDialog("What is the height value? ");
        h=Integer.parseInt(temp);
        g.setColor(Color.red);
        g.fillRect(100,100,w,h);
        g.drawString("Rectangle",130,200);
    }
    static void displayPolygon(Graphics g)
    {
        int[] x={20,50,90};
        int[] y={20,30,100};
        g.fillPolygon(x,y,x.length);
    }
}
