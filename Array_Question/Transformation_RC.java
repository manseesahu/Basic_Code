package Array_Question;

public class Transformation_RC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [ ] [] mat =	{{3, 4	},
				{1,2,3,4 },
				{ 5,6,7,8},
				{9,10,11,12}};
		
		 for (int i = 0; i < mat.length; i++) {
	            for (int j = 0; j < mat[i].length; j++) {
	                System.out.print((mat[i][j] + 1) + " ");
	            }
	            System.out.println();
	        }

	}

}	
			





