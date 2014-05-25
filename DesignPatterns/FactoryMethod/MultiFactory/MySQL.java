package FactoryMethod.MultiFactory;

/**
 * @ClassName: MySQL
 * @Description: TODOMySQL实体类
 * @author solomonsuheng
 * @date 2014-5-25 下午7:18:07
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
