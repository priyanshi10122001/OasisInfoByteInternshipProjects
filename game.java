import java.util.Random;
import java.util.Scanner;

public class game
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String play = "yes";
        while(play.equals("yes"))
        {
            Random rand = new Random();
            int randNUM = rand.nextInt(100);
            int guess = -1;
            int tries = 0;
            while(guess != randNUM)
            {
                System.out.print("guess a number between 1 and 100: ");
                guess = sc.nextInt();
                tries++;

                if(guess == randNUM)
                {
                    System.out.println("Awesome ! you guessed the number");
                    System.out.println("it only took you " + tries + "guessess!");
                    System.out.println("would you like to play again? YES or NO");
                    play = sc.next().toLowerCase();
                }
                else if(guess > randNUM)
                {
                    System.out.println("Your guess is too high , try again.");
                
                }
                else 
                {
                    System.out.println("your guess is too low , try again ");
                }

                


            }

        }
        sc.close();

        
    }
}
    
