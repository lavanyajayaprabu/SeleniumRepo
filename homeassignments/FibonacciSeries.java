package homeassignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 0 1 1 2 3 5 8 13
		
		//num1=0 1 1 2
		//num2=1 1 2 3
		//add= 1 2 3 5
		
			int num1=0;
    		int num2=1;
    		
    		for (int i = 0; i <= 7; i++) {
    			System.out.print( num1 );

    			int add = num1 + num2;
    			num1 = num2;
    			num2 = add;
      
      
    }
  }
}