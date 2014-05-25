package FactoryMethod.MultiFactory;

/**
 * @ClassName: DBFactory
 * @Description: TODO数据库生产工厂
 * @author solomonsuheng
 * @date 2014-5-25 下午7:21:12
 */
public class DBFactory {
	private static DBIf dbif = null;

	public static DBIf produceMongoDB() {
		DBFactory.setDbif(new MongoDB());
		return DBFactory.getDbif();
	}

	public static DBIf produceMySQL() {
		DBFactory.setDbif(new MySQL());
		return DBFactory.getDbif();
	}

	public static DBIf getDbif() {
		return dbif;
	}

	private static void setDbif(DBIf dbif) {
		DBFactory.dbif = dbif;
	}

}
