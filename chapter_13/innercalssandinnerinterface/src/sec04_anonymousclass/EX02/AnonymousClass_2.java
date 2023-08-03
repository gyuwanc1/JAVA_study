package sec04_anonymousclass.EX02;

class A{
	C c = new C() {
		public void bcd() {
			System.out.println("익명 이너 클래스");
		}
	};
	
	void abc() {
		c.bcd();
	}
	
}

interface C{
	public abstract void bcd();
}

public class AnonymousClass_2 {
	public static void main(String[] args) {
		//1.객체생성 및 메서드호출
		A a = new A();
		a.abc();//익명이너 클래스
	}

}
