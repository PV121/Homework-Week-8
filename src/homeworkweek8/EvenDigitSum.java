package homeworkweek8;

public class EvenDigitSum {
    public static void getEvenDigitSum(int number) {
        int originalNumber = number;
        int digit=0;
                int sum = 0;
        if (number<0){
            System.out.println("-1");
        }
        if (number > 0) {
            while (number != 0){
                 digit = number % 10;
                if (digit % 2 == 0)
                    sum = sum + digit;
                number = number / 10;
            }
                System.out.println("sum of all even digit number " + originalNumber + "is : " + sum);
            }
        }



    public static void main(String[] args) {
        getEvenDigitSum(123456789);
        getEvenDigitSum(252);
        getEvenDigitSum(-22);
    }
}
