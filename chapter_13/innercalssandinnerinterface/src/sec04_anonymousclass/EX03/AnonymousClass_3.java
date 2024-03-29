package sec04_anonymousclass.EX03;

interface A{
	public abstract void abc();
}
//1.자식클래스를 직접생성
class B implements A{	
	public void abc() {
		System.out.println("매개변수 전달");
	}
}

class C {
	void cde(A a) {
		a.abc();
	}
}

public class AnonymousClass_3 {
	public static void main(String[] args) {
		C c = new C();
		
		//방법1. 클래스명 O  +  참조변수명 O
		A a = new B();		
		c.cde(a);//매개변수 전달
		
		//방법2. 클래스명 O  +  참조변수명 X
			
		c.cde(new B());//매개변수 전달
	}

}
