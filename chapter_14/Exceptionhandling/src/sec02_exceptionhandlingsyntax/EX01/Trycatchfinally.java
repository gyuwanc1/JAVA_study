package sec02_exceptionhandlingsyntax.EX01;

public class Trycatchfinally {
	public static void main(String[] args) {
		
		//1. try -catch
		try {
			System.out.println(3/0); //실행예외(ArithmeticException)
			System.out.println("프로그램종료");
		}
		catch(ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌수 없습니다");
			System.out.println("프로그램 종료");
		}
		
		//2. try-catch-finally
		try {
			System.out.println(3/0); //실행예외(ArithmeticException)			
		}
		catch(ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌수 없습니다");			
		}
		finally {//항상 작동해야하는 코드를 작성하자
			System.out.println("프로그램 종료");
		}
	}
}
