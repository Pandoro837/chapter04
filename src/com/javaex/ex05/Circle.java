package com.javaex.ex05;

public class Circle {

	//	필드
	private int radius;
	
	//생성자
	public Circle() {
		
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	
	//겟터셋터
	public int getRadius() {
		return this.radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//메소드
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
	
	
}
