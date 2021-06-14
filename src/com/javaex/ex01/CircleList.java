package com.javaex.ex01;

import java.util.Arrays;

public class CircleList {

//	필드
	private Circle[] cArray;
	private int crtPos;
	
//	생성자
	public CircleList() {
		cArray = new Circle[3];
		crtPos = 0;
	}
	
//	메소드 일반
	
	public void add(Circle circle) {
		cArray[crtPos] = circle;
		crtPos++;
	}
	
	public void remove() {
		
	}
	
	public int size() {
		return crtPos;
	}
	
	public Circle get(int index) {
		return cArray[index];//.toString
	}

	@Override
	public String toString() {
		return "PointList [pArray=" + Arrays.toString(cArray) + "]";
	}
	
}
