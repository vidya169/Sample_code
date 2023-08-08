package Array2;

public class sample4 {
	public static void main(String[] args) {
		 int [] arr=new int[4];
		 
		 arr[0]=12;
		 arr[1]=10;
		 arr[2]=15;
		 arr[3]=20;
		 
		 System.out.println("print all data");
		 
		 for(int i=0;i<=arr.length-1;i++)
		 {
			 System.out.println(arr[i]);
			 
		 }
		 
		 System.out.println("reverse order array");
		 for(int i=arr.length-1;i>=0;i--)
		 {
			 System.out.println(arr[i]);
		 }
		 
	}

}
