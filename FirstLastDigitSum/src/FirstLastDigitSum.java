public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        } else if (number < 10) {
            return (number + number);
        }
        int Lastdigit = number % 10;
        int Firstdigit =0;
        int number2 = number;

        while (number2 > 9) {
            Firstdigit = number2 / 10;

            number2 /= 10;
        }
        return (Firstdigit + Lastdigit);
    }
}
