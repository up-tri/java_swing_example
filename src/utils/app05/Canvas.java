package utils.app05;

import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

import utils.common.Point;

public class Canvas extends JPanel {
  private ArrayList<Point> points;

  public Canvas(ArrayList<Point> points) {
    this.points = points;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    int size = 600;

    utils.common.TwoDimensional td = new utils.common.TwoDimensional(g, -10, -10, 10, 10, size, size);

    g.setColor(Color.RED);
    for (Point point : points) {
      double x = point.x;
      double y = point.y;
      int dotX = (int) (x * size / 20 + (size / 2)) - 1;
      int dotY = (int) ((size / 2) - y * size / 20) - 1;
      g.fillOval(dotX, dotY, 2, 2);
    }

    td.paint();
  }
}
