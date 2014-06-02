package Demo;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * @ClassName: CrawlerTask
 * @Description: TODO页面任务
 * @author solomonsuheng
 * @date 2014-6-2 下午4:41:58
 */
public class CrawlerTask implements Runnable {
	private CloseableHttpClient httpClient = null;
	private HttpGet httpGet = null;
	private CloseableHttpResponse response = null;
	private String URL = null;

	// 构造函数
	public CrawlerTask(String URL) {
		this.URL = URL;
	}

	// 内部init
	private boolean initTask() {
		boolean flag = false;
		this.setHttpClient(HttpClients.createDefault());
		this.setHttpGet(new HttpGet(this.getURL()));
		flag = true;
		return flag;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (this.initTask()) {
			// 成功初始化
			try {
				this.setResponse(this.getHttpClient()
						.execute(this.getHttpGet()));
				System.out.println(EntityUtils.toString(this.getResponse()
						.getEntity()));
			} catch (ClientProtocolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public CloseableHttpClient getHttpClient() {
		return httpClient;
	}

	public void setHttpClient(CloseableHttpClient httpClient) {
		this.httpClient = httpClient;
	}

	public HttpGet getHttpGet() {
		return httpGet;
	}

	public void setHttpGet(HttpGet httpGet) {
		this.httpGet = httpGet;
	}

	public CloseableHttpResponse getResponse() {
		return response;
	}

	public void setResponse(CloseableHttpResponse response) {
		this.response = response;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

}
