package homeworkweek8;

public class PalindromeNumber {
    public static void main(String[] args) {
        isPalindrome(-1221);//true
        isPalindrome(707);//true
        isPalindrome(11212);//false
        isPalindrome(121);//true
        isPalindrome(105051);//false


    }
    public static boolean isPalindrome(int number){
        int remainder;
        int reversenumber=0;
        int originalNum=number;
        while(number != 0){
            remainder= number % 10;
            reversenumber= reversenumber * 10 + remainder;
            number/=10;

        }
        if(originalNum==reversenumber){
            System.out.println(originalNum+ " is Palindrome number.");
            return true;
        }else{
            System.out.println(originalNum+" is not Palindrome number.");

            return false;
        }
    }
}
