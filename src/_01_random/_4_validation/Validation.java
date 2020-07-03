//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if(randomNumber==1) {
			JOptionPane.showMessageDialog(null, "You are my fire");
			
		}
		if(randomNumber==2) {
			JOptionPane.showMessageDialog(null, "My one desire");
			
		}
		if(randomNumber==3) {
			JOptionPane.showMessageDialog(null, "belive when I say");
			
		}
		if(randomNumber==4) {
			JOptionPane.showMessageDialog(null, "I want it that way");
			
		}
		if(randomNumber==5) {
			JOptionPane.showMessageDialog(null, "Aint nothing but a heartace");
			
		}
		if(randomNumber==6) {
			JOptionPane.showMessageDialog(null, "Aint nothing but a mistake");
			
		}
		if(randomNumber==7) {
			JOptionPane.showMessageDialog(null, "I never wanna hear you say");
			
		}
		if(randomNumber==8) {
			JOptionPane.showMessageDialog(null, "I want it that way");
			
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
