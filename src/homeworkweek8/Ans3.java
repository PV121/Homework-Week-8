package homeworkweek8;

import java.util.Scanner;

public class Ans3 {
    public static void main(String[] args) {
        alphabet();
    }

    public static void alphabet() {
        Scanner letter = new Scanner(System.in);
        System.out.println("Please enter alphabet: ");
        String alphabet= letter.next().toLowerCase();
        if (alphabet.length()>1){
            System.out.println("Invalid Entry");
        }else if(!isitaletter(alphabet)) {
            System.out.println("Invalid Entry");
        }else if (alphabet.equals("a")||alphabet.equals("e")||alphabet.equals("i")||alphabet.equals("o")||alphabet.equals("u")){
            System.out.println(alphabet+ " is vowel.");
        }else{
            System.out.println("Alphabet is Consonant");
        }

    }
    public static boolean isitaletter(String l) {
        if (l.charAt(0)>96 && l.charAt(0)<123){
            return true;
        }else{
            return false;
        }

    }


}
