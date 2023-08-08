package polymorphism;

public class ex4_overloading {
	
	public void String(String a, String b)
	{
		System.out.println(a+b);
	}
	public void div(float a, float b, float c )
	{
		System.out.println(a+b/c);
	}
	
	public static void main(String[] args) {
		ex4_overloading s1=new ex4_overloading();
		s1.String("vidya", "  chavan");
		s1.div(2.3f, 5, 4.5f);
		
	}
	

}
