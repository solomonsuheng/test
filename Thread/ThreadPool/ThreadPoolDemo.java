package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName: ThreadPoolDemo
 * @Description: TODO线程池
 * @author solomonsuheng
 * @date 2014-6-2 下午4:31:49
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);// 线程池3个
		Runnable task_1 = new Task("Task_1", 10);
		Runnable task_2 = new Task("Task_2", 10);
		Runnable task_3 = new Task("Task_3", 10);

		executor.execute(task_1);
		executor.execute(task_2);
		executor.execute(task_3);

		executor.shutdown();
	}
}
