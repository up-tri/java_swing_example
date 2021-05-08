package utils.app02;

import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @package utils.app02
 * 
 * @class ButtonClickAction
 * 
 *        コンポーネント上のボタンに対してクリックイベントを発生させる
 * 
 * @author up-tri<yaki-shake@up-tri.me>
 * @since 2021.05.09
 */
public class ButtonClickAction implements ActionListener {
  private Component component;

  public ButtonClickAction(Component component) {
    this.component = component;
  }

  public void actionPerformed(ActionEvent e) {
    JLabel label = new JLabel("clicked!");
    JOptionPane.showMessageDialog(this.component, label);
  }
}
