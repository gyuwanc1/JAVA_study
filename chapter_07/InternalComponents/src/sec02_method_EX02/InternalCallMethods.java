package sec02_method_EX02;

public class InternalCallMethods {
	public static void main(String[] args) {
		
		//같은 클래스 안에 있는 내부 메소드 호출 -> 참조변수없이 메소드명으로 가능
		print(); //안녕
		
		int a = twice(3);
		System.out.println(a);//6
		
		double b = sum(a, 5.8);
		System.out.println(b); //1.8
		
	}
	public static void print() {
		System.out.println("안녕");
	}

	public static int twice(int k) {
		
		return k*2;
	}

	public static double sum(int m, double n) {
		return m+n;
	}
	

}
