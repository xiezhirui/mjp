package com.cdhrtx.mjp.xzr;

public abstract class CalculateTest implements Calculate {
	public float getArea(float r) {
		float area=PI*r*r;
		return area;
	}

	public float getCircumference(float r) {
		float circumference=2*PI*r;
		return circumference;
	}
	
	public static void main(String[] args) {
		
	}
	
}
