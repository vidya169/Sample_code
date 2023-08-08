package Exception_Handling;

public class practice5 {
	public static void main(String[] args) {
		int []arr=new int[5];
		
		try
		{
			try
			{
				arr[6]=23;
			}
			catch(Exception s1)
			{
				s1.printStackTrace();
				System.out.println("ArrayIndexOutOfBoundsException");
				System.out.println("hi");
			}
			arr[8]=20;
			
		}
		catch(Exception s2)
		{
			s2.printStackTrace();
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("hello");
		}
		
			}
}
