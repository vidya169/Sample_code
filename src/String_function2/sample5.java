package String_function2;

public class sample5 {
	public static void main(String[] args) {
		String str1=" vidya, prabhakar, chavan";
		String [] a=str1.split(",");
		
		for(String arr:a)
		{
			System.out.println(arr);
		}
		
		System.out.println("------------------------");
		
		String str2=" my@ name@ is@ vidya";
		String [] b=str2.split("@");
		
		for(String arr2:b)
		{
			System.out.println(arr2);
		}
		
		System.out.println("========================");
		
		String str3=" vidya, snehal, rajat, nikhiraj, sushant ";
		String [] c=str3.split(",");
				
				for(String arr3:c)
				{
					System.out.println(arr3);
				}
				String str4=" vidya, prabhakar, chavan";
				String str5=" Vidya, Prabhakar, Chavan";
				
		System.out.println("--------------------------------");	
		System.out.println(str1+str2+str3);
		System.out.println(str3.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str2.charAt(3));
		System.out.println(str1.length());
		System.out.println(str1.contains(str3));
		System.out.println(str1.contains(str4));
		System.out.println(str1.equals(str4));
		System.out.println(str1.equals(str5));
		System.out.println(str1.equalsIgnoreCase(str5));
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.compareToIgnoreCase(str3));
		System.out.println(str1.indexOf('a'));
		System.out.println(str1.repeat(3));
		System.out.println(str1.replace("vidya", "chavan"));
		System.out.println(str1.substring(4));
		System.out.println(str1.contains("vidya"));
		System.out.println(str1.contains("snehal"));
		
		
	}

}
