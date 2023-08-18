class Basicpro
{
	public static void main(String args[])
	{
		int x='#';
		int z=x;
		if(z>=65 && z<=90)
		{
		System.out.println("capital letter");
		}
		else if(z>=97 && z<=122)
		{
		System.out.println("small letter");
		}
		else if(z>=48 && z<=57)
		{
		System.out.println("numbers");
		}
		else
		{
		System.out.println("special characters");
		}
	}
}