class Node //NODE
{
	int cons; //CONSTANT VARIABLE
	int exp;  //EXPONENTIAL VALUE
	Node next;//NEXT POINTER
}
class Polynomial //OPERATIONAL CLASS
{
	
	Node head1; //HEAD POINTER FOR FIRS POLYNOMIAL
	Node head2; //HEAD POLYNOMILA FOR SECOND POLYNOMIAL
	Node head3; //HEAD POINTER FOR RESULTANT POLYNOMIAL
	
	public void add_poly_one(int cons,int exp)  //FIRST POLYNOMIAL
	{
		Node node=new Node();
		node.cons=cons;
		node.exp=exp;
		
		if(head1==null)
		{
			head1=node;
		}
		else
		{
			Node p=head1;
			while(p.next!=null)
			{
				p=p.next;
			}
			p.next=node;
		}
	}
	
	public void add_poly_two(int cons,int exp)  //SECOND POLYNOMIAL
	{
		Node node=new Node();
		node.cons=cons;
		node.exp=exp;
		
		if(head2==null)
		{
			head2=node;
		}
		else
		{
			Node q=head2;
			while(q.next!=null)
			{
				q=q.next;
			}
			q.next=node;
		}
	}
		
	
	public void show_poly_one()  //SHOW FIRST
	{
		Node p=head1;
		while(p!=null)
		{
			System.out.print(p.cons+"x^"+p.exp+" + ");
			p=p.next;
		}
		System.out.println("");
	}
	
	public void show_poly_two()  //SHOW SECOND
	{
		Node q=head2;
		while(q!=null)
		{
			System.out.print(q.cons+"x^"+q.exp+" + ");
			q=q.next;
		}
		System.out.println("");
	}
	
	public void result(int res,int exp)  //ADDING 
	{
		Node node=new Node();
		node.cons=res;
		node.exp=exp;
		
		if(head3==null)
		{
			head3=node;
		}
		else
		{
			Node m=head3;
			while(m.next!=null)
			{
				m=m.next;
			}
			m.next=node;
		}
	}
		
	
	
	public void addition() //ADDING TWO POLYNOMIAL
	{
		Node p=head1;
		Node q=head2;
		
		while(p!=null && q!=null)
		{
			if(p.exp>q.exp)
			{
				result(p.cons,p.exp);
				p=p.next;
			}
			else if(p.exp<q.exp)
			{
				result(q.cons,q.exp);
				q=q.next;
			}
			else
			{
				int res=p.cons+q.cons;
				System.out.println(res);
				result(res,p.exp);
				p=p.next;
				q=q.next;
			}

		}
		System.out.println("ADDITION COMPLETED SUCCESSFULLY");
	}
	
	public void show_result() //SHOW RESULTED POLYNOMIAL
	{
		Node n=head3;
		while(n.next!=null)
		{
			System.out.print(n.cons+"x^"+n.exp+" + ");
			n=n.next;
		}
		System.out.println(n.cons+"x^"+n.exp+" + ");
		System.out.println("");
	}
	
}

class Poly //DRIVER CLASS
{
	public static void main (String args[])
	{
	
		Polynomial pl=new Polynomial();
		pl.add_poly_one(9,4);
		pl.add_poly_one(3,2);
		pl.add_poly_one(5,1);
		pl.add_poly_two(21,3);
		pl.add_poly_two(11,2);
		pl.add_poly_two(6,1);
		pl.show_poly_one();
		pl.show_poly_two();
		pl.addition();
		pl.show_result();			
	}
}
