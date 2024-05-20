package zookeeper;

public class Bat extends Mammal{
	private int energy;

	public Bat() {
		this.energy = 300;
	}
	
	public void fly() {
		setEnergy(getEnergy()-50);
		System.out.printf("The bat fly and his energy decrease %s", this.getEnergy());
	}
	
	public void eatHumans() {
		setEnergy(getEnergy()+25);
		System.out.printf("The bat eat a human and his energy increase %s",this.getEnergy());
	}
	
	public void attackTown() {
		setEnergy(getEnergy()-100);
		System.out.printf("The bat made an attack on the town and his energy decrease %s", this.getEnergy());
	}
}
