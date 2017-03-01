package playground;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class DrawSmile extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 200, 200); // Forma do rosto
		g.setColor(Color.BLACK);
		g.fillOval(55, 65, 30, 30); // Olho esquerdo
		g.fillOval(135, 65, 30, 30); // Olho direito
		g.fillOval(50, 110, 120, 60); // Boca
		g.setColor(Color.YELLOW);
		g.fillOval(50, 110, 120, 30); // "Retoca" a boca
		g.fillOval(45, 120, 130, 40); // "Retoca" a boca
	}
}
