package com.javaex.ex01;

public class PointListApp {

	public static void main(String[] args) {
		
		//포인트 관리
		MyList<Point> pList = new MyList<Point>();
		
		Point p1 = new Point(3, 3);
		Point p2 = new Point(4, 4);
		
		System.out.println(pList.size());
		
		pList.add(p1);
		pList.add(p2);
		
		System.out.println(pList.size());
		
		//원 관리
		MyList<Circle> cList = new MyList<Circle>(); //배열[3], crtPos=0
		
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(10);
		
		cList.add(c1);
		cList.add(c2);
		
		System.out.println(cList.size());
	}

}
