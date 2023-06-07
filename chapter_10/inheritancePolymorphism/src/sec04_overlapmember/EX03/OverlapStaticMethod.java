package sec04_overlapmember.EX03;
//Static method 오버라이딩 X
class A{
	static void print() {
		System.out.println("A클래스");
	}
}

class B extends A{
	static void print() {
		System.out.println("B클래스");
	}
}

public class OverlapStaticMethod {
	public static void main(String[] args) {
		
		//1. 클래스 이름으로 바로접근
		A.print(); //A클래스
		B.print(); //B클래스
		
		//2. 객체생성
		
		A aa= new A();
		B bb= new B();
		A ab= new B();
		
		//3.객체를 통한 메서드 호출 //static method는 오버라이딩이 되지않는다.
		aa.print(); //A클래스
		bb.print(); //B클래스
		ab.print(); //A클래스
		
		
	}

}
