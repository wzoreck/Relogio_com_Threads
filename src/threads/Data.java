package threads;

public class Data {

	private int seconds;
	private int stopwatch;
	private int alarm;

	public Data() {
		seconds = 0;
		stopwatch = 0;
		alarm = 0;
	}

	public String getClockTime() {
		return null;
	}

	public void setClockTime(int seconds) {
		this.seconds = seconds;
	}

	public void startTimer() {

	}

	public void stopTimer() {

	}

	public void restartTimer() {

	}

	public void creatAlarm(int seconds) {
		alarm = seconds;
	}
}
