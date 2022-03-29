package homeworkweek8;

import jdk.nashorn.internal.ir.IfNode;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        minMax();

    }

    public static void minMax() {
        int min = 0, max = 0;
        boolean ismin = false, ismax = false;

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Number: ");
            if (input.hasNextInt()) {
                int num = input.nextInt();
                if (num > max || !ismax) {
                    max = num;
                    ismax = true;
                }
                if (num < min || !ismin) {
                    min = num;
                    ismin = true;
                }
            } else {
                System.out.println("Minimum number is " + min);
                System.out.println("Maximum number is " + max);
                break;
            }
        }

    }
}



