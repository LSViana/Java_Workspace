package playground;
import javax.swing.JFrame;
public class ch6_13_Ex1Test {
	public static void main(String[] args) {
		ch6_13_Ex1 panel = new ch6_13_Ex1();
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(215, 235);
		application.setVisible(true);
	}
}
