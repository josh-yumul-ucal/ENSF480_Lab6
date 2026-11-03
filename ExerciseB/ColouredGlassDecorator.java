import java.awt.Color;
import java.awt.Graphics;

public class ColouredGlassDecorator extends Decorator{
  // Color of glass: rgb(2, 249, 8)
  public ColouredGlassDecorator(Component cmp, int x, int y, int w, int h){
    super(cmp, x, y, w, h);
  }

  @Override 
  public void draw(Graphics g){
    Color temp = g.getColor();
    g.setColor(new Color(2, 249, 8, 30));
    g.fillRect(getX(), getY(), getWidth(), getHeight());
    g.setColor(temp);
    super.draw(g);
  }
}
