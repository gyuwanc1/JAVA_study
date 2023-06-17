package sec01_abstractclass.EX02;
//추상클래스의 객체 생성 방법 2 (익명이너클래스 이용하여 객체생성하기)

abstract class A {
	abstract void abc();
}

public class AbstractClass_2 {
	public static void main(String[] args) {
		
		//1. 객체 생성
		A a1 = new A() {			
			void abc() {
				System.out.println("방법2. 익명이너클래스 방법으로 객체생성");
				
			}
		};
		A a2 = new A() {			
			void abc() {
				System.out.println("방법2. 익명이너클래스 방법으로 객체생성");				
			}
		};
		
		//2. 메서드 호출
		a1.abc();//방법2. 익명이너클래스 방법으로 객체생성
		a2.abc();//방법2. 익명이너클래스 방법으로 객체생성
	}

}
