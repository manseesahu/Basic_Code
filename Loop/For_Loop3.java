package Loop;
import java.util.*;

public class For_Loop3 {

	public static void main(String[] args) {
		//print the sum of first n natural number
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i =0; i<=n; i++) {
			sum =sum + i;
		}
			System.out.println(sum);
		}
		
		
	}


