// OOP2-A
// RndRect
public class RndRect extends Rect {
	private int r; /* r : the radius of the round corner */

	public RndRect(int x1,int y1,int x2,int y2,int r) {
		super(x1,y1,x2,y2);
		this.r=r;
		}

	@Override
	public double getArea() {
		double ca = this.r*this.r*4
	 		- (this.r*this.r*Math.PI);
		return (0);
		}

	@Override
	public String toString() {
		return ("Rnd" + super.toString() + ", r=" + this.r);
		}
}
	