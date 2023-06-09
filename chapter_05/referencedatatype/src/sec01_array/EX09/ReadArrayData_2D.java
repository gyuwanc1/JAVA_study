package sec01_array.EX09;

public class ReadArrayData_2D {
	public static void main(String[] args) {
		
		//1. 2차원 데이터의 배열의 길이
		int[][] array1 = new int[2][3];
		System.out.println(array1.length);//2
		System.out.println(array1[0].length);//첫번째 행이 가리키는 1차원 배열의 개수 3
		System.out.println(array1[1].length);//두번째 행이 가리키는 1차원 배열의 개수 3
		
		System.out.println();
		
		int[][]array2 = new int[][] {{1,2},{3,4,5}};
		System.out.println(array2.length);//2 행의 갯구
		System.out.println(array2[0].length);//첫번째 행이 가리키는 1차원 배열의 개수 2
		System.out.println(array2[1].length);//두번째 행이 가리키는 1차원 배열의 개수 3
		System.out.println();
		//2. 2차원 배열의 출력방법
		System.out.println(array2[0][0]);
		System.out.println(array2[0][1]);
		System.out.println(array2[1][0]);
		System.out.println(array2[1][1]);
		System.out.println(array2[1][2]);
		System.out.println();
		
		for(int i = 0; i<array2.length;i++) {
			for(int j=0;j<array2[i].length;j++){
				System.out.println(array2[i][j]);
			}
		}
		System.out.println();
		
		//for(하나의 원소를 꺼냈을때 저장할 변수:집합객체) 
		for(int[] array:array2) {
			for(int k:array) {
				System.out.println(k);
			}
		}
		
		
	}
}
