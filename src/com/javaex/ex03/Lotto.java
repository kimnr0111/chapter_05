package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotto {

	public static void main(String[] args) {
		
		Set<Integer> lSet = new HashSet<Integer>();


		while(true) {
			lSet.add((int)(Math.random()*45)+1);
			if(lSet.size() == 6) {
				break;
			}
		}
		
		List<Integer> lSetList = new ArrayList<Integer>(lSet);
		
		Collections.sort(lSetList);
		
		for(Integer l: lSetList) {
			l.toString();
		}
		System.out.println(lSetList);


	}

}
