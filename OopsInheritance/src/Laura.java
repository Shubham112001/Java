
public class Laura extends Cars {
	private int services;

	public Laura(int services) {
		super("laura", "4wd", 4, 4, 6, false);
		this.services = services;
	}
	public void accelerate(int rate) {
		int newVelocity=getCurrentVelocity()+rate;
		if(newVelocity==0) {
			stop();
			changeGear(1);
		}
		else if(newVelocity>0 && newVelocity<=10) {
			changeGear(1);
		}
		else if(newVelocity>10 && newVelocity<=20) {
			changeGear(2);
		}
		else if(newVelocity>20 && newVelocity<=30) {
			changeGear(3);
		}
		else {
			changeGear(4);
		}
		if(newVelocity>0) {
			changeVelocity(newVelocity,getCurrentDirection());
		}
	}
	

}
