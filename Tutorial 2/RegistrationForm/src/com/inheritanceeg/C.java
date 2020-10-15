package com.inheritanceeg;

public class C extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
//		System.out.println("C");
//		System.out.println(c.classnameA);
		System.out.println(c.calc(10, 20));
		System.out.println(c.calc(10.5f, 20.5f));
		System.out.println(c.calc(10, 20, 30));
		System.out.println(c.calc(10, 20.5f));
		System.out.println(c.calc(10.5f, 20));
	}
	public int calc(int a, int b) {
		return a+b;
	}
	public float calc(float a, float b) {
		return a*b;
	}
	public int calc(int a, int b, int c) {
		return a+b-c;
	}
	public float calc(int a, float b) {
		return a*b;
	}
	public float calc(float a, int b) {
		return a*b;
	}

}
