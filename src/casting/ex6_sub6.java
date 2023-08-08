package casting;

public class ex6_sub6 extends ex6_super6 {
	public void farming()
	{
		System.out.println("Farming done by farmers");
	}
	
	public void farmer1()
	{
		System.out.println("Farmer 1 having Tractor only");
	}

	public void farmer2()
	{
		System.out.println("Farmer 2 having 13 Lac");
	}
	public void farmer3()
	{
		System.out.println("Farmer 3 having 2 accers of land");
	}

	public void farmer4()
	{
		System.out.println("Farmer 4 having 123 accers of land");
	}
	public void sarpanch()
	{
		System.out.println("Sarpanch having 111 accers of land , Tractors, labors");
	}
	
	
	public static void main(String[] args) 
	{
		ex6_super6 e1  = new  ex6_sub6();
		e1.farming();
		e1.farmer1();
		e1.farmer2();
		e1.farmer3();
		
		System.out.println("=============================");

		
		ex6_sub6 e2 = new ex6_sub6();
		e2.farmer4();
		e2.sarpanch();
		
		
		

	}

}
