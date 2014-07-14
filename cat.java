import java.util.ArrayList;
import java.util.Random;

public class cat
{
	String name;
	String color = "orange";
	String attitude = "meh";
	
	public cat(String n)
	{
		name = n;
	}
	
	public ArrayList<String> petTheCat(int pettings)
	{
		ArrayList<String> pettingResults = new ArrayList<String>();
		Random random = new Random();
		for (int i = 0; i<pettings; i++){
			if (random.nextDouble() < 0.3){
				pettingResults.add("purring occurs");
			}
			else{
				pettingResults.add("murder occurs");
			}
		}
		return pettingResults;
	}
	
	public String mow()
	{
		Random random = new Random();
		if (random.nextDouble() < 0.7)
			return "mow";
		else
			return "hiss";
	}
	
	public String toString()
	{
		return "This "+color+" cat's name is "+ name + 
				", and his attitude is decidedly "+attitude+".";
	}
}