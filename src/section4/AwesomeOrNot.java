package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random randGen = new Random();
	int eye = randGen.nextInt(4);
	// 3. Print out this variable
System.out.println("eye");
	// 4. Get the user to enter something that they think is awesome
String i = JOptionPane.showInputDialog("What is awesome");
	// 5. If the random number is 0

	// -- tell the user whatever they entered is awesome!
if(eye == 0) {
	JOptionPane.showMessageDialog(null,i+" is awesome" );
}
	// 6. If the random number is 1

	// -- tell the user whatever they entered is ok.
if(eye == 1) {
JOptionPane.showMessageDialog(null,i+"is ok");
}
	// 7. If the random number is 2

	// -- tell the user whatever they entered is boring.
if(eye == 2) {
	JOptionPane.showMessageDialog(null,i+ "is boring");
}
	// 8. If the random number is 3

	// -- write your own answer
if(eye ==3) {
	JOptionPane.showMessageDialog(null,i+"is horrible");
}
}
}


