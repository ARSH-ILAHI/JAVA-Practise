public class LastDigitChecker {

    public static boolean hasSameLastDigit (int x, int y, int z) {
        if (!(isValid(x)) || !(isValid(y)) || !(isValid(z))) {
            //System.out.println(isValid(x) + " " + isValid(y) + " " + isValid(z));
            return false;
        } else {

            return (((x % 10) == (y % 10)) || ((y % 10) == (z % 10)) || ((x % 10) == (z % 10)));
        }
    }

    public static boolean isValid (int a) {
        if ((a < 10) || (a > 1000)) {
            return false;
        } else {
            return true;
        }
    }
}