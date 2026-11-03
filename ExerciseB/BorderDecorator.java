import java.awt.Graphics;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;


public class BorderDecorator extends Decorator{
  public BorderDecorator(Component cmp, int x, int y, int w, int h){
    super(cmp, x, y, w, h);
  }

  @Override 
  public void draw(Graphics g){
    super.draw(g);
    Graphics2D g2d = (Graphics2D) g.create();
    float[] dash = {7f, 5f};
    float dashPhase = 0.0f;

    try{
      g2d.setColor(Color.BLACK);
      g2d.setStroke(new BasicStroke(
      2f,
      BasicStroke.CAP_BUTT,
      BasicStroke.JOIN_BEVEL,
      10.0f,
      dash,
      dashPhase
      ));
      g2d.drawRect(getX(), getY(), getWidth(), getHeight());
    } finally{
      g2d.dispose();
    }
  }
}
