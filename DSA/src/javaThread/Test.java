package javaThread;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 obj  = new Example1();
		obj.start();
		for(int i = 0; i<5;i++) {
			System.out.println("bittu");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
