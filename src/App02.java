import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @class App02
 * 
 *        ウインドウにボタンを表示し、クリックイベントを実装
 * 
 * @author up-tri<yaki-shake@up-tri.me>
 * @since 2021.05.09
 */
public class App02 {

  public static void main(String[] args) {
    (new App02()).execute();
  }

  public void execute() {
    JFrame frame = new JFrame("ウインドウタイトル");
    frame.setBounds(50, 50, 350, 350);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // パネルの作成
    JPanel panel = new JPanel();
    JButton button = new JButton("text");
    // ボタンにクリックイベントを追加
    utils.app02.ButtonClickAction action = new utils.app02.ButtonClickAction(frame);
    button.addActionListener(action);
    // パネルにボタンを追加
    panel.add(button);

    // パネルをウインドウに追加
    frame.getContentPane().add(panel, BorderLayout.SOUTH);

    frame.setVisible(true);
  }
}