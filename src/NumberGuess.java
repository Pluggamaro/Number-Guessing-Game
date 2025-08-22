import java.util.Random;
import java.util.Scanner;

public class NumberGuess{

    public static void main(String [] args){

        int generatedNumber;
        int userGuess;
        int attemptsLeft;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();        
        System.out.print("Guess the number (1-100)");

        try{
            generatedNumber = random.nextInt(1,101);
            userGuess = scanner.nextInt();
        }catch(Exception e){

        }

    }

}