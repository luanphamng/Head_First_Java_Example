package chap06EhanceBattleShip;

import java.util.ArrayList;

public class EhanceBattleShip {

	private ArrayList<String> locationCells;
	
	public void setLocationCells(ArrayList<String> loc) {
		locationCells = loc;
	}	
	
	public String checkYourSelf(String userInput) {
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		
		if(index >= 0) {
			locationCells.remove(index);
			if(locationCells.isEmpty()) {
				result = "kill";
			}			
			else {
				result = "hit";
			} // close if				
		}		
		System.out.println(result);
		return result;
	} // close checkYourSelf
	
}//close EhanceBattleShip
