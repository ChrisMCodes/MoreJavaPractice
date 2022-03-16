
public class Car extends Vehicle {

	String name;
	
	public Car(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public Car() {
		this.name = "Car";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", steering=" + steering + ", gear=" + gear + ", speed=" + speed + ", getName()="
				+ getName() + ", getSteering()=" + getSteering() + ", getGear()=" + getGear() + ", getSpeed()="
				+ getSpeed() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
}
