package FactoryMethod.AbstractFactory;

/**
 * @ClassName: MySQL
 * @Description: TODOMySQL数据库
 * @author solomonsuheng
 * @date 2014-5-25 下午7:38:40
 */
public class MySQL implements DBIf {

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("初始化MySQL");
	}

	@Override
	public void destory() {
		// TODO Auto-generated method stub
		System.out.println("销毁MySQL");
	}

}
