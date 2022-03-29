package homeworkweek8;

public class LeftAngleTriangle {
    public static void main(String[] args) {
        leftAngle();
    }

    public static void leftAngle() {
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
