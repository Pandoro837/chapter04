package com.javaex.ex02;

public class Circle {

//	필드
	private String fillColor;
	private String lineColor;
	private int radius;

//	생성자
	public Circle() {
		
	}
	
	public Circle(String fillColor, String lineColor, int radius) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.radius = radius;
	}

//	메소드 겟터셋터
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

//	메소드 일반
	@Override
	public String toString() {
		return "Circle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", radius=" + radius + "]";
	}
	
	
	
}