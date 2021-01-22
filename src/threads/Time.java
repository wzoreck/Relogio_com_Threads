package threads;

public class Time extends Thread {
	
	Data data;
	
	public Time(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++)
			System.out.println("Time test");
		super.run();
	}

}

// Faz a passagem do tempo, 1 segundo por vez;