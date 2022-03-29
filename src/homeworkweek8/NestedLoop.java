package homeworkweek8;

public class NestedLoop {
    public static void main(String[] args) {
        rightAngle();
    }

    public static void rightAngle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");

            }
            System.out.println();
        }
    }

}
