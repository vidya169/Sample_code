package String_function2;

public class sample4 {
	public static void main(String[] args) {
		String str1= " vidya, snehal, rajat, nikhiraj, sushant";
		String []  ar=str1.split(",");
		
		
		for(String a:ar)
		{
			System.out.println(a);
		}
		System.out.println("-------------------");
		
		String str2=" my@ name@ is@ vidya";
		String [] arr=str2.split("@", 3);
		
		for(String b:arr)
		{
			System.out.println(b);
		}
		
		System.out.println("-------concat both string----------------");
		 
		String str3=(str1+str2);
		System.out.println(str3);
		
		
		// String str4=a.concat(b);
		// System.out.println(str4);
	}

}
