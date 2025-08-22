import java.util.Random;
import java.util.Scanner;

public class NumberGuess{

    public static void main(String [] args){

        int generatedNumber;
        int userGuess;
        int attemptsLeft = 10;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();        
        System.out.print("Guess the number (1-100): ");

        try{
            generatedNumber = random.nextInt(1,101);
            
            userGuess = scanner.nextInt();
            
            do{
                if(userGuess == generatedNumber){
                    System.out.printf("WOW! YOU GOT IT! \nThe number was %d",generatedNumber);
                    break;
                }
                else if(userGuess > generatedNumber && (userGuess - generatedNumber > 18)){
                    System.out.printf("The number %d is too high",userGuess);
                    attemptsLeft--;
                }
                else if(userGuess < generatedNumber && (generatedNumber - userGuess > 18)){
                    System.out.printf("The number %d is too low",userGuess);
                    attemptsLeft--;
                }
                else if(userGuess > generatedNumber && ((userGuess - generatedNumber < 12)&& (userGuess - generatedNumber > 6))){
                    System.out.println("Not quite! but close, try again!");
                    attemptsLeft--;
                }
                else if(userGuess < generatedNumber && ((generatedNumber - userGuess < 12)&& (generatedNumber - userGuess > 6) )){
                    System.out.println("Not quite! !");
                    attemptsLeft--;
                }
                else if(userGuess > generatedNumber && (((userGuess - generatedNumber < 7)))){
                    System.out.println("REALLY CLOSE!! Keep at it!");
                    attemptsLeft--;
                }
                else if(userGuess < generatedNumber && ((generatedNumber - userGuess < 7) )){
                    System.out.println("Super Close!!!");
                    attemptsLeft--;
                }

                if( attemptsLeft < 6 && attemptsLeft >=1 ){
                    System.out.printf("You have %d guess(es) REMAINING!! ",attemptsLeft);
                }

                if(attemptsLeft == 0){
                    System.out.println("GAME OVER!!! \nThe NUMBER was: " + generatedNumber);
                }
            }while(attemptsLeft>0);

        }catch(Exception e){

        }

    }

}