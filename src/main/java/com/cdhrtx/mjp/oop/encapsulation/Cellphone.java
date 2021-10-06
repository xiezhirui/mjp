package com.cdhrtx.mjp.oop.encapsulation;

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
	private String model;

	/************************* 成员变量-公共的get/set方法 *************************/

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * 手机品牌
	 */
	private String brand;

	/************************* 成员变量-公共的get/set方法 *************************/

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * 手机价格
	 */
	private Integer price;

	/************************* 成员变量-公共的get/set方法 *************************/
	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		if (price < 0) {
			this.price = -1;
			return;
		}
		this.price = price;
	}

	/**
	 * 手机颜色
	 */
	private String color;

	/************************* 成员变量-公共的get/set方法 *************************/
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * 手机重量
	 */
	private Integer weight;

	/************************* 成员变量-公共的get/set方法 *************************/
	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
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
