package mirror.items;

import java.util.Arrays;
import java.util.Random;

public class Numbers {
	
	public static void matrix(int[][] a) {  
		Random random = new Random(); // created a Random Class object "random" using java.utility
		for(int i = 0; i<a.length; i++) {
			for (int j = 0; j<a.length; j++) {
				int randomNumber = random.nextInt(100); // gave a range to 0-100
				a[i][j]= randomNumber;
			}
			//System.out.println(Arrays.toString(a[i]));
			
			int[][] copy = new int[a.length][];
			for (int k = 0; k < 1; k++) {
	            copy[k] = a[i].clone(); 
	        
			System.out.println(Arrays.toString(copy[k]));
		}
		
		}
	}

}
