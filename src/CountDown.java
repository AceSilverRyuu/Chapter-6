public class CountDown {
    public static void main (String[] args)
    {
//        System.out.println("FINAL COUNTDOWN!!!!!");
//
//        int count = 10;
//
//        while (count != 0)
//        {
//            System.out.println(count);
//            --count;
//        }
//int count2 = 0;
//        while (count2 <= 10)
//        {
//            System.out.println(count2);
//            count2++;
//        }
// displayDoWhile();
        displayForLoop();
    }
    public static void displayDoWhile ()
    {
        int count = 10;
        int count2 = 10;
        do {
            System.out.println(count);
            --count;
        }
        while (count>=0);
        do {
            System.out.println(count2);
            ++count2;
        } while (count2<=10);
    }
    public static void displayForLoop()
    {
        for (int j = 10; j>= 1; j--)
        {
            System.out.println(j);
        }

        for(int i = 0; i<=10; i++)
        {
            System.out.println(i);
        }
    }
}
