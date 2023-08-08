package String_function2;

public class sample3 {
	public static void main(String[] args) {
      String str1 = "rajat,Vidya,nikhiraj,snehal,sushant,aniket";
      
      
		String [] str2 = str1.split("," , 6);
		
		for(String a : str2)
		System.out.println(a);
		
		System.out.println("===============");

		
		String str3 = " My@Name@Is@Vidya";
		
		String [] str4 = str3.split("@" , 4);
		
		for(String b : str4)
		System.out.println(b);
		
		System.out.println("======Concatination of str1 & str3=========");

		String c = str1.concat(str3);
		System.out.println(c);
		
		
		
		
		
		
	}
	}


