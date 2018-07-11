package section3;

import javax.swing.JOptionPane;

public class greeter {
public static void main(String[] args) {
	System.out.println("hello");
	String input = JOptionPane.showInputDialog("what is your name?");
	JOptionPane.showMessageDialog(null, "hello" + input);
}
}
