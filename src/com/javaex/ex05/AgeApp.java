package com.javaex.ex05;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AgeApp {

	public static void main(String[] args) {

		Map<String, Integer> ageMap = new HashMap<String, Integer>();
		
		Integer i01 = 40;
		Integer i02 = 30;
		Integer i03 = 30;
		
		ageMap.put("정우성", i01);
		ageMap.put("유재석", i02);
		ageMap.put("이효리", i03);
		
		System.out.println(ageMap.toString());
		
		ageMap.remove("유재석");
		System.out.println(ageMap.toString());
		
		ageMap.put("이효리", 100);
		System.out.println(ageMap.toString());
		
		ageMap.put("이정재", 50);
		System.out.println(ageMap.toString());
		
		Integer age = ageMap.get("이정재");
		System.out.println(age);
		
		int count = ageMap.size();
		System.out.println(count);
		
		System.out.println("================");
		Set<String> keys = ageMap.keySet();
		for( String key : keys) {
			System.out.println(key);
			System.out.println(ageMap.get(key));
		}
		
		
	}

}
