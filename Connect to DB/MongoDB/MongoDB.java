import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;

/**
 * @ClassName: MongoDB
 * @Description: 测试连接MongoDB数据库的news user
 * @author solomonsuheng
 * @date 2014-5-18 上午11:06:13
 */
public class MongoDB {
	public static void main(String[] args) {
		Mongo mongo;
		try {
			mongo = new Mongo();
			DB db = mongo.getDB("news");
			DBCollection dbc = db.getCollection("user");
			DBCursor cur = dbc.find();
			while (cur.hasNext()) {
				System.out.println(cur.next().toString());
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
