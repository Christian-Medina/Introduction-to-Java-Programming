/* 
Christian Medina
Professor Ahmadnia
Number 3
This program goes through the game of Tower of Hanoi based on the number of disks input, less than or equal to 7, until all disks are at the end.
*/
package final3;
import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
class Tower{
    public int[] Len={150,375,625};
    int Wid=325,Hi=15;	
    Peg tower;
    public void Tower()
    {
	tower=null;
    }
    public void push(Peg s,int toTower)
    {
	if(empty()==true)
        {
            Peg temp=new Peg((Len[toTower-1]-(s.pegX/2)),Wid,s.pegX,Hi);
            temp.next=tower;
            tower=temp;
	}
	else
        {
            Peg temp=new Peg((Len[toTower-1]-(s.pegX/2)),(tower.towY-25),s.pegX,Hi);
            temp.next=tower;
            tower=temp;
	}	
    } 
    public void push(int towerX,int towerY,int pegX,int pegY)
    {
	Peg temp=new Peg(towerX,towerY,pegX,pegY);
	temp.next=tower;
	tower=temp;
    }        
    public Peg pull()
    {
	Peg top=tower;
	tower=tower.next;
	return top;
    }	
    public void clear()
    {
        Peg clear;
	while(tower!=null)
        {
            clear=tower;
            tower=tower.next;
            clear=null;
	}
    }
    public boolean empty(){
        if(tower==null) 
        {
            return true;
	}
        else if(tower!=null)
        {
            return false;
        }
        return false;
    }
}
class Peg{
    int towX,towY,pegX,pegY;
    Peg next;
    public Peg(int tX,int tY,int pX,int pY)
    {
        next=null;
	towX=tX;
	towY=tY;
	pegX=pX;
	pegY=pY;			
    }
}
public class Final3 extends Applet implements ActionListener, Runnable{
    Thread check=new Thread(this);
    int pegNum=0; 
    Button btnStart=new Button("Press to start");
    Label lblNum=new Label("Enter the number of disks(<=7): ");
    TextField txtf=new TextField();	
    Tower[] tower={new Tower(),new Tower(),new Tower()};
    
    public void init()
    {
	setLayout(null);
	resize(750,500);
	lblNum.setBounds(10,10,200,30);
        add(lblNum);		
	txtf.setBounds(250,20,25,25);
        add(txtf);
	btnStart.setBounds(500,20,100,30);
        add(btnStart);
	btnStart.addActionListener(this);
    }	
    public void actionPerformed(ActionEvent e)
    {
	if(e.getSource().equals(btnStart))
        {
            tower[2].clear();
            check = new Thread(this);			
            pegNum = Integer.parseInt(txtf.getText());			
            for(int i=0;i<pegNum;i++)
            {
		tower[0].push(50+(10*i),325-(30*i),150-(15*i),15);				
            }
            check.start();
            repaint();
	}
    }
    public void towerOfHanoi(int N,int from,int to,int temp)
    { 	
        if(N==1) 
        {
            moveTo(from,to);
        }	
	else
        {
            towerOfHanoi(N-1,from,temp,to);
            moveTo(from,to);
            towerOfHanoi(N-1,temp,to,from);
	}
    }	
    public void run()
    {
	try 
        {
            Thread.sleep(3000);
            towerOfHanoi(pegNum,1,3,2);
	}
        catch (InterruptedException e) 
        {
            e.printStackTrace();
	}
	if(check!=null)
        {
            check.interrupt();
	}	
    }		
    public void moveTo(int from,int to)
    {	
	Tower fromTower = null;
        Tower toTower = null;
        System.out.println(from+"->"+to);
	fromTower=tower[from-1];
	toTower=tower[to-1];		 
	toTower.push(fromTower.pull(),to);
	repaint();		
	try 
        {
            Thread.sleep(1000);
	}
        catch (InterruptedException e) 
        {
            e.printStackTrace();
	}		  
    }
    public void paint(Graphics g)
    {
        int index=0;
	g.setColor(Color.WHITE);
	g.fillRect(0,0,750,500);		
	g.setColor(Color.BLACK);
	g.fillRect(25,350,700,30);
	g.setColor(Color.BLACK);
	g.fillRect(100,75,15,275);
	g.fillRect(350,75,15,275);
	g.fillRect(600,75,15,275);		
	g.setColor(Color.RED);
	while(index<=3)
        {
            Peg top=tower[index].tower;
            while(top!=null)
            {
		g.fillRect(top.towX-25,top.towY,top.pegX,top.pegY);
		top = top.next;
            }
            index++;
	}
    }
}