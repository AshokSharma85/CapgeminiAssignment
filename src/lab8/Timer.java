package lab8;

public class Timer implements Runnable{
	Thread t;
	Timer(){
		t=new Thread(this,"timer");
		t.start();
	}
	
	public void run() {
		System.out.println("Start");
		int i=10;
		while(true) {
		try {
			Thread.sleep(10000);
			System.out.println(i+" sec passed");
			i=i+10;
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		}
	}

}
