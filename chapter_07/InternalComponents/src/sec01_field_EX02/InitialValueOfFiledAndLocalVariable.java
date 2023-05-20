package sec01_field_EX02;

//1. 클래스 생성(정의)
class A {
	boolean m1;
	int m2;
	double m3;
	String m4;
	
	void printfieldvalue() {
		System.out.println(m1);//false
		System.out.println(m2);//0
		System.out.println(m3);//0.0
		System.out.println(m4);//null: 객체를 가리키지 않고 있다.
	}
	
	void printLocalvariable() {
		int k;		
		//System.out.println(k); //지역변수 = 반드시 초기화 해야함
	}
}

public class InitialValueOfFiledAndLocalVariable {
	public static void main(String[] args) {
		
		//2. 클래스를 활용하여 객체 생성
		A a =  new A();
		
		//3. 객체활용
		a.printfieldvalue();
		
		
		
	}

}
