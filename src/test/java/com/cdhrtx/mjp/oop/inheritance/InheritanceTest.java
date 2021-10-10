package com.cdhrtx.mjp.oop.inheritance;

/**
 * 继承的测试用例
 * 
 * @author xzr
 *
 */
public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 调用了父类的无参构造器
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.call(13032811532L);

		SmartPhone smartPhoneModel = new SmartPhone("Mate40");
		System.out.println("手机型号：" + smartPhoneModel.getModel());

		smartPhoneModel.playVideo(smartPhoneModel.getModel());

	}

}
