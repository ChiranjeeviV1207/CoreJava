public class NormalException
{
		public static void main(String[] args) 
		{
			int [] a=new int [] {10,20,30,40,50};
			User1.square(a);
		}
	}
	class User1
	{
		public static void square(int[] a)
		{
			for(int x=0;x<a.length;x++)
			{
				a[x]=a[x]*a[x];
			}
			display(a);	
		}
		public static void display(int [] a)
		{
			for(int x=0;x<a.length;x++)
			{
				System.out.println(a[x]/0);
			}
		}
}