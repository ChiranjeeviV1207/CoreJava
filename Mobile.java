import java.util.Scanner;
class Mobile
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		double x,y;
		String word,sentence;
		char character;
		System.out.println("enter a value");
		a=sc.nextInt();
		System.out.println("enter b value");
		b=sc.nextInt();
		System.out.println("enter x value");
		=sc.nextDouble();
		System.out.println("enter y value");
		y=sc.nextDouble();
		System.out.println("enter word");
		word=sc.next();
		System.out.println("enter sentence");
		sc.nextLine();
		sentence=sc.nextLine();
		System.out.println("enter character");
		character=sc.next().charAt(0);
		System.out.println(a+" "+b+" "+x+" "+y+" "+word+" "+sentence+" "+character);
	}
}