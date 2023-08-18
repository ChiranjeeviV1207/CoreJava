class Series
{
	public static void main(String args[])
	{
		int a=0,b=1,x,c=0;
		for(x=2;x<=10;x++)
		{
		c=a+b;
		System.out.println(a);
		a=b;
		b=c;
		}
	}
}	