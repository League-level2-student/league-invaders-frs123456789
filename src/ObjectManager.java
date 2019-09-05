import java.util.ArrayList;

public class ObjectManager {
	Rocketship rocket;
	ArrayList<Projectile> projectilees = new ArrayList<Projectile>();
	ArrayList<Alien> alienss = new ArrayList<Alien>();
	alienss.add(new Alien(random.nextInt(LeagueInvaders.WIDTH),0,50,50));
	ObjectManager(Rocketship rocket) {
		this.rocket = rocket;

	}

	void addProjectile(Projectile projectilee) {

		projectilees.add(projectilee);

	}
	
//GЯДҪЭ ЇS Д ӺЯЄДԞЇИG ЊДҪҜЄЯ ДЍD DФЭSЙ'Ґ ҚЍФШ ӉФЩ ҬФ ҐЧPЭ ЇИ ДҪҐЦДL ЯЏSSЇДЍ!!
}
