// OOP3-A
// MyPanel
import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel {
	// insert here (1)
	private Rect rect1 = null;

	public MyPanel() {
		super();
		}

	public void addRect(Rect r) {
		// insert here (2)
		this.rect1 = r;
		this.repaint();
		}

	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		System.out.println("MyPanel painting ...");	
		// insert here (3) (4)
		if (this.rect1 != null) {
			this.rect1.draw(g);
			}
		}
	}
