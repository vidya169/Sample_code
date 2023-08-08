package casting;

public class ex8_sub8 extends ex8_super8{
	
	public void Car()
	{
		System.out.println("BMW");
	}
	
	public void Seatcover()
	{
		System.out.println("Change Seat Cover");
	}
	public void Charger()
	{
		System.out.println("We Have to buy New One charger");
	}
	public void Earpod()
	{
		System.out.println("Iphone Ear-Pods");
	}

	
	public static void main(String[] args) 
	{
		ex8_super8 c1 =new ex8_super8();
		c1.Mobile();
		c1.Cover();
		c1.Charger();
		c1.Bill();

}
}