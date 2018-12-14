package homeworks;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		walkingTheDog();
	}
	
	@SuppressWarnings("resource")
	public static void walkingTheDog() {		
		char [] [] array = new char[10] [10];
		char player = '@';
		int stepRight = 0, stepDown = 0;	
		Scanner in = new Scanner(System.in);
		System.out.println("Task 4 : Input button for stap (w, s, a, d.)");
		do {
			consolePrint(array,player, stepRight, stepDown);			
			String text = in.nextLine();	
			array[stepDown][stepRight] = player;
			switch(text) {
			case "w": 
				stepDown--;
				if (stepDown < 0) {
					stepDown++;	
				}
				break;
			case "s": 
				stepDown++;
				if (stepDown > array.length - 1) {
					stepDown--;	
				}
				break;
			case "d": 
				stepRight++;
				if (stepRight > array.length - 1) {
					stepRight--;
				}
				break;
			case "a": 
				stepRight--;
				if (stepRight < 0) {
					stepRight++;	
				}
				break;
			case "esc": return;
			}						
		}while(true);		
	}	
	
	public static void consolePrint(char[][] array, char player, int playerStepX, int playerStepY) {
		for (int j = 0; j < array.length; j++) {
			for (int s = 0; s < array[j].length; s++) {
				array[j][s] = ',';
				array[playerStepY][playerStepX] = player;
				System.out.print(array[j][s] + " ");
			}
			System.out.println();
		}
	}

}
