package garbageCollection;

public class Example {

	public static void main(String[] args) {
		Example a = new Example();
		
		
		
		garbage obj;
		for(int i =0 ; i < 1000;i++) {
			obj = new garbage();
		}

	}

}

class garbage{
	final int num  = 10;
	String name;
	
	//constructor
//	public garbage(String name) {
////		System.out.println("object created in the heap memory");
//		this.name= name;
//	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println("object is destroyed");
	}
}
