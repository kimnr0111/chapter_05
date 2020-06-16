package com.javaex.ex03;

import java.util.HashSet;
import java.util.Set;

public class SetApp {

	public static void main(String[] args) {

		Set<Integer> iSet = new HashSet<Integer>();
		
		Integer i01 = new Integer(3);
		Integer i02 = new Integer(10);
		Integer i03 = new Integer(7);
		Integer i04 = new Integer(5);
		
		
		iSet.add(i04);
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		
		for( Integer i: iSet) {
			System.out.println(i.toString());
		}
		
		System.out.println("=========================");
		
		Integer i05 = new Integer(5);
		iSet.add(i05);
		for( Integer i: iSet) {
			System.out.println(i.toString());
		}
		
		System.out.println("=========================");
		
		iSet.remove(i02);
		for( Integer i: iSet) {
			System.out.println(i.toString());
		}

	}

}
