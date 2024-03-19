package t1_BasicThread;

// 스레드 만드는 방법 : 1.Thread 클래스를 상속
public class T2_MultiThread1 extends Thread {
	//Thread를 상속받으면 무조건 run 이 있어야 한다(그래야 동작 가능)
	@Override //Thread가 상속받은 인터페이스클래스가 가지고 있는 메소드
	public void run() {
		System.out.println("=====================================");
		System.out.println("1.현재 클래스명 : T2_MultiThread1");
		System.out.println("1.현재 실행중인 스레드 이름 : "+Thread.currentThread().getName());
		System.out.println("=====================================");
		// 시간 지연방법1.
		//for(int i=0; i<1000000000; i++) {}
		// 시간 지연방법2.
		for (int i=1; i<=5; i++) {
			System.out.println("i = " + i);			
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
		System.out.println("=====================================");
		System.out.println("2.현재 클래스명 : T2_MultiThread1");
		System.out.println("2.현재 실행중인 스레드 이름 : "+Thread.currentThread().getName());
		System.out.println("2."+Thread.currentThread().getName()+" 스레드가 종료됩니다.");
		System.out.println("=====================================");
	}
}
