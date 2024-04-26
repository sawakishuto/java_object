// OOP2-A
// Rect
public class Rect {
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
		int w = this.getWidth();
		int h = this.getHeight();
		return ((double)(w*h));
		}

	public void move(int dx, int dy) {
		this.x1 += dx; this.x2 += dx;
		this.y1 += dy; this.y2 += dy;
		}

	@Override
	public String toString() {
		return ("R (" + this.x1 + ", " + this.y1 + ")-(" + this.x2 + ", " + this.y2 + ")");
		}
	}
