package com.javaex.ex05;

import java.util.LinkedList;
import java.util.List;

import com.javaex.ex04.Circle;
import com.javaex.ex04.Point;

public class PointApp {

	public static void main(String[] args) {

//ArrayList와 LinkedList는 List 인터페이스를 부모로 갖고 있기 때문에
//List를 통해 선언한 ArrayList와 LinkedList는 간단하게 호환이 가능하다
		
			//제네릭에는 기본 자료형은 들어갈 수 없다
			List<Point> pList = new LinkedList<Point>();
			
			Point p01 = new Point(2,4);
			Point p02 = new Point(3,6);
			Point p03 = new Point(4,8);
			Point p04 = new Point(5,10);
			
			pList.add(p01);
			System.out.println(pList.size());

			pList.add(p02);
			System.out.println(pList.size());

			pList.add(p03);
			
			Point p = pList.get(1);
			System.out.println(p.getX());
			System.out.println(p.getY());
			System.out.println(p.toString());
			System.out.println(p);
			
			System.out.println("----------------------");
			for(int i = 0; i < pList.size(); i++) {
				Point pp = pList.get(1);
				System.out.println(pp);
			}

			System.out.println("----------------------");
			for(int i = 0; i < pList.size(); i++) {
				System.out.println(pList.get(i).getX());
			}
			
			System.out.println("----------------------");
			System.out.println(pList.toString());
			
			//p04를 [1]에 add
			pList.add(1, p04);
			System.out.println(pList);
			
			//[1]을 삭제
			pList.remove(1);
			System.out.println(pList);
			
			//향상된 for문	무조건 처음 - > 끝까지
			//참조값을 받을 변수하나가 필요하다(클래스는 대상과 동일)
			for(Point ppp : pList) {
				System.out.println(ppp.getX());
				System.out.println(ppp);
			}
			
			//pList 원 추가
			Circle c01 = new Circle(100);
//			pList.add(c01);
	
	}

}
