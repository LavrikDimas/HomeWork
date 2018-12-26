package homeworks;

import java.util.Scanner;

public class MainShape {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Shape[] shape = {new Circle("Circle","Red"), new Square("Square","Blue"), new Triangle("Triangle","Purpure")};
		Circle circle = (Circle)shape[0];
		Square square = (Square)shape[1];
		Triangle triangle = (Triangle)shape[2];
		
		System.out.println("Enter: 1 for the circle; Enter: 2 for the square; Enter: 3 for the triangle; Enter: 0 exit program");
		while(true) {
			int n = in.nextInt();
			if (n == 0) {
				return;
			}
			switch(n) {
			case 1:
				System.out.println("you create circle, enter his radius");
				int a = in.nextInt();
				circle.setRadius(a);
				circle.getInfo();
				break;
			case 2:
				System.out.println("You create square, enter his magnitude");
				int b = in.nextInt();
				square.setA(b);
				square.getInfo();
				break;
			case 3:
				System.out.println("You crate triangle, enter his side");
				int aSide = in.nextInt();
				int bSide = in.nextInt();
				int cSide = in.nextInt();
				triangle.initialTriangle(aSide, bSide, cSide);
				triangle.getInfo();
			}
			System.out.println("Enter: 1 for the circle; Enter: 2 for the square; Enter: 3 for triangle; Enter: 0 exit program");
		}
	}

}
