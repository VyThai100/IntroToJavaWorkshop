package day3;

import java.io.IOException;

import javax.swing.JOptionPane;

public class StephenHawking {

	
	public static void main(String[] args) {
	
			for (int i = 0; i < 50 ; i++) {
		String Answer = JOptionPane.showInputDialog("Give Me a Sentance");
		speak(Answer);
		
		
		
	}
	
	
	
	
	
	
	// 4. repeat steps 2 and 3 a lot of times
	
	}
	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
