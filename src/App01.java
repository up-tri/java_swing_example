import javax.swing.JFrame;

/**
 * @class App01
 * 
 *        左上50x50pxの位置から、300x300pxのウインドウを表示
 * 
 * @author up-tri<yaki-shake@up-tri.me>
 * @since 2021.05.09
 */
public class App01 {

  public static void main(String[] args) {
    (new App01()).execute();
  }

  public void execute() {
    // フレームの作成
    JFrame frame = new JFrame("ウインドウタイトル");
    // 左上x,y座標、右下x,y座標
    frame.setBounds(50, 50, 350, 350);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}