package application;

import threads.Time;

public class Main {

	public static void main(String[] args) {
		Time time = new Time();
		time.start();
		for (int i = 0; i < 1000; i++)
			System.out.println("Thread main");
	}

}

// Menu, com opções:
//	▪ Ajustar horário;
//	▪ Visualizar horário;
//	▪ Iniciar cronômetro;
//	▪ Parar cronômetro (e mostrar valor atual);
//	▪ Zerar cronômetro;
//	▪ Definir alarme;