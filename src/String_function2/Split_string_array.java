package String_function2;

public class Split_string_array {
	public static void main(String[] args) {
		String s1="my name is vidya";
		
		String [] ar=s1.split(" ");
		
	   System.out.println(ar[1]);
	 System.out.println(ar.length);
	 
	 System.out.println("print all data from array");
	 
	 for(int i=0;i<=ar.length-1;i++)
	 {
		 System.out.println(ar[i]);
	 }
	}

}
