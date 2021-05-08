import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import utils.common.Point;

/**
 * @class App05
 * 
 *        2次関数の(疑似)描画
 * 
 * @author up-tri<yaki-shake@up-tri.me>
 * @since 2021.05.09
 */
public class App05 {

  public static void main(String[] args) {
    (new App05()).execute();
  }

  public void execute() {
    JFrame frame = new JFrame("ウインドウタイトル");
    frame.setBounds(50, 50, 650, 650);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ArrayList<Point> points = new ArrayList<Point>();
    for (int i = 0; i <= 2001; i++) {
      double x = 10 * i / 1000.0 - 10.0;
      Point point = new Point(x, this.f(x));
      System.out.println(point);
      points.add(point);
    }

    utils.app05.Canvas panel = new utils.app05.Canvas(points);

    frame.getContentPane().add(panel, BorderLayout.CENTER);

    frame.setVisible(true);
  }

  public double f(double x) {
    // y = x^2 - 2x -3;
    double a = 1;
    double b = -2;
    double c = -3;
    return a * x * x + b * x + c;
  }
}