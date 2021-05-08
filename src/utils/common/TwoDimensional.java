package utils.common;

import java.awt.Color;
import java.awt.Graphics;

public class TwoDimensional {
  private double minX;
  private double minY;
  private double maxX;
  private double maxY;
  private int spanX;
  private int spanY;
  private int graphWidth;
  private int graphHeight;
  private Graphics graphics;

  public TwoDimensional(Graphics graphics, double minX, double minY, double maxX, double maxY, int graphWidth,
      int graphHeight) {
    this.graphics = graphics;
    this.minX = minX;
    this.minY = minY;
    this.maxX = maxX;
    this.maxY = maxY;
    this.graphWidth = graphWidth;
    this.graphHeight = graphHeight;

    this.spanX = (int) ((Math.abs(maxX) + Math.abs(minX)) / 10);
    System.out.println(spanX);
    this.spanY = (int) ((Math.abs(maxY) + Math.abs(minY)) / 10);
  }

  public void paint() {
    ////// 軸線
    graphics.setColor(Color.DARK_GRAY);
    graphics.drawString("O", graphWidth / 2, graphHeight / 2);
    // x軸
    graphics.drawLine(0, graphHeight / 2, graphWidth, graphHeight / 2);
    graphics.drawString("Y", graphWidth / 2, 10);
    // y軸
    graphics.drawLine(graphWidth / 2, 0, graphWidth / 2, graphHeight);
    graphics.drawString("X", graphWidth - 10, graphHeight / 2);
    ////// 補助線
    graphics.setColor(Color.LIGHT_GRAY);
    // x軸と平行な補助線
    for (int i = 1; i <= 9; i++) {
      if (i == 5) {
        continue;
      }
      int y = (int) ((this.spanY * i) * (graphWidth / (Math.abs(this.maxY) + Math.abs(this.minY))));
      graphics.drawLine(0, y, graphWidth, y);
      graphics.drawString("" + (this.spanY * (5 - i)), graphWidth / 2, y - 2);
    }
    // y軸と平行な補助線
    for (int i = 1; i <= 9; i++) {
      if (i == 5) {
        continue;
      }
      int x = (int) ((this.spanX * i) * (graphWidth / (Math.abs(this.maxX) + Math.abs(this.minX))));
      System.out.println(x);
      graphics.drawLine(x, 0, x, graphHeight);
      graphics.drawString("" + (this.spanX * (i - 5)), x, graphHeight / 2);
    }
  }
}
