package SingletonMethod;

/**
 * @ClassName: Singleton
 * @Description: TODO单例模式
 * @author solomonsuheng
 * @date 2014-5-25 下午7:59:26
 */
public class Singleton {
	// 私有静态实例，禁止引用，赋值为Null，实现延迟加载
	private static Singleton instance = null;

	// 似有构造函数
	private Singleton() {
	}

	// 静态工厂创建该实例
	public static Singleton getInstance() {
		if (Singleton.instance == null) {
			// 单例未被创建,此处创建该单例
			// 防止多线程同时访问,同时保证调用该函数保持性能优势
			synchronized (Singleton.instance) {
				if (instance == null) {
					Singleton.instance = new Singleton();
				}
			}
		}
		return Singleton.instance;
	}
}
