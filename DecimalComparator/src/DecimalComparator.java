public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double Param1, double Param2) {

        double diff = Math.abs((Param1 - Param2) * 1000);

        if (diff > 0.9) {
            return false;
        } else {
            return true;
        }
    }
}
