public class AverageCalculator 
{
	public static void main(String[] args) 
	{
		System.out.print("The " + args.length + " numbers are: ");
		
		double sum = 0;
		double num = 0;
		for (String str : args)
		{	
			sum += Double.parseDouble(str);
			num = Double.parseDouble(str);
			
			System.out.print(String.format("%.3f", num) + " ");
		}
		sum = sum/args.length;
		System.out.println();
		System.out.println("The average of the numbers are: " + String.format("%.3f", sum));
	}
}