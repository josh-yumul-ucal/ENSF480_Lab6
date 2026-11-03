import java.awt.Graphics;

public abstract class Decorator implements Component{
  private Component cmp;
  private int x;
  private int y;
  private int width;
  // height is listed as public in the UML but that makes no sense
  private int height;

  protected Decorator(Component cmp, int x, int y, int width, int height){
    setComponent(cmp);
    setX(x);
    setY(y);
    setWidth(width);
    this.height = height;
  }

  @Override 
  public void draw(Graphics g){getComponent().draw(g);}


  // Setters
  protected void setComponent(Component cmp){
    this.cmp = cmp;
  }

  protected void setX(int x){
    this.x = x;
  }

  protected void setY(int y){
    this.y = y;
  }

  protected void setWidth(int w){
    this.width = w;
  }

  protected void setHeight(int h){
    this.height = h;
  }

  // Getters
  protected int getX(){
    return x;
  };

  protected int getY(){
    return y;
  }

  protected int getWidth(){
    return width;
  }

  protected int getHeight(){
    return height;
  }

  protected Component getComponent(){
    return cmp;
  }

}
