package Abstract_Cocrete_Class;

public class demo4 extends demo3{
	
		public void m1()
		{
			System.out.println("Running Incomplete method m1 From Abstract class1");
		}
		
		public void m3()
		{
			System.out.println("Running Incomplete method m3 From Abstract class1");
		}
		
		public void m4()
		{
			System.out.println("Running Incomplete method m4 From Abstract class1");
		}
		
		
		public static void main(String[] args) 
		{
			
			demo4 a=new demo4();
			a.m1();
			a.m2();
			a.m3();
			a.m4();
			
		}
		

}
