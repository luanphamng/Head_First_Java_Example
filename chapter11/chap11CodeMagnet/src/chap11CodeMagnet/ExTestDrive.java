package chap11CodeMagnet;

class MyEx extends Exception{}

public class ExTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "no";
		
		
		System.out.print("t");
		try {
		doRisky(test);
		}
		catch (MyEx e){
			System.out.print("a");
		}
		finally {
			System.out.print("w");
			System.out.println("s");			
		}
				
				
	}
	
	static void doRisky(String t) throws MyEx{
		System.out.print("h");
		
		if("yes".equals(t)) {
			throw new MyEx();
		}
		
		System.out.print("r");
		System.out.print("o");
	}

}

