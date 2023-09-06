package sec03_userexception.EX01;

//1. 사용자 일반예외 (checked exception)
class MyException extends Exception{
	public MyException() {
		super();
	}
	public MyException(String message) {
		super(message);
	}
}

//2. 사용자 실행예외 (Unchecked exception = runtime exception)
class MyRTException extends RuntimeException{
	public MyRTException() {
		super();
	}
	public MyRTException(String message) {
		super(message);
	}
}

class A{
	//3. 사용자 정의예외 객체 생성
	MyException me1 = new MyException();
	MyException me2 = new MyException("예외메세지: My exception");
	
	MyRTException mre1 = new MyRTException();
	MyRTException mre2 = new MyRTException("예외메세지: My RTexception");
	
	//4. 예외던지기 (throw) : 던진시점에서 예외발생
	//@ 방법 1. 예외를 직접 처리 
		void abc_1(int num) {
			try {
				if(num>70) {
					System.out.println("정상작동");
				}
				else {
					throw me1;// 예외를 던진 이시점에 예외발생
				}
			}catch(MyException e) {
				System.out.println("예외처리1");
			}
			
		}
		void bcd_1() {
			abc_1(65);
		}
		
		//방법2. 예외의 전가
		void abc_2 (int num) throws MyException {
			if(num>70) {
				System.out.println("정상작동");
			}
			else {
				throw me1;// 예외를 던진 이시점에 예외발생
			}
			
		}
		
		void bcd_2() {
			try {
				abc_2(65);
			} catch (MyException e) {
				System.out.println("예외처리2");
			}
		}
}




public class CreateUserException {
	public static void main(String[] args) {
		
		A a = new A();
		a.bcd_1();
		a.bcd_2();
		
	}

}
