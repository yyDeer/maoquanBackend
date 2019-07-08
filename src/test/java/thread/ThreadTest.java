package thread;

public class ThreadTest {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread("我的线程——");
		new Thread(thread1).start();
		new Thread(thread1).start();
		new Thread(thread1).start();
	}
}


class MyThread implements Runnable{
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	

	public MyThread(String name) {
		super();
		this.name = name;
	}
	
	

	public MyThread() {
		super();
	}


	@Override
	public void run() {
		System.out.println("开启线程："+Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			System.out.println(name +Thread.currentThread().getName()+"——"+i);
		}
	}
	
}