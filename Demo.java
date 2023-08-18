class Demo
{
		public static void main(String args[])
		{
		int fee=100000;
		int s1=16,s2=19,s3=17,s4=14,s5=20,s6=15;
		int total=s1+s2+s3+s4+s5+s6;
		double percentage=total/120.0*100;
		System.out.println(percentage);
		double scholarship=10/100.0*fee;
		double donation=10/100.0*fee; 
		double totalfee=(percentage>80)?(fee-scholarship):(fee+donation);
		String section=(percentage>80)?("section-a"):("section-b");
		System.out.println(section);
		System.out.println(totalfee);
		}
}