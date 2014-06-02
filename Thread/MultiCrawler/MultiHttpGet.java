package Demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * @ClassName: MultiHttpGet
 * @Description: TODO多线程HttpGet
 * @author solomonsuheng
 * @date 2014-6-2 下午4:41:00
 */
public class MultiHttpGet {
	public static void main(String[] args) {
		ExecutorService exePool = Executors.newCachedThreadPool();
		exePool.execute(new CrawlerTask("http://www.baidu.com"));
		exePool.execute(new CrawlerTask("http://www.163.com"));

		exePool.shutdown();
	}
}
