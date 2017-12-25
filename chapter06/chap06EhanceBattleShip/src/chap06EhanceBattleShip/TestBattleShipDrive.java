package chap06EhanceBattleShip;

import java.util.ArrayList;
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
		EhanceBattleShip dot = new EhanceBattleShip();
		GameHelper helper = new GameHelper();
		
		int numOfGuesses = 0;
		int location = (int) (Math.random() * 5);
		ArrayList<String> locations = new ArrayList<String>();
		locations.add("A2");
		locations.add("B1");
		locations.add("B3");
		
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

