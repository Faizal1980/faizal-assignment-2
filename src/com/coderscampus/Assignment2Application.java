package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {

		Random random = new Random();
		int theRandomNumber = random.nextInt(1, 101);
		System.out.println(theRandomNumber);

		for (int i = 1; i < 6; i++) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Pick a number between 1 and 100");
			String userInput = scanner.nextLine();
			Integer convertedInput = Integer.parseInt(userInput);

			if (convertedInput < 1 | convertedInput > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again");
			} else if (theRandomNumber == convertedInput) {
				System.out.println("You win!");
				System.exit(0);
			} else if (convertedInput < theRandomNumber) {
				System.out.println("Please pick a higher number");
			} else if (convertedInput > theRandomNumber) {
				System.out.println("Please pick a lower number");
			}

		}

		System.out.println("You lose!");
		System.out.println("The number to guess was: " + theRandomNumber);

	}
}
