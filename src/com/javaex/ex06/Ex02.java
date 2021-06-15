package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {

		//HashSet을 이용하여 중복 체크
		
		Set<Integer> iRandom = new HashSet<Integer>();
		
		while (iRandom.size() != 6) {
			iRandom.add((int)(Math.random()*45+1));
		}
		
		System.out.println(iRandom);
	}

}
