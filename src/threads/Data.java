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

	public int getClockTimeInSeconds() {
		return seconds;
	}

	public void setClockTime(int seconds) {
		this.seconds = seconds;
	}

	public void incrementOneSecond() {
		if (seconds >= 86399) // IF 24 hours
			seconds = 0;
		seconds++;
	}

	public int getTimerInSeconds() {
		return stopwatch;
	}

	public void restartTimer() {
		stopwatch = 0;
	}

	public void incrementTimer() {
		stopwatch++;
	}

	public void creatAlarm(int seconds) {
		alarm = seconds;
	}
}
