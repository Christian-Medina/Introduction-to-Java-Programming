package project.pkg7;
import java.util.*;
import java.lang.*;
public class Project7 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        LinkedList myList=new LinkedList();
        char c='y';
        do
        {
            
            System.out.println("CONTINUE(y/n)? ");
            c=read.next().charAt(0);
        }while (c=='y');
    }
}