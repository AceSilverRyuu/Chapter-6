// Display every character between Unicode 65 and 122
// Start new line after 20 characters

public class DebugSix2 {
    public static void main(String args[]) {
        char letter;
        int a = 0;
        for (a = ; a <= ; a++) {
            letter = (char) a;
            System.out.print("  " + letter);
        }
            if (a == 65 || a == 122) {
                System.out.print("");
            }
            System.out.println("\n End of application");

        }
    }
