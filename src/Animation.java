import java.awt.Graphics;

import javax.swing.JFrame;


public class Animation extends JFrame {
	private int WIDTH = 500;
	private int HEIGHT = 400;
	
	public Animation() {
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		setTitle("See My Ball");
	}

	public static void main(String[] args) {
		new Animation();
	}
	
	public void paint(Graphics g) {
		System.out.println("paint called");
		drawCircle(g, 20, 20, 30);
	}
	
	private void drawCircle(Graphics g, int x, int y, int radius) {
		g.drawOval(x, y, 20, 20);
	}
}
