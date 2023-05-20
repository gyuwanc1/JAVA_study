package sec01_field_EX01;

//필드와 지역변수의 구분

//1. 클래스 생성

class A {
	int m = 3;//필드: 클래스의 내부구성요소, 자신이 선언된 중괄호가 클래스 중괄호 일경우 필드
	int n = 4;//필드
	
	void work1() {
		int k =5;// 지역변수 : 메소드 안에서 선언된 변수
		System.out.println(k); //5
		work2(3);
	}
	
	void work2(int i) { 
		// int i  가장먼저 실행 , 지역변수
		// i = 외부에서 전달된 값
		int j =4;//지역변수
		System.out.println(i+j);// 7
	}
}

public class FieldComponent {
	public static void main(String[] args) {
		
		//2. 클래스를 활용하여 객체생성
		
		A a = new A();
		
		//3-1. 필드값 출력;
		System.out.println(a.m);//3
		System.out.println(a.n);//4
		
		//3-2 메서드 호출
		a.work1();//5,7
	}

}
