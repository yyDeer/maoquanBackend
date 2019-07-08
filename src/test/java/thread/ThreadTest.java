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
	
	private int a = 100;
	
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
		while(a>0){
			synchronized (this) {
				if(a>0) {
					System.out.println(name +Thread.currentThread().getName()+"抢到了第"+a+"张票");
					a--;
				}
			}
		}
	}
	
}