package sec01_finalmodifier.EX02;

class A {
	void avc() {}
	final void bcd() {}
}

class B extends A{
	void abc() {}
//	void bcd () {} //final 메서드는 오버라이딩 불가
}

final class C{}

//class D extends C{} //final 클래스는 상속 자체가 불가

public class finalmodifier_2 {

}
