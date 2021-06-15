package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {

		Set<Point> pSet = new HashSet<Point>();
		
		Point p01 = new Point(1,2);
		Point p02 = new Point(3,6);
		Point p03 = new Point(5,10);
		
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		
		System.out.println(pSet);

//		중복의 정이가 달라서 확인할 수 없다 - > 오버라이딩 필요
		Point p04 = new Point(3,6);
		pSet.add(p04);
		
		System.out.println(pSet);
		
	}

}
