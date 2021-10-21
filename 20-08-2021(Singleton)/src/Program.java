
public class Program 
{
	public static void main(String args[])
	{
		FoodCourt fd1=FoodCourt.getFoodCourt();
		
	}
}
class FoodCourt
{
	static FoodCourt fd;
	private FoodCourt()
	{
		System.out.println("New food Court created");		
	}
	public static FoodCourt getFoodCourt()
	{
		if(fd==null)
			fd=new FoodCourt();
		return fd;
	}
}