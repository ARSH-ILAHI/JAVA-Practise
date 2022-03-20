public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hoursOfDay) {
        if (barking && (hoursOfDay < 0 || hoursOfDay > 23)) {
            return false;
        } else if (barking && (hoursOfDay < 8 || hoursOfDay > 22)) {
            return true;
        };
        return false;
    }
}
