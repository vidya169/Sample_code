package Abstract_Cocrete_Class;

public class demo8 extends demo7{
	public void m2()
	{
		System.out.println("method m2 complete in concrete class");
	}
	
	public void m3()
	{
		System.out.println("method m3 complete in concrete class");
	}
	
	public static void main(String[] args)
	{
		demo8 c1=new demo8();
		c1.m1();
		c1.m2();
		c1.m3();

		
	}
}
	
	
		
