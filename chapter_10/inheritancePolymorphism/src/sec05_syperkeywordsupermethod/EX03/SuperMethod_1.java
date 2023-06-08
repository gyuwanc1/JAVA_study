package sec05_syperkeywordsupermethod.EX03;

class A {
	A(){
		System.out.println("A생성자");
	}
}

class B extends A {
	B(){
		//super();//생략시 컴파일러 자동 추가 (부모클래스의 생성자 호출)
		System.out.println("B생성자");
	}
}

class C {
	C(int a){
		System.out.println("C생성자");
	}
}

class D extends C{
//	D(){          //1
//		super();  //2
//	}			  //3  1~3번 까지 컴파일러가 자동으로 추가해주는 내용
	D(){
		super(3);
	}
}

public class SuperMethod_1 {
	public static void main(String[] args) {
		//1. A객체 생성
		A aa= new A(); //A생성자
		System.out.println();
		
		//2. B객체 생성  부모의 클래스가 호출 후 자식의 생성자 호출
		B bb = new B(); //A생성자 B생성자
		
	} 

}
