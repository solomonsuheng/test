package FactoryMethod.AbstractFactory;

/**
 * @ClassName: DBProducer
 * @Description: TODO数据库提供接口
 * @author solomonsuheng
 * @date 2014-5-25 下午7:39:36
 */
public interface DBProducer {
	public DBIf produceDB();
}
