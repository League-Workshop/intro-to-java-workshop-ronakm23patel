package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "if you have to cross a pirahna infested river here's how to do it...);");
		// Get the user to enter an adjective
String input = JOptionPane.showInputDialog("enter an adjective");
		// Get the user to enter a type of liquid
String verb = JOptionPane.showInputDialog("enter a liquid");
		// Get the user to enter a body part
String noun = JOptionPane.showInputDialog("enter a body part");
		// Get the user to enter a verb
String boy = JOptionPane.showInputDialog("enter a verb");
		// Get the user to enter a place
String liquid = JOptionPane.showInputDialog("enter a place");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		JOptionPane.showInputDialog("Piranhas are more brisk during the day, so cross the river \n"
				+ "at night. Piranhas are attracted to fresh juice and will most likely take a bite \n"
				+ "out of you hand if you moved. Whatever you do, if you have an open wound, \n"
				+ " try to find another way to get back to your house. Good luck");
				
		

	}
}

