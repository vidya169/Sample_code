package Abstract_Cocrete_Class;

public class demo2  extends demo1{
	
	int a=60;
	int b=30;
	public void method1() {
		
		System.out.println("multiplication of 2 numbers:" + (a*b));
		
	}

	@Override
	public void method2() {
		System.out.println("division of 2 numbers:" + (a/b));
		
	}
	public static void main(String[] args) 
	{
		demo2 e=new demo2();
		e.method1();
		e.method2();
		e.method3();
	}

}
