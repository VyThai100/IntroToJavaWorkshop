package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		
String answer = JOptionPane.showInputDialog("Do You Know How To Write A Code?");
		
if (answer.equals("yes")) {
JOptionPane.showMessageDialog(null, "Then You Will Rule The World");
}
		else {
	JOptionPane.showMessageDialog(null, "Good Luck Washing Dishes");
}
	}
}

