import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color;

public class ColouredFrameDecorator extends Decorator{
  private int thickness;
  public ColouredFrameDecorator(Component cmp, int x, int y, int w, int h, int thickness){
    super(cmp, x, y, w, h);
    if (thickness <= 0){
      throw new IllegalArgumentException("Thickness must be positive");
    }
    this.thickness = thickness;
  }

  @Override 
  public void draw(Graphics g){
    super.draw(g);

    Graphics2D g2d = (Graphics2D) g.create();

    try{
      g2d.setColor(Color.RED);
      g2d.setStroke(new BasicStroke(thickness));

      g2d.drawRect(getX(), getY(), getWidth(), getHeight());
    }finally{
      g2d.dispose();
    }
  }
}

