public class Main {
    public static void main(String[] args) {
        long Mph = SpeedConverter.toMilesPerHour(-5.6);
        System.out.println(Mph);

        SpeedConverter.printConversion(-5.6);
    }
}
