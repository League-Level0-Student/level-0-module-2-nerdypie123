package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class gambling {
public static void main(String[] args) {
	Random ran = new Random();
	int number1 = ran.nextInt(99 - 0 + 1);
	int number2 = ran.nextInt(99 - 0 + 1);
	int number3 = ran.nextInt(99 - 0 + 1);
	int number4 = ran.nextInt(99 - 0 + 1);
	int number5 = ran.nextInt(99 - 0 + 1);
	int number6 = ran.nextInt(99 - 0 + 1);
	
	int number7 = ran.nextInt(99 - 0 + 1);
	int number8 = ran.nextInt(99 - 0 + 1);
	int number9 = ran.nextInt(99 - 0 + 1);
	int number10 = ran.nextInt(99 - 0 + 1);
	int number11 = ran.nextInt(99 - 0 + 1);
	int number12 = ran.nextInt(99 - 0 + 1);
	JOptionPane.showMessageDialog(null, "your lottery number is" + number1 + number2 + number3 + number4 + number5 + number6 + "\nthe winning number is" + number7 + number8 + number9 + number10 + number11 + number12);
	

}
}
