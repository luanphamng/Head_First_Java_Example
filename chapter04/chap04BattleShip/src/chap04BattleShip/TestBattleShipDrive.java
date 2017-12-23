package chap04BattleShip;

public class TestBattleShipDrive {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		BattleShip dot = new BattleShip();
//		
//		int[] locations = {2, 3, 4};
//		dot.setLocationCells(locations);
//		
//		String userGuess = "8";
//		String result = dot.checkYourSelf(userGuess);
//		String testResult = "failed";
//		
//		if (result.equals("hit")) {
//			testResult = "passed";
//		}
//		
//		System.out.println(testResult);
//	}


	//Sharpen your pencil

	public static void main(String [] args)
	{
		BattleShip dot = new BattleShip();
		GameHelper helper = new GameHelper();
		
		int numOfGuesses = 0;
		int location = (int) (Math.random() * 5);
		int[] locations = {location, location + 1, location + 2};
		
		String result;
		String userGuess = "";
				
		dot.setLocationCells(locations);
		
		boolean isAlive = true;
		
		
		while(isAlive == true)
		{			
			userGuess = helper.getUserInput("Please input: ");
			result = dot.checkYourSelf(userGuess);			
			numOfGuesses++;
			if(result.equals("kill")) {									
				isAlive = false;
				break;
			}				
		}
		System.out.println("Congrats! Num Of guess: " + numOfGuesses);

	}
	
}

