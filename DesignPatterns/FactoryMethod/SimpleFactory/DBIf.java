package FactoryMethod.SimpleFactory;

/**
 * @ClassName: DB数据库公用借口
 * @Description: TODO
 * @author solomonsuheng
 * @date 2014-5-25 下午7:00:37
 */
public interface DBIf {
	public void init();// 初始化数据库

	public void destory();// 释放数据库所有链接
}
