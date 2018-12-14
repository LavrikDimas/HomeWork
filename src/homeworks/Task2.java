package homeworks;

public class Task2 {

	public static void main(String[] args) {
		System.out.printf("%1s%1s%18s%19s%n","|#|","currency","|description","|rate |");
		System.out.println("------------------------------------------------");
		System.out.printf("%1s%1d%1s%1s%27s%9s%1.2f%1s%n","|", 1,"|","USD","|American dollar","|",28.15, "|");
		System.out.printf("%1s%1d%1s%1s%26s%10s%1.2f%2s%n","|", 1,"|","RUB","|Russian rouble","|",2.38, "|");
		System.out.printf("%1s%1d%1s%1s%24s%12s%1.2f%2s%n","|", 1,"|","TRY","|Turkish lira","|",5.19, "|");
	}

}
