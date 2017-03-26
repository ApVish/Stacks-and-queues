import java.util.*;
public class Stack
{
	
	int top=-1;
	int a[]=new int[50];
	
	public void push(int item)
	{
		if(top<49)
			a[++top]=item;
		else System.out.println("Stack is full");
	}
	
	public void pop()
	{
		if(top==-1)System.out.println("Stack is empty");
		else System.out.println(a[top--]+" is popped");
	}
	
	public void display()
	{
	 System.out.println("Stack contents :");
	 for(int i=top;i>=0;i--)
		 System.out.println(a[i]);
	}

 

	public static void main(String []args)
	{Stack s=new Stack();
	 int x;
	 Random rand=new Random();
	 
	  for(int i=0;i<=50;i++)
	  { 
		  x=rand.nextInt(50);
		  s.push(x);
	  }
	 s.display();
	 for(int i=0;i<=50;i++)
	 {s.pop();}
	}
}