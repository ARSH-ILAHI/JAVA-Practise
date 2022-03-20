public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor (int first, int second) {
        if ((first < 10) || (second < 10)) {
            return -1;
        }
        int limit = 0;
        if (first > second) {
            limit = first / 2;
        } else {
            limit = second / 2;
        }

        int GCD = 2;
        int count = 2;
        while (count <= limit) {
            if (((first % count) == 0) && ((second % count) == 0)) {
                GCD = count;
            }
            count++;
        }
        return GCD;
    }
}