package homeworkweek8;

public class FibonacciNumber {
    public static void main(String[] args) {

        number();
    }

    public static void number() {
        int n1 = 0;
        int n2 = 1;
        int n3;
        int n = 8;
        for (int i = 2; i <= n; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

    }
}
