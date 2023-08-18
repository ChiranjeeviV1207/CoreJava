class Prime
{
	public static void main(String args[])
	{
		int x=1,number=7,count=0;
		while(x<=number)
		{
			if(number%x==0)
			count++;
			x++;
		}
		if(count==0)
		{
			System.out.println("p");
		}
		else
		{
			System.out.println("np");
		}
	}
}