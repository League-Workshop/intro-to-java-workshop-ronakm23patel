package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
	int score=0;
		// 2.  Ask the user a question 
		String words = JOptionPane.showInputDialog("does 1 + 1 = 2");
		// 3.  Use an if statement to check if their answer is correct
		if(words.equalsIgnoreCase("yes")) {
		score=score+1;
		}
		
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
	
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String hand = JOptionPane.showInputDialog("is mango edible");
		if(hand.equalsIgnoreCase("yes")) {
			score=score+1;
		}
		String me = JOptionPane.showInputDialog("is antartica cold");
		if(me.equalsIgnoreCase("yes")) {
		score=score+1;
		}
		// 6.  After all the questions have been asked, print the user's score 
		System.out.println(score);
		}
	}
