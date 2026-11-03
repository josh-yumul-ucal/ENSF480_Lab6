import java.awt.Graphics;
import java.awt.Color;

public class Text implements Component{
  private final int x;
  private final int y;
  private final String text;

  public Text(String text, int x, int y){
    this.text = text;
    this.x = x;
    this.y = y;
  };

  @Override 
  public void draw(Graphics g){
    Color previousColor = g.getColor();
    g.setColor(new Color(0, 128, 0));
    g.drawString(text, x, y);
    g.setColor(previousColor);
  }
}
