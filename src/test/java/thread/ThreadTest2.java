package thread;

public class ThreadTest2 {
	public static void main(String[] args) {
		MyThread2 thread1 = new MyThread2();
		MyThread2 thread2 = new MyThread2();
		thread1.start();
		thread2.start();
	}
}


class MyThread2 extends Thread{
	

	@Override
	public void run() {
		System.out.println("开启线程："+Thread.currentThread().getName());
	}
	
}