class Even

{
	public static void main(String args[])
	{
		int x=1,y=100,count=0,sum=0;
		while(x<=y)
		{
		System.out.println(x);
		count++;
		sum=sum+x;
		x+=2;
		}
	System.out.println(sum+" "+count);
	}
}