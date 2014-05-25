package FactoryMethod.AbstractFactory;

/**
 * @ClassName: AbstractFactoryTest
 * @Description: TODO抽象工厂测试
 * @author solomonsuheng
 * @date 2014-5-25 下午7:49:09
 */
public class AbstractFactoryTest {
	public static void main(String[] args) {
		DBProducer dbp = new MongoDBFactory();
		DBIf dbif = dbp.produceDB();
		dbif.init();
		dbif.destory();
		DBProducer dbp2 = new MySQLFactory();
		DBIf dbif2 = dbp2.produceDB();
		dbif2.init();
		dbif2.destory();
	}
}
