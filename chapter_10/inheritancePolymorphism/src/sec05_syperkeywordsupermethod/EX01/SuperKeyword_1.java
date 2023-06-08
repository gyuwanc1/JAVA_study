package sec05_syperkeywordsupermethod.EX01;

class A{
	void abc() {
		System.out.println("A클래스 abc()");
	}
}

class B extends A{	
	void abc() {
		System.out.println("B클래스 abc()");
	}
	void bcd() {
		abc(); //this.abc
	}
}

public class SuperKeyword_1 {
	
	public static void main(String[] args) {
		//1. 객체 생성
		B bb = new B();
		
		//2. 메서드 호출 
		bb.bcd(); //B클래스의 abc()
	}

}
