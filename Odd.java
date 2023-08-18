class Natural

{
	public static void main(String args[])
	{
		int x=100,y=1,count=0,sum=0;
		while(x>=y)
		{
		System.out.println(x);
		count++;
		sum=sum+x;
		x--;
		}
	System.out.println(sum+" "+count);
	}
}