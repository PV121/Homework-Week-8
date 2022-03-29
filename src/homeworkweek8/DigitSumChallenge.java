package homeworkweek8;

import java.util.Scanner;

public class DigitSumChallenge {
    public static void main(String[] args) {
        sumDigits(125);

    }

    public static void sumDigits(int number) {
        int sum = 0;
        if (number < 10 && number >= 0) {
            System.out.println(-1);
        } else {
            for (sum = 0; number != 0; number = number / 10) {
                sum = sum + number % 10;

            }
            System.out.println(sum);
        }


    }
}
