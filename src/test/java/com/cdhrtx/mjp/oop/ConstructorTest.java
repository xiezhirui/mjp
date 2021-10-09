package com.cdhrtx.mjp.oop;

/**
 * 构造器的使用测试用例
 * 
 * @author xzr
 *
 */
public class ConstructorTest {

	public static void main(String[] args) {
		// 无参构造器调用
		Cellphone noArgs = new Cellphone();
		// 有参构造器调用
		Cellphone oneArgs = new Cellphone("小米11");
		System.out.println("Cellphone对象的model属性值被赋值为：" + oneArgs.model);
		// 全参构造器调用
		Cellphone fullArgs = new Cellphone("Mate40", "华为", 6999, "黑色");
		System.out.println("手机型号是：" + fullArgs.model + " 手机品牌是：" + fullArgs.brand + " 手机价格是：" + fullArgs.price
				+ " 手机颜色是：" + fullArgs.color);

	}

}
