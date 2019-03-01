package project.pkg6;
import java.util.*;
import java.lang.*;
public class Project6 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        LinkedList myList=new LinkedList();
        int x,y;
        do
        {
            System.out.print("Enter the coefficient and the power of a term (0 0) to stop: ");
            x=read.nextInt();
            y=read.nextInt();
            myList.insertQueue(x);
            myList.insertQueue(y);
        }while (x!=0&&y!=0);
        System.out.println(" ");
        myList.display(myList.queue);
    }
}
