package polymorphism;

public class ex9_overloading {
	public void m1(int a, int b)
	{
		System.out.println(a*b);
	}
	
	public void m1(int a, int b,int c, float d)
	{
		System.out.println((a+d)/(b-c));
		
	}
	
	public static void main(String[] args) 
	{
		ex9_overloading e5 = new ex9_overloading();
		e5.m1(20, 2);
		e5.m1(100, 80, 40, 50.50f);
	}
	

}
