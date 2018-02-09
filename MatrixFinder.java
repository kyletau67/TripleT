/*Team Triple T's (Kyle Tau, Angela Tom, Simon Tsui)
  APCS2 pd 2
  HW03 -- I Am Still Searching
  2018-02-02 */

/* Our algo first runs through the diagonal from the top left corner. When the next number that the algo checks in the diagonal is greater than the target, the algo stops at the number previous (not bigger than target). Then it searches in linear fashion in both the top half of the diagonal and the bottom half of the diagonal. */

public class MatrixFinder {
    public int currentRow;
    public int currentCol;
    public static void main(String[] args) {
        MatrixFinder yes = new MatrixFinder();
        int[][] m = new int[3][3];
        m[0][0] = 1;
        m[0][1] = 2;
        m[0][2] = 3;
        m[1][0] = 2;
        m[1][1] = 3;
        m[1][2] = 4;
        m[2][0] = 3;
        m[2][1] = 4;
        m[2][2] = 5;
        System.out.println(yes.search(m , 2));
        int[][] m2 = new int[4][4];
        m2[0][0] = 1;
        m2[0][1] = 3;
        m2[0][2] = 5;
        m2[0][3] = 7;
        m2[1][0] = 2;
        m2[1][1] = 4;
        m2[1][2] = 6;
        m2[1][3] = 8;
        m2[2][0] = 4;
        m2[2][1] = 5;
        m2[2][2] = 10;
        m2[2][3] = 12;
        m2[3][0] = 9;
        m2[3][1] = 11;
        m2[3][1] = 13;
        m2[3][3] = 16;
        System.out.println(yes.search(m2, 12));


        int[][] m3 = new int[1][1];
    m3[0][0] =5;

    System.out.println(yes.search(m3, 5)); // In the matrix

    System.out.println(yes.search(m3, 10)); // Not in the matrix



    }

    public String search(int[][] matrix, int target){
        String coord = "(-1,-1)"; //base coordinates for return
        int row = 0;
	int col = matrix.length-1;
	while ( row < matrix.length && col >= 0){
	    if(matrix[row][col] == target){
		coord = "( " + row + "," + col + " )";
		return coord;
	    }
	    if(matrix[row][col] > target){
		col --;
	    } else {
		row ++;
	    }
	}
	return coord;



    }
}
