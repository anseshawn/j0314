package t1_BasicThread;

// 스레드 만드는 방법 : 2. 스레드클래스의 조상인 Runnable 인터페이스를 상속
// (상속만 했을 때는 아직 스레드가 아님)
public class T2_MultiThread2 implements Runnable {

	// 인터페이스를 바로 상속해왔기 때문에 override 안 하면 에러가 발생함
	@Override
	public void run() {
		System.out.println("=====================================");
		System.out.println("1.현재 클래스명 : T2_MultiThread2");
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
		System.out.println("2.현재 클래스명 : T2_MultiThread2");
		System.out.println("2.현재 실행중인 스레드 이름 : "+Thread.currentThread().getName());
		System.out.println("2."+Thread.currentThread().getName()+" 스레드가 종료됩니다.");
		System.out.println("=====================================");
	}
}
