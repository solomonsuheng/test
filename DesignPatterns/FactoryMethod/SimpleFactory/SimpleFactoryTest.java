package FactoryMethod.SimpleFactory;

/**
 * @ClassName: SimpleFactoryTest
 * @Description: TODO简单工厂模式测试
 * @author solomonsuheng
 * @date 2014-5-25 下午7:08:13
 */
public class SimpleFactoryTest {
	public static void main(String[] args) {
		DBIf dbifMD = DBFactory.produceDB("MongoDB");
		dbifMD.init();
		dbifMD.destory();

		DBIf dbifMySQL = DBFactory.produceDB("MySQL");
		dbifMySQL.init();
		dbifMySQL.destory();
	}
}
