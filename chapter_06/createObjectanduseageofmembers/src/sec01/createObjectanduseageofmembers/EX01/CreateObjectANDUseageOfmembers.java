package sec01.createObjectanduseageofmembers.EX01;

//1. 클래스의 구성 (정의) :  붕어빵 기계

class A{
	int m=3;
	
	void print() {
		System.out.println("객체 생성 및 활용");
	}
}

public class CreateObjectANDUseageOfmembers {
	public static void main(String[] args) {
		
		//2. 클래스로 부터 객체 생성 : 붕어빵 만들기
		A a = new A();		
		
		//3. 클래스 멤버활용 (필드활용:필드에 값을 읽기/쓰기, 메서드를 활용:메서드를 호출) : 붕어빵을 먹기
		
		a.m =5;
		System.out.println(a.m); //5
		
		a.print(); //객체 생성 및 활용
	}

}
