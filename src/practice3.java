
public class practice3 {
	public static void main(String[] args) {
		String arr="vidya,snehal,vaishnavi ";
		String[] arr2=arr.split(",", 3);
		
		for(int i=0;i<=arr2.length-1;i++)
		{
			System.out.println(arr2[i]);
		}
		
		System.out.println("=================");
		
		String v1="vidya@prabhakar@chavan";
		String[] v2=v1.split("@",3 );
		for( int j=0;j<=v2.length-1;j++)
		{
			System.out.println(v2[j]);
		}
		System.out.println("==================");
		String con=arr.concat(v1);
		System.out.println(con);
		
		System.out.println("================");
       				
	}

}
