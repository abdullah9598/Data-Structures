class X
{
	public void call(int a,char from_rod,char to_rod,char aux_rod)
	{
	try
	{
		
		if(a==1)
		{
			System.out.println("MOVE DISK 1 FROM ROD "+from_rod+" TO ROD "+to_rod);
			return;
		}
		call(a-1,from_rod,aux_rod,to_rod);
		System.out.println("MOVE DISK "+a+" FROM ROD "+from_rod+" TO ROD "+to_rod);
		call(a-1,aux_rod,to_rod,from_rod);	
	}
	
	catch(Exception e)
	{
	}
	}

}
class Tower
{
	public static void main(String args[])
	{
		X x=new X();
		x.call(3,'A','C','B');
	}
}
		