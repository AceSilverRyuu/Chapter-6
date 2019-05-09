public class CountDown {
    public static void main (String[] args)
    {
        System.out.println("FINAL COUNTDOWN!!!!!");

        int count = 10;

        while (count != 0)
        {
            System.out.println(count);
            --count;
        }

        while (count != 11)
        {
            System.out.println(count);
            count++;
        }

    }
}
