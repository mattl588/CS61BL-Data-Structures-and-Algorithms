
public class arrayPractice {
	public static void main(String[] args) {
	int[] x = new int[] {1,2,3,4,5};
	int[] y;
	System.out.println(x[0]);
	y = x; //assigning x to y. entire array is transferred, and not just a reference. 
	x = new int[]{5,6,7,8,9}; //changing x doesn't change y. 
	System.out.println(x[0]);
	System.out.println(y[0]);
	
	
	int[][] pascalsTriangle; //2D array in format [rows][columns]
	pascalsTriangle = new int[4][]; //now has 4 rows. 
	int[] rowZero = pascalsTriangle[0];

	pascalsTriangle[0] = new int[]{1};
	pascalsTriangle[1] = new int[]{1, 1};
	pascalsTriangle[2] = new int[]{1, 2, 1};
	pascalsTriangle[3] = new int[]{1, 3, 3, 1};
	int[] rowTwo = pascalsTriangle[2];
	rowTwo[1] = -5;

	int[][] matrix;
	matrix = new int[4][];
	matrix = new int[4][4];

	int[][] pascalAgain = new int[][]{{1}, {1, 1},
	                                {1, 2, 1}, {1, 3, 3, 1}};

	}
}
