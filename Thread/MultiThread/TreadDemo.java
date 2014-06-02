package MultiThread;

public class TreadDemo {
	public static void main(String[] args) {
		Runnable task = new Task("Task_1", 100);
		Runnable task2 = new Task("Task_2", 100);
		Thread thread = new Thread(task2);
		Thread thread2 = new Thread(task);
		thread.start();
		thread2.start();
	}
}
