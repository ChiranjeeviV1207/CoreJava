class Char
{
		public static void main(String args[])
		{
		char a='x';
		int b=a;
		System.out.println("ASCII VALUE  "+b);
		if(b>=65&&b<=90)
		System.out.println("capital letters");
		else if(b>=48&&b<=57)
		System.out.println("numbers");
		else if(b>=97&&b<=122)
		System.out.println("small letters");
		else
		System.out.println("special characters");
		
		}
}