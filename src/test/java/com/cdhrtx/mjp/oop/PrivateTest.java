package com.cdhrtx.mjp.oop;

/**
 * private关键字的使用
 * 
 * @author xzr
 *
 */
public class PrivateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cellphone iphone13 = new Cellphone();
		System.out.println("手机的默认重量是：" + iphone13.getWeight());

		iphone13.showCellphoneInfo();

	}

}
