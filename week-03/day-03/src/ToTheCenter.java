import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ToTheCenter {
  public static void mainDraw(Graphics graphics) {
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // draw 3 lines with that function.
    drawLine(graphics, 20, 20);
    drawLine(graphics, 120, 30);
    drawLine(graphics, 220, 30);
  }

  public static void drawLine(Graphics graphics,int coordinateX, int coordinateY){
    graphics.drawLine(coordinateX, coordinateY, 150, 150);
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("ToTheCenter");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}