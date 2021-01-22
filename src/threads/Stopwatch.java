package threads;

public class Stopwatch extends Thread {
	
	Data data;
	
	public Stopwatch(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		super.run();
	}

}

// Marca o tempo entre o iniciar cronômetro e o parar cronômetro (caso o cronômetro seja
// iniciado, parado e iniciado novamente, quando ele é iniciado pela segunda vez ele
// continua do valor anterior, não reinicia do zero);