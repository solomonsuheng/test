package HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: HashMapDemo
 * @Description: HashMapDemo
 * @author solomonsuheng
 * @date 2014年5月22日 下午4:29:09
 */
public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "solomonsuheng");
		map.put("age", "10");
		System.out.println(map);
	}
}
