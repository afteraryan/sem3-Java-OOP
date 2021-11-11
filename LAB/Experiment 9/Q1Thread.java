class ThreadExtend extends Thread{
	public void run() {
		System.out.println("Thread Class is Running");
	}
}

class ThreadExtend2 implements Runnable{
	public void run() {
		System.out.println("Runnable Thread Class is running");
	}
}

public class Q1Thread {

	public static void main(String[] args) {
		ThreadExtend TE1 = new ThreadExtend();
		TE1.start();
		ThreadExtend2 Obj = new ThreadExtend2();
		Thread TE2 = new Thread(Obj);
		TE2.start();
	}

}