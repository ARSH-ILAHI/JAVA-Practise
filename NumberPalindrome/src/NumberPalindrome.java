public class NumberPalindrome {

    public static boolean isPalindrome (int number) {

        if (number < 0) {
            number *= -1;
        }

        int lastDigit = 0;
        int number2 = number;
        int reverse = 0;

        while (number2 > 0) {
            lastDigit = number2 % 10;
            reverse = reverse * 10 + lastDigit;
            number2 /= 10;
        }
        return (number == reverse);
        }
}
