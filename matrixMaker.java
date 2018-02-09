public class matrixMaker{
    int size;
    int[][] apple;
    int[][] banana;
    static int[][] saved;
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
  int minimum = 0;
  for(int i = 0; i < size; i++){
    banana[0][i] = i;
    banana[i][0] = i;
  }
  for(int i = 1; i < size; i++){
    for(int j = 1; j < size; j++){
      minimum = Math.max(banana[i][j-1], banana[i-1][j]);
      banana[i][j] = minimum + (int)(Math.random() * 4) + 1;
    }
  }
    }
    public String displayApple(){
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
  public String displayBanana(){
  	String retstr = "";
  	for(int i = 0; i < banana.length; i++){
  	    retstr += "[ ";
  	    for(int j = 0; j < banana.length; j++){
  		retstr += banana[i][j];
  		retstr += " ";
  	    }
  	    retstr += "]\n";
  	}
  	return retstr;
  }
      public String displaySaved(){
  	String retstr = "";
  	for(int i = 0; i < saved.length; i++){
  	    retstr += "[ ";
  	    for(int j = 0; j < saved.length; j++){
  		retstr += saved[i][j];
  		retstr += " ";
  	    }
  	    retstr += "]\n";
  	}
	saveMatrix();
  	return retstr;
  }
    public void saveMatrix(){
	saved = banana;
    }
    public static void main(String[] args){
	matrixMaker defMatrix = new matrixMaker(30);
	defMatrix.newMatrix();
  defMatrix.Matrix2();
        System.out.println(defMatrix.displayBanana());
	if(saved == null){
	    defMatrix.saveMatrix();
	}
	System.out.println("\n=======================================\n");
	System.out.println(defMatrix.displaySaved());
    }

}
