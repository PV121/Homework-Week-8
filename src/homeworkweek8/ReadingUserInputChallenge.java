package homeworkweek8;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        input();

    }

    public static void input() {
        int counter = 1;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        while (counter <= 10) {
            System.out.println("Enter number " + counter + " : ");

            if (scan.hasNextInt()) {
               sum += scan.nextInt();
                counter++;

            } else {
                System.out.println("Invalid Number");

            }
            scan.nextLine();
        }

        // sum of 10 numbers
        System.out.println("Sum of entered numbers:" + sum);

    }


}

