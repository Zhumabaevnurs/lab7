
public class TwoDimArray {

	public static int[][] myArray = {{1,2,3},{4,5,6},{7,8,9}};
	
	public static void main(String[] args) {
		myArray=fillArray("twodimesion.txt"); // args[0] represents the file name
		printArray(myArray);
		printArrayEven(myArray);
	}
	private static void printArray (int[][] theArray) {
		for (int i=0; i<theArray.length; i++) {
			for (int j=0; j<theArray[i].length;j++)
				display(theArray[i][j]);
			System.out.println();
		}
	}
	private static void display (int num){
		if(num<10)// single digit number, then put one more space
		System.out.print(num+" ");
		else //two diigits number
			System.out.print(num+" "); //for the two digits number, only put one space
	}
	private static void printArrayEven(int[][] theArray){
		for (int i=0; i<theArray.length; i++) { //row: theArray, length
			for (int j=0; j<theArray[i].length;j++) { //col:theArray[i].length
				if(theArray[i][j]%2==0) //even
				display(theArray[i][j]);
			    else //odd
			    	System.out.print("*  "); // it should have two white space
			}
			System.out.println();
		}
	}
	
	public static int[][] fillArray(String myFile){
		TextFileInput tfi = new TextFileInput(myFile);
		int row=Integer.parseInt(tfi.readLine()); //"4"
		int col=Integer.parseInt(tfi.readLine()); // "5"
		int[][] arr= new int[row][col]; // create a 2D array
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j]=Integer.parseInt(tfi.readLine());
			}
		}
		return arr;
	}
	
	
}
