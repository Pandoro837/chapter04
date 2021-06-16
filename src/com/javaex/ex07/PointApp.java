package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {

		Set<Point> pSet = new HashSet<Point>();
		
		Point p01 = new Point(1,2);
		Point p02 = new Point(3,6);
		Point p03 = new Point(2,7);
		
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		
		System.out.println(pSet);
		System.out.println("----------------");
//		중복의 정의가 달라서 확인할 수 없다 - > 오버라이딩 필요
		Point p04 = new Point(3,6);
		pSet.add(p04);
		System.out.println(pSet);
		
//		Point 비교	-> equals()
		System.out.println(p02.equals(p04));	//equals() -> 로직, 오버라이딩 가능
		System.out.println(p02 == p04);	// 주소값 비교
		
		System.out.println(p01.equals(p04));
		
//		hashCode 비교	- 실제 주소가 아닌, 주소값을 기반한 숫자
//		Set - hashCode 비교 - 같음 - equals 비교 - 같음 - 동등 객체 인식
//										| 다름
//			- hashCode 비교 - 다름 - 다른 객체로 인식
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		System.out.println(p03.hashCode());
		System.out.println(p04.hashCode());
		
		
	}

}
