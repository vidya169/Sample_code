package casting;

public class ex7_sub7 extends ex7_super7 {
	

	public void m1()
	{
		System.out.println("Marker");
	}
	public void m2()
	{
		System.out.println("Pencil");
	}
	public void m3()
	{
		System.out.println("Gel Pen");
	}
	
	public static void main(String[] args) 
	{
		ex7_super7 e2 = new ex7_sub7();
		e2.m1();
		e2.m2();
		e2.m3();
		
	}

}
