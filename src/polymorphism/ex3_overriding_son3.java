package polymorphism;

public class ex3_overriding_son3 extends ex3_overriding_father3 {
	public void axix()
	{
		System.out.println("axix: 300L");
	}
	public void hdfc()
	{
		System.out.println("hdfc: 400L");
	}
	public void kotak()
	{
		System.out.println("kotak: 500L");
	}
	 public void sbi()
	  {
		  System.out.println("sbi: 600L");
	  }
	 public static void main(String[] args) {
		
	
	 ex3_overriding_son3 v1=new ex3_overriding_son3 ();
	 v1.axix();
	 v1.hdfc();
	 v1.kotak();
	 v1.sbi();


}
}
