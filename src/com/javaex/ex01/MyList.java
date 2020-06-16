package com.javaex.ex01;

public class MyList<T> {
	
	private T[] oArray;
	private int crtPos;
	
	public MyList() {
		oArray = (T[])new Object[3];
		crtPos = 0;
	}
	
	public void add(T o) {
		oArray[crtPos] = o;
		crtPos++;
	}
	
	public int size() {
		return crtPos;
	}

}
