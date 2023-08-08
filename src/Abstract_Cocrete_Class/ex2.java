package Abstract_Cocrete_Class;

public class ex2 extends ex1 {
	public void paytm()
	{
		System.out.println("paytm= 500");
	}

	@Override
	public void googlepay() {
		System.out.println("googlepay=  1000");
		
	}

	@Override
	public void phonepe() {
		System.out.println("phonepe=  20000");
		
	}

	@Override
	public void wppay() {
		System.out.println("wppay=  3000");
		
	}
	public static void main(String[] args) {
		
		ex2 s1=new ex2();
		s1.amazonpay();
		s1.googlepay();
		s1.paytm();
		s1.wppay();
		s1.phonepe();
		
	}

}
