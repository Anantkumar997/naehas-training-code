package MultiThreading;
class Mythread1 implements Runnable{
	@Override
	public void run() {
		int i = 0;
		while(i < 200) {
			System.out.println("Thread1 with :" + " " + i);
			i++;
		}
		
	}
}

class Mythread2 implements Runnable{
	@Override
	public void run() {
		int i = 200;
		while(i < 400) {
			System.out.println("Thread2 with :" + " " + i);
			i++;
		}
		
	}
}
public class ThreadWithRunnable {

	public static void main(String[] args) {
		Mythread1 r1 = new Mythread1();
		Mythread2 r2 = new Mythread2();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		

	}

}
