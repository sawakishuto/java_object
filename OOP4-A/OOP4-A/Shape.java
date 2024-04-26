// OOP4-A/B
// Shape
import java.awt.Graphics;
import java.awt.Color;

public abstract class Shape implements Drawable {

	public abstract int getWidth();
	public abstract int getHeight();
	public abstract double getArea();
	public abstract void move(int dx, int dy);

	public void draw(Graphics g) {
		System.out.println("Drawing... "+this.toString());
		g.setColor(Color.BLACK);
		}
	}
