import java.util.Scanner;


class Operations
{
	int arr[]=new int[5];
	int top=0;
	public void push(int data)
	{
		
		arr[top]=data;
		System.out.println(arr[top]+" ADDED IN THE STACK");
		top++;
		
	}
	
	public void pop()
	{
		top--;
		int data=arr[top];
		arr[top]=0;
		System.out.println("DELETED FROM THE STACK = "+data);
	}
	
	
	public void peek()
	{
		int data=arr[top-1];
		System.out.println("LAST ELEMENT IN THE STACK IS : "+data);
	}
	
	
	public void show()
	{
	System.out.print("STACK : ");
	for(int i=0;i<top;i++)
	{
		
		System.out.print(arr[i]+" ");
		
	}
	System.out.println("");
	
	}
	
}


class Stack
{
	public static void main(String ar[])
	{
		Operations op=new Operations();
		
		System.out.println("SIMPLE STACK ALGO");
		System.out.println("");
		
		Scanner sc=new Scanner(System.in);
		
		int factor=1;
		
		while(factor==1)
		{
			System.out.println("");
			System.out.println("1.TO ADD THE ELEMENT IN THE STACK");
			System.out.println("2.TO DELETE THE LAST ELEMENT FROM THE STACK");
			System.out.println("3.TO VIEW THE LAST ELEMENT IN THE STACK");
			System.out.println("4.TO VIEW THE STACK");
			System.out.println("");
			System.out.print("ENTER YOUR CHOICE ");
			int n=sc.nextInt();
			
			switch(n)
			{
				case 1:
				System.out.print("ENTER THE ELEMENT TO ADD : ");
				int p=sc.nextInt();
				op.push(p);
				break;
				
				case 2:
				op.pop();
				break;
				
				case 3:
				op.peek();
				break;
				
				
				case 4:
				op.show();
				break;
			}
		}
		
	}
}





























