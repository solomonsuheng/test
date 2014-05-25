package FactoryMethod.SimpleFactory;

/**
 * @ClassName: MySQL
 * @Description: TODOMySQL数据库实体类
 * @author solomonsuheng
 * @date 2014-5-25 下午7:03:17
 */
public class MySQL implements DBIf {

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("初始化MySQL数据库");
	}

	@Override
	public void destory() {
		// TODO Auto-generated method stub
		System.out.println("销毁MySQL数据库");
	}

}
