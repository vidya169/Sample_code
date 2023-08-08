package Exception_Handling;

public class practice2 {
	public static void main(String[] args) {
		int [] arr=new int[3];
		
		
		try
		{
			arr[4]=10;
		}
		catch(ArrayIndexOutOfBoundsException s1)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
			s1.printStackTrace();
		}
	
	}
}
