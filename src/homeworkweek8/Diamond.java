package homeworkweek8;

public class Diamond {
    public static void main(String[] args) {
        diamond();

    }

    public static void diamond() {
        for (int i = 1; i <= 11; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
        for (int i = 10; i >= 1; i--) {
            for (int j = i; j >= 2; j--) {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
    }
}