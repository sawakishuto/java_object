// OOP3-A/B
// MyFrame
import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	private MyPanel panel = null;

	public MyFrame(String title,int x, int y, int w, int h) {
		super(title);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocation(x, y);
		this.setSize(w, h);
		this.panel = new MyPanel();
		this.add(this.panel, BorderLayout.CENTER);
		this.setVisible(false);
		}
		
	public void makeVisible() {
		this.setVisible(true);
		}

	public void addRect(Rect r) {
		if (this.panel != null)  {
			this.panel.addRect(r);
			}
		}
	
	// (class method)
	// set UI as cross-platform Look and Feel (Metal) 
	public static void setUI() {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			} 
		catch (Exception e) {
			e.printStackTrace();
			}
		}
	}
