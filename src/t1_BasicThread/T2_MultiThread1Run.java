package t1_BasicThread;

public class T2_MultiThread1Run {
	public static void main(String[] args) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("main(1).현재 클래스명 : T2_MultiThread1Run");
		System.out.println("main(1).현재 실행중인 스레드 이름 : "+Thread.currentThread().getName());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		
		// 스레드를 상속받은 객체를 생성 = t1은 스레드가 맞음
		T2_MultiThread1 t1 = new T2_MultiThread1();
		// t1.run(); // 스레드를 실행할 때는 run()메소드가 아닌 start()메소드로 실행한다.
		t1.start();
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		System.out.println("main(2).현재 클래스명 : T2_MultiThread1Run");
		System.out.println("main(2).현재 실행중인 스레드 이름 : "+Thread.currentThread().getName());
		System.out.println("main(2)."+Thread.currentThread().getName()+" 스레드가 종료되었습니다.");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}
