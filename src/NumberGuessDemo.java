import java.util.Scanner;
import java.util.Random;

public class NumberGuessDemo {

    public static void main(String[] args) {
        var numberGen = new Random();
        var hiddenNumber = numberGen.nextInt(10) + 1;
        var commandLinereader = new Scanner(System.in);
        System.out.println("Guess a number from 1 to 10:");
        var userGuess = commandLinereader.nextInt();
        while (true) {
            if (hiddenNumber == userGuess) {
                System.out.println("you guessee it! " + hiddenNumber + " was the right one");
                break;
            } else {
                System.out.println("Sorry " + userGuess + " was not my number");
                if (userGuess - hiddenNumber > 0)
                    System.out.println("Your guess was too high!");
                else
                    System.out.println("Your guess was too low!");
                System.out.println("Try again: ");
                userGuess = commandLinereader.nextInt();
            }
        }
    }
}

