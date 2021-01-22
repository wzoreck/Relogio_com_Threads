package application;

import java.util.Scanner;

import threads.Alarm;
import threads.Data;
import threads.Stopwatch;
import threads.Time;

public class Main {

	public static void main(String[] args) {

		Data data = new Data();

		// Threads
		Time time = new Time(data);
		time.start();
		Stopwatch stopwatch = new Stopwatch(data);
		stopwatch.start();
		Alarm alarm = new Alarm(data);

		Scanner sc = new Scanner(System.in);

		boolean runApplication = true;
		int hours, minutes, seconds;

		while (runApplication) {
			int menuChoice;

			System.out.println();
			System.out.println("--------------- Menu ---------------");
			System.out.println("[1]  - Adjust time");
			System.out.println("[2]  - View current time");
			System.out.println("[3]  - Start timer");
			System.out.println("[4]  - Stop timer");
			System.out.println("[5]  - Restart timer");
			System.out.println("[6]  - Set alarm");
			System.out.println("[99] - End the program");
			System.out.println("------------------------------------");
			System.out.print("Enter your choice: ");
			menuChoice = sc.nextInt();
			System.out.println("------------------------------------");
			System.out.println();

			switch (menuChoice) {
			case 1:
				System.out.print("Enter the hours: ");
				hours = sc.nextInt();
				System.out.print("Enter the minutes: ");
				minutes = sc.nextInt();
				System.out.print("Enter the seconds: ");
				seconds = sc.nextInt();
				data.setClockTime(timeToSeconds(hours, minutes, seconds));
				break;

			case 2:
				timeToString(data.getClockTimeInSeconds());
				break;

			case 3:
				stopwatch.setState(true);
				System.out.println("The timer is running");
				break;

			case 4:
				stopwatch.setState(false);
				System.out.println("The timer is paused");
				System.out.println("Elapsed time");
				timeToString(data.getTimerInSeconds());
				break;

			case 5:
				System.out.println("The timer is restarted");
				stopwatch.setState(false);
				data.restartTimer();
				break;

			case 6:
				System.out.print("Enter the hours: ");
				hours = sc.nextInt();
				System.out.print("Enter the minutes: ");
				minutes = sc.nextInt();
				data.creatAlarm(timeToSeconds(hours, minutes));
				alarm.start();
				break;

			case 99:
				runApplication = false;
				break;

			default:
				System.out.println("The chosen option is not available!");
				break;
			}
		}

		sc.close();
		System.out.println();
		System.out.println("*Program ended*");

	}

	public static int timeToSeconds(int hours, int minutes, int seconds) {
		int totalSeconds = hours * 3600;
		totalSeconds += minutes * 60;
		totalSeconds += seconds;
		return totalSeconds;
	}

	public static int timeToSeconds(int hours, int minutes) {
		int totalSeconds = hours * 3600;
		totalSeconds += minutes * 60;
		return totalSeconds;
	}

	public static void timeToString(int seconds) {
		int currentSeconds, hours, minutes;
		currentSeconds = seconds;
		hours = currentSeconds / 3600;
		currentSeconds -= hours * 3600;
		minutes = currentSeconds / 60;
		currentSeconds -= minutes * 60;

		System.out.printf("%02d:%02d:%02d", hours, minutes, currentSeconds);
		System.out.println();
	}

}

// Menu, com opções:
//	▪ Ajustar horário; OK
//	▪ Visualizar horário; OK
//	▪ Iniciar cronômetro; OK
//	▪ Parar cronômetro (e mostrar valor atual); OK
//	▪ Zerar cronômetro; OK
//	▪ Definir alarme;