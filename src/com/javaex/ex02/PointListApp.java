package com.javaex.ex02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PointListApp {

	public static void main(String[] args) {
		
		//ArrayList<Point> = new ArrayList<Point>();
		//LinkedList<Point> = new LinkedList<Point>();
		//List<Point> pList = new ArrayList<Point>();
		//섞어쓰기
		List<Point> pList = new LinkedList<Point>();
		
		Point p1 = new Point(2, 2);
		Point p2 = new Point(3, 3);
		Point p3 = new Point(4, 4);

		//Point추가
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		
		//갯수 확인
		int size = pList.size();
		System.out.println(size);
		System.out.println("========================");
		
		//특정 Point 정보 읽기
		Point p = pList.get(0);
		p.draw();
		System.out.println("========================");
		
		//Point 전체 draw() 실행
		for(int i=0;i<pList.size();i++) {
			System.out.println(pList.get(i));
		}
		
		System.out.println("=");
		//향상된 for문
				for( Point pp: pList) {
					pp.draw();
				}
		
		pList.get(0).draw();
		pList.get(1).draw();
		
		System.out.println(pList.toString());
		System.out.println("========================");
		
		//Point제거
		pList.remove(0);
		System.out.println(pList.toString());
		pList.remove(p2);
		System.out.println(pList.toString());
		
		//index값 알아내기
		System.out.println(pList.indexOf(p2));
		System.out.println(pList.indexOf(p3));
		


	}

}
