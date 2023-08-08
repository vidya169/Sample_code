package polymorphism;

public class ex2_overloading {
	
	
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public void mult(int a, int b, int c)
	{
		System.out.println(a*b*c);
	}
	 
	public static void main(String[] args) {
		
		ex2_overloading s1=new ex2_overloading();
		s1.add(10, 20);
		s1.mult(12, 23, 12);
		
	}
	

}
