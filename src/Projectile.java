import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Projectile extends GameObject{
int speed = 10;
public static BufferedImage image;
public static boolean needImage = true;
public static boolean gotImage = false;	

	Projectile(int x, int y, int width, int height) {
		super(x, y, width, height);
		if (needImage) {
		    loadImage ("bullet.png");
		}
		// TODO Auto-generated constructor stub
	}
void update() {
	y-=speed;
}
void draw(Graphics g) {
	g.setColor(Color.RED);
    g.fillRect(x, y, width, height);
    if (gotImage) {
    	g.drawImage(image, x, y, width, height, null);
    } else {
    	g.setColor(Color.BLUE);
    	g.fillRect(x, y, width, height);
    }
}
void loadImage(String imageFile) {
    if (needImage) {
        try {
            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
	    gotImage = true;
        } catch (Exception e) {
            
        }
        needImage = false;
    }
}
}