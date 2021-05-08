import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @class App04
 * 
 *        図形描画
 * 
 * @author up-tri<yaki-shake@up-tri.me>
 * @since 2021.05.09
 */
public class App04 {

  public static void main(String[] args) {
    (new App04()).execute();
  }

  public void execute() {
    JFrame frame = new JFrame("ウインドウタイトル");
    frame.setBounds(50, 50, 350, 350);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    utils.app04.Canvas panel = new utils.app04.Canvas();

    frame.getContentPane().add(panel, BorderLayout.CENTER);

    frame.setVisible(true);
  }
}