// OOP2-A/B
// Main
public class Main {
	public static void main(String[] args){
		System.out.println("Hello World! by OOP2");
		
		Rect r1 = new Rect(10,10,20,25);
		System.out.println("r1 = "+r1.toString());
		int w1 = r1.getWidth();
		System.out.println("w1 = "+w1);

		// OOP-A2 for extending the Rect class
		int h1 = r1.getHeight();
		System.out.println("h1 = " +h1);
		
		double a1 = r1.getArea();
		System.out.println("area = "+a1);
	
		// OOP2: for testing the RndRect class
		RndRect rr1 = new RndRect(30,10,45,20,2);
		System.out.println("rr1 = "+rr1.toString());
		int rr1w = rr1.getWidth();
		System.out.println("Widhth of of rr1 = "+rr1w);

		// a Rect variable for a RndRect instance
		Rect rr2 = new RndRect(100,120,110,135,3);
		System.out.println("rr2 = "+rr2.toString());

		// Area of instances of the Rect/RndRect classes
		double r1a  = r1.getArea();
 		double rr1a = rr1.getArea();
		double rr2a = rr2.getArea();
		System.out.println("Area of of Rect r1 = "+r1a);
		System.out.println("Area of of RndRect rr1 = "+rr1a);
		System.out.println("Area of of RndRect rr2 = "+rr2a);
		}
	}
