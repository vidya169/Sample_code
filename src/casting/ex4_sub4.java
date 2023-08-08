package casting;

public class ex4_sub4 extends ex4_super4 {
	
	public void add()
	{
		System.out.println(a+b);
	}
	public void sub()
	{
		System.out.println(a-b);
		
	}
	public void div()
	{
		System.out.println(a/b);
	}
	public void mult()
	{
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		ex4_super4 s1=new ex4_sub4();
		s1.add();
		s1.sub();
		s1.div();
		
		System.out.println("--------subclass property----------------------");
		ex4_sub4 s2=new ex4_sub4();
		s2.add();
		s2.div();
		s2.mult();
		s2.sub();
		
		
	}


}
