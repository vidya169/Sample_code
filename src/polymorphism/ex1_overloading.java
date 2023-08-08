package polymorphism;

public class ex1_overloading {

	
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		ex1_overloading s1=new ex1_overloading();
		s1.add(20, 10);
		s1.add(10, 12, 25);
		
		
		
	}
}
