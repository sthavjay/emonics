package mybill.utilities;

import mybill.items.Tent;
import mybill.items.Utility;

public class UtilityBuilder {
	public static Utility[] generateUtilityItems() {
		
		Utility[] allutility = new Utility[4];
		allutility[0] = new Tent(1, 100, 6, 'R', 'M');
		allutility[1] = new Tent(2, 40.60, 2, 'G', 'S');
		allutility[2] = new Tent(3, 389.90, 4, 'B', 'L');
		allutility[2] = new Utility(4, 389.90, 2);
		return allutility;
	}

}
