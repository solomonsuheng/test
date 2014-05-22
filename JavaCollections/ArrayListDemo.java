package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName: ArrayListDemo
 * @Description: ArrayList Collections
 * @author solomonsuheng
 * @date 2014年5月22日 下午4:16:56
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("a");
		arrayList.add("b");
		arrayList.add("c");
		arrayList.add("d");
		arrayList.add("e");
		arrayList.add("f");

		Iterator<String> iter = arrayList.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		for (String str : arrayList) {
			System.out.println(str);
		}

		System.out.println(arrayList);

	}
}
