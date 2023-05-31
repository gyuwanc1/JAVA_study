package sec02_staticmodified.EX03;

class A{
	void abc() {
		System.out.println("인스턴스 메서드");
	}
	static void bcd() {
		System.out.println("스테틱 메서드");
	}
}

public class StaticMethod {
	public static void main(String[] args) {
		
		//1. 인스턴스 메서드 활용방법(객체 생성후 사용가능)
		A a1 = new A();
		a1.abc();// 인스턴스 메서드
		
		//2. 스테틱 메서드 활용방법
		//방법 1. 클래스 이름으로 바로접근
		A.bcd();//스테틱 메서드
		
		//방법 2. 객체 생성 후 사용가능// 가능한 사용하지 말것
		A a2 =  new A();
		a2.bcd();
		
		
	}

}
