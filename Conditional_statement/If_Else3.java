package Conditional_statement;
import java.util.*;

public class If_Else3 {

	public static void main(String[] args) {
		// =<> 
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		// We can use if(Condition1){
		// stt1
		// stt2
		// } else if (Condition2) {
		// stt3
		// stt4
		// }
		// else {
		// stt5
		// stt6
		// }
		// Single condition m {} imp. nhi h 
		
		if (a==b) {
			System.out.println("Equal");
		}else{
			if(a>b) {
			System.out.println("A is greater");
			}else {
				System.out.println("A is lesser");
			}
		}
		

	}

}
