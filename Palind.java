class Palind
{
	public static void main(String args[])
	{
		int a=22722,sum=0,rem=0,x=a;
		for(;a>0;a/=10)
		{
		rem=a%10;
		sum=sum*10+rem;
		}
		System.out.println(sum);
		if(sum==x)
		{
		System.out.println("palindrome");
		}
		else
		{
		System.out.println(" not a palindrome");
		}
	}
}
		