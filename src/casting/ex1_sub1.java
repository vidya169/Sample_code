package casting;

public class ex1_sub1 extends  ex1_super1 {
	public void mango()
	{
		System.out.println("mango- 50kg");
	}
	public void apple()
	{
	System.out.println("apple- 20kg");	
	}
	public void strawberry()
	{
		System.out.println("strawberry- 2kg");
	}
	public void orange()
	{
		System.out.println("orange- 5kg");
	}
	
	
	public static void main(String[] args) {
		
		//upcasting
		
		ex1_super1 s1= new ex1_sub1();
		s1.apple();
		s1.mango();
		s1.strawberry();
		

	}


}
