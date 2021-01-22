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
		Stopwatch stopwatch = new Stopwatch(data);
		Alarm alarm = new Alarm(data);

		Scanner sc = new Scanner(System.in);

		boolean runApplication = true;

		while (runApplication) {
			int menuChoice;

			System.out.println();
			System.out.println("--------------- Menu ---------------");
			System.out.println("[1]  - Adjust time");
			System.out.println("[2]  - View schedule");
			System.out.println("[3]  - Start timer");
			System.out.println("[4]  - Stop timer");
			System.out.println("[5]  - Restart timer");
			System.out.println("[6]  - Set alarm");
			System.out.println("[99] - End the program");
			System.out.println("------------------------------------");
			System.out.print("Enter your choice: ");
			menuChoice = sc.nextInt();
			System.out.println("------------------------------------");

			switch (menuChoice) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 99:
				runApplication = false;
				break;

			default:
				System.out.println();
				System.out.println("The chosen option is not available!");
				break;
			}
		}

		sc.close();
		System.out.println();
		System.out.println("*Program ended*");

	}

}

// Menu, com opções:
//	▪ Ajustar horário;
//	▪ Visualizar horário;
//	▪ Iniciar cronômetro;
//	▪ Parar cronômetro (e mostrar valor atual);
//	▪ Zerar cronômetro;
//	▪ Definir alarme;