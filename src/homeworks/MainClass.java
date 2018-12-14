package homeworks;

import java.util.Scanner;

public class MainClass {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		PowerSupply supply = new PowerSupply();
		Scanner in = new Scanner(System.in);
		while (true) {
			supply.turnOn();
			double power = in.nextDouble();
			supply.setVoltage(power);	
			System.out.println(supply.getOutput(0));
			System.out.println(supply.getOutput(1));
		}

	}

}
