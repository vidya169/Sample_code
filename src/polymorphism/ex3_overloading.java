package polymorphism;

public class ex3_overloading {

	
	public void div(float a, float b)
	{
		System.out.println(a/b);
	}
	public void div(float a, float b,float c)
	{
		System.out.println(a*b/c);
	}

	public static void main(String[] args) {
		ex3_overloading s1=new ex3_overloading ();
				s1.div(20.1f, 12f);
				s1.div(20.3f, 2.5f, 3.5f);
		
	}
}
