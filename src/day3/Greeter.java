package day3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
String answer = JOptionPane.showInputDialog("What is your name?");
JOptionPane.showMessageDialog(null, "Hello "+ answer);
String answer2 = JOptionPane.showInputDialog("Do You Like $$?");
JOptionPane.showMessageDialog(null, "..."+ answer2);
String answer3 = JOptionPane.showInputDialog("Are You a Robber Then?");
JOptionPane.showMessageDialog(null, "Cool Then.."+ answer3);

}
}
