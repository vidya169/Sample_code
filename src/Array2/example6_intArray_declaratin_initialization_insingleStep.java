package Array2;

public class example6_intArray_declaratin_initialization_insingleStep {
	public static void main(String[] args) {
		
		int [] ar= {30,20,40,10,50};
		String [] ab= {"vidya","snehal","rajat","nishant","nikhiraj"};
		
		System.out.println(ar.length);
		System.out.println("print all data int");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("print string data");
		
		for(int j=0;j<=ab.length-1;j++)
		{
			System.out.println(ab[j]);
		}
	}
}
