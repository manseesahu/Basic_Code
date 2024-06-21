package Array_Question;

public class Increment_Matrix_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
	            { 2, 3, 5 },
	            { 6, 7, 2 },
	            { 2, 4, 8 }
	        };
	        System.out.println("Matrix incremented by 1");
	        for (int i = 0; i < matrix.length; i++) {
	         for (int j = 0; j < matrix[i].length; j++) {
	               
	         int incrementedValue = matrix[i][j] + 1;
	          System.out.print(incrementedValue + " ");
	            }
	            System.out.println(); 
	        }
	    }
	
	}


