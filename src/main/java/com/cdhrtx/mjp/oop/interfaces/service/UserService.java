package com.cdhrtx.mjp.oop.interfaces.service;

/**
 * 用户服务接口
 * 
 * @author xzr
 *
 */
public interface UserService {
	/**
	 * 网站名称 常量
	 */
	public static final String WEB_SITE_NAME = "淘宝网";

	/**
	 * 登录 抽象方法
	 */
	public abstract void login();

	/**
	 * 默认方法的定义
	 */
	public default void resetPassword() {
		System.out.println("请输入手机号并点击发送验证码：");
		sendCode();
		System.out.println("请输入收到的手机验证码：");
		System.out.println("请输入新密码：");
		System.out.println("请确认新密码：");
		System.out.println("密码重置成功！");
	}

	/**
	 * 发送验证码 私有成员方法
	 */
	private void sendCode() {
		System.out.println("您好！验证码是：XXXX");
	}

	/**
	 * 统计网站注册的用户信息
	 */
	public static void statistics() {
		long count = getAllUserInfo();
		System.out.println("当前网站的注册人数是" + count);
	}

	/**
	 * 从数据库查询所有用户信息
	 * 
	 * @return
	 */
	static long getAllUserInfo() {
		System.out.println("从数据库查询所有的用户信息");
		int count = 1_000_000_000;
		return count;
	}

}
