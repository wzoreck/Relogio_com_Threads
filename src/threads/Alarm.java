package threads;

public class Alarm extends Thread {
	
	Data data;
	
	public Alarm(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		super.run();
	}

}

// Verifica se o horário atual é igual ao horário em que o alarme está programado, se for
// avisa o usuário;