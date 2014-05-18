import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;

/**
 * @ClassName: MongoDB
 * @Description: TODO连接MongoDB数据库,news数据库的user集合
 * @author solomonsuheng
 * @date 2014-5-18 下午1:41:21
 */
public class MongoDB {
	public static void main(String[] args) {
		try {
			Mongo mongo = new Mongo();// 默认是localhost：27017
			DB db = mongo.getDB("news");// 从MongoDB连接中获取news数据库
			DBCollection dbc = db.getCollection("user");// 从news数据库获取user集合
			DBCursor cur = dbc.find();// 从user集合中查询所有数据,返回给游标cur
			while (cur.hasNext()) {// 根据游标cur的值输出数据
				System.out.println(cur.next().toString());
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
