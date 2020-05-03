import java.util.*;

class Sorting
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF THE ARRAY");
		int n=sc.nextInt();
		int [] arr=new int [n];
		int j;
	
	
		for(j=0;j<n;j++)
		{
			System.out.print("ENTER ELEMENT "+(j+1)+ " " );
			arr[j]=sc.nextInt();
		}
		
		System.out.println(" ");
		System.out.println("THE INPUTTED ARRAY IS : ");
		
		for(j=0;j<n;j++)
		{
			
			System.out.print(arr[j]);
			System.out.print(" ");
		}
		
		int k;
		for(k=0;k<n;k++)
		{
			for(j=0;j<(n-1);j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("");
		for(j=0;j<n;j++)
		{
			
			System.out.print(arr[j]);
			System.out.print(" ");
		}
		
		
	}
}