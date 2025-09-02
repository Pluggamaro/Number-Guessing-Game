import java.util.Random;
import java.util.Scanner;

public class NumberGuess{

    public static void main(String [] args){

        int generatedNumber;
        int userGuess = -1;
        int attemptsLeft = 10;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("****************NUMBER GUESSING GAME****************");        
        System.out.print("Guess the number (1-100): ");

        generatedNumber = random.nextInt(100) + 1;

        try{
            
            do{
                userGuess = scanner.nextInt();
                

                
                if(userGuess == generatedNumber){
                    System.out.printf("WOW! YOU GOT IT! \nThe number was %d",generatedNumber);
                    break;
                }
                if(userGuess > 100){
                    System.out.print("The RANGE is 1-100!! :");
                    attemptsLeft--;
                    scanner.nextLine();
                    continue;
                }
                 if(userGuess < 0 || userGuess == 0){
                    System.err.print("The number is surely greater than 0!! :");
                    attemptsLeft--;
                    scanner.nextLine();
                }
                else if(userGuess > generatedNumber && (userGuess - generatedNumber > 18)){
                    System.out.printf("The number %d is too high :",userGuess);
                    attemptsLeft--;
                    scanner.nextLine();
                }
                else if(userGuess < generatedNumber && (generatedNumber - userGuess > 18)){
                    System.out.printf("The number %d is too low. TRY AGAIN: ",userGuess);
                    attemptsLeft--;
                    scanner.nextLine();
                    continue;
                }
                else if(userGuess > generatedNumber && ((userGuess - generatedNumber < 12)&& (userGuess - generatedNumber > 6))){
                    System.out.print("Not quite! but close, try again! :");
                    attemptsLeft--;
                    scanner.nextLine();
                    continue;
                }
                else if(userGuess < generatedNumber && ((generatedNumber - userGuess < 12)&& (generatedNumber - userGuess > 6) )){
                    System.out.print("Not quite! ! :");
                    attemptsLeft--;
                    scanner.nextLine();
                }
                else if(userGuess > generatedNumber && (((userGuess - generatedNumber < 7)))){
                    System.out.print("REALLY CLOSE!! Keep at it!: ");
                    attemptsLeft--;
                    scanner.nextLine();
                }
                else if(userGuess < generatedNumber && ((generatedNumber - userGuess < 7) )){
                    System.out.print("Super Close!!! :");
                    attemptsLeft--;
                    scanner.nextLine();
                }

                if( attemptsLeft < 6 && attemptsLeft >=1 ){
                    System.out.printf("\nYou have %d guess(es) REMAINING!! :",attemptsLeft);
                    
                    attemptsLeft--;
                    scanner.nextLine();
                    //continue;
                }

                if(attemptsLeft == 0){
                    System.out.println("\nGAME OVER!!! \nThe NUMBER was: " + generatedNumber);
                    continue;
                }
               
            }while(attemptsLeft>0);

        }catch(Exception e){
            System.err.println("Error");
        }

    }

}