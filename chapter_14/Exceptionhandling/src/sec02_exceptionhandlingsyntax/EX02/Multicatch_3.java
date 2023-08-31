package sec02_exceptionhandlingsyntax.EX02;

public class Multicatch_3 {
	public static void main(String[] args) {
		
		//1. catch블록을 각각 처리한 경우
		try {
			System.out.println(3/1); //실행예외(ArithmeticException)
			int num = Integer.parseInt("10A"); //실행예외(NumberFormatException)
		}
		catch(NumberFormatException e) {
			System.out.println("예외가 발생했습니다.");			//catch블럭은 하나만 실행 된다. 가장먼저 예외인것.
		}
		catch(ArithmeticException e) {
			System.out.println("예외가 발생했습니다.");				
		}
		
		//2. catch 블록을 하나로 통일한 경우
		try {
			System.out.println(3/1); //실행예외(ArithmeticException)
			int num = Integer.parseInt("10A"); //실행예외(NumberFormatException)
		}
		catch(ArithmeticException | NumberFormatException e) {
			System.out.println("예외가 발생했습니다.");			//catch블럭은 하나만 실행 된다. 가장먼저 예외인것.
		}

		
	}
}
