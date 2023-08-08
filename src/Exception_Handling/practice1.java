package Exception_Handling;

public class practice1 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c;
		
		try
		{
			c=a/b;
		}
		catch(ArithmeticException s1)
		{
			System.out.println("arithmatic exception handled");
			s1.printStackTrace();
		}
	
	}
}
