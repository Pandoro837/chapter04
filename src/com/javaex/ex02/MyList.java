package com.javaex.ex02;

public class MyList {

	//필드
	private Object[] oArray;
	private int crtPos;

	//생성자	
	public MyList() {
		this.oArray = new Object[3];
		this.crtPos = 0;
	}
	
	//메소드 겟터셋터
	
	//메소드 일반
	public void add(Object object) {
		oArray[crtPos] = object;
		crtPos++;
	}
	
	public int size() {
		return crtPos;
	}
	
	public Object get(int index) {
		return oArray[index];
	}
	
	
	
	
	
}
