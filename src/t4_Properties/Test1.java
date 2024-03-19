package t4_Properties;

public class Test1 {
	public static void main(String[] args) {
		
		Thread thread = Thread.currentThread();
		System.out.println("현재 스레드 이름 : "+thread.getName());
		System.out.println("현재 동작하는 스레드 수1 : "+Thread.activeCount());
		
		for(int i=0; i<3; i++) {
			Thread th = new Thread();
			System.out.println(th.getName());
			th.start(); // for문이 반복되면서 스레드가 생성되고 사라지기를 반복한다
		}
		System.out.println("현재 동작하는 스레드 수2 : "+Thread.activeCount());
		// 메인스레드가 for문보다 더 빨리 sysout문을 동작하면서 for문안의 스레드가 사라지기 전에 카운트 할 수 있음 (2,3,4 로 출력될 가능성이 있다)
		System.out.println();
		
		for(int i=0; i<3; i++) {
			Thread th = new Thread();
			th.setName(i+"번째 스레드");
			System.out.println(th.getName());
			th.start();
		}
		System.out.println("현재 동작하는 스레드 수3 : "+Thread.activeCount());
	}
}
