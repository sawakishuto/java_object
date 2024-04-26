// OOP3-A/B
// Main
public class Main  {
	public static void main(String[] args){
		MyFrame.setUI(); // set cross-platform UI

		MyFrame mf1 = new MyFrame("frame 1",50,50,300,300);
		MyFrame mf2 = new MyFrame("frame 2",70,70,300,270);

		Rect r1 = new Rect(50,50,150,100);
		mf1.addRect(r1);
		mf1.makeVisible();
// mf2は更新されない
		mf2.addRect(new Rect(70,50,130,140));
 		mf2.makeVisible();
	   	}
	}
