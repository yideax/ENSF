import java.util.ArrayList;


public class TriangleAL {

	ArrayList<ArrayList<Integer>> triangle;
	private int size;

	public TriangleAL() {
	}

	public TriangleAL (int s) {
		size = s;
		triangle = new ArrayList<ArrayList<Integer>>();

		this.fillTriangle();
	}
	
	public void fillTriangle() {
		int row = 0;
		while(row < size) {
			triangle.add(new ArrayList<Integer>());
			row++;
			}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < i + 1; j++) {
				if (j == 0 || j == i){
					triangle.get(i).add(j, 1);
				}
				else {
					triangle.get(i).add(j, triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
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
				System.out.printf("%-5d", triangle.get(i).get(j));
			}
			System.out.println();
		}
	}

	public ArrayList<Integer> sumRows() {
	/**
	 * Sums all the rows of the generated triangle
	 */
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int sum = 0;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < i + 1; j++) {
				sum+=triangle.get(i).get(j);
			}
			arr.add(i, sum);
			sum = 0;
		}

		return arr;
	}
	
	public ArrayList<Integer> sumCols() {
	/**
	 * Sums all the columns of the generated triangle
	 */
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int sum = 0;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i; j++) {
				sum+=triangle.get(j+i).get(i);
			}
			arr.add(i, sum);
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

		TriangleAL pt = new TriangleAL(Integer.parseInt(args[0]));
		pt.printTriangle();

		ArrayList arr = new ArrayList();
		arr = pt.sumRows();
		System.out.println("\nHere are the sum of rows:");
		
		for(int i =0; i < pt.size(); i++)
			System.out.println(arr.get(i));

		arr.clear();
 
		arr = pt.sumCols();
		System.out.println("\nHere are the sum of columns:");
		
		for(int i =0; i < pt.size(); i++)
			System.out.printf( "%-5d", arr.get(i));
		System.out.println();
	}

}
