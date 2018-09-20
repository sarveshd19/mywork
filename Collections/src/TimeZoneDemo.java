import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeZoneDemo {
	public static void main(String[] args) {
		String[] zones = TimeZone.getAvailableIDs();
		for (String zone : zones) {
			System.out.println(zone);
		}
		System.out.println("Total: " + zones.length);

		TimeZone zone = TimeZone.getTimeZone("IST");
		GregorianCalendar cal = new GregorianCalendar(zone);

		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		
		Date now = new Date();
		System.out.println(now);
	}
}
