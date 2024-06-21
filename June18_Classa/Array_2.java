package June18_Classa;

public class Array_2 {
	public static void main(String[] args) {
		
		int [] arr = {4,7,1,75,31,72};

		//you have to find maximum and minimum element in the array}
		
		        int max = arr[0]; // Assume the first element is the maximum initially
		        int min = arr[0]; // Assume the first element is the minimum initially
		        //for(int a : arr){
		        //if (a>max) {
		        //	max = a;
		        //}
		        //if(a<min) {
		        //min=a;
		        	
		        
		        // Iterate through the array to find max and min
		        for (int i = 1; i < arr.length; i++) {
		            if (arr[i] > max) {
		                max = arr[i]; // Update max if current element is greater
		            }
		            if (arr[i] < min) {
		                min = arr[i]; // Update min if current element is smaller
		            }
		        }
		        
		        // Print the maximum and minimum values
		        System.out.println("Maximum value in the array: " + max);
		        System.out.println("Minimum value in the array: " + min);
		    }
		}

		
	}
}
