package casting;

public class ex5_sub5 extends ex5_super5 {
	
	public void name1()
	{
		System.out.println(a);
	}
	public void name2()
	{
		System.out.println(b);
	}
	public void name3()
	{
		System.out.println(c);
	}
	public void name4()
	{
		System.out.println(d);
	}
	public void name5()
	{
		System.out.println(e);
		
	}
	public void name6()
	{
		System.out.println("aniket");
	}
	
	//upcasting
	public static void main(String[] args) {
		ex5_super5 a1=new ex5_sub5();
		a1.name1();
		a1.name2();
		a1.name3();
		a1.name4();
		a1.name5();
		
	}
}
