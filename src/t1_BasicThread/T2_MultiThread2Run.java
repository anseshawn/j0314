package t1_BasicThread;

// 스레드를 만드는 2번째 방법 : Runnable 인터페이스 구현객체를 만든 후 스레드 생성시 매개변수로 처리해준다.
public class T2_MultiThread2Run {
	public static void main(String[] args) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("main(1).현재 클래스명 : T2_MultiThread2Run");
		System.out.println("main(1).현재 실행중인 스레드 이름 : "+Thread.currentThread().getName());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		
		T2_MultiThread2 t2 = new T2_MultiThread2(); // 1.인터페이스 구현객체 생성
		// Thread thread = new Thread(t2); // 1. 생성한 구현객체를 스레드에 넣어줌
		// MultiThread2는 스레드 객체가 아니기 때문에 여기서 스레드로 만들어줘야 한다
		Thread thread = new Thread(t2, "atom"); // 스레드 생성시 이름 부여
		thread.start(); 
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		System.out.println("main(2).현재 클래스명 : T2_MultiThread2Run");
		System.out.println("main(2).현재 실행중인 스레드 이름 : "+Thread.currentThread().getName());
		System.out.println("main(2)."+Thread.currentThread().getName()+" 스레드가 종료되었습니다.");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}
