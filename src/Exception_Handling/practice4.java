package Exception_Handling;

public class practice4 {
	public static void main(String[] args) {
		int [] arr=new int[5];
		int a=10;
		int b=0;
		int c;
		
		
		try
		{
			arr[6]=20;
		}
		catch(ArrayIndexOutOfBoundsException s1)
		{
		System.out.println("ArrayIndexOutOfBounds Exception handle");
		}
		System.out.println("good night");
		System.out.println("====================");
		try
		{
			c=a/b;
			
		}
		catch(ArithmeticException s2)
		{
			System.out.println("Arithmetic Exception handle");
		}
		
		System.out.println("vidya");
		System.out.println("chavan");
		
		
		
		
		
		
		
		
		
		
		
			}
}
