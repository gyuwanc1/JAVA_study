package sec02_exceptionhandlingsyntax.EX02;

public class Multicatch_2 {
	public static void main(String[] args) {
		
		//1. catch블록의 순서가 잘못된 경우
		
//		try {
//			System.out.println(3/1); //실행예외(ArithmeticException)
//			int num = Integer.parseInt("10A"); //실행예외(NumberFormatException)
//		}
//		catch(Exception e) {
//			System.out.println("숫자는 0으로 나눌수 없습니다");				
//		}
//		catch(NumberFormatException e) {
//			System.out.println("숫자로 바꿀수 없습니다.");			//catch블럭은 하나만 실행 된다. 가장먼저 예외인것.
//		}
//		finally {//항상 작동해야하는 코드를 작성하자
//			System.out.println("프로그램 종료");
//		}	
		
		//2. catch블록의 올바른 순서
		try {
			System.out.println(3/1); //실행예외(ArithmeticException)
			int num = Integer.parseInt("10A"); //실행예외(NumberFormatException)
		}
		catch(NumberFormatException e) {
			System.out.println("숫자로 바꿀수 없습니다.");			//catch블럭은 하나만 실행 된다. 가장먼저 예외인것.
		}
		catch(Exception e) {
			System.out.println("숫자는 0으로 나눌수 없습니다");				
		}

		finally {//항상 작동해야하는 코드를 작성하자
			System.out.println("프로그램 종료");
		}	
	}

}
