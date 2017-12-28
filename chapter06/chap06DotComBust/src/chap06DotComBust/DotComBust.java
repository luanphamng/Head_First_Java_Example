package chap06DotComBust;
import java.util.*;

public class DotComBust {
	
	GameHelper helper = new GameHelper();
	ArrayList<DotCom> DotComsList = new ArrayList<DotCom>();
	int numOfGuesses = 0;
	
	// 
	public void setUpGame() {
		DotCom firstShip = new DotCom();
		firstShip.setName("Pets.com");
		DotCom secondShip = new DotCom();
		secondShip.setName("eToys.com");
		DotCom thirdShip = new DotCom();
		thirdShip.setName("Go2.com");
		
		DotComsList.add(firstShip);
		DotComsList.add(secondShip);
		DotComsList.add(thirdShip);
		
		for(DotCom dotComset : DotComsList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComset.setLocationCells(newLocation);
		}					
	}	
	
	private void startPlaying() {
		while(!DotComsList.isEmpty())
		{
			String userGuess = helper.getUserInput("Please input: ");
			checkUserGuess(userGuess);			
		}
		finishGame();
		
	}
	
	private void checkUserGuess(String userInput) {
		numOfGuesses++;
		String result = "miss";
		
		for(DotCom dotComToTest : DotComsList) {
			result = dotComToTest.checkYourself(userInput);
			if(result.equals("hit")) {
				break;
			}			
			if(result.equals("kill")) {
				DotComsList.remove(dotComToTest);
				break;
			}
		}			
		System.out.println(result);
		
	}	//close checkUserGuess method
	
	private void finishGame() {
		System.out.println("Number of Guesses" +numOfGuesses);
		System.out.println("All Dot Coms are dead! Your stock is now worthless");
		if(numOfGuesses <= 18) {
			System.out.println("It only took you " + numOfGuesses + " guesses");
            System.out.println("You got out before your options sank.");			
		}
		else {
			System.out.println("Took you long enough. " +numOfGuesses + " guesses.");
			System.out.println("Fish are dancing with your options.");
		}
	}	//close finishGame method
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}	//close main method

}
