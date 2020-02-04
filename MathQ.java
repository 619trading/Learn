import java.util.Scanner;
import java.math.*;

public class MathQ {
	public static void main(String[] args) {
		int credit = 0;
		int firstTry = 0;
		int secondTry = 0;
		int wrong = 0;
		System.out.print("What's your name?");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		AdditionProblem q1 = new AdditionProblem();
		SubtractionProblem q2 = new SubtractionProblem();
		MultiplicationProblem q3 = new MultiplicationProblem();
		DivisionProblem q4 = new DivisionProblem();

		System.out.println("Nice to meet you , " + name + "!");
		System.out.println("**************MATH CHALLENGE*************");
		System.out.println(
				"This challenge will present you 10 problems in which you will have two chances to answer the question correctly");
		System.out.println(
				"The questions that will be asked will be basic arithmetic ranging from addition, subtraction, multiplication and division");
		System.out.println("You will receive full credit if you answer the question correctly on the first try");
		System.out.println("You will only receive half credit if you answer it correctly on the second try");
		System.out.println("You score will be tallied at the end of the quiz");
		System.out.println("Good luck!");
		System.out.println("---------------------");

		for (int i = 1; i <= 10; i++) {
			long rand1 = Math.round((Math.random() * 4) + 1);
			// System.out.println(rand1); //for testing random function

			if (rand1 == 1.0) {
				System.out.println("Problem #" + i);
				System.out.println("----------------------------");
				System.out.println(q1.getProblem());

				System.out.println("Type Your Answer Below:");
				Integer ans = sc.nextInt();
				System.out.println("Your answer was: " + ans);
				if (ans == q1.getAnswer()) {
					System.out.println("That is correct!");
					credit = credit + 10;
					firstTry = firstTry + 1;
					System.out.println("Your total points right now is: " + credit);
					System.out.println();
				} else {
					System.out.println("-------------------------");
					System.out.println();
					System.out.println("Sorry that is not correct");
					System.out.println("Lets try again");
					System.out.println();
					System.out.println(q1.getProblem());
					System.out.println("Type Your Answer:");
					Integer ans1 = sc.nextInt();
					if (ans1 == q1.getAnswer()) {
						System.out.println("There ya go..good answer");
						System.out.println("Lets move on");
						credit = credit + 5;
						secondTry = secondTry + 1;
						System.out.println("You total points thus far is: " + credit);
					} else {
						System.out.println();
						System.out.println("Hmmmm.sorry thats still not correct");
						System.out.println("The correct answer was: " + q1.getAnswer());
						wrong = wrong + 1;
						System.out.println("You have " + credit + " points");
						System.out.println("Lets continue on!");
						System.out.println();
						System.out.println("-------------------------");
					}

				}

			} else if (rand1 == 2.0) {
				System.out.println("Problem #" + i);
				System.out.println("----------------------------");
				System.out.println(q2.getProblem());
				System.out.println("Type Your Answer:");

				int ans = sc.nextInt();
				System.out.println("Your answer was " + ans);
				if (ans == q2.getAnswer()) {
					System.out.println("That is correct!");
					credit = credit + 10;
					firstTry = firstTry + 1;
					System.out.println("Your total points right now is: " + credit);
					System.out.println();
				} else {
					System.out.println("-------------------------");
					System.out.println("Sorry that is not correct");
					System.out.println("Lets try again");
					System.out.println();
					System.out.println(q2.getProblem());
					System.out.println("Type Your Answer:");
					Integer ans1 = sc.nextInt();
					if (ans1 == q2.getAnswer()) {
						System.out.println("There ya go..good answer");
						System.out.println("Lets move on");
						credit = credit + 5;
						secondTry = secondTry + 1;
						System.out.println("You total points thus far is: " + credit);
					} else {
						System.out.println();
						System.out.println("Hmmmm.sorry thats still not correct");
						System.out.println("The correct answer was: " + q2.getAnswer());
						wrong = wrong + 1;
						System.out.println("You have " + credit + " points");
						System.out.println("Lets continue on!");
						System.out.println();
						System.out.println("-------------------------");

					}

				}

			} else if (rand1 == 3.0) {
				System.out.println("Problem #" + i);
				System.out.println("----------------------------");
				System.out.println(q3.getProblem());
				System.out.println("Type Your Answer:");
				Integer ans = sc.nextInt();
				System.out.println("Your answer was " + ans);
				if (ans == q3.getAnswer()) {
					System.out.println();
					System.out.println("That is correct!");
					credit = credit + 10;
					firstTry = firstTry + 1;
					System.out.println("Your total points right now is: " + credit);
					System.out.println();
				} else {
					System.out.println("-------------------------");
					System.out.println();
					System.out.println("Sorry that is not correct");
					System.out.println("Lets try again");
					System.out.println();
					System.out.println(q3.getProblem());
					System.out.println("Type Your Answer:");
					Integer ans1 = sc.nextInt();
					if (ans1 == q3.getAnswer()) {
						System.out.println("There ya go..good answer");
						System.out.println("Lets move on");
						credit = credit + 5;
						secondTry = secondTry + 1;
						System.out.println("You total points thus far is: " + credit);
					} else {
						System.out.println();
						System.out.println("Hmmmm.sorry thats still not correct");
						System.out.println("The correct answer was: " + q3.getAnswer());
						wrong = wrong + 1;
						System.out.println("You have " + credit + " points");
						System.out.println("Lets continue on!");
						System.out.println();
						System.out.println("-------------------------");

					}

				}

			} else {
				System.out.println("Problem #" + i);
				System.out.println("----------------------------");
				System.out.println(q4.getProblem());
				System.out.println("Type Your Answer:");

				double ans = sc.nextDouble();
				System.out.println("Your answer was " + ans);
				if (ans == q4.getAnswer()) {
					System.out.println();
					System.out.println("That is correct!");
					credit = credit + 10;
					firstTry = firstTry + 1;
					System.out.println("Your total points right now is: " + credit);
					System.out.println();
				} else {
					System.out.println("-------------------------");
					System.out.println("Sorry that is not correct");
					System.out.println("Lets try again");
					System.out.println();
					System.out.println(q4.getProblem());
					System.out.println("Type Your Answer:");
					double ans1 = sc.nextDouble();
					if (ans1 == q4.getAnswer()) {
						System.out.println("There ya go..good answer");
						System.out.println("Lets move on");
						System.out.println();
						credit = credit + 5;
						secondTry = secondTry + 1;
						System.out.println("You total points thus far is: " + credit);
					} else {
						System.out.println();
						System.out.println("Hmmmm.sorry thats still not correct");
						System.out.println("The correct answer was: " + q4.getAnswer());
						wrong = wrong + 1;
						System.out.println("You have " + credit + " points");
						System.out.println("Lets continue on!");
						System.out.println();
						System.out.println("-------------------------");

					}

				}

			}

		}

		System.out.println("Well done on completing the quiz");
		System.out.println("Below you will find your score out of 10");
		System.out.println("-----------------------------------------");
		System.out.println("Total point earned: " + credit + "/100");
		System.out.println("Number of questions answered correctly on the first try: " + firstTry);
		System.out.println("Number of questions answered correctly on the second try: " + secondTry);
		System.out.println("Number of questions answered incorrect: " + wrong);

	}
}
