package String_function2;

public class String_all_function {
	public static void main(String[] args) {
		
		String s1="velocity";
		String s2="VIDYA";
		String s3="abcd";
		String s4="my name is vidya";
		String s6="";
		String s7="abcabab";
		String s8="Vaishnavi";
		String s9="java classes";
		
		
		
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s4.contains("name"));
		
		System.out.println("------------");
		
		System.out.println(s4.isEmpty());
		System.out.println(s1.charAt(2));
		System.out.println(s7.indexOf('n'));
		System.out.println(s7.lastIndexOf('a'));
		
		System.out.println("-----------------");
		
		System.out.println(s8.startsWith("Va"));
		System.out.println(s8.endsWith("vi"));
		System.out.println(s4.substring(3,7));
		System.out.println(s1.substring(3));
		System.out.println(s2.concat(s3));
		System.out.println(s2+s3);
		System.out.println(s9.replace("java", "selenium"));{
			
		}
		
	}

}
