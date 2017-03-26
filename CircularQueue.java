import java.util.*;


public class CircularQueue
{	
	int f=-1;
	int r=-1;
	int a[]=new int[50];
	
	public void insert(int item)
	{
		if(f!=(r+1)%50)
			{if(r==-1)f=0;
			 r=(r+1)%50;
			 a[r]=item;}
		else System.out.println("Queue is full");
	}
	
	public void delete()
	{
		if(f==-1)System.out.println("Queue is empty");
		else 
			{
				System.out.println(a[f]+" is deleted");
				if(f==r){f=-1;r=-1;}
				else{f=(f+1)%50;}
	}
	}
	
	public void display()
	{
	 System.out.println("Queue contents :");
	 if(f<=r)
	 {for(int i=f;i<=r;i++)
		 System.out.println(a[i]);}
	 else
	 {
		 for(int i=f;i<=49;i++)
			 System.out.println(a[i]);
		 for(int i=0;i<=r;i++)
			 System.out.println(a[i]);
	 }
	}

 

	public static void main(String []args)
	{CircularQueue s=new CircularQueue();
	 int x;
	 Random rand=new Random();
	 
	  for(int i=0;i<50;i++)
	  { 
		  x=rand.nextInt(50);
		  s.insert(x);
	  }
	 s.display();
	 for(int i=0;i<=50;i++)
	 {s.delete();}
	 for(int i=0;i<=50;i++)
	  { 
		  x=rand.nextInt(50);
		  s.insert(x);
	  }
	 s.display();
	}
}