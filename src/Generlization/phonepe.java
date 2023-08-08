package Generlization;

public class phonepe implements Money_transaction {

	@Override
	public void recharge() {
		System.out.println("number");
		
	}

	@Override
	public void transfermoney() {
		System.out.println("selfacc,otheracc");
		
	}

	@Override
	public void CheckBalance() {
		System.out.println("30cr");
		
	}
	public void phonepewallet() {
		System.out.println("20L");
		
	}
	
	public static void main(String[] args) {
		       System.out.println("-------phonepe------");
		phonepe s1=new phonepe();
				s1.CheckBalance();
				s1.recharge();
				s1.transfermoney();
				s1.phonepewallet();
				
				System.out.println("---googlepay-----");
				
		Googlepay s2=new Googlepay();
		s2.recharge();
		s2.transfermoney();
		s2.CheckBalance();
		s2.Googleoaywallet();
		        
		        System.out.println("------paytm----------");
		       
		        paytm s3=new paytm();
		        s3.CheckBalance();
		        s3.recharge();
		        s3.transfermoney();
		        s3.paytmpewallet();
		        
	}


}
