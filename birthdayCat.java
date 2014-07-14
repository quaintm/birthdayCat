public class birthdayCat
{

	public static void main( String[] args)
	{
		cat present = new cat("Mephistopheles");
		
		System.out.println(present.toString());
		int numPettings = 5;
		System.out.println("You attempt to pet the cat "+numPettings+" times: ");
		System.out.println(present.petTheCat(numPettings));
		System.out.println("You swear at the cat. His response is "+present.mow()+".");
	}
}