package Array2;

public class example3_chararray {
	public static void main(String[] args) {
		
		char [] ar=new char[5];
		
		ar[0]='A';
		ar[1]='A';
		ar[2]='A';
		ar[3]='A';
		ar[4]='A';
		
		System.out.println(ar.length);
		System.out.println("===print all information==");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
	}

}
