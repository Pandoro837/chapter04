package com.javaex.ex01;

import java.util.Arrays;

public class PointList {

//	필드
	private Point[] pArray;
	private int crtPos;
	
//	생성자
	public PointList() {
		this.pArray = new Point[3];
		crtPos = 0;
	}
	
//	겟터셋터

	
//	메소드 일반
	public void add(Point point) {
		pArray[crtPos] = point;
		crtPos++;
	}
	
	public void remove() {
		
	}
	
	public int size() {
		return crtPos;
	}
	
	public Point get(int index) {
		return pArray[index];//.toString
	}

	@Override
	public String toString() {
		return "PointList [pArray=" + Arrays.toString(pArray) + "]";
	}
	
}
