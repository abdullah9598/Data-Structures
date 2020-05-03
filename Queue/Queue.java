/*

TOPIC DATA STRUCTURE : QUEUE USIG LINKED LIST
FUNCTIONS : ADDING IN QUEUE & DELETION IN QUEUE USING LINKED LIST

FIRST IN FIRST OUT (FIFO)


*/
class Node //NODE OF LINKED LIST
{
	int data; //FOR STORING DATA
	Node next; //FOR STORING THE ADDRESS OF THE NEXT VARIABLE
}
class Implement
{
	Node front; //POINT OF DELETION
	Node rear;  //POINT OF INSERTION
	int length=0; //FOR THE LENGTH OF QUEUE
	
	public void enqueue(int data) //METHOD FOR INSERTION
	{
		Node node=new Node(); //NODE CREATED TO ADD
		node.data=data;
		node.next=null;
		
		if(front==null) //IF ITS A FIRST NODE
		{
			front=node;
		}
		else
		{
			rear.next=node;
		}
		rear=node;
		length++;
	}
		
	public void show()  //METHOD TO SHOW QUEUE
	{
		Node n=front; 
		if(front==null) //IF QUEUE IS EMPTY
		{
			System.out.println("THE QUEUE IS EMPTY");
		}
		else
		{
			while(n.next!=null) //TRAVERSING THROUGH THE LINKED LIST
			{
				System.out.print(n.data+ " <-- ");
				n=n.next;
			}
			System.out.print(n.data);
		}
		System.out.println("");
	}
	
	public void dequeue() //METHOD TO E DATA FROM THE QUEUE
	{
		if(front==null) //IF QUEUE IS EMPTY
		{
			System.out.println("List is empty");
		}
		else
		{
		Node n=front;
		front=n.next;
		length--;
		}
		
	}
		
	}
	
class Queue
{
	public static void main(String args[])  //DRIVER METHOD
	{
		Implement im=new Implement();
		im.dequeue();
		im.show();
		im.enqueue(22);
		im.enqueue(97);
		im.enqueue(33);
		im.enqueue(88);
		im.enqueue(99);
		im.show();
		im.dequeue();
		im.show();
		im.enqueue(99);
		im.show();
		im.dequeue();
		im.show();
		
	}
}