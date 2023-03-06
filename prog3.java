package Sample;

public class prog3 {
	public static void main(String[] args) {
		
	System.out.println("Main method started");
	m1();      // call static method
	m2();
	add();
	System.out.println("Main method ended");
	}
	public static void m1() // define static method m1
	{
		System.out.println("running static method m1");
	}
	public static void m2()  // define static method m2
	{
		System.out.println("running static method m2");
	}
	public static void add()  // define static method m2
	{
		int a=2;
		int b=3;
		int c;
		c=a+b;
		System.out.println("c="+c);
	}
	

}
