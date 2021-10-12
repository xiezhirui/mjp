package com.cdhrtx.mjp.oop.encapsulation;

/**
 * this关键字测试用例
 * 
 * @author xzr
 *
 */
public class ThisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cellphone noArgs = new Cellphone();
		System.out.println("This " + noArgs);

		Cellphone twoArgs = new Cellphone("P50", "红色");
		System.out.println("手机的型号是：" + twoArgs.getModel());
	}
}
