import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager implements ActionListener{
	Rocketship rocket;
	ArrayList<Projectile> projectilees = new ArrayList<Projectile>();
	ArrayList<Alien> alienss = new ArrayList<Alien>();
	Random gen = new Random();
	
	ObjectManager(Rocketship rocket) {
		this.rocket = rocket;

	}

	private void addAlien() {
		// TODO Auto-generated method stub
		alienss.add(new Alien(gen.nextInt(LeagueInvaders.WIDTH),0,50,50));
	}

	void addProjectile(Projectile projectilee) {
		
		projectilees.add(projectilee);

	}
	void checkCollision(){
		for(int i = 0; i < alienss.size(); i++) {
			for(int j = 0; j < projectilees.size(); j++) {
				if(rocket.collisionBox.intersects(alienss.get(i).collisionBox)) {
				rocket.isActive = false;
				alienss.get(i).isActive = false;
				}}
			}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		addAlien();
	}
	
	void update(){
		rocket.update();
		for(int i = 0; i < alienss.size(); i++) {
			alienss.get(i).update();
			if(alienss.get(i).y > LeagueInvaders.HEIGHT) {
				alienss.get(i).isActive=false;
			}
		}
		for(int i = 0; i < projectilees.size(); i++) {
			projectilees.get(i).update();
			if(projectilees.get(i).y > LeagueInvaders.HEIGHT) {
				projectilees.get(i).isActive=false;
			}
		}
	}
	void draw(Graphics g) {
		for(int i = 0; i < alienss.size(); i++) {
			alienss.get(i).draw(g);
		}
		for(int i = 0; i < projectilees.size(); i++) {
			projectilees.get(i).draw(g);
		}
		rocket.draw(g);
		
		
}}
