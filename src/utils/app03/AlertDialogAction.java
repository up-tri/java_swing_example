package utils.app03;

import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.JTextComponent;

/**
 * @package utils.app03
 * 
 * @class AlertDialogAction
 * 
 *        コンポーネント上のボタンに対して、textフィールドの値を表示するクリックイベントを発生させる
 * 
 * @author up-tri<yaki-shake@up-tri.me>
 * @since 2021.05.09
 */
public class AlertDialogAction implements ActionListener {
  private Component component;
  private JTextComponent textComponent;

  public AlertDialogAction(Component component, JTextComponent textComponent) {
    this.component = component;
    this.textComponent = textComponent;
  }

  public void actionPerformed(ActionEvent e) {
    String text = this.textComponent.getText();
    JLabel label = new JLabel("text: " + text);
    JOptionPane.showMessageDialog(this.component, label);
  }
}
