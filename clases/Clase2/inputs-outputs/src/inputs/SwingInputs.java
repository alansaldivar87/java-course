package inputs;

import javax.swing.JOptionPane;

/**
 * 
 * @author alan.saldivar
 * Class SwingInput
 * Shows text lectures within a swing window
 */
public class SwingInputs {
	public static void main(String[] args) {
		String strVal1, strVal2;
		int val1, val2, sum;
		
		// Open a prompt window asking the numbers
		strVal1 = JOptionPane.showInputDialog("Write the first number");
		strVal2 = JOptionPane.showInputDialog("Write the second number");
		
		/*
		 * Change the string  value to Integers, then store in these variables.
		 * If we don't parse them, the final result would be a concatenated string.
		 */
		val1 = Integer.parseInt(strVal1);
		val2 = Integer.parseInt(strVal2);
		
		sum = val1 + val2;
		
		// Display result in both, console and Prompt window
		System.out.printf("The sum is: %d", sum);
		JOptionPane.showMessageDialog(null,  "The sum is: " + sum);
		
		/*
		 * 
		 */
		
	}
}
