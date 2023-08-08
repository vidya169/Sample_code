package polymorphism;

public class ex5_overriding_son5 extends ex5_overriding_father5 {
	public void laptop1()
	{
		System.out.println("Lenovo");
	}

	public void laptop2()
	{
		System.out.println("Rog Strig");
	}
	
	public void laptop3()
	{
		System.out.println("acer");
	}
	
	public void laptop4()
	{
		System.out.println("Asus Rog");
	}
	
	public void laptop5()
	{
		System.out.println("Apple");
	}

	
	
	
	public static void main(String[] args) 
	{
		System.out.println("Shop 1");

		
		ex5_overriding_son5 e1 = new ex5_overriding_son5();
		e1.laptop1();
		e1.laptop2();
		e1.laptop3();
		e1.laptop4();
		
		

	}
}
