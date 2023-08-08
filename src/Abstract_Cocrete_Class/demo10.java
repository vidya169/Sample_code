package Abstract_Cocrete_Class;

public class demo10 extends demo9 {

	
	int a=20;
	int b=30;
	public void s2() {
		System.out.println(a+b);
		
	}

	@Override
	public void s3() {
		System.out.println(a*b);
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		demo10 a=new demo10();
	    a.s1();
		a.s2();
		a.s3();
	}
	
}
	
	
		
		
