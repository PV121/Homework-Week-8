package homeworkweek8;

import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        primenumber();
    }

    public static void primenumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input any number");
        int number = sc.nextInt();
        boolean prime = false;
        for (int i = 2; i <= number / 2; i++) {
            // condition for nonprime number
            if (number % 2  == 0 || number % 3==0 || number % 4 ==0 || number % 5==0 || number % 10==0) {
                prime = true;

            }

        }
        if (!prime){
            System.out.println(number + " is prime number");
        } else {
            System.out.println(number + " is not prime number");
        }
    }
}