package playground;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;
public class ch6_13_Ex2 extends JPanel {
	public static Random randomNumber = new Random();
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int i = 0; i < 10; i++) {
			int c = randomNumber.nextInt(2);
			if(c == 0) {
				Color fillColor = new Color(randomNumber.nextInt(256), randomNumber.nextInt(256), randomNumber.nextInt(256));
				g.setColor(fillColor);
				int h = getHeight(), w = getWidth(), panelH = (1 + randomNumber.nextInt(h)), panelW = (1 + randomNumber.nextInt(w)), sizeH = (1 + randomNumber.nextInt(h / 2)),	sizeW = (1 + randomNumber.nextInt(w / 2));
				//while(sizeH > h - panelH)
					//sizeH = (1 + randomNumber.nextInt(h / 2));
				//while(sizeW > w - panelW)
					//sizeW = (1 + randomNumber.nextInt(w / 2));
				g.fillOval(panelW, panelH, sizeW, sizeH);
			} else {
				Color fillColor = new Color(randomNumber.nextInt(256), randomNumber.nextInt(256), randomNumber.nextInt(256));
				g.setColor(fillColor);
				int h = getHeight(), w = getWidth(), panelH = (1 + randomNumber.nextInt(h)), panelW = (1 + randomNumber.nextInt(w)), sizeH = (1 + randomNumber.nextInt(h / 2)), sizeW = (1 + randomNumber.nextInt(w / 2));
				//while(sizeH > h - panelH)
					//sizeH = (1 + randomNumber.nextInt(h / 2));
				//while(sizeW > w - panelW)
					//sizeW = (1 + randomNumber.nextInt(w / 2));
				g.fillRect(panelW, panelH, sizeW, sizeH);
			}
		}
	}
}
