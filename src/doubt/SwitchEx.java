package doubt;

public class SwitchEx {

    public static String getDayType(int day) {
        switch (day) {
            case 6:
            case 7:
                return "Weekend";  // Returning from switch case
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return "Weekday";  // Returning from switch case
            default:
                return "Invalid day";  // Returning for an invalid input
        }
    }
    public static void main(String[] args) {
        System.out.println(getDayType(1)); // Output: Weekend
        System.out.println(getDayType(3)); // Output: Weekday
        System.out.println(getDayType(9)); // Output: Invalid day
    }
}
