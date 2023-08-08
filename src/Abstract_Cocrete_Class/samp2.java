package Abstract_Cocrete_Class;

public class samp2 extends samp1 {
	void method1() {
		System.out.println("Aaj, Aaj ek Haseen aur bant lu, Aaj ek Dua aur mang lu, Aaj ek ansu aur pe lu, Aaj ek Zindagi aur ji loon, Aaj ek Sapna aur dekh loon, Aaj, Kya pata Kal Ho Naa Ho!!!”");
		System.out.println("-----------------------------------------------------------");
	}

	@Override
	void method2() {
		System.out.println("Kabhi akbhi dil jodne ke liye dil todna padta hai, aur dil tod ke jodne wale ko pata nahi kya kehte hain…”");
		System.out.println("-----------------------------------------------------------");
	}
	public void method4() {
		System.out.println("Daray hue log aksar alfazon ke piche chupte hain…”");
		
	}
	
	public static void main(String[] args) 
	{
		System.err.println("Famous Dialogues of  my all time favorite SHAHRUKH KHAN");
		System.out.println("-----------------------------------------------------------");
		samp2 e=new samp2();
		e.method1();
		e.method2();
		e.method3();
		e.method4();
		
		
	}


}
