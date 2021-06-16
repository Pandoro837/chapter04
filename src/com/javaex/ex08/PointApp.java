package com.javaex.ex08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

//	메소드 일반
	public static void main(String[] args) {
		
//		List<Point> pList = new ArrayList<Point>();
//			키 값, 관리대상
		Map<String, Point> pMap = new HashMap<String, Point>();
		
		Point p01 = new Point(1,1);
		Point p02 = new Point(2,2);
		Point p03 = new Point(3,3);
		
//		Map은 add가 아니라 put을 사용한다
//		해당 값을 넣기 전에 key 값을 지정해주어야 한다
		pMap.put("정우성", p01);
		pMap.put("이효리", p02);
		pMap.put("유재석", p03);
		
		System.out.println(pMap.size());
		System.out.println(pMap);

		System.out.println(pMap.get("정우성").getX());
		
//		중복된 key 값에 자료를 넣으면 덮어씌워진다
		Point p04 = new Point(100,1000);
		pMap.put("유재석", p04);
		System.out.println(pMap);
		
//		key 리스트를 만든다
//		["정우성", "이효리", "유재석"] - > key 리스트를 확보
//		pMap.get("이름")
		
//		Map이 key를 Set으로 관리하고 있다
		Set<String> keys = pMap.keySet();	//String set으로 key 값을 받아서
		
//		String key에 넣어 반복문을 실행한다
		for(String key : keys) {
//			System.out.println(pMap.get(key).getX());
			System.out.println(pMap.get(key).toString());
		}
		
	}
	
}
