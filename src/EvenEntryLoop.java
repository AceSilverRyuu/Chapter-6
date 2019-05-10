import java.util.Scanner;

public class EvenEntryLoop {

    public static void main (String[] args){

        int userChoice = 0;
        Scanner input = new Scanner(System.in);

        while (userChoice != 999){

            System.out.println("Please enter an even number or type 999 to quit >>>> ");
            userChoice = input.nextInt ();

            if (userChoice % 2 == 0){
                System.out.println("What Are You?");
            }
            else if (userChoice == 999){
                System.out.println("Thanks For Playing");
            }
            else{
                System.out.println("An Idiot Sandwich.");
            }
        }


    }
}
