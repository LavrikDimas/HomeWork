package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {	
		String text = new Scanner(System.in).nextLine();		
		String [] separated = text.split(";");		
		String [] [] database = new String [separated.length][];		
		for (int i = 0; i < database.length; i++) {
			String separatedString = separated[i];
			String[] separatedData = separatedString.split(",");
			database[i] = separatedData;
		}
		do {
			System.out.println("Enter query: ");
			String query = new Scanner(System.in).nextLine();
			if (query.equals("exit")) {
				break;
			}
			for (int i = 0; i < database.length; i++) {
				for (int j = 0; j < database[i].length; j++) {
					if (database[i][j].contains(query)) {
						System.out.println(Arrays.toString(database[i]));
					}
				}
			}
		}while(true);
		
	}

}
