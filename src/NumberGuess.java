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
        

        generatedNumber = random.nextInt(100) + 1;

        try{
            
            do{
                System.out.printf("Guess the number, you have %d chances remaining (1-100) : ", attemptsLeft);

                String input = scanner.nextLine();

                if(input.isEmpty()){
                    System.out.println("Enter a NUMBER!!");
                    continue;
                }

                userGuess = Integer.parseInt(input);
                

                
                if(userGuess == generatedNumber){
                    System.out.printf("WOW! YOU GOT IT! \nThe number was %d",generatedNumber);
                    break;
                }
               
                attemptsLeft--;

                if(attemptsLeft == 0){
                    break;
                }

                if(userGuess > 100){
                    System.out.println("The RANGE is 1-100!! :");
                    attemptsLeft--;
                    continue;
                }
                else if(userGuess <= 0){
                    System.err.println("The number is surely greater than 0!! :");

                }
                else if(userGuess > generatedNumber && (userGuess - generatedNumber > 18)){
                    System.out.printf("The number %d is too high : \n",userGuess);
                }
                else if(userGuess < generatedNumber && (generatedNumber - userGuess > 18)){
                    System.out.printf("The number %d is too low. TRY AGAIN: \n",userGuess);

                }
                else if(userGuess > generatedNumber && ((userGuess - generatedNumber < 12)&& (userGuess - generatedNumber > 6))){
                    System.out.println("Not quite! but close, try again! :");
                    
                }
                else if(userGuess < generatedNumber && ((generatedNumber - userGuess < 12)&& (generatedNumber - userGuess > 6) )){
                    System.out.println("Not quite! ! :");
                    
                }
                else if(userGuess > generatedNumber && (((userGuess - generatedNumber < 7)))){
                    System.out.println("REALLY CLOSE!! Keep at it!: ");
                    
                }
                else if(userGuess < generatedNumber && ((generatedNumber - userGuess < 7) )){
                    System.out.println("Super Close!!! :");
                    
                }
               
            }while(attemptsLeft>0);

            if(attemptsLeft == 0 && userGuess != generatedNumber){
                System.out.println("\nGAME OVER!!! \nThe NUMBER was: " + generatedNumber);
            }

        }catch(NumberFormatException e){
            System.err.println("Error");
        }finally{
            scanner.close();
        }

    }

}