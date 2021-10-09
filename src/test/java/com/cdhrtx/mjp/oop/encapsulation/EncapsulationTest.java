package com.cdhrtx.mjp.oop.encapsulation;

/**
 * 属性封装的测试用例
 * 
 * @author xzr
 *
 */
public class EncapsulationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建手机类的对象
		Cellphone cellphone = new Cellphone();
		// 访问对象的成员变
		cellphone.setBrand("Huawei Mate40 Pro");
		System.out.println("手机的型号是：" + cellphone.getBrand());

		cellphone.setPrice(-6999);
		System.out.println("手机的价格是：" + cellphone.getPrice());

	}

}
