package control_statements;

public class Nested_ifelse {
	public static void main(String[] args) {
		int age=17;
		int weight=49;
		if(age>=18)
		{
			System.out.println("your age is : age>18");
			if(weight>=50)
			{
				System.out.println("your eligible for blood nonation");
			}
			else
			{
				System.out.println("your weight not eligible for donating");
			}
		}
		else
		{
			System.out.println("your not eligible for blood donating your under 18");
		}
	}

}
