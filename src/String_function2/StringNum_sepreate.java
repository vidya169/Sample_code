package String_function2;

public class StringNum_sepreate {
	public static void main(String[] args) {
		String a="page2 not found error 404 #";
		
		System.out.println(a.replaceAll("[^0-9]"," "));   //^ Circumflex    ^ accept
		System.out.println(a.replaceAll("[0-9]",""));
		System.out.println(a.replaceAll("[A-Z]",""));
		
		
	}

}
