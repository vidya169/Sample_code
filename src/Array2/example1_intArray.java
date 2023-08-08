package Array2;

public class example1_intArray {
	public static void main(String[] args) {
		
		int[] ar=new int[5];     //array declarisation
		
		ar[0]=40;               //array initialistion
		ar[1]=50;
		ar[2]=10;
		ar[3]=30;
		ar[4]=20;
		
		//array usages
		
		System.out.println(ar[0]);
	    System.out.println(ar.length);
	    
	    System.out.println("===print all info in array===");
	    
	    for(int i=0;i<=4;i++)
	    {
	    	System.out.println(ar[i]);
	    }
	    
			
		}
		
	}


