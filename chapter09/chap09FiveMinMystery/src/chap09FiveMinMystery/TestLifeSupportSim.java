package chap09FiveMinMystery;

import java.util.*;

class V2Radiator{
	V2Radiator(ArrayList list){
		for(int x = 0; x < 5; x++) {
			list.add(new SimUnit("V2Radiator"));
		}
		System.out.println("Created V2");
	}// close constructor
}

class V3Radiator extends V2Radiator{
	V3Radiator(ArrayList lglist){
		super(lglist);
		for(int g = 0; g < 10; g++) {
			lglist.add(new SimUnit("V3Radiator"));
		}		
		System.out.println("Created V3");		
	} //End constructor
}

class RetentionBot{
	RetentionBot(ArrayList rlist){
		rlist.add(new SimUnit("Retention"));		
	}
}
public class TestLifeSupportSim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList aList = new ArrayList();
		V2Radiator v2 = new V2Radiator(aList);
		V3Radiator v3 = new V3Radiator(aList);
		
		for(int z = 0; z < 20; z++) {
			RetentionBot ret = new RetentionBot(aList);
		}
		
		System.out.println("aList = "+ aList.size());
	}

}

class SimUnit{
	String botType;
	SimUnit(String type){
		botType = type;
		System.out.println("Sim Created!");
	}
	
	int powerUse() {
		if("Retention".equals(botType)) {
			System.out.println("Power use: 2");
			return 2;
		}
		else	{
			System.out.println("Power use: 4");
			return 4;
		}
	}
}
//Solution : add system.out.print into Sim, 
// to monitor how many element created