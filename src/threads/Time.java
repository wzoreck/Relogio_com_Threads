package threads;

public class Time extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++)
			System.out.println("Time test");
		super.run();
	}

}
