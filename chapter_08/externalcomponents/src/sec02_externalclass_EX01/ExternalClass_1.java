package sec02_externalclass_EX01;

//와부 클래스 정의 (public을 설정 할 수 없다)

class A{
	int m =3;
	int n =4;
	
	void print() {
		System.out.println(m + " , "+n);
	}
}

public class ExternalClass_1 {
	public static void main(String[] args) {
		A a = new A();
		a.print();// 3,4
		
	}

}
