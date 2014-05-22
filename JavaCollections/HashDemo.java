package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @ClassName: HashDemo
 * @Description: HashSet Collections
 * @author solomonsuheng
 * @date 2014年5月22日 下午4:07:06
 */
public class HashDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("e");
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
