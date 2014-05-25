package FactoryMethod.SimpleFactory;

/**
 * @ClassName: DBFactory
 * @Description: TODO数据库产生工厂
 * @author solomonsuheng
 * @date 2014-5-25 下午7:04:23
 */
public class DBFactory {
	private static DBIf dbif = null;

	// 根据不同的类型产生不同的数据库
	public static DBIf produceDB(String dbType) {
		if ("MySQL".equals(dbType)) {// 如果是MySQL数据库类型
			DBFactory.setDbif(new MySQL());
		} else if ("MongoDB".equals(dbType)) {// 如果是MongoDB数据库类型
			DBFactory.setDbif(new MySQL());
		} else {
			// 此处扩展别的数据库内容
		}

		return DBFactory.getDbif();
	}

	public static DBIf getDbif() {
		return dbif;
	}

	private static void setDbif(DBIf dbif) {
		DBFactory.dbif = dbif;
	}
}
