package sec01_basicsyntax.EX03;

public class ConsoleOutput {
	public static void main(String[] args) {
		
		//1.System.out.println()  화면출력 ctrl+f11
		System.out.println("화면출력"); //화면출력
		System.out.println("화면"+"출력"); //화면출력
		System.out.println(3.8);//3.8
		System.out.println(3+5);//8
		System.out.println("화면"+3); //화면3
		System.out.println("화면"+3+5);// 화면35
		System.out.println(3+5+"화면");// 8화면
		System.out.println();
		
		int a = 3;
		String b = "화면";
		System.out.println(a);//3
		System.out.println(b);//화면
		System.out.println(b+"출력");//화면출력
		System.out.println(a+b+"출력");//3화면출력
		System.out.println();
		
		//2. system.out.print(...)
		System.out.print("화면");
		System.out.print("출력");
		System.out.print("3");
		System.out.print("\n"); // \n의 의미는 개행해라의 의미이다.
		System.out.print("\n"); // \n의 의미는 개행해라의 의미이다.
		
		
		//3. system.out.printf(...)
		System.out.printf("%d\n", 30);//30 10진수
		System.out.printf("%o\n", 30);//36 8진수
		System.out.printf("%x\n", 30);//1e 16진수
		
		System.out.printf("%s\n", "출력"); // 출력 문자열 출력
		System.out.printf("%f\n", 5.8); // 출력 실수 출력
		System.out.printf("%4.2f\n", 5.8); // 출력 실수 출력
		System.out.printf("%d와%4.2f\n",4, 5.8); // 출력 실수 출력
		
	}
}
