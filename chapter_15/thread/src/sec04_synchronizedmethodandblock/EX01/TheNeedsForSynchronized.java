package sec04_synchronizedmethodandblock.EX01;

//공유객체 생성
class MyData{
	int data =3;
	
	public void plusData() {
		int mydata = data; //데이터를 가져오기
		try {Thread.sleep(2000);} catch (InterruptedException e) {}		
		data = mydata+1; 
	}
}

//공유객체를 사용하는 쓰레드 생성

class PlusThread extends Thread{
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData = myData;
	}

	public void run() {
		myData.plusData();
		System.out.println(getName() + "실행결과 : " + myData.data);
	}
}

public class TheNeedsForSynchronized {
	public static void main(String[] args) {
		
		//공유객체 생성
		MyData myData = new MyData();
		
		//1. plusThread1
		
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plsuThread1");
		plusThread1.start();
		
		try {Thread.sleep(1000);} 
		catch (InterruptedException e) {}
		
		//2. plusThread2
		
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plsuThread2");
		plusThread2.start();
		
	}
	

}
