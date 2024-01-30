package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		Random random = new Random();
		int theRandomNumber = random.nextInt(1, 101);
		Scanner scanner = new Scanner(System.in);

		int i = 0;
		while (i < 5) {
			System.out.print("Pick a number between 1 and 100 ");
			String userInput = scanner.nextLine();
			Integer convertedInput = Integer.parseInt(userInput);

			if (convertedInput < 1 || convertedInput > 100) {
				System.out.println("The number was not between 1 and 100, please try again");
				continue;
			}
			i++;

			if (convertedInput == theRandomNumber) {
				System.out.println("You win!");
				break;
			} else if (convertedInput < theRandomNumber) {
				System.out.println("Please pick a higher number");
			} else {
				System.out.println("Please pick a lower number");
			}
		}

		if (i == 5) {
			System.out.println("You lose!");
			System.out.println("The number to pick was: " + theRandomNumber);
		}

		scanner.close();
	}

}