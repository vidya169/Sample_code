package polymorphism;

public class ex7_overloading {
	
	
		public void mul(int a, int b)
		{
			System.out.println(a*b);
			
		}
		
		
		public void mul(float a, float b)
		{
			System.out.println(a*b);
		}
		
		
		public static void main(String[] args) 
		{
			ex7_overloading e1=new ex7_overloading();
			e1.mul(20, 20);
			e1.mul(8.5f, 2.5f);
		}
		
		
	}


