package polymorphism;

public class ex4_overriding_son4 extends ex4_overriding_father4  {
	public void BJP()
	{
		System.out.println("Narendra Modi");
	}

	public void Congress()
	{
		System.out.println("Rahul Gandhi");
	}
	
	public void Shivsena()
	{
		System.out.println("Uddhav Thakre");
	}
	
	public void MNS()
	{
		System.out.println("Raj Thakre");
	}
	
	public void Apaksh()
	{
		System.out.println("Vidarabh vegla Zala ch pahije");
	}
	
	
	
	public static void main(String[] args) 
	{
		System.out.println("Uche Log");

		
		ex4_overriding_father4 e1 = new  ex4_overriding_father4();
		e1.BJP();
		e1.Congress();
		e1.Shivsena();
		e1.MNS();
		
		System.out.println("================================");

	
		System.out.println("Vidarbh Vegla Kara");

		ex4_overriding_son4 e2 = new ex4_overriding_son4();
		e2.BJP();
		e2.Congress();
		e2.Shivsena();
		e2.MNS();
		e2.Apaksh();
		
	}

}
