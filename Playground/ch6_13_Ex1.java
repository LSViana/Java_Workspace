package playground;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;
public class ch6_13_Ex1 extends JPanel {
	public static Random randomColor = new Random();
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Color fillColor1 = new Color(randomColor.nextInt(256), randomColor.nextInt(256), randomColor.nextInt(256));
		Color fillColor2 = new Color(randomColor.nextInt(256), randomColor.nextInt(256), randomColor.nextInt(256));
		g.setColor(fillColor1);
		g.fillOval(10, 10, 180, 180);
		g.setColor(fillColor2);
		g.fillOval(30, 30, 140, 140);
		g.setColor(fillColor1);
		g.fillOval(50, 50, 100, 100);
		g.setColor(fillColor2);
		g.fillOval(70, 70, 60, 60);
		g.setColor(fillColor1);
		g.fillOval(90, 90, 20, 20);
	}
}
