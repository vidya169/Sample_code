package polymorphism;

public class ex6_overloding {

	public void add(int a, int b)
	{
		System.out.println(a+b);
	}

	public void add(int c, int d, int e)
	
	{
		System.out.println(c+d+e);
	}
	
	
	
	public static void main(String[] args) 
	{
		ex6_overloding a1 = new ex6_overloding();
		
		a1.add(22,23);
		a1.add(23, 3, 2);
		
	}

}
