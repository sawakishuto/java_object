// OOP4-A
// MyPanel
import java.awt.*;
import javax.swing.*;
// import java.util.List;
import java.util.ArrayList;

public class MyPanel extends JPanel {
//	private            shapeList = null;
	private ArrayList<Shape> shapeList = null;

	public MyPanel() {
		super();
//		this.shapeList = new 
		this.shapeList = new ArrayList<>();
		}

	public void addShape(Shape s) {
		shapeList.add(s);
//		               ;
		this.repaint();
		}

	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		System.out.println("MyPanel painting ...");
		for (Shape se : shapeList) {
			if(se != null){
				se.draw(g);
			}

		}
//		for (       :          ) {
//			if (se != null)         ;
//			}
		}
	}
