public class ejercicio1 {
    public static void main(String[] args) {
        int years = 1;
        int months = 2;
        int days = 3;
        long totalSeconds = calculateSeconds(years, months, days);
        System.out.println("Total seconds: " + totalSeconds);
    }

    public static long calculateSeconds(int years, int months, int days) {
        final int SECONDS_IN_MINUTE = 60;
        final int MINUTES_IN_HOUR = 60;
        final int HOURS_IN_DAY = 24;
        final int DAYS_IN_MONTH = 30;
        final int MONTHS_IN_YEAR = 12;

        long totalDays = years * MONTHS_IN_YEAR * DAYS_IN_MONTH + months * DAYS_IN_MONTH + days;
        return totalDays * HOURS_IN_DAY * MINUTES_IN_HOUR * SECONDS_IN_MINUTE;
    }
}
