package sec_Controlstatements_EX02;

public class SwitchControlStatement {
	public static void main(String[] args) {
		
		//1. break이 포함되지 않은 경우
		int value1 =2;
		switch(value1) {
		case 1:
			System.out.println("a");
		case 2:
			System.out.println("b");
		case 3:
			System.out.println("c");
		default:
			System.out.println("d");
		}
		System.out.println();
		//2. break이 포함되는 경우
		int value2 =2;
		switch(value2) {
		case 1:
			System.out.println("a");
			break;
		case 2:
			System.out.println("b");
			break;
		case 3:
			System.out.println("c");
			break;
		default:
			System.out.println("d");
		}
		System.out.println();
		//@ if else if else 구문으로 변환
		if(value1 ==1) {
			System.out.println("A");
		} else if(value1 ==2) {
			System.out.println("B");
		} else if (value2 == 3) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		
	}
}
