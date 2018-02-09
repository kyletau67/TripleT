public class MFDriver{
    static long startTime;
    static long endTime;
    public static void main(String[] args) {
	matrixMaker matrix1 = new matrixMaker(100);
	MatrixFinder searcher = new MatrixFinder();
	matrix1.newMatrix();
	startTime = System.currentTimeMillis();
	for(int i = 0; i < 10000; i++){
	System.out.println(MatrixFinder.search(matrix1.apple, 5092));
	}
	endTime = System.currentTimeMillis();
	System.out.println("Time elapsed: " + (endTime - startTime));
    }
}
