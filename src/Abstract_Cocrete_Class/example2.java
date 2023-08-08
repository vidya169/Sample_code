package Abstract_Cocrete_Class;

public class example2 extends example1 {
	
	public void m2() {
		System.out.println("hii");
	}
	public void m3()
	{
		System.out.println("hello");
	}
	public void m4()
	{
		System.out.println("velocity");
	}
	
	public static void main(String[] args) {
		
		example2 s1=new example2();
		s1.m1();
		s1.m2();
		s1.m3();
		s1.m4();
		
		
	}

}
