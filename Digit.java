class Digit
{
	public static void main(String args[])
	{
		int num=236563424,count=0,sum=0,rem=0;
		for(;num>0;num/=10)
		{
		rem=num%10;
		sum=sum+rem;
		count++;
		}
		System.out.println(count+" "+sum);
	}
}