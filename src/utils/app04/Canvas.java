package utils.app04;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Canvas extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    g.setColor(Color.RED);
    g.drawOval(10, 10, 200, 200);
  }
}
