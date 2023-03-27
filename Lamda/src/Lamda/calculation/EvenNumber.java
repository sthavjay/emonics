package Lamda.calculation;

public class EvenNumber implements Calculator{

	@Override
	public boolean test(int a) {
		return (a % 2 == 0);  // for even result
	}
		
	
}