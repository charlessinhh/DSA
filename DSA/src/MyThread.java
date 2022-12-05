
public class MyThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.run();
	}
	
	public void run() {
		for(int i = 1; i < 3; ++i) {
			System.out.print(i+"..");
		}
	}

}
