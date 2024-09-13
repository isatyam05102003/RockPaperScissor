import java.util.*;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // List of possible moves for the computer
            String[] rps = {"r", "p", "s"};
            // Computer makes a random move
            String computer = rps[new Random().nextInt(rps.length)];

            String playerMove;
            while (true) {
                System.out.println("Please enter your move (r = rock, p = paper, s = scissors): ");
                playerMove = scanner.nextLine();
                // Check if the player's move is valid
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println(playerMove + " is not a valid move.");
            }

            // Display the computer's move
            System.out.println("Computer played: " + computer);

            // Determine the winner
            if (playerMove.equals(computer)) {
                System.out.println("The game is a tie.");
            } else if (playerMove.equals("r")) {
                if (computer.equals("p")) {
                    System.out.println("You lose! Paper covers rock.");
                } else if (computer.equals("s")) {
                    System.out.println("You win! Rock smashes scissors.");
                }
            } else if (playerMove.equals("p")) {
                if (computer.equals("r")) {
                    System.out.println("You win! Paper covers rock.");
                } else if (computer.equals("s")) {
                    System.out.println("You lose! Scissors cut paper.");
                }
            } else if (playerMove.equals("s")) {
                if (computer.equals("p")) {
                    System.out.println("You win! Scissors cut paper.");
                } else if (computer.equals("r")) {
                    System.out.println("You lose! Rock smashes scissors.");
                }
            }

            // Ask if the player wants to play again
            System.out.println("Play again? (y/n)");
            String playAgain = scanner.nextLine();

            // Exit the loop if the player does not want to play again
            if (!playAgain.equalsIgnoreCase("y")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
