package casting;

public class ex2_sub2 extends  ex2_super2{
	public void nifty()
	{
		System.out.println("nifty :- 2slot");
	}
	public void banknifty()
	{
		System.out.println("banknifty :- 5slot");
	}
	public void option()
	{
	System.out.println("option :- 5slot");	
	}
	public void ipo()
	{
		System.out.println("ipo :- 50k");
	}
	
	//upcasting
	public static void main(String[] args) {
		ex2_super2 v1=new ex2_sub2();
		v1.banknifty();
		v1.nifty();
		v1.option();
		
	}



}
