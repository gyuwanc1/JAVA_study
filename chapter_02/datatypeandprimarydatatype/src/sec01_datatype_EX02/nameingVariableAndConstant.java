package sec01_datatype_EX02;

public class nameingVariableAndConstant {
	public static void main(String[] args) {
		
		//1. 변수의 이름
		boolean aBcD; //가능 하지만 권고사항 위배
		byte 가나다; //한글가능
		short _abcd; //_,$ 가능 영문자와 동급
		char $ab_cd; 
		//int 3abcd; // 불가능 숫자는 제일 앞에 올 수 없다.
		long abcd3;
		//float int; //사용불가 int는 이미 예약어 사용불가
		double main;//가능 메서드 이름과 변수이름은 동일해도 무관, 사용하지 않는것이 좋을듯
		//int my work;//불가능 스페이스 특수키가 포함
		String myClassname;
		int ABC;// 가능 하지만 권고사항 위배 
		
		//2. 상수이름
		final double PI;
		final int MY_DATA;
		final float myData; // 가능은 하지만 권고사항 위배
		
		//메서드와 변수를 사용하는 방법
	}

}
