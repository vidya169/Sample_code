package Star_pattern;

public class sample5 {
	public static void main(String[] args) {
		int star=7;
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star=star-2;
		}
	}

}
