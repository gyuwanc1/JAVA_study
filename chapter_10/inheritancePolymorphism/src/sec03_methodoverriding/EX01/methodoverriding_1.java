package sec03_methodoverriding.EX01;

class A{
	void print() {
		System.out.println("A클래스");
	}
}

class B extends A{
	void print() {
		System.out.println("B클래스");
	}
}

public class methodoverriding_1 {	
	public static void main(String[] args) {
		//1. A타입 A 생성자
		A aa=  new A();
		aa.print(); //A클래스
		
		//2. B타입 B 생성자
		B bb = new B();
		bb.print(); //B클래스
		
		//3. A타입 B생성자
		A ab = new B();
		ab.print(); //B클래스
		
		
	}

}
