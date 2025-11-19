import java.util.*;

public class Task1Number1Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String playAgain = "yes";

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain.equalsIgnoreCase("yes")) {
            int number = rand.nextInt(100) + 1;
            int guess = 0;
            int attempts = 0;

            System.out.println("Guess the number between 1 and 100:");

            while (guess != number) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess < number) {
                    System.out.println("very low!");
                } else if (guess > number) {
                    System.out.println("very high!");
                } else {
                    System.out.println("🎉 Congratulations! You guessed the correct number in " + attempts + " attempts.");
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next();
        }

        System.out.println("Thanks for playing the game!");
      
    }
}
