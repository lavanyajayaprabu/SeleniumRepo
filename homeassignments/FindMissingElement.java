package homeassignments;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input -> {1,4,3,2,8,6,7}
		// 1,2,3,4,6,7,8
		
		int[] input= {1,4,3,2,8,6,7};
		Arrays.sort(input); // 1,2,3,4,6,7,8
		
		for(int i=0; i<input.length-1; i++) {
			
		if (((input[i+1])-(input[i])!=1)) {
				System.out.println("The missing element is:"+((input[i])+1));
		}
			}
			
		
	}

}
