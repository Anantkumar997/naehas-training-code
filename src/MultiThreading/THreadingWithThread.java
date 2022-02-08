package MultiThreading;
class Thread1 extends Thread{
	@Override
	public void run() {
		int i = 0;
		while(i < 200) {
			System.out.println("Thread1 is cooking : " + " " + i);
			i++;
		}
	}
}

class Thread2 extends Thread{
	@Override
	public void run() {
		int i = 200;
		while(i < 400) {
			System.out.println("Thread2 is chetting : " + " " + i);
			i++;
		}
	}
}
public class THreadingWithThread {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();

	}

}
