package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName: LinkedListDemo
 * @Description: LinkedListDemo
 * @author solomonsuheng
 * @date 2014年5月22日 下午4:26:02
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		System.out.println(list);

		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
