package Lamda.calculation;
import static Lamda.calculation.Calculator.isPrime;

public class LamdaTest {
	public static int multiplication(int[] numbers, Calculator c) {
		int total = 0;
		for(int n:numbers) {
			if(c.test(n)) {
				total= n*n;
			}
		}
		return total;
		
	}

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8};
		int result = 0;
		Calculator c=new EvenNumber();
		
		
		result = multiplication(numbers, c); 
		//result = multiplication(numbers, (int n)->{return  n%2==0;});  // for evebresult
		System.out.println(result);
		
		result = multiplication(numbers, n->n%2 != 0);  // for multiplication  of all odd numbers from array.
		System.out.println(result);
		
		result = multiplication(numbers, n->isPrime(n));  // for multiplication  of all odd numbers from array.
		System.out.println(result);
		
	}

}
