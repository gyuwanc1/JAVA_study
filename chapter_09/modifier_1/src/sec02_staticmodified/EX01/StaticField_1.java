package sec02_staticmodified.EX01;

class A{
	int m =3; //인스턴스 필드
	static int n= 5; // (정적)static 필드, 
}

public class StaticField_1 {
	public static void main(String[] args) {
		
		//1. 인스턴스 필드 활용방법 (항상 객체생성을 한 후 사용가능)
		A a1 = new A();
		System.out.println(a1.m);
		
		//2. 정적(static)필드 활용방법
		//방법1.(객체 생성없이 클래스 이름으로 바로 활용)
		System.out.println(A.n);
		
		//방법2.(객체생성 후 활용: 인스턴스와 동일) : 가능한 지양, 사용하지말것
		A a2 =  new A();
		System.out.println(a2.n);
		
		
		
		
	}

}
