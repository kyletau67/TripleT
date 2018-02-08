public class matrixMaker{
    int size;
    int[][] apple;
    int[][] banana;
    public matrixMaker(){
	size = 10;
    }
    public matrixMaker(int newSize){
	size = newSize;
    }
    public void newMatrix(){
	int[][] retMatrix = new int[size][size];
	apple = new int[size][size];
	int ctr = 0;
	for(int i = 0; i < size; i++){
	    for(int j = 0; j < size; j++){
		retMatrix[i][j] = ctr;
		apple[i][j] = ctr;
		ctr++;
	    }
	}
    }
    public void Matrix2(){
	banana = new int[size][size];
    }
    public String display(){
	String retstr = "";
	for(int i = 0; i < apple.length; i++){
	    retstr += "[ ";
	    for(int j = 0; j < apple.length; j++){
		retstr += apple[i][j];
		retstr += " ";
	    }
	    retstr += "]\n";
	}
	return retstr;
    }
    public static void main(String[] args){
	matrixMaker defMatrix = new matrixMaker(100);
	defMatrix.newMatrix();
        System.out.println(defMatrix.display());
    }

}
