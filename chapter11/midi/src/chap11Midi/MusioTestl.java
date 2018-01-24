package chap11Midi;
import javax.print.MultiDocPrintService;
import javax.sound.midi.*;

public class MusioTestl {

	public void play(){
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("We got a sequencer!");;
		}
		catch(MidiUnavailableException ex) {
			System.out.println("Bummer");
			ex.printStackTrace();
			
		}
		
	}//close play
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusioTestl mt = new MusioTestl();
		mt.play();
	}

}
