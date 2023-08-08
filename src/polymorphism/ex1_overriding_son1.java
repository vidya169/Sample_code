package polymorphism;

public class ex1_overriding_son1 extends ex1_overriding_father1 {
	public void paytm()
	{
		System.out.println("paytm: 10000");
	}
	public void amazonpay()
	{
		System.out.println("amazonpay: 20000");
	}
	public void googlepay()
	{
		System.out.println("googlepay: 30000");
	}
	 public void phonepay()
	  {
		  System.out.println("phonepay: 40000");
	  }
	 public void wppay()
	  {
		  System.out.println("wppay: 40000");
	  }

	 
	 public static void main(String[] args) {
		 ex1_overriding_son1 v1=new ex1_overriding_son1();
		 v1.amazonpay();
		 v1.googlepay();
		 v1.paytm();
		 v1.phonepay();
		 v1.wppay();
		 
		
	}
	 

}
