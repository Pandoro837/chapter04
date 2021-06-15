package com.javaex.ex03;

public class MyListApp {

	public static void main(String[] args) {
		
		// 포인트를 리스트로 관리
		MyList<Point> pList = new MyList<Point>();
			
		Point p01 = new Point(2, 4);
		Point p02 = new Point(5, 4);
		
		Circle c03 = new Circle(100);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(c03);		//다른 인스턴스도 들어간다
//		제너릭 선언으로 해당 리스트는 Point만 들어갈 수 있기 때문에
//		Circle 객체를 갖는 c03은 오류가 발생한다
		for(int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		
	}

}
