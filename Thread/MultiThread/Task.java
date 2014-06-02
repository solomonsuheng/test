package MultiThread;

/**
 * @ClassName: Task
 * @Description: хннЯ
 * @author solomonsuheng
 * @date 2014-6-2 обнГ4:22:21
 */
public class Task implements Runnable {
	private String name;
	private int times;

	public Task(String name, int times) {
		this.name = name;
		this.times = times;
	}

	public void run() {
		// TODO Auto-generated method stub
		while(true) {
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
