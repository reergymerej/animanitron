import java.awt.BorderLayout;

import javax.swing.JFrame;


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

