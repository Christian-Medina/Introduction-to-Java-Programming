package project.pkg6;

import java.util.Scanner;
import java.lang.*;

class node {
    int info;
    node next;
    public node(int val)
    {
        info=val;
        next=null;
    }
}
public class LinkedList {
    node stack, queue, ordered;
    public LinkedList()
    {
        stack=null;
        queue=null;
        ordered=null;
    }
    /*public void insertStack(char val)
    {
        val = Character.toUpperCase(val);
        if (val!=' ')
        {
            node temp=new node(val);
            temp.next=stack;
            stack=temp;
        }
    }*/
    public void insertQueue(int val)
    {
        node p;
        node temp=new node(val);
        if(queue==null)
        {
            queue=temp;
        }
        else
        {
            p=queue;
            while(p.next!=null)
            {
                p=p.next;
            }
            p.next=temp;
        }
    }
    /*public void insertOrdered(int val)
    {
        node p,q;
        node temp=new node (val);
        p=q=ordered;
        while(p!=null&&p.info<val)
        {
            q=p;
            p=p.next;
        }
        if(p==ordered)
        {
            temp.next=p;
            ordered=temp;
        }
        else if(p==null)
        {
            q.next=temp;
        }
        else
        {
            temp.next=p;
            q.next=temp;
        }
    }*/
    public void display(node p)
    {
        Scanner read=new Scanner(System.in);
        int a,b,c,d,e,f,x;
        double y;
        System.out.print("F(X)="+p.info);
        a=p.info;
        p=p.next;
        System.out.print("X^"+p.info);
        b=p.info;
        p=p.next;
        System.out.print(" +"+p.info);
        c=p.info;
        p=p.next;
        System.out.print("X^"+p.info);
        d=p.info;
        p=p.next;
        System.out.print(" +"+p.info);
        e=p.info;
        p=p.next;
        System.out.println("X^"+p.info);
        f=p.info;
        System.out.println("Enter the X value: ");
        x=read.nextInt();
        y=a*Math.pow(x,b)+c*Math.pow(x,d)+e*Math.pow(x,f);
        System.out.println("F("+x+")="+y);
        /*while(p!=null)
        {
            System.out.print(p.info+"->");
            p=p.next;  
        }
        System.out.println("NULL");*/
    }
}
