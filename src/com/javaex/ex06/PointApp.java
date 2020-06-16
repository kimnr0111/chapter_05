package com.javaex.ex06;

import java.util.HashMap;
import java.util.Map;

public class PointApp {

	public static void main(String[] args) {
		
		Map<String, Point> pMap = new HashMap<String, Point>();
		
		Point p01 = new Point(2, 3);
		Point p02 = new Point(10, 11);
		Point p03 = new Point(20, 21);
		
		pMap.put("정우성", p01);
		pMap.put("유재석", p02);
		pMap.put("이효리", p03);
		
		Point p = pMap.get("정우성");
		System.out.println(p.getY());
		
		
		System.out.println(pMap.get("정우성").getY());
		
		System.out.println(pMap.toString());

	}

}
