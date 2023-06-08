package sec05_syperkeywordsupermethod.EX02;


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
		super.abc(); //super.abc : 부모클래스 객체의 abc()메서드 호출
	}
}

public class Superkeyword_2 {
	public static void main(String[] args) {
		//1. 객체 생성
		B bb = new B();
		
		//2. 메서드 호출 
		bb.bcd(); //A클래스의 abc()
	}

}
