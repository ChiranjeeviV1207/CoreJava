class Largest
{
	public static void main(String args[])
	{
		int num=639584,sum=0,rem=0,count=0,max=0;
		for(;num>0;num/=10)//639184>0//63918>0
		{
			rem=num%10;//4//8
			if(max<rem)
			max=rem;//4//8
		}
		System.out.println(max);
	}
}