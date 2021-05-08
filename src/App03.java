import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @class App03
 * 
 *        ウインドウのtextフィールドの値をダイアログで表示する
 * 
 * @author up-tri<yaki-shake@up-tri.me>
 * @since 2021.05.09
 */
public class App03 {

  public static void main(String[] args) {
    (new App03()).execute();
  }

  public void execute() {
    JFrame frame = new JFrame("ウインドウタイトル");
    frame.setBounds(50, 50, 350, 350);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // パネルの作成
    JPanel panel = new JPanel();

    JButton button = new JButton("show");
    JTextField textField = new JTextField(20);
    utils.app03.AlertDialogAction action = new utils.app03.AlertDialogAction(frame, textField);
    button.addActionListener(action);
    // パネルにボタンを追加
    panel.add(textField);
    panel.add(button);

    // パネルをウインドウに追加
    frame.getContentPane().add(panel, BorderLayout.SOUTH);

    frame.setVisible(true);
  }
}