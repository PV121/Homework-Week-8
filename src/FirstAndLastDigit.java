package homeworkweek8;

import java.util.Scanner;

public class FirstAndLastDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scan.nextInt();// read value
        int sum = sumFirstAndLastDigit(number);
        System.out.println("The sum of first and last digit of the number " + number + " : " + sum);
    }

    //Method to find the sum first and last digit
    public static int sumFirstAndLastDigit(int number) {


        //finding the last digit
        int lastDigit = number % 10;
        // finding the total number of digits
        int totalDigits = findDigits(number);

        //Calculating the divisor value
        int divisor = (int) Math.pow(10, totalDigits - 1);

        //finding first digit
        int firstDigit = number / divisor;

        int sum = firstDigit + lastDigit;


        return sum;
    }

    //method to find the total number of digits
    public static int findDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;
    }
}







