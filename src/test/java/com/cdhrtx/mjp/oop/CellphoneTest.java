package com.cdhrtx.mjp.oop;

/**
 * 对象的创建和使用
 * 
 * @author xzr
 *
 */
public class CellphoneTest {

	public static void main(String[] args) {
		// 创建手机类的对象
		Cellphone iphone12 = new Cellphone();
		// 访问手机类的成员变量
		System.out.println("型号是：" + iphone12.model);

		// 给对象的成员变量赋值
		iphone12.model = "12";
		iphone12.brand = "苹果";
		iphone12.price = 6999;
		iphone12.color = "黑色";

		System.out.println("型号是：" + iphone12.model);
		System.out.println("品牌是：" + iphone12.brand);
		System.out.println("价格是：" + iphone12.price);
		System.out.println("颜色是：" + iphone12.color);

		// 访问手机类的成员方法
		long number = 13032811532L;
		iphone12.call(number);
		iphone12.sendMessage(number, "你好");
	}

}
