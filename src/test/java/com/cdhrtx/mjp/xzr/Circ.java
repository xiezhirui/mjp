package com.cdhrtx.mjp.xzr;

public class Circ implements Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circ circ=new Circ();
		float r=7;
		float area=circ.getArea(r);
		System.out.println("圆的面积为："+area);
		float circumference=circ.getCircumference(r);
		System.out.println("圆的周长为："+circumference);
	}
/**
 * 定义计算圆面积的方法
 * @param r
 * @return
 */
	@Override
	public float getArea(float r) {
		// TODO Auto-generated method stub
		float area=PI*r*r;
		return area;
	}

	@Override
	public float getCircumference(float r) {
		// TODO Auto-generated method stub
		float circumference=2*PI*r;
		return circumference;
	}

}
