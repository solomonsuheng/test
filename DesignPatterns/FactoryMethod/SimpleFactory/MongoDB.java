package FactoryMethod.SimpleFactory;

/**
 * @ClassName: MongoDB
 * @Description: TODOMongoDB数据库类型
 * @author solomonsuheng
 * @date 2014-5-25 下午7:01:46
 */
public class MongoDB implements DBIf {

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("初始化MongoDB数据库");
	}

	@Override
	public void destory() {
		// TODO Auto-generated method stub
		System.out.println("销毁MongoDB数据库");
	}

}
