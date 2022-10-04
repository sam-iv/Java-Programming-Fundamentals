package exercise1;
import java.text.DecimalFormat;

public class ClockDisplay {
	private NumberInfo hours;
	private NumberInfo minutes;
	private int hour;
	private boolean amOrPm = false; //where true is pm and false is am
	
	public ClockDisplay() {
		this.hours = new NumberInfo(24);
		this.minutes = new NumberInfo(60);
	}
	
	public void timeTick() {
		minutes.Increment();
		
		if (minutes.getValue() == 0) {
			hours.Increment();
		}
		
		hour = this.hours.getValue();
		if (hour >= 13) {
			amOrPm = true;
		}
	}

	@Override
	public String toString() {
		DecimalFormat style1 = new DecimalFormat("00");
		DecimalFormat style2 = new DecimalFormat("0");
		
		if (amOrPm == true) {
			return ( style2.format(this.hours.getValue() - 12) + ":" + style1.format(this.minutes.getValue()) + "pm" );
		}
		else {
			return ( style1.format(this.hours.getValue()) + ":" + style1.format(this.minutes.getValue()) + "am");
		}
	}
}
