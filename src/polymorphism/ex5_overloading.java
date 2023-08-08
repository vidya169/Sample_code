package polymorphism;

public class ex5_overloading {

	
	public void char1(char a, char b)
	{
		System.out.println(a+ " "+" "+b);
	}
	public void char1(char a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		ex5_overloading s1=new ex5_overloading();
		s1.char1('v', 'c');
		s1.char1('z');
		
	}
}
