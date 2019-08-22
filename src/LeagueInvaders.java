import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	GamePanel gp = new GamePanel();
	JFrame jf;
	public static final int WIDTH = 500;
	public static final int HEIGHT = 800;

	public LeagueInvaders() {
		jf = new JFrame();
		jf.setVisible(true);
		jf.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		jf.pack();
		jf.addKeyListener(gp);

	}

	void setup() {
		jf.add(gp);
		int height = HEIGHT;
		int width = WIDTH;

	}

	public static void main(String[] args) {
		LeagueInvaders li = new LeagueInvaders();
		li.setup();

	}
}
