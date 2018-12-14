package homeworks;

public class PowerSupply {
	private boolean power = false;
	private double incomingVoltage = 0;
	
	public void setVoltage(double voltage) {
		incomingVoltage = voltage;	
		checkVoltage();
	}
	
	public void turnOn() {
		power = true;
	}
	
	public void turnOff() {
		power = false;
	}
	
	public boolean isTurnedOn() {
		return power;
	}
	
	private void checkVoltage() {
		if (incomingVoltage < 200) {
			System.out.println("Low voltage.");
			turnOff();
		} else if (incomingVoltage > 250) {
			System.out.println("High voltage.");
			turnOff();
		}
	}
	
	public double getOutput(int index) throws Exception {
		if (!isTurnedOn()) {
			return 0.0;
		}
		
		switch (index) {
		case 0:
			return 5.0;
		case 1:
			return 12.0;
		default:
			throw new Exception("There is no output with index " + index);	
		}
	}
}
