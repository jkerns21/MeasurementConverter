
public class MeasurementConverter 
{

	public static void main (String []args)
	{
		
	}
	
	public static float feetToInches(float feet)
	{
		float inches;
		inches = feet * 12;
		return inches;
	}
	
	public static float milesToFeet (float miles)
	{
		float feet = miles * 5280;
		return feet;
	}
}
