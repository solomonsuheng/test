package FactoryMethod.AbstractFactory;

/**
 * @ClassName: MySQLFactory
 * @Description: TODO生成MySQL的工厂
 * @author solomonsuheng
 * @date 2014-5-25 下午7:42:34
 */
public class MySQLFactory implements DBProducer {
	private static DBIf dbif = null;

	@Override
	public DBIf produceDB() {
		// TODO Auto-generated method stub
		MySQLFactory.setDbif(new MySQL());
		return MySQLFactory.getDbif();
	}

	public static DBIf getDbif() {
		return dbif;
	}

	private static void setDbif(DBIf dbif) {
		MySQLFactory.dbif = dbif;
	}

}
