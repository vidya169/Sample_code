package Generlization;

public class zeroda implements broking_application {

	@Override
	public void nifty() {
		System.out.println("17400");
		
	}

	@Override
	public void banknifty() {
		System.out.println("36600");
		
	}
	public void option() {
		System.out.println("infosys");
	}
public static void main(String[] args) {
	zeroda s1=new zeroda();
	s1.banknifty();
	s1.nifty();
	s1.option();
	
	System.out.println("----Angel------");
	
	Angel s2=new Angel();
	s2.banknifty();
	s2.nifty();
	s2.option();
	
	System.out.println("----Upstock-----");
	 
	Upstock s3=new Upstock();
	 
	s3.banknifty();
	s3.nifty();
	s3.option();
	
	
}
}
