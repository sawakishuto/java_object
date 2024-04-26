// OOP4-A/B
// Main
import java.util.List;
import java.util.ArrayList;

public class Main  {
	public static void main(String[] args){
		// for testing Shape abstract class
		Shape s1 = new Rect(10,10,100,150);
		Shape s2 = new Circle(200,200,10);
		int w1 = s1.getWidth();
		int w2 = s2.getWidth();
		System.out.println("w1 = "+w1);
		System.out.println("w2 = "+w2);
		
		// for testing a method of the String class
		int n = 10;
		String str1 = "value of n = ";
		str1 += n;
		str1 = str1.toUpperCase();
		System.out.println(str1);

		// for testing ArrayList
//		      strList = new            ;
//		      ("abc");
//		      ("xyz");
//		String resStr = "";
//		for (      :       ) {
//			resStr +=     ;
//		}
//		System.out.println(resStr);

		List<String> strList = new ArrayList<>();
		strList.add("abc");
		strList.add("xyz");
		String resStr = "";
		for(String se : strList){
			resStr += se.toUpperCase();
		}
		System.out.println(resStr);


		// an example of "overload"
		Shape s3 = new Rect(10,10);
		System.out.println("s3 = "+s3.toString());

		// the main part
		MyFrame.setUI(); // set cross-platform UI

		MyFrame mf1 = new MyFrame("frame 1",50,50,300,300);
		Shape s = new Rect(50,50,150,100);
		mf1.addShape(s);
		mf1.addShape(new Rect(100,75,180,155)); 
		mf1.addShape(new Circle(120,170,50));
		mf1.addShape(new Circle(210,70,20));
		mf1.makeVisible();

		MyFrame mf2 = new MyFrame("frame 2",400,100,300,270);
		mf2.addShape(new Rect(70,50,130,140));
		mf2.addShape(new Circle(170,90,50));
		mf2.addShape(new Circle(100,110,70)); 
		mf2.makeVisible();
   		}
	}
