package sec02_interface.EX08;

interface A{
	static void abc() {
		System.out.println("A인터페이스의 정적메서드 abc()");
	}
}

public class StaticMethod {
	public static void main(String[] args) {
		//1.정적메서드 호출
		A.abc();
	}

}
