import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredBoxes {

  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 1 parameter:
    // the square size
    // and draws a square of that size to the center of the canvas.
    // draw 3 squares with that function.
    drawBox(graphics,10);
    drawBox(graphics,40);
    drawBox(graphics,70);
  }

  public static void drawBox(Graphics graphics,int size){
    graphics.drawRect(150-(size/2), 150-(size/2),size, size);
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("CenteredBoxes");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}