package FactoryMethod.AbstractFactory;

/**
 * @ClassName: MongoDBFactory
 * @Description: TODO生产MongoDB的工厂
 * @author solomonsuheng
 * @date 2014-5-25 下午7:47:42
 */
public class MongoDBFactory implements DBProducer {
	private static DBIf dbif = null;

	@Override
	public DBIf produceDB() {
		// TODO Auto-generated method stub
		MongoDBFactory.setDbif(new MongoDB());
		return MongoDBFactory.getDbif();
	}

	public static DBIf getDbif() {
		return dbif;
	}

	private static void setDbif(DBIf dbif) {
		MongoDBFactory.dbif = dbif;
	}

}
