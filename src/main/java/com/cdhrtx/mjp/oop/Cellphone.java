package com.cdhrtx.mjp.oop;

/**
 * 手机类
 * 
 * @author xzr
 *
 */
public class Cellphone {

	/************************* 成员变量 *************************/

	/**
	 * 手机型号
	 */
	String model;

	/**
	 * 手机品牌
	 */
	String brand;

	/**
	 * 手机价格
	 */
	Integer price;

	/**
	 * 手机颜色
	 */
	String color;

	/**
	 * 手机重量
	 */
	private Integer weight;

	/**
	 * 获得手机重量
	 * 
	 * @return
	 */
	public Integer getWeight() {
		return weight;
	};

	/**
	 * 显示手机重量
	 */
	public void showCellphoneInfo() {
		System.out.println("手机的重量是：" + weight);
	}

	/************************* 无参构造器 *************************/
	/**
	 * 无参构造器
	 */
	public Cellphone() {
		System.out.println("我是一个无参构造器" + this);
	}

	/**
	 * 有参构造器
	 */
	public Cellphone(String model) {
		this.model = model;
	}

	/**
	 * 全参构造器
	 * 
	 * @param model
	 * @param brand
	 * @param price
	 * @param color
	 */
	public Cellphone(String model, String brand, Integer price, String color) {
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	/************************* 成员方法 *************************/

	/**
	 * 给指定的手机号打电话
	 * 
	 * @param number
	 */
	public void call(Long number) {
		System.out.println("正在给 " + number + " 打电话");

	}

	/**
	 * 给指定的手机发短信
	 * 
	 * @param number
	 * @param message
	 */
	public void sendMessage(long number, String message) {
		System.out.println("正在给 " + number + " 发短信：" + message);
	}
}
