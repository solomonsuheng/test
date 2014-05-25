package FactoryMethod.MultiFactory;

/**
 * @ClassName: DBIf
 * @Description: TODO数据库接口类
 * @author solomonsuheng
 * @date 2014-5-25 下午7:16:32
 */
public interface DBIf {
	public void init();// 数据库初始化

	public void destory();// 数据库销毁

}
