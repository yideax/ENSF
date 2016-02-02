public class average_calculator{
	
	public static void main (String[] args){
		
		int i = args.length;
		double total = 0;
		double average;
	
	for (String str : args){
		
		double temp = Double.parseDouble(str);
		total += temp;
		
		System.out.print(String.format("%.3f", temp) + " ");
		
	}
	
	average = total/i;
	System.out.println();
	System.out.println(String.format("%.3f", average));
	
	}
	}

