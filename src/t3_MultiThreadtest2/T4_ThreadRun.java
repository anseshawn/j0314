package t3_MultiThreadtest2;
/*
class SMIFile2 implements Runnable{
	@Override
	public void run() {
		// #2. 자막 (한글)
		String[] smiArray = {"하나","둘","셋","넷","다섯"};
		try {Thread.sleep(10);} catch (InterruptedException e) {}			

		// #4. 자막출력
		for(int i=0; i<smiArray.length; i++) {
			System.out.println("- 자막 : "+ smiArray[i]);
			try {Thread.sleep(300);} catch (InterruptedException e) {}			
		}
	}
}

class ScreenFile2 implements Runnable{
	@Override
	public void run() {
		// #1. 영상프레임 1~5컷
		int[] screenArray = {1,2,3,4,5};
				
		// #3. 영상출력
		for(int i=0; i<screenArray.length; i++) {
			System.out.print("영상프레임 : "+ screenArray[i]);
			try {Thread.sleep(300);} catch (InterruptedException e) {}			
		}
	}
}
*/
public class T4_ThreadRun {
	public static void main(String[] args) {
		// 자막을 출력하는 스레드를 익명이너클래스로 구현한다.
		// Runnable은 독립적으로 생성이 되지 않기 때문에 Runnable 안의 추상메소드(run())을 사용하기 위해 
		Thread th1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// #2. 자막 (한글)
				String[] smiArray = {"하나","둘","셋","넷","다섯"};
				try {Thread.sleep(20);} catch (InterruptedException e) {}			

				// #4. 자막출력
				for(int i=0; i<smiArray.length; i++) {
					System.out.println("- 자막 : "+ smiArray[i]);
					try {Thread.sleep(500);} catch (InterruptedException e) {}			
				}
			}
			
		});
		
		Thread th2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// #1. 영상프레임 1~5컷
				int[] screenArray = {1,2,3,4,5};
						
				// #3. 영상출력
				for(int i=0; i<screenArray.length; i++) {
					System.out.print("영상프레임 : "+ screenArray[i]);
					try {Thread.sleep(500);} catch (InterruptedException e) {}			
				}
			}
		});
		
		th1.start();
		th2.start();
	}
}
