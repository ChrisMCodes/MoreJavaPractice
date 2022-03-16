/**
 * 
 */

/**
 * @author ChrisMCodes
 *
 */
public class Vehicle {
	

	int steering;
	int gear;
	double speed;

	/**
	 * @param: int steering (value represents direction of wheel, 
	 * -10 (all the way left) to 10 (all the way to the right))
	 * 
	 * @param: int gear (value represents gear from 0 (reverse) to 5
	 * 
	 * @param: double speed (value represents speed in mph)
	 * 
	 */
	public Vehicle(int steering, int gear) {
		// TODO Auto-generated constructor stub
		this.steering = validateSteering(steering);
		this.gear = validateGear(gear);
		this.speed = validateSpeed(speed);
	}
	
	public Vehicle() {
		steering = 0;
		gear = 1;
		speed = 0;
	}
	
	/**
	 * Setters and getters for fields
	 * 
	 */
	
	public int getSteering() {
		return steering;
	}

	public void setSteering(int steering) {
		this.steering = steering;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	/**
	 * 
	 * @param steering
	 */
	public int validateSteering(int steering) {
		boolean validSteering = steering >= -10 && steering <= 10;
		if (!validSteering) {
			steering = 0;
			System.out.println("Sorry! The steering value you entered is not valid. Steering set to 0.");
		}
		
		if (steering == 0) {
			System.out.println("Steering wheel is straight ahead!");
		} else {
		
		String message = (steering < 0) ? "Left!" : "Right!";
		System.out.println("Steering wheel is " + message);
		
		}
		
		return steering;
	}
	
	/**
	 * @param gear
	 * 
	 * 
	 */
	public int validateGear(int gear) {
		boolean validGear = gear >= 0 && gear <= 5;
		
		if (!validGear) {
			gear = 1;
			System.out.println("Sorry! The gear value you entered is not valid. Gear set to 1.");
		}
		
		if (gear == 0) {
			System.out.println("Backing up...");
		} else {
			System.out.println("Onward!");
		}
		
		return gear;
	}
	
	/**
	 * 
	 * @param speed
	 * 
	 */
	public double validateSpeed(double speed) {
		boolean validSpeed = speed >= 0 && speed <= 300;
		
		if (!validSpeed) {
			speed = 0;
			System.out.println("Sorry! The speed you entered is not valid. Speed set to 0.");
		}
		
		if (speed == 0) {
			System.out.println("Staying put.");
		} else {
			System.out.println("Now we're moving!");
		}
		
		return speed;
	}
	
	
	/**
	 * 
	 * toString()
	 * 
	 */

	@Override
	public String toString() {
		return "Vehicle [steering=" + steering + ", gear=" + gear + ", speed=" + speed + ", getSteering()="
				+ getSteering() + ", getGear()=" + getGear() + ", getSpeed()=" + getSpeed() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
