package homeworkweek8;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        angle();

    }

    public static void angle() {

        System.out.println("Input number of rows: 10");
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j);

            }
            System.out.println("");

        }
    }
}
