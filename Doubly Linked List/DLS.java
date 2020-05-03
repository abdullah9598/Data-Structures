class Node
{
	Node previous;
	int data;
	Node next;
}


class DoublyLinkedList
{
	Node head;
	Node tail;
	
	
	public void insertAtEnd(int data)
	{
		
	Node node=new Node();
	
	node.previous=null;
	node.data=data;
	node.next=null;
	
	if(head==null)
	{
		head=node;
	}
	else
	{
		tail.next=node;
		node.previous=tail;
	}
	tail=node;	
	}

	
	public void insertAtStart(int data)
	{
		Node node=new Node();
		Node n=head;
		node.data=data;
		if(head==null)
		{
			this.insertAtEnd(data);
		}
		else
		{
			n.previous=node;
			node.next=head;
			head=node;
		}
	}
	
	public void insertAtIndex(int data,int index)
	{
		Node node = new Node();
		node.data=data;
		
		Node n=head;
		if(head==null)
		{
			insertAtStart(data);
		}
		else
		{
		for(int i=0;i<index-1;i++)
		{
			n=n.next;
		}
		node.next=n.next;
		n.next=node;
		node.previous=n;
		n.next.previous=node;
		}
	}	
		
		
	
	
	public void deleteAtStart()
	{
		Node n=head;
		head=n.next;
		n.previous=null;
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
			this.deleteAtStart();
		}
			
		else
		{
		while(n.next.next!=null)
		{
			n=n.next;
		}
		n.next=null;
		tail=n.previous;
		
		System.out.println("DATA DELETED SUCCESFULLY");
		}
	}
	
	

public void show()
{
	Node n=head;
	if(head==null)
	{
		System.out.println("EMPTY LINKED LIST");
	}
	else
	{
		while(n!=null)
		{
			
			System.out.println(n.data);
			n=n.next;
		}
		//System.out.println(n.data);
	}

}
}

class DLS
{
	public static void main(String args[])
	{
		
		DoublyLinkedList dl=new DoublyLinkedList();
		dl.show();
		dl.insertAtStart(55);
		dl.insertAtEnd(22);
		dl.insertAtEnd(23);
		dl.insertAtEnd(25);
		dl.show();
		System.out.println("");
		dl.show();
		dl.insertAtEnd(99);
		System.out.println("");
		dl.deleteAtEnd();
		dl.show();
		System.out.println("");
		dl.insertAtEnd(108);
		dl.show();
		dl.insertAtIndex(33,1);
		dl.show();
		dl.insertAtEnd(199);
		dl.show();
		dl.deleteAtStart();
		dl.show();
		
		
		
	}
}	
		