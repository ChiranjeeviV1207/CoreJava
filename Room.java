class Room
{
	public static void main(String args[])
	{
		int a=1,b=1000,count=0,sum=0;
		while(a<b)
		{
		if(b%4==0 && b%7==0)
			{
			System.out.println(a);
			}
			count++;
			a++;
		}
			System.out.println(count);
	}
}