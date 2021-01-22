package threads;

public class Time extends Thread {
	
	Data data;
	
	public Time(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				data.incrementSeconds();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			super.run();	
		}
	}

}

// Faz a passagem do tempo, 1 segundo por vez;