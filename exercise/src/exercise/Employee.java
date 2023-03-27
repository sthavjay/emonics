package exercise;

public class Employee {

	public static void main(String[] args) {
	 
		for(int number = 2; number<=100;number++) {
				boolean flag=true;
				for(int i=2; i<number;i++) {
					if(number%i == 0) {
						flag=false;
						break;
					}
				}
				if(flag) {
					System.out.println(number+" is Prime");
				}
			
		}
		
	}

}
