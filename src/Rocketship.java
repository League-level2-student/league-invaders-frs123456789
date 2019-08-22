import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
int speed = 0;
	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		
		// TODO Auto-generated constructor stub

	}
	public void right() {
        x+=speed;
    }
	public void left() {
        x+=speed;
    }
	public void up() {
        x+=speed;
    }
	public void down() {
        x+=speed;
    }
	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}

}