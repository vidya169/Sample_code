package Array2;

public class eaample2_StringArray {
	
public static void main(String[] args) {
	String [] ar=new String[5];
	
	ar[0]="vidya";
	ar[1]="snehal";
	ar[2]="sushant";
	ar[3]="rajat";
	ar[4]="nikhiraj";
	
	System.out.println(ar.length);
	System.out.println("==print all data==");
	
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
		
	}
	
}
}
