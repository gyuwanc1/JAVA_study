package sec05_threadstates.EX04;


class MyThread1 extends Thread{
	@Override
	public void run() {for(long i=0; i<1000000000L ;i++) {}//시간지연

	}
}

class MyThread2 extends Thread{
	MyThread1 myThread1;
	public MyThread2(MyThread1 myThread1) {
		this.myThread1 = myThread1;		
	}
	
	@Override
	public void run() {
		try {
			myThread1.join(500);
		} catch (InterruptedException e) {
			System.out.println(" -- sleep() 진행중 interrupt() 발생");
			for(long i=0; i<1000000000L ;i++) {}//시간지연
		}
	}
}



public class TimedWaitting_join {
	public static void main(String[] args) {
		
		//1. 객체생성
		MyThread1 myThread1 =  new MyThread1();
		MyThread2 myThread2 =  new MyThread2(myThread1);
		myThread1.start();
		myThread2.start();
		
		try {Thread.sleep(100);} catch (InterruptedException e) {}
		System.out.println("MyThread1 State = " + myThread1.getState());
		System.out.println("MyThread1 State = " + myThread2.getState());
		
		
		myThread2.interrupt();		
		System.out.println("MyThread1 State = " + myThread1.getState());
		System.out.println("MyThread1 State = " + myThread2.getState());
	}

}
