package playground;
public class staticObject {
	public static final double staticVariable = 1;
	String color;
	public static final staticObject gray = new staticObject(1);
	public static final staticObject black = new staticObject(2);
	public enum Colors { BLACK, WHITE, BLUE };
	staticObject() {
		color = "No color";
	}
	staticObject(int n) {
		switch(n) {
			case 1: color = "Gray"; break;
			case 2: color = "Black"; break;
		}
	}
}
