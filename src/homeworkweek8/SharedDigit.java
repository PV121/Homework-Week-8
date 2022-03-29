package homeworkweek8;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int frstnum, int secndnum) {
        if ((frstnum >= 10 && frstnum <= 99) && (secndnum >= 10 && secndnum <= 99)) {
            int firstnumlastdigit = frstnum % 10;
            int secondnumlastdigit = secndnum % 10;
            int firstnumfirstdigit = frstnum / 10;
            int secondnumfirstdigit = secndnum / 10;

            return (firstnumfirstdigit == secondnumfirstdigit) || (firstnumfirstdigit == secondnumlastdigit) ||
                    (firstnumlastdigit == secondnumfirstdigit) || (firstnumlastdigit == secondnumlastdigit);


        }
        return false;
    }
}