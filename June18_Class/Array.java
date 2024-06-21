package June18_Class;

public class Array {

	public static void main(String[] args) {
		// Array 46 33 44 45 30
		int[] arr = new int [7]; ///0,0,0,0,0
		arr[0]= 34;
		arr[1]= 23;
		arr[2]= 3;
		arr[3]= 53;
		arr[4]= 21;
		arr[5]=6;
		arr[6]=2;
		
		//
		//int[]tt{34,23,3,53,21.6.2}
		//int reverse
		
		System.out.println(arr.length);
		for(int i =0 ;i<7;i++) {
			System.out.println(arr[i]);
			if (arr[i]<17) {System.out.println("pass by grace");
			arr[i]= arr[i]+7;
			}
			
		}
		
	}

}
