package FactoryMethod.MultiFactory;

/**
 * @ClassName: MultiFactoryTest
 * @Description: TODO多工厂可以防止因为字符串不存在而无法创建数据库
 * @author solomonsuheng
 * @date 2014-5-25 下午7:24:16
 */
public class MultiFactoryTest {
	public static void main(String[] args) {
		DBIf dbifMD = DBFactory.produceMongoDB();
		DBIf dbifMS = DBFactory.produceMySQL();
		dbifMD.init();
		dbifMD.destory();
		
		dbifMS.init();
		dbifMS.destory();
	}
}
