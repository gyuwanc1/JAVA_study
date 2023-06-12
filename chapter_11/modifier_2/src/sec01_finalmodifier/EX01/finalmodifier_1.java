package sec01_finalmodifier.EX01;

class A1 {
	int a= 3;
	final int b=5;
	A1(){
		
	}
}

class A2 {
	int a;
	final int b;
	A2(){
		a=3;
		b=5; //객체생성시 초기화를 하지않으면 생성자 안에서 해줘야 한다.
	}
}

class A3 {
	int a=3;
	final int b=5;
	A3(){
		a=5;
//		b=7;// final 필드는 한번 정해진 값을 바꿀수 없다. (최초선언 된 이후 값을 대입할 수 없다)
		
	}
}

class B{
	void bcd() {
		int a=3;
		final int b= 5;
		
		
	}
}

public class finalmodifier_1 {
	public static void main(String[] args) {
		//1. 객체생성
		A1 a1 = new A1();
		A2 a2 = new A2();
		a1.a=7;
//		a1.b=9;// final 필드는 한번 정해진 값을 바꿀수 없다.
		
				
		a2.a=7;
//		a2.b=9;// final 필드는 한번 정해진 값을 바꿀수 없다.
	}

}
