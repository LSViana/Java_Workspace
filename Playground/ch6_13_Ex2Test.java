package playground;
import javax.swing.JFrame;
public class ch6_13_Ex2Test {
	public static void main(String[] args) {
		ch6_13_Ex2 panel = new ch6_13_Ex2();
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(230, 250);
		application.setVisible(true);
	}
}
