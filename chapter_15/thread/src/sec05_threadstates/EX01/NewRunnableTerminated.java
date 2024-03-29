package sec05_threadstates.EX01;

public class NewRunnableTerminated {
	public static void main(String[] args) {
		// 쓰레드 상태 저장 클래스
		Thread.State state;
		
		
		//1. 객체생성(NEW)
		Thread thread = new Thread() {
			@Override
			public void run() {
				for(long i=0; i<100000000L ;i++) {}//시간지연
			}
		};
		
		state = thread.getState();
		System.out.println("thread state = " + state); //NEW
		
		//2. Thread 시작
		thread.start();
		state = thread.getState();
		System.out.println("thread state = " + state); //Runnable
		
		
		//3. thread 종료
		try {
			thread.join();
		} catch (InterruptedException e) {}
		
		state = thread.getState();
		System.out.println("thread state = " + state); //Terminated
	}

}
