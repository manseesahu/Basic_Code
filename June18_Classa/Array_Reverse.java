package June18_Classa;

public class Array_Reverse {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
    int [] arr = {23,27,75,83,24};
    //you have to find weather 83 is present 
    boolean flg = false;
  for(int ssi: arr) {
	  if(ssi ==83) {
		  flg= true;
		  System.out.println("yes");
	  }
  }
  if (flg==false) {
	  System.out.println("no");
  }
	
}}