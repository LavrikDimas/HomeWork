package homeworks;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Task3 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEE dd MMM MM", Locale.ENGLISH);
		while(true) {
			date.setTime(System.currentTimeMillis());
			System.out.print("Date: " + dateFormat.format(date));
			System.out.printf("%1s%3s%1d%3s%1d%3s%1d%n","; Time:", "H:", date.getHours(), "M:", date.getMinutes(), "S:", date.getSeconds());
			System.out.println();
			TimeUnit.SECONDS.sleep(1);
		}
	}
	

}
