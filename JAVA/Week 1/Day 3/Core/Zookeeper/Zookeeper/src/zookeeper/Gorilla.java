package zookeeper;

public class Gorilla extends Mammal{
	public Gorilla() {
		super();
	}
	
	public void throwSomething() {
		setEnergy(getEnergy()-5);
		System.out.printf("Gorilla throw something and the energy of him decrease : %s ", super.getEnergy());
	}
	
	public void eatBananas() {
		setEnergy(getEnergy()+10);
		System.out.printf("Gorilla eat bananas and the energy of him now increase : %s", super.getEnergy());
	}
	
	public void climb() {
		setEnergy(getEnergy()-10);
		System.out.printf("Gorilla climb and the energy of him now decrease : %s", super.getEnergy());
	}
}
