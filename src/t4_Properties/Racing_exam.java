package t4_Properties;


class HorseRacing extends Thread {
    String running = "";
    int cnt = 0;
    int sum = 0;
    String[] rank = new String[5];
    
    @Override
    public void run() {
        int goal = 10;
        for(int i=0; i<=goal; i++) {
            running = running + ">";
            if(i == goal) {
                System.out.println(Thread.currentThread().getName()+" : "+running+(cnt+1)+"번");
                rank[cnt] = Thread.currentThread().getName();
                cnt++;
            }
            else {            
                System.out.println(Thread.currentThread().getName() +" : "+running);
            }
            try {Thread.sleep(500);} catch (InterruptedException e) {}
        }
        
    }
}
 
public class Racing_exam {
    
    public static void main(String[] args) {
        
        HorseRacing horse = new HorseRacing();
        Thread h1 = new Thread(horse,"태양(1번말)");
        Thread h2 = new Thread(horse,"번개(2번말)");
        Thread h3 = new Thread(horse,"바다(3번말)");
        Thread h4 = new Thread(horse,"구름(4번말)");
        Thread h5 = new Thread(horse,"천둥(5번말)");
        
        System.out.println("경마를 시작합니다.");
        
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();
        
        try {
            h1.join();
            h2.join();
            h3.join();
            h4.join();
            h5.join();
        } catch (InterruptedException e) {}
        
        System.out.println("경주가 종료되었습니다.");        
        System.out.println("=======순위=======");
        System.out.println("1등: " + horse.rank[0]);
        System.out.println("2등: " + horse.rank[1]);
        System.out.println("3등: " + horse.rank[2]);
    }
}