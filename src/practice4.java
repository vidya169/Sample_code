
public class practice4 {
	public static void main(String[] args) {
		String ab="vidya chavan";
		String[] v1=ab.split(" ");
		
		for(int i=0;i<=v1.length-1;i++)
		{
			System.out.println(v1[i]);
		}
		System.out.println("=============");
		
		String ab1="vidya chavan";
		String[] v2=ab.split(" ");
		
		for(int i=0;i<=v1.length-1;i++)
		{
			System.out.println(v2[i]);
		}
		
		String c=ab.concat(ab1);
		System.out.println(c);
	}

}
