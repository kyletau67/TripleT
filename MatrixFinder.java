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

    public String top(String coord, int target, int counter, int[][] matrix) {
    //will return new coord or keep the coord
    currentRow = counter;
    currentCol = counter;
        while((currentCol <= matrix.length - 1)&&(currentRow >= 0)){
            if (matrix[currentRow][currentCol] < target){
                currentCol++; //go right, numbers increase to the right
            }
            if (matrix[currentRow][currentCol] > target){
                currentRow--; //go up, numbers decrease to the top
            }
			if (currentRow == 0 && (currentCol == matrix.length - 1 || currentCol == 0) && matrix[currentRow][currentCol] != target){
				coord = "(-1,-1)";
			}
	    if(currentCol == matrix.length - 1){
		if(matrix[currentRow][currentCol] > target){
		    currentRow --;
		} else {
		    currentRow ++;
		}
	    }
	    if(currentRow == 0){
		if(matrix[currentRow][currentCol] > target){
		    currentCol --;
		} else {
		    currentCol ++;
		}
	    }
            if (matrix[currentRow][currentCol] == target){
                coord = "(" + currentRow + "," + currentCol + ")";
                return coord;
            }
	   

	    
            counter++;
        }
        return coord;
    }


    public String bottom(String coord, int target, int counter, int[][] matrix) {
        currentRow = counter;
        currentCol = counter;
        while((currentCol >= 0) && (currentRow <= matrix.length - 1)){
	    if(matrix[currentRow][currentCol] < target){
		currentRow++;
	    }
	    if(matrix[currentRow][currentCol] > target){
		currentCol--;
	    }
		if (currentCol == 0 && currentRow == 0 && matrix[currentRow][currentCol] != target){
				coord = "(-1,-1)";
			}
	    if(currentCol == 0){
		if(matrix[currentRow][currentCol] > target){
		    currentRow --;
		} else {
		    currentRow ++;
		}
	    }
	    if(currentRow == matrix.length - 1){
		if(matrix[currentRow][currentCol] > target){
		    currentCol --;
		} else {
		    currentCol ++;
		}
	    }

            if (matrix[currentRow][currentCol] == target){
                coord = "(" + currentRow + "," + currentCol + ")";
                return coord;
            }
            counter++;
        }
	return coord;
    }

    public String search(int[][] matrix, int target){
        String coord = "(-1,-1)"; //base coordinates for return
        int counter = 0;
    outer:
        while (counter < matrix.length) {
            if (matrix[counter][counter] > target) {
        break outer; }//if the diagonal # is larger, break
            else {
        counter++; }
        }
        counter--; //go back one diagonal
        coord = top(coord, target, counter, matrix); //replace coord maybe
        coord = bottom(coord, target, counter, matrix); //replace coord maybe
        return coord;



    }
}
