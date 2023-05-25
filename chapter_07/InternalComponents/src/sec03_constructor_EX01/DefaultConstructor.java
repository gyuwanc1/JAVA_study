package sec03_constructor_EX01;

//컴파일러가 자동 추가해주는 생성자(기본생성자)

class A{
	int m;
	void wrk() {
		System.out.println(m);//0
	}
	//컴파일러가 자동으로 추가해주는 기본 생성자(생성자가 아에 없을때만 생성해줌)
//	A(){
//		//객체 생성 이후에 해야할 추가 일들
//	}
}

class B{
	int m;
	void wrk() {
		System.out.println(m);//0
	}
	B(){//기본생성자
		
	}
}

class C{
	int m;
	void wrk() {
		System.out.println(m);//생성자로 넘어온 값
	}
	C(int a){ // 생성자의 기본기능 : 객체생성 + 필드초기화
		m=a;
	}
}



public class DefaultConstructor {
	public static void main(String[] args) {
		
		
		//1. 클래스의 객체 생성
		A a = new A();
		B b = new B();
//		C c = new C();
		C c = new C(3);
		
		//2. 메서드 호출
		a.wrk();//0
		b.wrk();//0
		c.wrk();//3
		
		
	}

}
