package threads;

public class Stopwatch extends Thread {
	
	Data data;
	private boolean state;
	
	public Stopwatch(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				if (state)
					data.incrementTimer();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			super.run();	
		}
	}
	
	public void setState(boolean state) {
		this.state = state;
	}

}

// Marca o tempo entre o iniciar cronômetro e o parar cronômetro (caso o cronômetro seja
// iniciado, parado e iniciado novamente, quando ele é iniciado pela segunda vez ele
// continua do valor anterior, não reinicia do zero);