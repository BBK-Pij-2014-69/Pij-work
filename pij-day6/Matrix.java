public class Matrix{
	public int[][] matrix;
	
	public Matrix(int row,int column){
		matrix = new int[row][column];
		for (int r = 0; r < row; r++){
			for (int c = 0; c < column; c++){
				matrix [r][c] = 1;
			}
		}
	}
	
	public void setElement(int row,int column, int newVal){
		if (checkRowIndex(row)==false){
			return;
		}else if (checkColumnIndex(column)==false){
			return;
		}
		matrix[row][column] = newVal;
	}
	
	public boolean checkRowIndex(int index){
		if (index >= matrix[0].length){
			return false;
		}
		return true;
	}
	
	public boolean checkColumnIndex(int index){
		if (index >= matrix.length){
			return false;
		}
		return true;
	}
	
	public void setRow(int row,String str){
		if (checkRowIndex(row)==false){
			return;
		}
		int[] string = getIntegers(str);
		if (string.length != matrix[row].length){
			return;
		}else{
			for (int i=0; i < matrix[row].length; i++){
				matrix[row][i]=string[i];
			}
		}
	}
	
	public void setColumn(int column,String str){
			if (checkColumnIndex(column)==false){
				return;
			}
			int[] string = getIntegers(str);
			if (string.length != matrix[0].length){
				return;
			}else{
				for (int i=0; i < matrix[0].length; i++){
					matrix[i][column]=string[i];
				}
			}
	}
	
	public int[] getIntegers(String str){
		int n = (str.length()+1)/2;
		int[] string = new int[n];
		int p = 0;
		for (int i=0;i<str.length();i++){
			if (Character.isDigit(str.charAt(i))){
				string[p]=Integer.parseInt(str.substring(i,i+1));
				//System.out.println (string[p]);
				p=p+1;
			}
		}
		return string;
	}
	
	public void tostring(){
		String str = ("[");
		for (int r = 0; r < matrix.length; r++){			
			for (int c = 0; c < matrix[r].length; c++){
				if (c != matrix[r].length-1){
					str = (str + matrix[r][c] + ",");
				}else{
					str = (str + matrix[r][c] + ";");
				}
			}
		}
		str = (str.substring(0,str.length()-1) + "]");
		System.out.println(str);
	}
	
	public void prettyPrint(){
		for (int r = 0; r < matrix.length; r++){
			for (int c = 0; c < matrix[r].length; c++){
				System.out.print (matrix[r][c] + "\t");
			}
			System.out.println ("");
		}
	}
}