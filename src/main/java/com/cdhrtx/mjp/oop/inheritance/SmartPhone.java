package com.cdhrtx.mjp.oop.inheritance;

/**
 * 智能机类（子类）
 * 
 * @author xzr
 *
 */
public class SmartPhone extends Cellphone {

	/************************* 子类成员变量 *************************/

	/**
	 * 是否支持无线充电
	 */
	private boolean wirelessCharging;

	public boolean isWirelessCharging() {
		return wirelessCharging;
	}

	public void setWirelessCharging(boolean wirelessCharging) {
		this.wirelessCharging = wirelessCharging;
	}

	/************************* 子类成员方法 *************************/

	@Override
	public String toString() {
		return "SmartPhone [wirelessCharging=" + wirelessCharging + "]";
	}

	/**
	 * 播放视频
	 * 
	 * @param model
	 */
	public void playVideo(String model) {
		System.out.println(model + " 正在刷抖音。。。");
	}

	/**
	 * 发微信
	 */
	public void sendMessage(long number, String message) {
		super.sendMessage(13678009869L, "你牛个鸡巴");
		System.out.println("正在给 " + number + " 发微信：" + message);
	}

	/************************* 子类构造方法 *************************/

	public SmartPhone() {

	};

	public SmartPhone(String model) {
		super(model);
	}
}
