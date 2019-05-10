import java.util.Scanner;

public class TestScoreStatistics {

    public static void main (String[]args){

        Scanner input = new Scanner(System.in);

        int userChoice = 0;;
        int count = 0;
        int high = 0;
        int low = 100;
        int totalScore = 0;
        double average = 0;




        while (userChoice != 999){

            System.out.println("Please enter a number between 0 & 100 or type 999 to quit >>>> ");
            userChoice = input.nextInt ();

            if (userChoice > high){

                high = userChoice;
            }
            else if (userChoice < low){

                low = userChoice;
            }
           count++;
        }
        if (userChoice == 999) {

            totalScore = totalScore + userChoice;
            average = totalScore / count;

            System.out.println ("You entered " + count + " test scores");
            System.out.println ("The Highest score was " + high);
            System.out.println ("The Lowest score was " + low);
            System.out.println ("The Average was " + average);

        }


    }
}
