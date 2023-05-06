package sec01_operator_1.Ex05;

public class LogicalOperator {
	public static void main(String[] args) {
		//1. 논리연산자
		//@AND (&&)
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(true && (5<3));//false
		System.out.println((5>=5) && (7>2));//true
		System.out.println();
		
		//@OR (||)
		System.out.println(true || true);//true
		System.out.println(true || false);//true
		System.out.println(false || (5<3));//true
		System.out.println((5>=5) || (7>2));//true
		System.out.println();
		
		//@XOR (^)
		System.out.println(true ^ true);//false
		System.out.println(true ^ false);//true
		System.out.println(false ^ (5<3));//false
		System.out.println((5>=5) ^ (7>2));//false
		System.out.println();
		
		//@NOT (!)
		System.out.println(!true); //flase
		System.out.println(!false); //true
		System.out.println(false || !(5<3));//true
		System.out.println((5>=5) || !(7>2));//true
		System.out.println();
		
		//2. 비트연산자로 논리연산 수행
		System.out.println(true & true);//true
		System.out.println(true & false);//false
		System.out.println(true | (5<3));//true
		System.out.println((5>=5) | (7>2));//true
		System.out.println();
		
		//@ 숏 서킷 사용 여부(논리연산자는 O, 비트연산자는 X)
		
		int value1= 3; //숏서킷 O
		System.out.println(false && ++value1>6);//false  전치연산자로 4와6을 비교 
		System.out.println(value1); //위에서뒷부분을 읽지않음
		System.out.println();
		
		int value2= 3; //숏서킷X
		System.out.println(false & ++value2>6);//false  
		System.out.println(value2); //4 뒷부분을 읽음
		System.out.println();
		
		int value3= 3; //숏서킷X
		System.out.println(true || ++value3>6);//true
		System.out.println(value3); //3 뒷부분을 읽지않음
		System.out.println();
		int value4= 3; //숏서킷X
		System.out.println(true | ++value4>6);//true
		System.out.println(value4); //4 뒷부분을 읽음
		
		
		
		
		
		
	}

}
