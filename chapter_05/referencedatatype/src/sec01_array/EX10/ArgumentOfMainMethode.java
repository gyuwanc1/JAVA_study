package sec01_array.EX10;

public class ArgumentOfMainMethode {
	public static void main(String[] args) {
		
		//1.args배열의 길이 구하기
		System.out.println(args.length);
		System.out.println();
		
		//2. 매개변수 출력1
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println(Integer.parseInt(args[1])+1);//31  문자 + 숫자 = 문자
		System.out.println();
		
		//3. 매개변수 출력2
		for(String s : args) {
			System.out.println(s);
		}
		System.out.println();
	}

}
