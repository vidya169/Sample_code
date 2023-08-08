package polymorphism;

public class ex8_overloading {
	public void Str(String s1, String s2)
	{
		System.out.println(s1==s2);

		System.out.println(s1+s2);

	}
	
	public void Str(String s1, String s2, String s3)
	{
		System.out.println(s1+s2+s3);
	}
	
	public void Str(char s3, char s4)
	{
		System.out.println(s3==s4);
		
		System.out.println(s3 +" " + " " +s4);
	}
	
	public static void main(String[] args) 
	{
		ex8_overloading e1= new ex8_overloading();
		e1.Str("Vidya", "Chavan");
		e1.Str('A', 'B');
		e1.Str("Hello Welcome", " To Java" , " World");
	}


}
