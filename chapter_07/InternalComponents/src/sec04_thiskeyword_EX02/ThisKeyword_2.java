package sec04_thiskeyword_EX02;

class A{
	int m;
	int n;
	
	void init(int m, int n) {
		m=m;
		n=n;
	}

}

class B{
	int m;
	int n;
	
	void init(int m, int n) {
		this.m=m;
		this.n=n;
	}

}

public class ThisKeyword_2 {
	public static void main(String[] args) {
		
		// 1. 필드명과 지역변수 명이 같은 경우 (this  키워드를 사용하지 않은 경우)
		A a = new A();
		a.init(2,3);
		System.out.println(a.m);// 0
		System.out.println(a.n);// 0
		
		// 2. 필드명과 지역변수 명이 같은 경우 (this  키워드를 사용한 경우)
		B b = new B();
		b.init(2,3);
		System.out.println(b.m);// 2
		System.out.println(b.n);// 3
		
		
	}

}
