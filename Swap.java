class Swap
{
		public static void main(String args[])
		{
		int a=30;
		int b=10;
		int c=20;
		System.out.println("before swap="+a+" "+b+ " "+c);
		a=b;
		b=c;
		c=b+a;
		System.out.println("after swap="+a+" "+b+ " "+c);
		}
}