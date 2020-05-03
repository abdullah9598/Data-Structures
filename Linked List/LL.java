import java.util.*;


class Node
{
	int data;
	Node next;
		
}
class Linked_list
{
	Node head;
	
	public void insert(int x)
	{
		Node node=new Node();
		node.data=x;
		
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node n;
			n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
				
		}
	}
	
	public void insertAtStart(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		node.next=head;
		head=node;		
		
	}
	
	public void insertAt(int data,int index)
	{
		try{
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		Node n=head;
		
		for(int i=0;i<index-1;i++)
		{
			n=n.next;
		}
		node.next=n.next;
		n.next=node;
	}
	catch(Exception e)
	{
		System.out.println("LIST OVERFLOWN");
	}
	}
	
	
	
	public void deleteHead()
	{
		Node n = head;
		head=n.next;
		System.out.println("DATA DELETED SUCCESFULLY !!");
	}
	
	public void deleteAtEnd()
	{
		Node n = head;
		if(head==null)
		{
			System.out.println("LIST UNDERFLOWN");
		}
		else if(n.next==null)
		{
			this.deleteHead();
		}
			
		else
		{
		while(n.next.next!=null)
		{
			n=n.next;
		}
		n.next=null;
		System.out.println("DATA DELETED SUCCESFULLY");
		}
	}
	
	
	public void deleteAtIndex(int index)
	{
		Node n = head;
		if(head==null)
		{
			System.out.println("LIST UNDERFLOWN...");
		}
		else if(n.next==null)
		{
			this.deleteHead();
		}
		else
		{
		for(int i=0;i<index-1;i++)
		{
			n=n.next;		
		}
		n.next=n.next.next;
		System.out.println("DATA DELETED SUCCESSFULLY !");
		}
		
	}

	public void show()
	{
		Node node=head;
		
		if(head==null)
		{
			System.out.println("NO DATA IN THE LIST");
		}
		else
		{
		System.out.println("THE CURREMT LIST IS : ");
		while(node!=null)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
		System.out.println("");
		
		}
		
	}
}

class LL
{
public static void main(String args[])
{
	Linked_list ls=new Linked_list();
	Scanner sc=new Scanner(System.in);
	
	
	int factor=1;
	while(factor==1)
	{
		System.out.println("1.TO ENTER ELEMENT AT THE END OF The LIST");
		System.out.println("2.TO INSERT ELEMENT AT START");
		System.out.println("3.TO INSERT ELEMENT AT ANY POSITON OF THE LIST");
		System.out.println("4.TO DELETE THE FIRST ELEMENT OF THE LIST");
		System.out.println("5.TO DELETE FROM THE END");
		System.out.println("6.TO DELETE AT CERTAIN INDEX");
		System.out.println("7.TO VIEW LIST");
		System.out.println("8.TO EXIT");
		
		
		
		int n=sc.nextInt();
		int no;
		switch(n)
		{
			case 1:
			System.out.println("ENTER YOUR NUMBER");
			no=sc.nextInt();
			ls.insert(no);
			break;
			
			case 2:
			System.out.println("ENTER YOUR NUMBER");
			no=sc.nextInt();
			ls.insertAtStart(no);
			break;
			
			case 3:
			System.out.println("ENTER YOUR NUMBER");
			no=sc.nextInt();
			System.out.println("ENTER YOUR INDEX");
			int index=sc.nextInt();
			
			if(index==0)
			{
				ls.insertAtStart(no);
			}
			else
			{
				ls.insertAt(no,index);
			}
			break;
			
			case 4:
			ls.deleteHead();
			break;
			
			case 5:
			ls.deleteAtEnd();
			break;
			
			case 6:
			index=sc.nextInt();
			System.out.prinln("ENTER INDEX VALUE");
			ls.deleteAtIndex(index);
			break;
			
			
			case 7:
			ls.show();
			break;
			
			case 8:
			factor=2;
			break;
			
			
			
		}
	}
	
}
}
			




















