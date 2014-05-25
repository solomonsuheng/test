package FactoryMethod.MultiFactory;

/**
 * @ClassName: MongoDB
 * @Description: TODOMongoDB类
 * @author solomonsuheng
 * @date 2014-5-25 下午7:17:54
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
		System.err.println("销毁MongoDB");
	}

}
