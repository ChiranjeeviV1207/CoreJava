class Long
{
	public static void main(String args[])
	{
		int x=1650,y=2058,count=0,sum=0;
		while(x<=y)
		{
		{
		if((x%4==0 && x%100!=0) || x%400==0)
		System.out.println(x);
		}
		count++;
		sum=sum+x;
		x++;
		}
		if((1728%4==0 && 1728%100!=0) || 1728%400==0)
			{
			System.out.println("leap year");
			}
		else
			{
			System.out.println("not");
			}
	System.out.println(sum+" "+count);
	}
}