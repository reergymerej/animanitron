import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Animation extends JFrame {
	
	private int WIDTH = 500;
	private int HEIGHT = 400;
	private String TITLE = "See My Ball";
	
	public Animation() {
		
		
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		setTitle(TITLE);
		
		AnimationPanel panel = new AnimationPanel();
		getContentPane().add(BorderLayout.CENTER, panel);
	}
	
	public static void main(String[] args) {
		new Animation();
	}
}

class AnimationPanel extends JPanel {
	Timer _timer;
	private int WIDTH = 500;
	private int HEIGHT = 400;
	private int x;
	private int y;
	private int RADIUS = 30;
	
	public AnimationPanel() {
		x = WIDTH / 2 - RADIUS;
		y = HEIGHT / 2 - RADIUS;
		
		_timer = new Timer(100, new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				moveCircle();
			}
		});
		
		_timer.start();
	}
	
	private void moveCircle() {
		x += 2;
		y += 3;
		repaint();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		drawCircle(g, x, y, RADIUS);
	}
	
	private void drawCircle(Graphics g, int x, int y, int radius) {
		g.drawOval(x, y, radius * 2, radius * 2);
	}
}