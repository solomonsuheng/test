package FactoryMethod.AbstractFactory;

/**
 * @ClassName: DBFunction
 * @Description: TODO数据库功能接口
 * @author solomonsuheng
 * @date 2014-5-25 下午7:35:34
 */
public interface DBIf {
	public void init();// 初始化数据库

	public void destory();// 销毁数据库
}
