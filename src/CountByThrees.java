import java.util.Scanner;

public class CountByThrees {

    public static void main (String[]args){

countByUser();
            }

    public static void countByThrees(){
        System.out.println("\nCounting by 3's to 300.\n");
        for (int i =3; i<=300; i=i+3) {
            System.out.print(i + " ");
            if (i % 30 == 0) {
                System.out.println();
            }
        }

    }
    public static void countByUser(){
        Scanner input = new Scanner(System.in);

        int userChoice = 0;
        int userChoiceHigh;
        int count = 0;


        while (userChoice != 999){

            System.out.println("\nUser chooses number to count by >>>> ");
            userChoice = input.nextInt();
            System.out.println("User chooses number to count to (Must be higher than 1st number)>>>> ");
            userChoiceHigh = input.nextInt();


            for (int i = 0; i < userChoiceHigh; i = userChoice + i) {

                count = count+1;

                if (count % 10 ==0){

                    System.out.println(i);

                }

                else {

                    System.out.print(i + " ");
                }
            }
        }
    }
}
