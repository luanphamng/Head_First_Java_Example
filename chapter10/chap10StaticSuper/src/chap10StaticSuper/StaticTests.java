package chap10StaticSuper;

class StaticSuper{
	
	static {
		System.out.println("super static block");
	}
	
	StaticSuper() {
		// TODO Auto-generated constructor stub
		System.out.println("super constructor");
	}
}

public class StaticTests extends StaticSuper{
	
	static int rand;
	
	static {
		rand = (int) (Math.random() * 6);
		System.out.println("static block " + rand);
	}
	
	StaticTests() {
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("in main");
		StaticTests st = new StaticTests();
	}

}
