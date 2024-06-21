package June18_Classa;

public class Array_even {

	public static void main(String[] args) {

        // 2   3   5
		//6    7   2  
		//2    4   8
		// write the even number from this matrix 
		 int[][] matrix = {
		            { 2, 3, 5 },
		            { 6, 7, 2 },
		            { 2, 4, 8 }
		        };

		        // Loop through each element of the matrix
		        System.out.print("Even numbers in the matrix:");
		        for (int i = 0; i < matrix.length; i++) {
		            for (int j = 0; j < matrix[0].length; j++) {
		                // Check if the number is even
		                if (matrix[i][j] % 2 == 0) {
		                    System.out.print(matrix[i][j]); // Print the even number
		                }
		           
		            System.out.println();
		            }
		        }
		    }
		
	}

