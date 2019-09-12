import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ObjectManager implements ActionListener{
	Rocketship rocket;
	ArrayList<Projectile> projectilees = new ArrayList<Projectile>();
	ArrayList<Alien> alienss = new ArrayList<Alien>();
	
	ObjectManager(Rocketship rocket) {
		this.rocket = rocket;

	}

	private void addAlien() {
		// TODO Auto-generated method stub
		
	}

	void addProjectile(Projectile projectilee) {
		
		projectilees.add(projectilee);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		addAlien();
	}
	
//
}
