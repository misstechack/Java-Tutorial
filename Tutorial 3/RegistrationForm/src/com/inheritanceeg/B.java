package com.inheritanceeg;

public class B extends A {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
//		System.out.println("B");
//		System.out.println(b.classnameA);
		b.print();
	}
	public void print() {
		System.out.println("Class B extends class A");
	}

}
