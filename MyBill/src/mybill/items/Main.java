package mybill.items;

import mybill.utilities.Returnable;
import mybill.utilities.UtilityBuilder;

public class Main {
	public static void returnPolicy(Returnable r) {
	r.doReturn();
		
	}
	
	public static void printDetails(Utility u) {
		if(u instanceof Returnable) {
			System.out.println(u);
			returnPolicy((Returnable)u);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("checking for running progrm?");
		
		Utility[] items = UtilityBuilder.generateUtilityItems();
		for(Utility item:items) {
			printDetails(item);
		}
		

	}
	
	

}
