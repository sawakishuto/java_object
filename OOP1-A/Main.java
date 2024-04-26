// OOP1-A
// Main
public class Main {
	public static void main(String[] args){
		System.out.println("Hello World! by OOP");

		// basic (using local variables)
		int x;
		x = 10;
		x += 10;
		int y = x + 10;
		int n = 10;
		String str1 = "value of n ";
		str1 += " = ";
		str1 += n;
		System.out.println(str1);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		int a = 10;
		boolean b = (a > 5);
		System.out.println("b = " + b);
		if (a==10) {
			System.out.println("true!");
			}
		else  {
			System.out.println("false!");
			}

		// Using the methods of the Rect class (the main part)
		Rect r1;
		r1 = new Rect(10,10,20,20);
		Rect r2 = new Rect(30,10,50,25);
		
		int w1 = r1.getWidth();
		System.out.println("width of r1 = " + w1);

		int w2 = r2.getWidth();
		System.out.println("width of r2 = " + w2);

		r1.move(10,25);

		System.out.println("r1 = " + r1.toString());
		System.out.println("r2 = " + r2.toString());
		} // end of main()
	} // end of the Main class

