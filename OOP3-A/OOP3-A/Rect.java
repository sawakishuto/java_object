// OOP3-A
// Rect
import java.awt.*;

public class Rect  {
	private int x1, y1, x2, y2;

	public Rect(int x1,int y1,int x2,int y2) {
		this.x1 = x1; this.x2 = x2;
		this.y1 = y1; this.y2 = y2;
		}

	public int getWidth() {
		return (this.x2-this.x1);
		}
	public int getHeight() {
		return (this.y2-this.y1);
		}
	public double getArea() {
		return ((double)(this.getWidth() * this.getHeight()));
		}
	public void move(int dx,int dy) {
		this.x1 += dx; this.x2 += dx;
		this.y1 += dy; this.y2 += dy;
		}

	public void draw(Graphics g) {
		System.out.println("Rect drawing... : "+this.toString());
		g.setColor(Color.BLACK);
		// insert here (5)-(9) 
		g.drawRect(this.x1, this.y1, this.getWidth(), this.getHeight());
		}

	@Override
	public String toString() {
		return ("R (" + this.x1 + ", " + this.y1 + ")-(" + this.x2 + ", " + this.y2 + ")");
		}
	}
