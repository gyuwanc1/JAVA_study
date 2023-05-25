package sec04_thiskeyword_EX01;

//1. 클래스의 정의: 클래스 내부에서 필드, 메서드에 앞에 자동으로붙는  this 키워드

class A{
	int m;
	int n;
	void init(int a, int b) {
		m=a;// this.m
		n=b;// this.n
	}
	void work() {
		init(2,3);//this.init(2,3)
	}
}


public class thisketword_1 {
	public static void main(String[] args) {
		
	//2. 클래스의 객체 생성
		
		A a =  new A();
		
	//3. 매서드 호출 / 필드값 활용
		a.work();
		
		System.out.println(a.m);
		System.out.println(a.n);
		
		
		
		
	}

}
