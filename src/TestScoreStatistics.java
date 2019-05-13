import java.util.Scanner;

public class TestScoreStatistics {

    public static void main (String[]args) {

        Scanner input = new Scanner(System.in);

        int userChoice;
        final int MAX = 100;
        final int MIN = 0;
        int count = 0;
        int high;
        int low;
        int totalScore = 0;
        double average;


        System.out.println("Please enter a number between 0 & 100 or type 999 to quit >>>> ");
        userChoice = input.nextInt();

        high = userChoice;
        low = userChoice;
        while (userChoice != 999) {

            if (userChoice <= MAX && userChoice >= MIN) {
                ++count;
                totalScore = totalScore + userChoice;

                if (userChoice > high)

                    high = userChoice;
                    if (userChoice < low)

                        low = userChoice;
                } else
                    System.out.println("Type another score or type 999 to exit.");
                userChoice = input.nextInt();
            }


            totalScore = totalScore + userChoice - 999;
            average = totalScore / count;

            System.out.println ("You entered " + count + " test scores");
            System.out.println ("The Highest score was " + high);
            System.out.println ("The Lowest score was " + low);
            System.out.println ("The Average was " + average);


    }
}
