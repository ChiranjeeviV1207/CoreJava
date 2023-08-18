import java.util.Scanner;
class Computer
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int x=35,y;
		System.out.println("enter y value");
		y=s.nextInt();
		double p=86.9,q;
		System.out.println("enter q value");
		q=s.nextDouble();
		String word,sentence;
		System.out.println("enter word");
		word=s.next();
		System.out.println("enter sentence");
		s.nextLine();
		sentence=s.nextLine();
		char c;
		System.out.println("enter c");
		c=s.next().charAt(0);
		System.out.println(x+" "+y+" "+p+" "+q+" "+word+" "+sentence+" "+c);
	}
}
		 