package Exception_Handling;

public class practice3 {
	public static void main(String[] args) {
		int [] arr=new int[5];
		
		try
		{
			arr[6]=20;
			
		}
		catch(NullPointerException s1)
		{
			System.out.println("NullPointer Exception handle");
		}
		catch(ArithmeticException s2)
		{
			System.out.println("Arithmetic Exception handle");
		}
		catch(Exception s3)
		{
			System.out.println("ArrayIndexOutOf Bounds Exception handle");
		}
	}
}
