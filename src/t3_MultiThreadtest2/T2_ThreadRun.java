package t3_MultiThreadtest2;

class SMIFile extends Thread{
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

class ScreenFile extends Thread{
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

public class T2_ThreadRun {
	public static void main(String[] args) {
		// 자막객체 생성 실행
		Thread smiThread = new SMIFile();
		smiThread.start();
		
		// 영상객체 생성 실행
		Thread screenFile = new ScreenFile();
		screenFile.start();
		
		// SMIFile 이랑 ScreenFile 스레드에서 지연시간을 같이 줬기 때문에 1~5까지 차례대로 나옴
		// SMIFile 에서 초반부에 딜레이를 줘서 영상이 먼저 나오도록 함
	}
}
