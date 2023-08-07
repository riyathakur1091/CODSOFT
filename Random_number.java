
import java.util.Scanner;
import java.util.Random;

public class Random_number {
    public static void main(String[] args) {
        playGame();
    }

    public static int RandomNum(int start, int end) {
        Random random = new Random();
        return random.nextInt(end - start + 1) + start;
    }

    public static int UserGuess(Scanner scanner) {
        System.out.print("Enter your guess: ");

        int guess = Integer.parseInt(scanner.nextLine());
        return guess;

    }

    public static String compareNumber(int guess, int number) {
        if (guess == number) {
            return "correct";
        } else if (guess < number) {
            return "low";
        } else {
            return "high";
        }
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        int startRange = 1;
        int endRange = 100;
        int attemptsLimit = 7;
        int rounds = 0;
        int totalAttempts = 0;

        while (true) {
            rounds++;
            int targetNumber = RandomNum(startRange, endRange);
            int attempts = 0;

            System.out.println(
                    "\nRound " + rounds + " - Guess the number between " + startRange + " and " + endRange + ".");

            while (attempts < attemptsLimit) {
                attempts++;
                int userGuess = UserGuess(scanner);
                String result = compareNumber(userGuess, targetNumber);

                if (result.equals("correct")) {
                    System.out.println("Congratulations! Your guess is correct. The number was " + targetNumber + ".");
                    totalAttempts += attempts;

                    break;
                } else {
                    System.out.println("Your guess is too " + result + ". Try again. Attempts left: "
                            + (attemptsLimit - attempts));
                }
            }

            if (attempts == attemptsLimit) {
                System.out.println("Out of attempts. The number was " + targetNumber + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }

        System.out.println("\nTotal rounds played: " + rounds);
        System.out.println("Total attempts taken: " + totalAttempts);
        System.out.println("Average attempts per round: " + (double) totalAttempts / rounds);
        scanner.close();
    }
}