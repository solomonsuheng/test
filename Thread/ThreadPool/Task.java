package ThreadPool;

public class Task implements Runnable {
	private String name;
	private int times;

	public Task(String name, int times) {
		this.name = name;
		this.times = times;
	}

	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < this.getTimes(); i++) {
			System.out.println(this.getName());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}

}
