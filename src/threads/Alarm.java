package threads;

public class Alarm extends Thread {
	
	Data data;
	private boolean state = true;
	
	public Alarm(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		while (state) {
			try {
				Thread.sleep(1000);
				if (data.getAlarm() <= data.getClockTimeInSeconds()) {
					System.err.println("Alarm ringing!!!!!!!");
					state =  false;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			super.run();
		}
	}

}

// Verifica se o horário atual é igual ao horário em que o alarme está programado, se for
// avisa o usuário;