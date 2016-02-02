/**
 * Provides a Pascal's Triangle.
 * 
 * The overall purpose is to learn how to use arrays.
 *
 * @author Harry Han
 * @version 1.0
 * @since January 22, 2016
 */
 public class Triangle {
 	/**
 	 * Pascal Triangle
 	 */
	private int [][] triangle;
	private int size;

	public Triangle() {
	/**
	 * The default constructor
	 */
	}

	public Triangle (int s) {
	/**
	 * The overloaded constructor. 
	 * Generates the Triangle with to the assigned size.
	 */
		size = s;

		triangle = new int [size][];
		for (int i = 0; i < size; i++) {
			triangle[i] = new int [i + 1];
		}

		this.fillTriangle();
	}

	public void fillTriangle() {
	/**
	 * Fills the generated Triangle
	 */
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < i + 1; j++) {
				if (j == 0 || j == i){
					triangle[i][j] = 1;
				}
				else {
					triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
				}
			}
		}
	}

	public void printTriangle() {
	/**
	 * Prints the generated triangle
	 */
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.printf("%-5d", triangle[i][j]);
			}
			System.out.println();
		}
	}

	public int[] sumRows() {
	/**
	 * Sums all the rows of the generated triangle
	 */
		int[] arr = new int[size];
		int sum = 0;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < i + 1; j++) {
				sum+=triangle[i][j];
			}
			arr[i] = sum;
			sum = 0;
		}

		return arr;
	}

	public int[] sumCols() {
	/**
	 * Sums all the columns of the generated triangle
	 */
		int[] arr = new int[size];
		int sum = 0;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i; j++) {
				sum+=triangle[j+i][i];
			}
			arr[i] = sum;
			sum = 0;
		}

		return arr;
	}

	public int size() {
	/**
	 * Returns the size of the triangle (rows)
	 */
		return size;
	}

	public static void main(String[] args) {
		if(args.length < 1 ) {
			System.err.println("Sorry this program needs an integer argument.");
			System.exit(1);
		}

		Triangle pt = new Triangle(Integer.parseInt(args[0]));
		pt.printTriangle();

		int [] sum_rows = pt.sumRows();
		System.out.println("\nHere are the sum of rows:");
		
		for(int i =0; i < pt.size(); i++)
			System.out.println(sum_rows[i]);
 
		int [] sum_cols = pt.sumCols();
		System.out.println("\nHere are the sum of columns:");
		
		for(int i =0; i < pt.size(); i++)
			System.out.printf( "%-5d", sum_cols[i]);
			
		System.out.println();
	}
}
