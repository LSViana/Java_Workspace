package playground;
import javax.swing.JFrame;
public class DrawSmileTest {
	public static void main(String[] args) {
		DrawSmile panel = new DrawSmile();
		JFrame application = new JFrame();
		// Configurando comportamento da área JFrame
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(230, 250);
		application.setVisible(true);
	}
}
