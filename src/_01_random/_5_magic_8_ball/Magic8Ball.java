//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
public static void main(String[] args) {
	

	// 2. Get the user to enter a question for the 8 ball to answer
    JOptionPane.showInputDialog("What will you ask the magic ape ball");

	// 3. Make a variable and initialize it to a random number.
    Random ran = new Random();
int num = ran.nextInt(4 - 1 + 1);
	
	// 4. If the random number is 0
if(num==1){
	JOptionPane.showMessageDialog(null, "Yes");
}
else if(num==2){
	JOptionPane.showMessageDialog(null, "no");
}
else if(num==3){
	JOptionPane.showMessageDialog(null, "Why are you using a random program for your problems");
}
else if(num==4){
	JOptionPane.showMessageDialog(null, "I dont know try again haha");
}
	// -- tell the user "Yes"

	// 5. If the random number is 1

	// -- tell the user "No"

	// 6. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3

	// -- write your own answer

}
}