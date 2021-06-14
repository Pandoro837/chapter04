package com.javaex.ex01;

public class MyListApp {

	public static void main(String[] args) {

//		// 배열을 사용하면 갯수를 미리 지정해야 하므로
//		// 더 많거나 더 적은 갯수의 자료가 들어올 경우 대처가 어렵다
//		Point[] pArray = new Point[2];
//		
//		Point p00 = new Point(2,2);
//		Point p01 = new Point(3,3);
//
//		pArray[0] = p00;
//		pArray[1] = p01;
//		
//		for(int i = 0; i < pArray.length; i++) {
//			System.out.println(pArray[i].toString());
//		}
		
////////////////////////////////////////////////////////
//		포인트 관리
////////////////////////////////////////////////////////

		System.out.println("Point 관리 --------------------");
		
//		포인트를 관리하는 리스트(배열 대용)을 만든다
		PointList pList = new PointList();
		
		Point p00 = new Point(2,2);
		Point p01 = new Point(3,3);
		Point p02 = new Point(4,4);

//		배열에 자동으로 추가
		pList.add(p00); //배열 1개
		pList.add(p01); //배열 2개
		pList.add(p02); //배열 3개
		
		System.out.println(pList);
		
		 // 배열의 길이 확인 
		System.out.println(pList.size()); // 3
		 
		 // 배열의 내부 값 확인 
		System.out.println(pList.get(1)); // Point [x = 3, y = 3]	- toString(생략
		System.out.println(pList.get(1).toString()); // Point [x = 3, y = 3]
		System.out.println(pList.get(1).getX());	//3
		
		System.out.println("---------------------------------");
		for(int i = 0; i < pList.size(); i++) {
//			System.out.println(pList.get(i));
			System.out.println(pList.get(i).getX());
		}
		
		 // 배열의 내부 값 삭제 
//		pList.remove(1); // [1] 데이터 삭제 - > 배열 2개
		 
//		 Point p03 = new Point(100, 100); pList.add(p03); //배열 3개
		 
////////////////////////////////////////////////////////
//원 관리
////////////////////////////////////////////////////////

		System.out.println("원 관리 --------------------");

		CircleList cList = new CircleList();
		
		Circle c00 = new Circle("빨강", "검정", 10);
		Circle c01 = new Circle("노랑", "검정", 15);
		Circle c02 = new Circle("초록", "검정", 20);
		
		cList.add(c00);
		cList.add(c01);
		cList.add(c02);
		
		System.out.println(cList);
		
		System.out.println(cList.size());
		
		System.out.println(cList.get(1)); 
		System.out.println(cList.get(1).toString()); 
		System.out.println(cList.get(1).getRadius());
		
		System.out.println("---------------------------------");
		for(int i = 0; i < pList.size(); i++) {
			System.out.println(cList.get(i));
			System.out.println(cList.get(i).getRadius());
		}
		
	}

}
