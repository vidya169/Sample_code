package polymorphism;

public class ex10_overloading {
	public  void m1(int x,int y)
	{
		System.out.print("addition of 2 parameters is:" );
		System.out.println(x+y);
	}
	public  void m1(int x,int y,int z)
	{
		System.out.print("addition of 3 parameters is:" );
		System.out.println( x+y+z);
	}
	public static void main(String[] args) 
	{
		ex10_overloading a1=new  ex10_overloading();
		 a1.m1(12,5);
		 a1.m1(7,45,56);
	}

}
