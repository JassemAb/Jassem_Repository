package zookeeper;

public class Mammal {
	private int energy;
	
	
	public Mammal () {
		this.energy = 100;
	}
	
	public int displayEnergy() {
		System.out.println("Your energy :" + this.energy);
		return this.energy;
	}
	
	public int getEnergy() {
		return this.energy;
	}
	
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
}
