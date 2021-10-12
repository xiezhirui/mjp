package com.cdhrtx.mjp.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 面向对象思想测试用例
 * 
 * @author xzr
 *
 */
public class OOPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList(Arrays.asList(1, 2, 3));
		System.out.println("初始化：" + list);
		list.add(4);
		System.out.println("添加后：" + list);
	}

}
