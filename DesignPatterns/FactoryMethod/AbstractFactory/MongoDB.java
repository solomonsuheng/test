package FactoryMethod.AbstractFactory;

/**
 * @ClassName: MongoDB
 * @Description: TODOMongoDB
 * @author solomonsuheng
 * @date 2014-5-25 下午7:37:32
 */
public class MongoDB implements DBIf {

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("初始化MongoDB");
	}

	@Override
	public void destory() {
		// TODO Auto-generated method stub
		System.out.println("销毁MongoDB");
	}

}
