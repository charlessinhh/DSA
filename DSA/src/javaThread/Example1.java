package javaThread;

public class Example1 extends Thread {
	
	public void run() {
		for(int i = 0; i<5;i++) {
			System.out.println("charles");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		

	}

}
