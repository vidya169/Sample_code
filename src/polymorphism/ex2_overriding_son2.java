package polymorphism;

public class ex2_overriding_son2 extends ex_2_overriding_father2 {
	public void wp()
	{
		System.out.println("wp: 2");
	}
	public void twitter()
	{
		System.out.println("twitter: 2");
	}
	public void facebook()
	{
		System.out.println("facebook: 2");
	}
	 public void instagram()
	  {
		  System.out.println("instagram: 2");
	  }
	 public static void main(String[] args) {
		 ex2_overriding_son2 v1=new ex2_overriding_son2();
		 v1.instagram();
		 v1.facebook();
		 v1.twitter();
		 v1.wp();
		
	}
	

}
